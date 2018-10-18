package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "QUESTION")
@XmlRootElement
public class Question implements Serializable{

    @OneToMany(mappedBy = "question")
    @XmlTransient
    @JsonIgnore
    private List<QuestionEquipement> questionEquipements;

    @OneToMany(mappedBy = "question")
    @XmlTransient
    @JsonIgnore
    private List<ReponseEntree> reponseEntrees;
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String intitule;
    
    @Enumerated(EnumType.STRING)
    private QuestionType questionType;
  /*  
    @ElementCollection(targetClass = EquipementType.class, fetch = FetchType.EAGER )
    @Enumerated(EnumType.STRING)
    private Collection<EquipementType> equipementTypes;
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    @XmlTransient
    public List<ReponseEntree> getReponseEntrees() {
        return reponseEntrees;
    }

    public void setReponseEntrees(List<ReponseEntree> reponseEntrees) {
        this.reponseEntrees = reponseEntrees;
    }

    @XmlTransient
    public List<QuestionEquipement> getQuestionEquipements() {
        return questionEquipements;
    }

    public void setQuestionEquipements(List<QuestionEquipement> questionEquipements) {
        this.questionEquipements = questionEquipements;
    }
    
    
}
