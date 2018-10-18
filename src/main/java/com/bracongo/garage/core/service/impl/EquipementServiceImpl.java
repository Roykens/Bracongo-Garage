package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IEquipementDao;
import com.bracongo.garage.core.entity.Equipements;
import com.bracongo.garage.core.service.IEquipementService;
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
public class EquipementServiceImpl implements IEquipementService{
    
    @Autowired
    private IEquipementDao equipementDao;

    @Override
    public List<Equipements> getAllEquipements() {
        return equipementDao.getAllEquipements();
                
    }

    @Override
    public List<Equipements> getAllMotos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipements> getAllCamions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipements> getAllGrElectrogene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipements> getAllVehicules() {
        return equipementDao.findAll();
    }

    @Override
    public List<Equipements> getAllElevateurs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipements getById(String id) {
        System.out.println("hereeeeeeeeeeeeee" + id);
        Equipements e =  equipementDao.getById(id);
        System.out.println(e);
        return e;
    }
    
}
