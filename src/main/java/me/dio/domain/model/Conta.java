package me.dio.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(scale = 13, precision = 2)
    private BigDecimal saldo;

    @Column(scale = 13, precision = 2)
    private BigDecimal limite;
}
