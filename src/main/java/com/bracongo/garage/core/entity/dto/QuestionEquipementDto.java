package com.bracongo.garage.core.entity.dto;

import com.bracongo.garage.core.entity.QuestionType;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author vr.kenfack
 */
public class QuestionEquipementDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String intituleQuestion;
    
    private List<String> equipementType;
    
    private QuestionType questionType;

    public QuestionEquipementDto() {
    }
       

    public String getIntituleQuestion() {
        return intituleQuestion;
    }

    public void setIntituleQuestion(String intituleQuestion) {
        this.intituleQuestion = intituleQuestion;
    }

    public List<String> getEquipementType() {
        return equipementType;
    }

    public void setEquipementType(List<String> equipementType) {
        this.equipementType = equipementType;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "QuestionEquipementDto{" + "intituleQuestion=" + intituleQuestion + ", equipementType=" + equipementType + ", questionType=" + questionType + '}';
    }
    
    
    
}
