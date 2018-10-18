package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Articles;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface IPdrService extends ICrudService<Articles>{
    
    public List<Articles> getAllPdr();
    
    public Articles getById(String idPdr);
}
