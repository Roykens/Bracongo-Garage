package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.Articles;
import com.bracongo.garage.core.service.IArticleService;
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
@RequestMapping("/pdrs")
public class ArticlesCtrl {
    
    @Autowired
    private IArticleService articleService;
    
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Articles>> getAllPdr() {
       List<Articles> result = articleService.getAll();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Articles> getById(@PathVariable("id") String id){
        Articles a =  articleService.getById(id);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
    
}
