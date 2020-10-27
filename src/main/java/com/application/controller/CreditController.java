package com.application.controller;

import com.application.model.Credit;
import com.application.service.core.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/credit")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @PostMapping("/save")
    @ResponseBody
    public Credit save(@RequestBody Credit model) {
        if (model == null){
            return null;
        }
        return creditService.save(model);
    }

    @GetMapping("/findById/{creditId}")
    @ResponseBody
    public Optional<Credit> findById(@RequestParam("adminId") Long creditId){
        return creditService.findById(creditId);
    }

    @PostMapping("/deleteById/{creditId}")
    @ResponseBody
    public void deleteById(@RequestParam("adminId") Long creditId){
        if (creditId == null){
            return;
        }
        creditService.deleteById(creditId);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<Credit> findAll(){
        return creditService.findAll();
    }
}
