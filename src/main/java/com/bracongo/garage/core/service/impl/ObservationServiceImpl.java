package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IEntreeGarageDao;
import com.bracongo.garage.core.dao.IObservationDao;
import com.bracongo.garage.core.dao.ISortieGarageDao;
import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.Observation;
import com.bracongo.garage.core.entity.SortieGarage;
import com.bracongo.garage.core.service.IObservationService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vr.kenfack
 */
@Service
public class ObservationServiceImpl implements IObservationService{

    @Autowired
    private IObservationDao observationDao;
    
    @Autowired
    private IEntreeGarageDao garageDao;
    
    @Autowired
    private ISortieGarageDao sortieGarageDao;
    
    @Override
    public List<Observation> getAllByEntree(Long idEntreeGarage) {
        if(idEntreeGarage != null){
            EntreeGarage eG = garageDao.getOne(idEntreeGarage);
            if(eG != null){
                return observationDao.getAllByEntree(eG);
            }
        }
        return null;
    }

    @Override
    public Observation save(Observation entity) {
        return observationDao.save(entity);
    }

    @Override
    public Observation getById(Serializable id) {
        return observationDao.getOne((Long)id);
    }

    @Override
    public List<Observation> getAll() {
       return  observationDao.findAll();
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Observation> getAllBySortie(Long idSortieGarage) {
        if(idSortieGarage != null){
            SortieGarage sG = sortieGarageDao.getOne(idSortieGarage);
            if(sG != null){
                return observationDao.getAllBySortie(sG);
            }
        }
        return null;
    }
    
}