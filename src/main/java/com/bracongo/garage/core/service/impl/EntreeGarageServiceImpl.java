package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IArticleDao;
import com.bracongo.garage.core.dao.IEntreeGarageDao;
import com.bracongo.garage.core.dao.IEquipementDao;
import com.bracongo.garage.core.dao.IObservationDao;
import com.bracongo.garage.core.dao.IPdrSouhaiteDao;
import com.bracongo.garage.core.dao.IQuestionDao;
import com.bracongo.garage.core.dao.IReponseEntreeDao;
import com.bracongo.garage.core.dao.IReponseSortieDao;
import com.bracongo.garage.core.dao.ISortieGarageDao;
import com.bracongo.garage.core.dao.ITravailEntreeDao;
import com.bracongo.garage.core.dao.IUtilisateurDao;
import com.bracongo.garage.core.entity.Articles;
import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.Equipements;
import com.bracongo.garage.core.entity.EtapeVehicule;
import com.bracongo.garage.core.entity.Observation;
import com.bracongo.garage.core.entity.PdrSouhaite;
import com.bracongo.garage.core.entity.ReponseEntree;
import com.bracongo.garage.core.entity.ReponseSortie;
import com.bracongo.garage.core.entity.SortieGarage;
import com.bracongo.garage.core.entity.TravailEntree;
import com.bracongo.garage.core.entity.dto.Entree;
import com.bracongo.garage.core.entity.dto.EntreeDto;
import com.bracongo.garage.core.entity.dto.QuestionReponseDto;
import com.bracongo.garage.core.service.IEntreeGarageService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */

@Service
@Transactional
public class EntreeGarageServiceImpl implements IEntreeGarageService{
    
    @Autowired
    private IEntreeGarageDao entreeGarageDao;
    
    @Autowired
    private IEquipementDao equipementDao;
    
    @Autowired
    private IUtilisateurDao utilisateurDao;
    
    @Autowired
    private IObservationDao observationDao;
    
    @Autowired
    private ITravailEntreeDao travailEntreeDao;
    
    @Autowired
    private IQuestionDao questionDao;
    
    @Autowired
    private IReponseEntreeDao reponseEntreeDao;
    
    @Autowired
    private ISortieGarageDao sortieGarageDao;
    
    @Autowired
    private IReponseSortieDao reponseSortieDao;
    
    @Autowired
    private IArticleDao articleDao;
    
    @Autowired
    private IPdrSouhaiteDao pdrSouhaiteDao;
    
    @Override
    public EntreeGarage saveOrUpdateEntreeGarage(EntreeGarage entree) {
        if(entree.getId() == null){
            entree.setEtapeVehicule(EtapeVehicule.ENTREE);
            return entreeGarageDao.save(entree);
        }
        else
            return entreeGarageDao.save(entree);
    }
    @Override
    public List<EntreeGarage> getAllEntree() {
        return entreeGarageDao.findAll();
    }

    @Override
    public EntreeGarage findById(Long id) {
        return entreeGarageDao.getOne(id);
    }

    @Override
    public EntreeGarage findByEquipement(String equipementId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entree saveFromWeb(EntreeDto entreeDto) {
        System.out.println("DONNEES RECUE "+ entreeDto);
        Equipements e = equipementDao.getById(entreeDto.getIdEquipement());
        if( e != null){
            EntreeGarage eG = new EntreeGarage();
            eG.setCharrois(entreeDto.getCharrois());
            eG.setDateEntree(entreeDto.getDateEntree());
            eG.setDemandeur(entreeDto.getDemandeur());
            eG.setNiveauEssence(entreeDto.getNiveauEssence());
            eG.setEtapeVehicule(EtapeVehicule.ENTREE);
            eG.setHeure(entreeDto.getHeure());
            eG.setHubdomètre(entreeDto.getKilometreHubdo());
            eG.setKilometre(entreeDto.getKilometre());
            eG.setLieu(entreeDto.getLieu());
            eG.setUtilisateur(utilisateurDao.getOne(Long.valueOf(entreeDto.getIdUtilisateur())));
            eG.setEquipements(e);
            eG = entreeGarageDao.save(eG);
            List<String> observations = entreeDto.getObservations();
            
            List<QuestionReponseDto> question = entreeDto.getQuestionProjection();
            for (QuestionReponseDto questionReponseDto : question) {
                ReponseEntree re = new ReponseEntree();
                re.setEntreeGrarage(eG);
                re.setQuestion(questionDao.getOne(Long.valueOf(questionReponseDto.getIdQuestion())));
                re.setValeur(questionReponseDto.getReponse());
                reponseEntreeDao.save(re);
            }
            
            for (String observation : observations) {
                Observation o = new Observation(eG, observation);
                observationDao.save(o);
            }
            
            List<String> travaux = entreeDto.getTravaux();
            for (String string : travaux) {
                TravailEntree te = new TravailEntree(string, eG);
                travailEntreeDao.save(te);
            }
            
            Set<String> pdrs = entreeDto.getPdrs();
            for (String pdr : pdrs) {
                Articles a = articleDao.getById(pdr.trim());
                System.out.println(a);
                if(a != null){
                    PdrSouhaite pdrSouhaite = new  PdrSouhaite();
                    pdrSouhaite.setEntree(eG);
                    pdrSouhaite.setPdr(a);
                    pdrSouhaiteDao.save(pdrSouhaite);
                }
            }
            
            Entree result = new Entree(eG);
            System.out.println("DONNEE A ENVOYER " + result);
            return result;
        }
        return null;
    }

    @Override
    public List<Entree> getAll() {
       List<EntreeGarage> entrees = entreeGarageDao.findAll();
        System.out.println(entrees);
       entrees.forEach((entree) -> {
           System.out.println(entree);
        });
       List<Entree> result = new ArrayList<>();
       entrees.forEach((entree) -> {
           result.add(new Entree(entree));
        });
        return  result;
    }

    @Override
    public void saveSortieFromWeb(EntreeDto entreeDto) {
        System.out.println("DONNEES RECUE "+ entreeDto);
        Equipements e = equipementDao.getById(entreeDto.getIdEquipement());
        EntreeGarage eG = entreeGarageDao.getOne(entreeDto.getIdEntree());
        if( e != null && eG != null){
            SortieGarage sG = new SortieGarage();
            sG.setCharrois(entreeDto.getCharrois());
            sG.setEntreeGarage(eG);
            sG.setDateSortie(entreeDto.getDateEntree());
            sG.setDemandeur(entreeDto.getDemandeur());
            sG.setNiveauEssence(entreeDto.getNiveauEssence());
            sG.setHeure(entreeDto.getHeure());
            sG.setHubdomètre(entreeDto.getKilometreHubdo());
            sG.setKilometre(entreeDto.getKilometre());
            sG.setLieu(entreeDto.getLieu());
            sG.setUtilisateur(utilisateurDao.getOne(Long.valueOf(entreeDto.getIdUtilisateur()))); 
            sG = sortieGarageDao.save(sG);
            List<String> observations = entreeDto.getObservations();           
            List<QuestionReponseDto> question = entreeDto.getQuestionProjection();            
            for (QuestionReponseDto questionReponseDto : question) {
                ReponseSortie rs = new ReponseSortie();
                rs.setSortieGarage(sG);
                rs.setQuestion(questionDao.getOne(Long.valueOf(questionReponseDto.getIdQuestion())));
                rs.setValeur(questionReponseDto.getReponse());
                reponseSortieDao.save(rs);
            }  
            
            for (String observation : observations) {
                Observation o = new Observation(sG, observation);
                observationDao.save(o);
            }           
            eG.setEtapeVehicule(EtapeVehicule.SORTIE);
            entreeGarageDao.save(eG);            
        }
      //  return null;
    }
    
}
