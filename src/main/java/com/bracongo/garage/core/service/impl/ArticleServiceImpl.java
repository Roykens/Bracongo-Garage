package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IArticleDao;
import com.bracongo.garage.core.entity.Articles;
import com.bracongo.garage.core.service.IArticleService;
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
public class ArticleServiceImpl implements IArticleService{
    
    @Autowired
    private IArticleDao articleDao;

    @Override
    public Articles getById(String idPdr) {
        if(idPdr != null){
            return articleDao.getById(idPdr);
        }
        return null;
    }

    @Override
    public Articles save(Articles entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Articles getById(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Articles> getAll() {
        return articleDao.findAll();
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
