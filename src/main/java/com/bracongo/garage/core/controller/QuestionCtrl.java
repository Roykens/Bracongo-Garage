package com.bracongo.garage.core.controller;

import com.bracongo.garage.core.entity.Question;
import com.bracongo.garage.core.entity.dto.QuestionEquipementDto;
import com.bracongo.garage.core.entity.dto.QuestionProjection;
import com.bracongo.garage.core.service.IQuestionService;
import java.util.List;
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
@RequestMapping("/questions")
public class QuestionCtrl {
    
    @Autowired
    private IQuestionService questionService;
    
    @RequestMapping(method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Question> addQuestion(@RequestBody QuestionEquipementDto qEdTO) {
        Question q = questionService.saveQuestion(qEdTO);
        return new ResponseEntity<>(q, HttpStatus.CREATED);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions= questionService.getAllQuestion();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/equipements")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<QuestionProjection>> getAllQuestionsEquipement() {
        List<QuestionProjection> questions= questionService.getAllQuestionEquipement();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
    
}
