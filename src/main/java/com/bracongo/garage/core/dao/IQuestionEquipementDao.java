package com.bracongo.garage.core.dao;

import com.bracongo.garage.core.entity.QuestionEquipement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vr.kenfack
 */
@Repository
public interface IQuestionEquipementDao extends JpaRepository<QuestionEquipement, Long>{
    
}
