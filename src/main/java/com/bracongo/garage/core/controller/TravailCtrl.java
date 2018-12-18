package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.dto.TravailDto;
import com.bracongo.garage.core.service.ITravailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vr.kenfack
 */
@RestController
@RequestMapping("/travaux")
public class TravailCtrl {
    
    @Autowired
    private ITravailService travailService;
    
    @RequestMapping(method = RequestMethod.POST , value = "/save")
    @CrossOrigin(origins = "*")
    public ResponseEntity<TravailDto> saveTravail(@RequestBody TravailDto travailDto) {
       TravailDto tDto = travailService.saveTravail(travailDto);
        return new ResponseEntity<>(tDto, HttpStatus.CREATED);
    }
    
}
