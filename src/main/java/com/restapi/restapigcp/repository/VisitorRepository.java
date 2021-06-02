package com.restapi.restapigcp.repository;

import com.restapi.restapigcp.Entity.Visitor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Integer> {
    
}
