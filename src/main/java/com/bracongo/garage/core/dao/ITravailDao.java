package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.Travail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vr.kenfack
 */
@Repository
public interface ITravailDao extends JpaRepository<Travail, Long>{
    
    @Query("select t from Travail t where t.entreeGarage = :entree ")
    public List<Travail> getAllTravailByEntree(@Param("entree") EntreeGarage entreeGarage);
    
}
