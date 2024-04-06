package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {
    
}
