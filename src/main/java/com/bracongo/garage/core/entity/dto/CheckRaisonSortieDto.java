package com.bracongo.garage.core.entity.dto;

import com.bracongo.garage.core.entity.CheckRaisonResult;
import java.io.Serializable;

/**
 * Donnée envoyée par l'utilisateur au check de sortie
 * @author vr.kenfack
 */
public class CheckRaisonSortieDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Long idRaisonChoisie;
    
    private CheckRaisonResult checkRaisonResult;

    public Long getIdRaisonChoisie() {
        return idRaisonChoisie;
    }

    public void setIdRaisonChoisie(Long idRaisonChoisie) {
        this.idRaisonChoisie = idRaisonChoisie;
    }

    public CheckRaisonResult getCheckRaisonResult() {
        return checkRaisonResult;
    }

    public void setCheckRaisonResult(CheckRaisonResult checkRaisonResult) {
        this.checkRaisonResult = checkRaisonResult;
    }
   
}
