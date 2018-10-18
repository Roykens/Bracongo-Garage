package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.ReponseEntree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vr.kenfack
 */
@Repository
public interface IReponseEntreeDao extends JpaRepository<ReponseEntree, Long>{
    
}
