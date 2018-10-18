package com.bracongo.garage.core.entity.dto;

import com.bracongo.garage.core.entity.EntreeGarage;
import java.io.Serializable;
import java.util.Date;

/**
 * Send entry to client once it is registered in database
 * @author vr.kenfack
 */
public class Entree implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public Entree() {
    }
    
    public Entree(EntreeGarage entreeGarage){
        this.idServeur = entreeGarage.getId();
        this.idEquipement = entreeGarage.getEquipements().getEquNoInvent();
        this.type = entreeGarage.getEquipements().getType().name();
        this.dateEntree = entreeGarage.getDateEntree();
        this.designation = entreeGarage.getEquipements().getEquDesignation();
        this.demandeur = entreeGarage.getDemandeur();
        this.charrois = entreeGarage.getCharrois();
        this.etat = entreeGarage.getEtapeVehicule().name();
        this.niveauEssence = entreeGarage.getNiveauEssence();
        this.utilisateur = entreeGarage.getUtilisateur().getNom();
        this.idUtilisateur = entreeGarage.getUtilisateur().getId().intValue();
    }
    
    private Long idServeur;

    private Date dateEntree;

    private String demandeur;

    private String charrois;

   private Double kilometre;

   private Double kilometreHubdo;

    private Double niveauEssence;

    private String utilisateur;

    private int idUtilisateur;

   private String etat;

    private int heure;

    private String idEquipement;

    private String designation;

    private String type;

    public Long getIdServeur() {
        return idServeur;
    }

    public void setIdServeur(Long idServeur) {
        this.idServeur = idServeur;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(String demandeur) {
        this.demandeur = demandeur;
    }

    public String getCharrois() {
        return charrois;
    }

    public void setCharrois(String charrois) {
        this.charrois = charrois;
    }

    public Double getKilometre() {
        return kilometre;
    }

    public void setKilometre(Double kilometre) {
        this.kilometre = kilometre;
    }

    public Double getKilometreHubdo() {
        return kilometreHubdo;
    }

    public void setKilometreHubdo(Double kilometreHubdo) {
        this.kilometreHubdo = kilometreHubdo;
    }

    public Double getNiveauEssence() {
        return niveauEssence;
    }

    public void setNiveauEssence(Double niveauEssence) {
        this.niveauEssence = niveauEssence;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public String getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(String idEquipement) {
        this.idEquipement = idEquipement;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Entree{" + "idServeur=" + idServeur + ", dateEntree=" + dateEntree + ", demandeur=" + demandeur + ", charrois=" + charrois + ", kilometre=" + kilometre + ", kilometreHubdo=" + kilometreHubdo + ", niveauEssence=" + niveauEssence + ", utilisateur=" + utilisateur + ", idUtilisateur=" + idUtilisateur + ", etat=" + etat + ", heure=" + heure + ", idEquipement=" + idEquipement + ", designation=" + designation + ", type=" + type + '}';
    }  
    
}