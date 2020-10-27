package com.application.service.core;

import com.application.model.core.BaseModel;

import java.util.List;
import java.util.Optional;

public interface BaseService<M extends BaseModel> {

    public M save(M model);
    public Optional<M> findById(Long id);
    public void deleteById(Long id);
    public List<M> findAll();
}
