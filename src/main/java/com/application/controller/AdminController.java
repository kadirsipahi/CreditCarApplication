package com.application.controller;

import com.application.model.Admin;
import com.application.service.core.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/save")
    @ResponseBody
    public Admin save(@RequestBody Admin model){
        if (model == null){
            return null;
        }
        return adminService.save(model);
    }

    @GetMapping("/findById/{adminId}")
    @ResponseBody
    public Optional<Admin> findById(@RequestParam("adminId") String adminId){
        return adminService.findById(Long.valueOf(adminId));
    }

    @GetMapping("/delete/{adminId}")
    @ResponseBody
    public void deleteById(@RequestParam("adminId") Long adminId){
        adminService.deleteById(adminId);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<Admin> findAll(){
        return adminService.findAll();
    }
}
