package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.RaisonEntree;
import com.bracongo.garage.core.service.IRaisonEntreeService;
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
@RequestMapping("/raisonsEntree")
public class RaisonEntreeCtrl {
    
    @Autowired
    private IRaisonEntreeService raisonEntreeService;
    
    @RequestMapping(method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<RaisonEntree> addRaison(@RequestBody RaisonEntree rse) {
        RaisonEntree result = raisonEntreeService.save(rse);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<RaisonEntree>> getAllRaison() {
        List<RaisonEntree> result = raisonEntreeService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
        raisonEntreeService.delete(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
    
        @RequestMapping(method = RequestMethod.PUT)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Void> updateUser(@RequestBody RaisonEntree rse) {
        RaisonEntree re = raisonEntreeService.getById(rse.getId());
        if (re == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            raisonEntreeService.save(rse);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
