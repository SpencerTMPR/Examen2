package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movimientos;


@Repository
public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {
    
}
