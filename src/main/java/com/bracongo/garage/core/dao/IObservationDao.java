package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.Observation;
import com.bracongo.garage.core.entity.SortieGarage;
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
public interface IObservationDao extends JpaRepository<Observation, Long>{
    
    @Query("select o from Observation o where o.entreeGrarage = :entree ")
    public List<Observation> getAllByEntree(@Param("entree")EntreeGarage entreeGarage);
    
    @Query("select o from Observation o where o.sortieGarage = :sortie ")
    public List<Observation> getAllBySortie(@Param("sortie")SortieGarage sortieGarage);
}
