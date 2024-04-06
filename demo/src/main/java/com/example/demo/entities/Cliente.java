package com.example.demo.entities;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
@Data
public class Cliente {

    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @OneToOne(mappedBy = "cliente" )
    private Direccion direccion;

    @OneToMany(mappedBy = "cliente" )
    private List<Cuentas> cuentas;
}






