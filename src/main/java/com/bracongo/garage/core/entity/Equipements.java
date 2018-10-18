package com.bracongo.garage.core.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "EQUIPEMENTS")
@NamedQueries({
    @NamedQuery(name = "Equipements.findAll", query = "SELECT e FROM Equipements e")
    , @NamedQuery(name = "Equipements.findByEquDesignation", query = "SELECT e FROM Equipements e WHERE e.equDesignation = :equDesignation")
    , @NamedQuery(name = "Equipements.findByEquCf", query = "SELECT e FROM Equipements e WHERE e.equCf = :equCf")
    , @NamedQuery(name = "Equipements.findByEquFamille", query = "SELECT e FROM Equipements e WHERE e.equFamille = :equFamille")
    , @NamedQuery(name = "Equipements.findByEquGroupe", query = "SELECT e FROM Equipements e WHERE e.equGroupe = :equGroupe")
    , @NamedQuery(name = "Equipements.findByEquNoInvent", query = "SELECT e FROM Equipements e WHERE e.equNoInvent = :equNoInvent")
    , @NamedQuery(name = "Equipements.findByEquResponsable", query = "SELECT e FROM Equipements e WHERE e.equResponsable = :equResponsable")
    , @NamedQuery(name = "Equipements.findByEquType", query = "SELECT e FROM Equipements e WHERE e.equType = :equType")
    , @NamedQuery(name = "Equipements.findByEquMarque", query = "SELECT e FROM Equipements e WHERE e.equMarque = :equMarque")
    , @NamedQuery(name = "Equipements.findByEquDateAchat", query = "SELECT e FROM Equipements e WHERE e.equDateAchat = :equDateAchat")
    , @NamedQuery(name = "Equipements.findByEquOrganeOblig", query = "SELECT e FROM Equipements e WHERE e.equOrganeOblig = :equOrganeOblig")
    , @NamedQuery(name = "Equipements.findByEquDernierBt", query = "SELECT e FROM Equipements e WHERE e.equDernierBt = :equDernierBt")})
public class Equipements implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "EQU_EQUIPEMENT")
    
    private String equEquipement;
    
    @Column(name = "EQU_DESIGNATION")
    private String equDesignation;
    
    @Column(name = "EQU_CF")
    private String equCf;
    
    @Column(name = "EQU_FAMILLE")
    private String equFamille;
    
    @Column(name = "EQU_GROUPE")
    private String equGroupe;
    
    @Column(name = "EQU_NO_INVENT")
    @Id
    private String equNoInvent;
    
    @Column(name = "EQU_RESPONSABLE")
    private String equResponsable;
       
    @Column(name = "EQU_TYPE")
    private String equType;
    
    @Column(name = "EQU_MARQUE")
    private String equMarque;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date equDateAchat;
    
    private Short equOrganeOblig;
    
    private Long equDernierBt;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date equDateCre;


    public Equipements() {
    }

    public String getEquDesignation() {
        return equDesignation != null? equDesignation.trim() : equDesignation;
    }

    public void setEquDesignation(String equDesignation) {
        this.equDesignation = equDesignation;
    }

    public String getEquCf() {
        return equCf != null ? equCf.trim() : equCf;
    }

    public void setEquCf(String equCf) {
        this.equCf = equCf;
    }

    public String getEquFamille() {
        return equFamille != null ? equFamille.trim() : equFamille;
    }

    public void setEquFamille(String equFamille) {
        this.equFamille = equFamille;
    }

    public String getEquGroupe() {
        return equGroupe != null ? equGroupe.trim() : equGroupe;
    }

    public void setEquGroupe(String equGroupe) {
        this.equGroupe = equGroupe;
    }

    public String getEquNoInvent() {
        return equNoInvent != null ? equNoInvent.trim() : equNoInvent;
    }

    public void setEquNoInvent(String equNoInvent) {
        this.equNoInvent = equNoInvent;
    }

    public String getEquResponsable() {
        return equResponsable != null ? equResponsable.trim() : equResponsable;
    }

    public void setEquResponsable(String equResponsable) {
        this.equResponsable = equResponsable;
    }

    public String getEquType() {
        return equType != null ? equType.trim() : equType;
    }

    public void setEquType(String equType) {
        this.equType = equType;
    }

    public String getEquMarque() {
        return equMarque != null ? equMarque.trim() : equMarque;
    }

    public void setEquMarque(String equMarque) {
        this.equMarque = equMarque;
    }

    public Date getEquDateAchat() {
        return equDateAchat;
    }

    public void setEquDateAchat(Date equDateAchat) {
        this.equDateAchat = equDateAchat;
    }

    public Short getEquOrganeOblig() {
        return equOrganeOblig;
    }

    public void setEquOrganeOblig(Short equOrganeOblig) {
        this.equOrganeOblig = equOrganeOblig;
    }

    public Long getEquDernierBt() {
        return equDernierBt;
    }

    public void setEquDernierBt(Long equDernierBt) {
        this.equDernierBt = equDernierBt;
    }

    public Date getEquDateCre() {
        return equDateCre;
    }

    public void setEquDateCre(Date equDateCre) {
        this.equDateCre = equDateCre;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equEquipement!= null ? equEquipement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipements)) {
            return false;
        }
        Equipements other = (Equipements) object;
        return !((this.equEquipement== null && other.equEquipement != null) || (this.equEquipement != null && !this.equEquipement.equals(other.equEquipement)));
    }

    @Override
    public String toString() {
        return "com.bracongo.garage.core.entity.Equipements[ equipements=" + equEquipement + " ]";
    }
    
    public EquipementType getType(){
        if(equGroupe.trim().equalsIgnoreCase("1002"))
            return EquipementType.CAMION;
        if(equGroupe.trim().equalsIgnoreCase("1000"))
            return EquipementType.AUTO;
        if(equGroupe.trim().equalsIgnoreCase("1001"))
            return EquipementType.MOTO;
        if(equGroupe.trim().equalsIgnoreCase("0038"))
            return EquipementType.GELECTROGENE;
        if(equGroupe.trim().equalsIgnoreCase("1005") || equGroupe.trim().equalsIgnoreCase("1015") || equGroupe.trim().equalsIgnoreCase("1027") || equGroupe.trim().equalsIgnoreCase("1028"))
            return EquipementType.ELEVATEUR;
        return null;
    }
    
}
