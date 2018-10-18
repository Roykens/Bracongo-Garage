package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name = "PRD_SOUHAITE")
public class PdrSouhaite implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JsonIgnore
    private EntreeGarage entree;
    
    @ManyToOne
    @JsonIgnore
    private Articles pdr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntreeGarage getEntree() {
        return entree;
    }

    public void setEntree(EntreeGarage entree) {
        this.entree = entree;
    }

    public Articles getPdr() {
        return pdr;
    }

    public void setPdr(Articles pdr) {
        this.pdr = pdr;
    }
    
    
    
    
    
}
