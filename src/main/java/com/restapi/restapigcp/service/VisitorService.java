package com.restapi.restapigcp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import com.restapi.restapigcp.Entity.Visitor;
import com.restapi.restapigcp.repository.VisitorRepository;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

    
    public Visitor saveVisitor(Visitor visitor) {
        return visitorRepository.save(visitor);
    }
    
    public List<Visitor> saveVisitors(List<Visitor> visitors) {
        return visitorRepository.saveAll(visitors);

    }
    
    public Visitor getProductById(int id) {
        return visitorRepository.findById(id).orElse(null);

    }
    
    public List<Visitor> getProducts() {
        return visitorRepository.findAll();

    }

    
}
