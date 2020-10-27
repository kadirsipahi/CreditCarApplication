package com.application.controller;

import com.application.model.Customer;
import com.application.service.core.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    @ResponseBody
    public Customer save(@RequestBody Customer model) {
        if (model == null){
            return null;
        }
        return customerService.save(model);
    }

    @GetMapping("/findById/{customerId}")
    @ResponseBody
    public Optional<Customer> findById(@RequestParam("adminId") Long customerId){
        return customerService.findById(customerId);
    }

    @PostMapping("/deleteById/{customerId}")
    @ResponseBody
    public void deleteById(@RequestParam("adminId") Long customerId){
        if (customerId == null){
            return;
        }
        customerService.deleteById(customerId);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
