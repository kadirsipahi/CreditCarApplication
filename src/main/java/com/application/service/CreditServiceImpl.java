package com.application.service;

import com.application.dao.CreditDao;
import com.application.model.Credit;
import com.application.service.core.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditDao creditDao;

    @Override
    @Transactional
    public Credit save(Credit model) {
        return creditDao.save(model);
    }
    @Override
    public Optional<Credit> findById(Long creditId){
        return creditDao.findById(creditId);
    }
    @Override
    @Transactional
    public void deleteById(Long creditId){
        creditDao.deleteById(creditId);
    }
    @Override
    public List<Credit> findAll(){
        return creditDao.findAll();
    }
}
