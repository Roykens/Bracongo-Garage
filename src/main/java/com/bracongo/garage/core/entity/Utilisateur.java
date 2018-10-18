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

/**
 *
 * @author vr.kenfack
 */
@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur  implements Serializable{

    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<EntreeGarage> entreeGarages;

    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<Travail> travaux;

    @OneToMany(mappedBy = "utilisateur")
    @JsonIgnore
    private List<SortieGarage> sortieGarages;
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nom;
    
    private String login;
    
    private String password;

    public Utilisateur() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    public List<SortieGarage> getSortieGarages() {
        return sortieGarages;
    }

    public void setSortieGarages(List<SortieGarage> sortieGarages) {
        this.sortieGarages = sortieGarages;
    }

    public List<Travail> getTravaux() {
        return travaux;
    }

    public void setTravaux(List<Travail> travaux) {
        this.travaux = travaux;
    }

    public List<EntreeGarage> getEntreeGarages() {
        return entreeGarages;
    }

    public void setEntreeGarages(List<EntreeGarage> entreeGarages) {
        this.entreeGarages = entreeGarages;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id=" + id + ", nom=" + nom + ", login=" + login + ", password=" + password + '}';
    }
    
    
    
}
