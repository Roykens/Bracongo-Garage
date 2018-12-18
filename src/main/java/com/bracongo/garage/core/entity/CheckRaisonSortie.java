package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "CHECKRAISONSORTIE")
@XmlRootElement
public class CheckRaisonSortie implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JsonIgnore
    private SortieGarage sortieGarage;
    
    @ManyToOne
    @JsonIgnore
    private RaisonEntreeChoisie raisonEntreeChoisie;
    
    @Enumerated(EnumType.STRING)
    private CheckRaisonResult resultat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SortieGarage getSortieGarage() {
        return sortieGarage;
    }

    public void setSortieGarage(SortieGarage sortieGarage) {
        this.sortieGarage = sortieGarage;
    }

    public CheckRaisonResult getResultat() {
        return resultat;
    }

    public void setResultat(CheckRaisonResult resultat) {
        this.resultat = resultat;
    }

    public RaisonEntreeChoisie getRaisonEntreeChoisie() {
        return raisonEntreeChoisie;
    }

    public void setRaisonEntreeChoisie(RaisonEntreeChoisie raisonEntreeChoisie) {
        this.raisonEntreeChoisie = raisonEntreeChoisie;
    }
    
    
}
