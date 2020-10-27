package com.application.dao.core;

import com.application.model.core.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDao<E extends BaseModel> extends JpaRepository<E, Long> {
}
