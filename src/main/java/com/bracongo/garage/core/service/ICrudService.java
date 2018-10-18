package com.bracongo.garage.core.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author vr.kenfack
 */
@Transactional
public interface ICrudService<E> {

    E save(E entity);

    E getById(Serializable id);

    List<E> getAll();

    void delete(Serializable id);

}
