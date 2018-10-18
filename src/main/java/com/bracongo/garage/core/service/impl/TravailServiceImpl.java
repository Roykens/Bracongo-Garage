package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IArticleDao;
import com.bracongo.garage.core.dao.IEntreeGarageDao;
import com.bracongo.garage.core.dao.IPdrUtiliseDao;
import com.bracongo.garage.core.dao.ITravailDao;
import com.bracongo.garage.core.dao.IUtilisateurDao;
import com.bracongo.garage.core.entity.Articles;
import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.EtapeVehicule;
import com.bracongo.garage.core.entity.PdrUtilise;
import com.bracongo.garage.core.entity.Travail;
import com.bracongo.garage.core.entity.Utilisateur;
import com.bracongo.garage.core.entity.dto.TravailDto;
import com.bracongo.garage.core.service.ITravailService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vr.kenfack
 */
@Service
public class TravailServiceImpl implements ITravailService{
    
    @Autowired
    private ITravailDao travailDao;
    
    @Autowired
    private IEntreeGarageDao entreeGarageDao;
    
    @Autowired
    private IUtilisateurDao utilisateurDao;
    
    @Autowired
    private IArticleDao articleDao;
    
    @Autowired
    private IPdrUtiliseDao pdrUtiliseDao;

    @Override
    public TravailDto saveTravail(TravailDto travailDto) {
        
        System.out.println("RECEIVED : "+ travailDto);
        Travail tra = new Travail();
        tra.setDescription(travailDto.getDescription());
        tra.setIntervenant(travailDto.getIntervenant());
        tra.setHeureDebut(travailDto.getHeureDebut());
        tra.setHeureFin(travailDto.getHeureFin());
        tra.setIntituleTravail(travailDto.getIntituleTravail());
        EntreeGarage eG = entreeGarageDao.getOne(Long.valueOf(travailDto.getIdEntree()));
        if(eG != null){
            tra.setEntreeGarage(eG);
        }
        Utilisateur user = utilisateurDao.getOne(Long.valueOf(travailDto.getIdUtilisateur()));
        if(user != null){
            tra.setUtilisateur(user);
        } 
        Set<String> pdrs = travailDto.getPdrUtilises();
        
        tra = travailDao.save(tra);
        for (String pdr : pdrs) {
             Articles a = articleDao.getById(pdr);
                if(a != null){
                    PdrUtilise pdrUtilise = new  PdrUtilise();
                    pdrUtilise.setTravail(tra);
                    pdrUtilise.setPdr(a);
                    pdrUtiliseDao.save(pdrUtilise);
                }
        }
        travailDto.setIdServeur(tra.getId().intValue());
        //System.out.println(travailDto);
        eG.setEtapeVehicule(EtapeVehicule.TRAVAIL);
        entreeGarageDao.save(eG);
        return travailDto;
    }

    @Override
    public Travail save(Travail entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Travail getById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Travail> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TravailDto> getAllByEntreeEquipement(Long entreeId) {
        EntreeGarage eG = entreeGarageDao.getOne(entreeId);
            List<TravailDto> result = new ArrayList<>();
        if(eG != null){
            List<Travail> travaux = travailDao.getAllTravailByEntree(eG);
            travaux.forEach((travail) -> {
                TravailDto dto = new TravailDto();
                dto.setDescription(travail.getDescription());
                dto.setHeureDebut(travail.getHeureDebut());
                dto.setHeureFin(travail.getHeureFin());
                dto.setIntituleTravail(travail.getIntituleTravail());
                dto.setIntervenant(travail.getIntervenant());
                List<PdrUtilise> pdrs = pdrUtiliseDao.getAllByTravail(travail);
                List<String> articles = new ArrayList<>();
                pdrs.forEach((pdr) -> {
                    articles.add(pdr.getPdr().getArtDesignation());
                });
                dto.setIdEntree(eG.getId().intValue());
                dto.setPdrUtilises(new HashSet<>(articles));
                result.add(dto);
            });
            return result;
        }
        return null;
    }
    
}
