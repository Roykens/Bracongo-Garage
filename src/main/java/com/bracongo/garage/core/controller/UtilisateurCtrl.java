package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.Utilisateur;
import com.bracongo.garage.core.service.IUtilisateurService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vr.kenfack
 */
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurCtrl {

    @Autowired
    private IUtilisateurService utilisateurService;

    /**
     *
     * @param u
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Utilisateur> addUser(@RequestBody Utilisateur u) {
        u = utilisateurService.save(u);
        return new ResponseEntity<>(u, HttpStatus.CREATED);
    }

    /**
     *
     * @param u
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> updateUser(@RequestBody Utilisateur u) {
        Utilisateur ut = utilisateurService.getById(u.getId());
        if (ut == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            utilisateurService.save(u);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Utilisateur> getUser(@PathVariable("id") Long id) {
        Utilisateur u = utilisateurService.getOneById(id);
        if (u == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.println(u);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Utilisateur>> getAllUsers() {
        List<Utilisateur> users = utilisateurService.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /**
     * 
     * @param id
     * @return 
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
        utilisateurService.delete(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
    
    @RequestMapping(value = "/login/{login}/{password}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Utilisateur> loginUser(@PathVariable("login") String login,@PathVariable("password") String password) {
        Utilisateur u = utilisateurService.login(login, password);
        if (u == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        //System.out.println(u);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

}
