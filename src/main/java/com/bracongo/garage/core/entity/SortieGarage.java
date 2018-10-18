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
import javax.persistence.OneToOne;
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
@Table(name = "SORTIE_GARAGE")
public class SortieGarage implements Serializable{

    @OneToMany(mappedBy = "sortieGarage")
    @JsonIgnore
    private List<ReponseSortie> reponseSorties;

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSortie;
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date heureSortie;
    
    private String demandeur;
    
    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur;
    
    private String charrois;
    
    private Double kilometre;
    
    private Double niveauEssence;
    
    private int heure;
    
    private String lieu;
    
    private Double hubdomètre;
    
    @OneToMany(mappedBy = "sortieGarage")
    @JsonIgnore
    private List<Observation> observations;
    
    @OneToOne
    @JsonIgnore
    private EntreeGarage entreeGarage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Date getHeureSortie() {
        return heureSortie;
    }

    public void setHeureSortie(Date heureSortie) {
        this.heureSortie = heureSortie;
    }

    public String getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(String demandeur) {
        this.demandeur = demandeur;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
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

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Double getHubdomètre() {
        return hubdomètre;
    }

    public void setHubdomètre(Double hubdomètre) {
        this.hubdomètre = hubdomètre;
    }

    public List<Observation> getObservations() {
        return observations;
    }

    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    public List<ReponseSortie> getReponseSorties() {
        return reponseSorties;
    }

    public void setReponseSorties(List<ReponseSortie> reponseSorties) {
        this.reponseSorties = reponseSorties;
    }

    public EntreeGarage getEntreeGarage() {
        return entreeGarage;
    }

    public void setEntreeGarage(EntreeGarage entreeGarage) {
        this.entreeGarage = entreeGarage;
    }
    
    
    
}
