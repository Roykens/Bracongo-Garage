package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Travail;
import com.bracongo.garage.core.entity.dto.TravailDto;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface ITravailService extends ICrudService<Travail>{
    
    public TravailDto saveTravail(TravailDto travailDto) ;
    
    public List<TravailDto> getAllByEntreeEquipement(Long entreeId);
    
    
}
