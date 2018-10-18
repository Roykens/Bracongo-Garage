package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.entity.Articles;
import com.bracongo.garage.core.entity.PdrSouhaite;
import com.bracongo.garage.core.service.IPdrSouhaiteService;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author vr.kenfack
 */
@Service
public class PdrSouhaiteServiceImpl implements IPdrSouhaiteService{

    @Override
    public PdrSouhaite saveOrUpdatePrdSouhaite(Long idEntreeGarage, String pdrId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Articles> getPdrSouhaiteByEntree(Long idEntreeGarage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PdrSouhaite save(PdrSouhaite entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PdrSouhaite getById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PdrSouhaite> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
