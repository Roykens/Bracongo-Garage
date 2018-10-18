package com.bracongo.garage.core.entity.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Receive entry element from client to register in database
 * @author vr.kenfack
 */
public class EntreeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public EntreeDto() {
    }
    
    private Long idEntree;

    private Date dateEntree;

    private String idEquipement;

    private String demandeur;

    private String charrois;

    private Double kilometre;

    private Double niveauEssence;

    private int idUtilisateur;

    private int heure;

    private Double kilometreHubdo;
    
    private String lieu;

    private List<QuestionReponseDto> questionProjection;

    private List<String> observations;

    private List<String> travaux;

    private Set<String> pdrs;

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(String idEquipement) {
        this.idEquipement = idEquipement;
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

    public Double getNiveauEssence() {
        return niveauEssence;
    }

    public void setNiveauEssence(Double niveauEssence) {
        this.niveauEssence = niveauEssence;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public Double getKilometreHubdo() {
        return kilometreHubdo;
    }

    public void setKilometreHubdo(Double kilometreHubdo) {
        this.kilometreHubdo = kilometreHubdo;
    }

    public List<QuestionReponseDto> getQuestionProjection() {
        return questionProjection;
    }

    public void setQuestionProjection(List<QuestionReponseDto> questionProjections) {
        this.questionProjection = questionProjections;
    }

    public List<String> getObservations() {
        return observations;
    }

    public void setObservations(List<String> observations) {
        this.observations = observations;
    }

    public List<String> getTravaux() {
        return travaux;
    }

    public void setTravaux(List<String> travauxEntrees) {
        this.travaux = travauxEntrees;
    }

    public Set<String> getPdrs() {
        return pdrs;
    }

    public void setPdrs(Set<String> pdrs) {
        this.pdrs = pdrs;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
    

    @Override
    public String toString() {
        return "EntreeDto{" + "dateEntree=" + dateEntree + ", idEquipement=" + idEquipement + ", demandeur=" + demandeur + ", charrois=" + charrois + ", kilometre=" + kilometre + ", niveauEssence=" + niveauEssence + ", idUtilisateur=" + idUtilisateur + ", heure=" + heure + ", kilometreHubdo=" + kilometreHubdo + ", questionProjections=" + questionProjection + ", observations=" + observations + ", travauxEntrees=" + travaux + ", pdrs=" + pdrs + '}';
    }

    public Long getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(Long idEntree) {
        this.idEntree = idEntree;
    }
    
    
    
}
