package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.Question;
import com.bracongo.garage.core.entity.dto.QuestionEquipementDto;
import com.bracongo.garage.core.entity.dto.QuestionProjection;
import java.util.List;

/**
 *
 * @author vr.kenfack
 */
public interface IQuestionService extends ICrudService<Question>{
    
    public List<Question> getAllQuestion();
    
    public Question saveQuestion(QuestionEquipementDto questionDto);
    
    public List<QuestionProjection> getAllQuestionEquipement();
}
