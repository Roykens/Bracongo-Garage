package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Articles;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface IArticleService extends ICrudService<Articles>{
    
    public Articles getById(String idPdr);
    
}
