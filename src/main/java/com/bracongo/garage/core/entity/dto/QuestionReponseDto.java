package com.bracongo.garage.core.entity.dto;

import java.io.Serializable;

/**
 *
 * @author vr.kenfack
 */
public class QuestionReponseDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int idQuestion;

    private String reponse;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    
}
