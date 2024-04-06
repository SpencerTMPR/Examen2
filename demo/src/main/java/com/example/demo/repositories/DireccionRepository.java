package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer> {
    
}
