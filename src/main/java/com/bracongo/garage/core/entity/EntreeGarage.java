package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
@XmlRootElement(name="entreeGarage")
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "ENTREE_GARAGE")
public class EntreeGarage implements Serializable{

    @OneToMany(mappedBy = "entreeGarage")
    @JsonIgnore
    private List<RaisonEntreeChoisie> raisonEntreeChoisies;

    @OneToOne(mappedBy = "entreeGarage")
    @JsonIgnore
    private SortieGarage sortieGarage;

    @OneToMany(mappedBy = "entreeGarage")
    @JsonIgnore
    private List<Travail> travails;

    @OneToMany(mappedBy = "entreeGrarage")
    @JsonIgnore
    private List<ReponseEntree> reponseEntrees;

    @OneToMany(mappedBy = "entree")
    @JsonIgnore
    private List<PdrSouhaite> pdrSouhaites;

    @OneToMany(mappedBy = "entreeGrarage")
    @JsonIgnore
    private List<TravailEntree> travailEntrees;
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateEntree;
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date heureEntree;
    
    private String demandeur;
    
    private String charrois;
     
    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur;
    
    private Double kilometre;
    
    private Double niveauEssence;
     
    private int heure;
    
    private String lieu;
    
    private Double hubdomètre;
    
    @OneToMany(mappedBy = "entreeGrarage")
    @JsonIgnore
    private List<Observation> observations;
    
    @Enumerated
    private EtapeVehicule etapeVehicule;
    
    @ManyToOne
    @JsonIgnore
    private Equipements equipements;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getHeureEntree() {
        return heureEntree;
    }

    public void setHeureEntree(Date heureEntree) {
        this.heureEntree = heureEntree;
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

    public List<TravailEntree> getTravailEntrees() {
        return travailEntrees;
    }

    public void setTravailEntrees(List<TravailEntree> travailEntrees) {
        this.travailEntrees = travailEntrees;
    }

    public List<PdrSouhaite> getPdrSouhaites() {
        return pdrSouhaites;
    }

    public void setPdrSouhaites(List<PdrSouhaite> pdrSouhaites) {
        this.pdrSouhaites = pdrSouhaites;
    }

    public List<ReponseEntree> getReponseEntrees() {
        return reponseEntrees;
    }

    public void setReponseEntrees(List<ReponseEntree> reponseEntrees) {
        this.reponseEntrees = reponseEntrees;
    }

    public String getCharrois() {
        return charrois;
    }

    public void setCharrois(String charrois) {
        this.charrois = charrois;
    }

    public EtapeVehicule getEtapeVehicule() {
        return etapeVehicule;
    }

    public void setEtapeVehicule(EtapeVehicule etapeVehicule) {
        this.etapeVehicule = etapeVehicule;
    }

    public Equipements getEquipements() {
        return equipements;
    }

    public void setEquipements(Equipements equipements) {
        this.equipements = equipements;
    }

    public List<Travail> getTravails() {
        return travails;
    }

    public void setTravails(List<Travail> travails) {
        this.travails = travails;
    }

    public SortieGarage getSortieGarage() {
        return sortieGarage;
    }

    public void setSortieGarage(SortieGarage sortieGarage) {
        this.sortieGarage = sortieGarage;
    }

    public List<RaisonEntreeChoisie> getRaisonEntreeChoisies() {
        return raisonEntreeChoisies;
    }

    public void setRaisonEntreeChoisies(List<RaisonEntreeChoisie> raisonEntreeChoisies) {
        this.raisonEntreeChoisies = raisonEntreeChoisies;
    }
    
    

    @Override
    public String toString() {
        return "EntreeGarage{" + "id=" + id + ", dateEntree=" + dateEntree + ", heureEntree=" + heureEntree + ", demandeur=" + demandeur + ", charrois=" + charrois + ", utilisateur=" + utilisateur + ", kilometre=" + kilometre + ", niveauEssence=" + niveauEssence + ", heure=" + heure + ", lieu=" + lieu + ", hubdom\u00e8tre=" + hubdomètre + ", etapeVehicule=" + etapeVehicule + ", equipements=" + equipements + '}';
    }
    
    
}
