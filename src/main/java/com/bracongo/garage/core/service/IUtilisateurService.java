package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Utilisateur;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface IUtilisateurService extends ICrudService<Utilisateur>{
    
    public Utilisateur getOneById(Long id);
    
    public Utilisateur findByLogin(String login);
    
    public Utilisateur login(String login, String password);
    
}
