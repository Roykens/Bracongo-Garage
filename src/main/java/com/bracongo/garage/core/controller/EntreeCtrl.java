package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.Observation;
import com.bracongo.garage.core.entity.dto.Entree;
import com.bracongo.garage.core.entity.dto.EntreeDto;
import com.bracongo.garage.core.entity.dto.TravailDto;
import com.bracongo.garage.core.service.IEntreeGarageService;
import com.bracongo.garage.core.service.IObservationService;
import com.bracongo.garage.core.service.ITravailService;
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
@RequestMapping("/entrees")
public class EntreeCtrl {
    
    @Autowired
    private IEntreeGarageService entreeGarageService;
    
    @Autowired
    private ITravailService travailService;
    
    @Autowired
    private IObservationService observationService;
    
    @RequestMapping(method = RequestMethod.POST , value = "/save")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Entree> saveEntree(@RequestBody EntreeDto entreeDto) {
       Entree e = entreeGarageService.saveFromWeb(entreeDto);
        return new ResponseEntity<>(e, HttpStatus.CREATED);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Entree>> saveEntree() {
       List<Entree> result = entreeGarageService.getAll();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    
    @RequestMapping(method = RequestMethod.POST , value = "/saveSortie")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Entree> saveSortie(@RequestBody EntreeDto entreeDto) {
        entreeGarageService.saveSortieFromWeb(entreeDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
      @RequestMapping(method = RequestMethod.GET, value = "/{idEntree}/travaux")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<TravailDto>> getTravailByEntree(@PathVariable("idEntree") Long idEntree) {
        List<TravailDto> travaux = travailService.getAllByEntreeEquipement(idEntree);
        return new ResponseEntity<>(travaux, HttpStatus.OK);
    }
    
      @RequestMapping(method = RequestMethod.GET, value = "/{idEntree}/observations")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Observation>> getObservationByEntree(@PathVariable("idEntree") Long idEntree) {
        List<Observation> observations = observationService.getAllByEntree(idEntree);
        return new ResponseEntity<>(observations, HttpStatus.OK);
    }
}
