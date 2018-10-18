package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.TravailEntree;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface ITravailEntreeService extends ICrudService<TravailEntree>{
    
    public TravailEntree saveOrUpdate(TravailEntree travailEntree);
    
    public List<TravailEntree> getAllByEntreeGarage(Long idEntreeGarage);
}
