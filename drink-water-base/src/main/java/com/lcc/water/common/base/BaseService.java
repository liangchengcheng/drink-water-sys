package com.lcc.water.common.base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable> {

    T findById(ID id);

    List<T> findAll();

    Integer insert(T model);

    Integer delete(ID id);

    Integer update(T model);
}
