package com.lcc.water.common.base;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T,Object extends Serializable> {

    T findById(Object id);

    List<T> findAll();

    Integer insert(T model);

    Integer delete(Object id);

    Integer update(T model);
}
