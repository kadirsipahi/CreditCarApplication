package com.application.dao;

import com.application.dao.core.BaseDao;
import com.application.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends BaseDao<Customer> {
}
