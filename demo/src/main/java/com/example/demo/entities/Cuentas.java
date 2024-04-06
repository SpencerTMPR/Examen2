package com.example.demo.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {

    @Id
    @Column(name="numerocuenta")
    private String numeroCuenta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;


    private double saldo;

    @Column(name="fechaapertura")
    private LocalDate fechaApertura;

    private boolean estado;

    private boolean sobregiro;

    @OneToMany(mappedBy = "cuentas" )
    private List<Movimientos> movimientos;
}
