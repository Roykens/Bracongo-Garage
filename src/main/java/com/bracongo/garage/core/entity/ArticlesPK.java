/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bracongo.garage.core.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author vr.kenfack
 */
@Embeddable
public class ArticlesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "ART_SOCIETE")
    private String artSociete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "ART_ARTICLE")
    private String artArticle;

    public ArticlesPK() {
    }

    public ArticlesPK(String artSociete, String artArticle) {
        this.artSociete = artSociete;
        this.artArticle = artArticle;
    }

    public String getArtSociete() {
        return artSociete;
    }

    public void setArtSociete(String artSociete) {
        this.artSociete = artSociete;
    }

    public String getArtArticle() {
        return artArticle;
    }

    public void setArtArticle(String artArticle) {
        this.artArticle = artArticle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artSociete != null ? artSociete.hashCode() : 0);
        hash += (artArticle != null ? artArticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArticlesPK)) {
            return false;
        }
        ArticlesPK other = (ArticlesPK) object;
        if ((this.artSociete == null && other.artSociete != null) || (this.artSociete != null && !this.artSociete.equals(other.artSociete))) {
            return false;
        }
        if ((this.artArticle == null && other.artArticle != null) || (this.artArticle != null && !this.artArticle.equals(other.artArticle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bracongo.garage.core.entity.ArticlesPK[ artSociete=" + artSociete + ", artArticle=" + artArticle + " ]";
    }
    
}
