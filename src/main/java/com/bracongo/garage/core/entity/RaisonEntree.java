package com.bracongo.garage.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "RAISONENTREE")
@XmlRootElement
public class RaisonEntree implements Serializable{

    @OneToMany(mappedBy = "raisonEntree")
    @JsonIgnore
    private List<RaisonEntreeChoisie> raisonEntreeChoisies;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private static final long serialVersionUID = 1L;
    
    private String intitule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public List<RaisonEntreeChoisie> getRaisonEntreeChoisies() {
        return raisonEntreeChoisies;
    }

    public void setRaisonEntreeChoisies(List<RaisonEntreeChoisie> raisonEntreeChoisies) {
        this.raisonEntreeChoisies = raisonEntreeChoisies;
    }
    
}
