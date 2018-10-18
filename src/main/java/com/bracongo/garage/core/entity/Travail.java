package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
@Table(name = "TRAVAIL")
public class Travail implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur;
    
    private String intervenant;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date heureDebut;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date heureFin;
    
    private String intituleTravail;
    
    private String description;
    
    
    @OneToMany(mappedBy = "travail")
    @JsonIgnore
    private List<PdrUtilise> pdrUtilises;
    
    @ManyToOne
    @JsonIgnore
    private EntreeGarage entreeGarage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public String getIntituleTravail() {
        return intituleTravail;
    }

    public void setIntituleTravail(String intituleTravail) {
        this.intituleTravail = intituleTravail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PdrUtilise> getPdrUtilises() {
        return pdrUtilises;
    }

    public void setPdrUtilises(List<PdrUtilise> pdrUtilises) {
        this.pdrUtilises = pdrUtilises;
    }

    public EntreeGarage getEntreeGarage() {
        return entreeGarage;
    }

    public void setEntreeGarage(EntreeGarage entreeGarage) {
        this.entreeGarage = entreeGarage;
    }

    @Override
    public String toString() {
        return "Travail{" + "id=" + id + ", intervenant=" + intervenant + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", intituleTravail=" + intituleTravail + ", description=" + description + '}';
    }
    
    

    
    
}
