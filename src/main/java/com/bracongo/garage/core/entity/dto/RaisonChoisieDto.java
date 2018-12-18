package com.bracongo.garage.core.entity.dto;

import java.io.Serializable;

/**
 * Données renvoyées à l'utilisateur pour usage local
 * @author vr.kenfack
 */
public class RaisonChoisieDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long idRaisonChoisie;
    
    private String nomRaison;
    
    private Long idEntree;
    
    private String auteur;

    public RaisonChoisieDto() {
    }
    
    

    public Long getIdRaisonChoisie() {
        return idRaisonChoisie;
    }

    public void setIdRaisonChoisie(Long idRaisonChoisie) {
        this.idRaisonChoisie = idRaisonChoisie;
    }

    public String getNomRaison() {
        return nomRaison;
    }

    public void setNomRaison(String nomRaison) {
        this.nomRaison = nomRaison;
    }

    public Long getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(Long idEntree) {
        this.idEntree = idEntree;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "RaisonChoisieDto{" + "idRaisonChoisie=" + idRaisonChoisie + ", nomRaison=" + nomRaison + ", idEntree=" + idEntree + ", auteur=" + auteur + '}';
    }
    
    
    
}
