package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "OBSERVATION")
public class Observation implements Serializable {

    @ManyToOne
    @JsonIgnore
    private SortieGarage sortieGarage;

    @ManyToOne
    @JsonIgnore
    private EntreeGarage entreeGrarage;
    
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Lob
    @Column(length = 1000)
    private String observation;

    public Observation() {
    }
    
    

    public Observation(EntreeGarage entreeGrarage, String observation) {
        this.entreeGrarage = entreeGrarage;
        this.observation = observation;
    }

    public Observation(SortieGarage sortieGarage, String observation) {
        this.sortieGarage = sortieGarage;
        this.observation = observation;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public EntreeGarage getEntreeGrarage() {
        return entreeGrarage;
    }

    public void setEntreeGrarage(EntreeGarage entreeGrarage) {
        this.entreeGrarage = entreeGrarage;
    }

    public SortieGarage getSortieGarage() {
        return sortieGarage;
    }

    public void setSortieGarage(SortieGarage sortieGarage) {
        this.sortieGarage = sortieGarage;
    }
    
    
    
}
