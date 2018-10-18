package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IUtilisateurDao;
import com.bracongo.garage.core.entity.Utilisateur;
import com.bracongo.garage.core.service.IUtilisateurService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vr.kenfack
 */
@Service
public class UtilisateurServiceImpl implements IUtilisateurService{
    
    @Autowired
    private IUtilisateurDao utilisateurDao;

    @Override
    public Utilisateur save(Utilisateur entity) {
        return utilisateurDao.save(entity);
    }

    @Override
    public Utilisateur getById(Serializable id) {
        System.out.println("GET BY ID");
        Utilisateur u =  utilisateurDao.getOne((Long)id);
        return u;
    }
    
    @Override
    public Utilisateur getOneById(Long id) {
        return utilisateurDao.getById(id);
    }

    @Override
    public List<Utilisateur> getAll() {
        return utilisateurDao.findAll();
    }

    @Override
    public void delete(Serializable id) {
        utilisateurDao.deleteById((Long)id);
    }

    @Override
    public Utilisateur findByLogin(String login) {
        return utilisateurDao.getByLogin(login);
    }

    @Override
    public Utilisateur login(String login, String password) {
        System.out.println("RECEIVED : " + login);
        Utilisateur u = utilisateurDao.getByLogin(login);
        if(u != null){
            if(u.getPassword().trim().equals(password.trim())){
                System.out.println(u);
                return u;
            }
        }
        return null;
    }

   
}
