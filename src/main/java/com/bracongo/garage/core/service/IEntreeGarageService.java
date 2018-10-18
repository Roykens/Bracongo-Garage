package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.dto.Entree;
import com.bracongo.garage.core.entity.dto.EntreeDto;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface IEntreeGarageService {
    public EntreeGarage saveOrUpdateEntreeGarage(EntreeGarage entre);
    
    public List<EntreeGarage> getAllEntree();
    
    public EntreeGarage findById(Long id);
    
    public EntreeGarage findByEquipement(String equipementId);
    
    public Entree saveFromWeb(EntreeDto entreeDto);
    
    public List<Entree> getAll();
    
    public void saveSortieFromWeb(EntreeDto entreeDto);
}
