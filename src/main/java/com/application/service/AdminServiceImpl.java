package com.application.service;

import com.application.dao.AdminDao;
import com.application.model.Admin;
import com.application.service.core.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminDao adminDao;

    @Override
    @Transactional
    public Admin save(Admin model) {
        return adminDao.save(model);
    }
    @Override
    public Optional<Admin> findById(Long adminId){
        return adminDao.findById(adminId);
    }
    @Override
    @Transactional
    public void deleteById(Long adminId){
        adminDao.deleteById(adminId);
    }
    @Override
    public List<Admin> findAll(){
        return adminDao.findAll();
    }
}
