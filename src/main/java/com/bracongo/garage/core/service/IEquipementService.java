package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Equipements;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface IEquipementService {
    
    public List<Equipements> getAllEquipements();
    
    public List<Equipements> getAllMotos();
    
    public List<Equipements> getAllCamions();
    
    public List<Equipements> getAllGrElectrogene();
    
    public List<Equipements> getAllVehicules();
    
    public List<Equipements> getAllElevateurs();
    
    public Equipements getById(String id);
}
