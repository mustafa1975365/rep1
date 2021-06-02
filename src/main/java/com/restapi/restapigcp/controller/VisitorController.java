package com.restapi.restapigcp.controller;

import com.restapi.restapigcp.Entity.Visitor;
import com.restapi.restapigcp.service.VisitorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {

    @Autowired
    private VisitorService visitorservice;

    @PostMapping("/addVisitor")
    public Visitor addVisitor(@RequestBody Visitor visitor) {
        return visitorservice.saveVisitor(visitor);
    }

}
