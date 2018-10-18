package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vr.kenfack
 */
@Repository
public interface IArticleDao extends JpaRepository<Articles, String>{
    
    @Query("select a from Articles a where a.artArticle = :id ")
    public Articles getById(@Param("id") String id);
    
}
