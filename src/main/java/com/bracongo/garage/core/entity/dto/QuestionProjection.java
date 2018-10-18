package com.bracongo.garage.core.entity.dto;

import java.io.Serializable;

/**
 *
 * @author vr.kenfack
 */
public class QuestionProjection implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private Long idQuestion;
    
    private String equipementType;

    public QuestionProjection(Long id, Long idQuestion, String equipementType) {
        this.id = id;
        this.idQuestion = idQuestion;
        this.equipementType = equipementType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    public QuestionProjection() {
    }

    public Long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(Long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getEquipementType() {
        return equipementType;
    }

    public void setEquipementType(String equipementType) {
        this.equipementType = equipementType;
    }
    
    
}
