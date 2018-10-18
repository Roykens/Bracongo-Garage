package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vr.kenfack
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "TRAVAIL_ENTREE")
public class TravailEntree implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String titre;
    
    @Column
    private String description;
    
    @ManyToOne
    @JsonIgnore
    private EntreeGarage entreeGrarage;

    public TravailEntree() {
    }
    
    

    public TravailEntree(String description, EntreeGarage entreeGrarage) {
        this.description = description;
        this.entreeGrarage = entreeGrarage;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EntreeGarage getEntreeGrarage() {
        return entreeGrarage;
    }

    public void setEntreeGrarage(EntreeGarage entreeGrarage) {
        this.entreeGrarage = entreeGrarage;
    }
    
    
    
}
