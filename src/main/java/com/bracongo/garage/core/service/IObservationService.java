package com.bracongo.garage.core.service;

import com.bracongo.garage.core.entity.EntreeGarage;
import com.bracongo.garage.core.entity.Observation;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */

@Transactional
public interface IObservationService extends ICrudService<Observation>{
    
    /**
     * Recupere toutes les observations d'un vehicule a l'entree du garage
     * @param entreeGarage
     * @return 
     */
    public List<Observation> getAllByEntree(Long idEntreeGarage);
    
    /**
     * Recupère toutes les observations à la sortie
     * @param idSortieGarage
     * @return 
     */
    public List<Observation> getAllBySortie(Long idSortieGarage);
}
