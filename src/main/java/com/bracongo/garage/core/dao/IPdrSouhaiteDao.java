package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.PdrSouhaite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vr.kenfack
 */
@Repository
public interface IPdrSouhaiteDao extends JpaRepository<PdrSouhaite, Long>{
    
}
