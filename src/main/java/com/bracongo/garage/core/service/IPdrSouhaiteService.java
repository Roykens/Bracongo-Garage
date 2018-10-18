package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Articles;
import com.bracongo.garage.core.entity.PdrSouhaite;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface IPdrSouhaiteService extends ICrudService<PdrSouhaite>{
    
    public PdrSouhaite saveOrUpdatePrdSouhaite(Long idEntreeGarage, String pdrId);
    
    public List<Articles> getPdrSouhaiteByEntree(Long idEntreeGarage);
}
