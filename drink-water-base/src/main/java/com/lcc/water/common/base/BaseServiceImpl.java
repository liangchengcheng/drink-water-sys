package com.lcc.water.common.base;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T,ID> {

    private BaseMapper<T, ID> baseMapper;

    public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
        this.baseMapper = baseMapper;
    }

    public T findById(ID id) {
        return baseMapper.findById(id);
    }

    public List<T> findAll(){
        return baseMapper.findAll();
    }

    public Integer insert(T model) {
        return baseMapper.insert(model);
    }

    public Integer delete(ID id) {
        return baseMapper.delete(id);
    }

    public Integer update(T model) {
        return baseMapper.update(model);
    }

}
