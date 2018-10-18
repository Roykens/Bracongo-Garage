package com.bracongo.garage.core.service.impl;

import com.bracongo.garage.core.dao.IQuestionDao;
import com.bracongo.garage.core.dao.IQuestionEquipementDao;
import com.bracongo.garage.core.entity.EquipementType;
import com.bracongo.garage.core.entity.Question;
import com.bracongo.garage.core.entity.QuestionEquipement;
import com.bracongo.garage.core.entity.dto.QuestionEquipementDto;
import com.bracongo.garage.core.entity.dto.QuestionProjection;
import com.bracongo.garage.core.service.IQuestionService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vr.kenfack
 */
@Service
public class QuestionServiceImpl implements IQuestionService{

    @Autowired
    private IQuestionDao questionDao;
    
    @Autowired
    private IQuestionEquipementDao questionEquipementDao;
    
    @Override
    public List<Question> getAllQuestion() {
        return questionDao.findAll();
    }

    @Override
    public Question save(Question entity) {
        return questionDao.save(entity);
    }

    @Override
    public Question getById(Serializable id) {
        return questionDao.getOne((Long)id);
    }

    @Override
    public List<Question> getAll() {
        return questionDao.findAll();
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Question saveQuestion(QuestionEquipementDto questionDto) {
        Question q = new Question();
        System.out.println("RECEIVED ===== " + questionDto);
        q.setIntitule(questionDto.getIntituleQuestion());
        q.setQuestionType(questionDto.getQuestionType());
        Question saved = questionDao.save(q);
        List<String> type = questionDto.getEquipementType();
        type.stream().map((string) -> {
            QuestionEquipement qe = new QuestionEquipement();
            qe.setEquipementType(EquipementType.valueOf(string));
            return qe;
        }).map((qe) -> {
            qe.setQuestion(saved);
            return qe;
        }).forEachOrdered((qe) -> {
            questionEquipementDao.save(qe);
        });
        return saved;
    }

    @Override
    public List<QuestionProjection> getAllQuestionEquipement() {
        List<QuestionEquipement> qeps =  questionEquipementDao.findAll();
        List<QuestionProjection> result = new ArrayList<>();
        qeps.forEach((qep) -> {
            result.add(new QuestionProjection(qep.getId(),qep.getQuestion().getId(), qep.getEquipementType().name()));
        });
        return result;
    }
    
}
