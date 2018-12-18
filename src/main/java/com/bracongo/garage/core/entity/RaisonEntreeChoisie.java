package com.bracongo.garage.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "RAISONENTREEPROPRIETAIRE")
@XmlRootElement
public class RaisonEntreeChoisie implements Serializable{

    @OneToMany(mappedBy = "raisonEntreeChoisie")
    private List<CheckRaisonSortie> checkRaisonSorties;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private EntreeGarage entreeGarage;
    
    @ManyToOne
    private RaisonEntree raisonEntree;
    
    @Enumerated(EnumType.STRING)
    private OrigineRaisonEntree origineRaisonEntree;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntreeGarage getEntreeGarage() {
        return entreeGarage;
    }

    public void setEntreeGarage(EntreeGarage entreeGarage) {
        this.entreeGarage = entreeGarage;
    }

    public RaisonEntree getRaisonEntree() {
        return raisonEntree;
    }

    public void setRaisonEntree(RaisonEntree raisonEntree) {
        this.raisonEntree = raisonEntree;
    }

    public OrigineRaisonEntree getOrigineRaisonEntree() {
        return origineRaisonEntree;
    }

    public void setOrigineRaisonEntree(OrigineRaisonEntree origineRaisonEntree) {
        this.origineRaisonEntree = origineRaisonEntree;
    }

    public List<CheckRaisonSortie> getCheckRaisonSorties() {
        return checkRaisonSorties;
    }

    public void setCheckRaisonSorties(List<CheckRaisonSortie> checkRaisonSorties) {
        this.checkRaisonSorties = checkRaisonSorties;
    }

}
