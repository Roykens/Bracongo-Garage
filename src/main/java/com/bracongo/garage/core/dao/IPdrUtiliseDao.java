package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.PdrUtilise;
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
public interface IPdrUtiliseDao extends JpaRepository<PdrUtilise, Long>{
    
    @Query("select pdr from PdrUtilise pdr where pdr.travail = :travail ")
    public List<PdrUtilise> getAllByTravail(@Param("travail")Travail travail);
    
}
