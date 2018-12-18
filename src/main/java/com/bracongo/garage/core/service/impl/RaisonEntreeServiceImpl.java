package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IRaisonEntreeDao;
import com.bracongo.garage.core.entity.RaisonEntree;
import com.bracongo.garage.core.service.IRaisonEntreeService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Service
@Transactional
public class RaisonEntreeServiceImpl implements IRaisonEntreeService{
    
    @Autowired
    private IRaisonEntreeDao raisonEntreeDao;

    @Override
    public RaisonEntree save(RaisonEntree entity) {
        return raisonEntreeDao.save(entity);
    }

    @Override
    public RaisonEntree getById(Serializable id) {
        return raisonEntreeDao.getOne((Long)id);
    }

    @Override
    public List<RaisonEntree> getAll() {
        return raisonEntreeDao.findAll();
    }

    @Override
    public void delete(Serializable id) {
        RaisonEntree re = raisonEntreeDao.getOne((Long)id);
        if(re != null){
            raisonEntreeDao.delete(re);
        }
    }
    
}
