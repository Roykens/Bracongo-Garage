package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.Equipements;
import com.bracongo.garage.core.service.IEquipementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vr.kenfack
 */
@RestController
@RequestMapping("/equipements")
public class EquipementCtrl {
    
    @Autowired
    private IEquipementService equipementService;
    
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Equipements>> getAllEquipements(){
        List<Equipements> equips =  equipementService.getAllEquipements() ;
        return new ResponseEntity<>(equips, HttpStatus.OK);
    }
    
    
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Equipements> getById(@PathVariable("id") String id){
        Equipements e =  equipementService.getById(id) ;
        return new ResponseEntity<>(e, HttpStatus.OK);
    }
}
