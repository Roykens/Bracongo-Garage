package com.bracongo.garage.core.entity.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author vr.kenfack
 */
public class TravailDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int idEntree;

    private int idServeur;

    private String description;

    private String intituleTravail;

    private Date heureDebut;

    private Date heureFin;

    private String intervenant;

    private int idUtilisateur;
    
    private Set<String> pdrUtilises;

    public int getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(int idEntree) {
        this.idEntree = idEntree;
    }

    public int getIdServeur() {
        return idServeur;
    }

    public void setIdServeur(int idServeur) {
        this.idServeur = idServeur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntituleTravail() {
        return intituleTravail;
    }

    public void setIntituleTravail(String intituleTravail) {
        this.intituleTravail = intituleTravail;
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

    public String getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Set<String> getPdrUtilises() {
        return pdrUtilises;
    }

    public void setPdrUtilises(Set<String> pdrUtilises) {
        this.pdrUtilises = pdrUtilises;
    }
    
    

    @Override
    public String toString() {
        return "TravailDto{" + "idEntree=" + idEntree + ", idServeur=" + idServeur + ", description=" + description + ", intituleTravail=" + intituleTravail + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + ", intervenant=" + intervenant + ", idUtilisateur=" + idUtilisateur + '}';
    }
    
    
    
    
    
}
