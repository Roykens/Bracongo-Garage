package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.Equipements;
import com.bracongo.garage.core.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author vr.kenfack
 */
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface IUtilisateurDao extends JpaRepository<Utilisateur, Long>{
    
    @Query("select u from Utilisateur u where u.id = :id ")
    public Utilisateur getById(@Param("id") Long id);
    
    @Query("select u from Utilisateur u where u.login like :login ")
    public Utilisateur getByLogin(@Param("login") String login);
    
}
