package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.RaisonEntreeChoisie;
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
public interface IRaisonEntreeChoisieDao extends JpaRepository<RaisonEntreeChoisie, Long>{
    
    @Query("select r from RaisonEntreeChoisie r where r.entreeGarage = :entree ")
    public List<RaisonEntreeChoisie> getAllByEntree(@Param("entree") EntreeGarage entree);
    
}
