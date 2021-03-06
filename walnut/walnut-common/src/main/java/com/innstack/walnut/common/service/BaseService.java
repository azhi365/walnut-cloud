package com.innstack.walnut.common.service;

import java.util.List;

public interface BaseService<T> {

    Boolean save(T entity);

    Boolean update(T entity);

    Boolean delete(Long id);

    T getById(Long id);

    List<T> listAll();

    List<T> listAll(T entity);
}
