package com.bracongo.garage.core.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "ARTICLES")
@NamedQueries({
    @NamedQuery(name = "Articles.findAll", query = "SELECT a FROM Articles a")
    , @NamedQuery(name = "Articles.findByArtDesignation", query = "SELECT a FROM Articles a WHERE a.artDesignation = :artDesignation")
    , @NamedQuery(name = "Articles.findByArtGroupe", query = "SELECT a FROM Articles a WHERE a.artGroupe = :artGroupe")
    , @NamedQuery(name = "Articles.findByArtMarque", query = "SELECT a FROM Articles a WHERE a.artMarque = :artMarque")})
public class Articles implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "ART_ARTICLE")
    @Id
    private String artArticle;
    
    @Column(name = "ART_DESIGNATION")
    private String artDesignation;
    
    @Column(name = "ART_GROUPE")
    private String artGroupe;
    
    @Column(name = "ART_MARQUE")
    private String artMarque;

    public Articles() {
    }

  
    public String getArtDesignation() {
        return artDesignation.trim();
    }

    public void setArtDesignation(String artDesignation) {
        this.artDesignation = artDesignation;
    }


    public String getArtGroupe() {
        return artGroupe.trim();
    }

    public void setArtGroupe(String artGroupe) {
        this.artGroupe = artGroupe;
    }

    public String getArtMarque() {
        return artMarque.trim();
    }

    public void setArtMarque(String artMarque) {
        this.artMarque = artMarque;
    }

    public String getArtArticle() {
        return artArticle.trim();
    }

    public void setArtArticle(String artArticle) {
        this.artArticle = artArticle;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artArticle != null ? artArticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articles)) {
            return false;
        }
        Articles other = (Articles) object;
        return !((this.artArticle == null && other.artArticle != null) || (this.artArticle != null && !this.artArticle.equals(other.artArticle)));
    }

    @Override
    public String toString() {
        return "com.bracongo.garage.core.entity.Articles[ articlesPK=" + artArticle + " ]";
    }
    
}
