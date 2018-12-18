package com.bracongo.garage.core.entity.dto;

import com.bracongo.garage.core.entity.OrigineRaisonEntree;
import java.io.Serializable;

/**
 *
 * @author vr.kenfack
 */
public class RaisonChoisieOrigine implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long idRaison;
    
    private OrigineRaisonEntree origineRaisonEntree;

    public RaisonChoisieOrigine() {
    }
    
    

    public Long getIdRaison() {
        return idRaison;
    }

    public void setIdRaison(Long idRaison) {
        this.idRaison = idRaison;
    }

    public OrigineRaisonEntree getOrigineRaisonEntree() {
        return origineRaisonEntree;
    }

    public void setOrigineRaisonEntree(OrigineRaisonEntree origineRaisonEntree) {
        this.origineRaisonEntree = origineRaisonEntree;
    }

    @Override
    public String toString() {
        return "RaisonChoisieOrigine{" + "idRaison=" + idRaison + ", origineRaisonEntree=" + origineRaisonEntree + '}';
    }

   

    
    
    
    
}
