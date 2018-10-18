package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.Equipements;
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
public interface IEquipementDao extends JpaRepository<Equipements, String>{
    
    @Query("select e from Equipements e where e.equGroupe in ('1002','1000','1001','0038','1005','1015','1027','1028')")
    public List<Equipements> getAllEquipements();
    
    @Query("select e from Equipements e where e.equNoInvent = :id ")
    public Equipements getById(@Param("id") String id);
    
}
