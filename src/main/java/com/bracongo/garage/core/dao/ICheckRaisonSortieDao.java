package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.CheckRaisonSortie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vr.kenfack
 */
@Repository
public interface ICheckRaisonSortieDao extends JpaRepository<CheckRaisonSortie, Long>{
    
}
