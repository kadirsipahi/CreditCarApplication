package com.application.service;

import com.application.dao.CustomerDao;
import com.application.model.Customer;
import com.application.service.core.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public Customer save(Customer model) {
        return customerDao.save(model);
    }
    @Override
    public Optional<Customer> findById(Long customerId){
        return customerDao.findById(customerId);
    }
    @Override
    @Transactional
    public void deleteById(Long customerId){
        customerDao.deleteById(customerId);
    }
    @Override
    public List<Customer> findAll(){
        return customerDao.findAll();
    }
}
