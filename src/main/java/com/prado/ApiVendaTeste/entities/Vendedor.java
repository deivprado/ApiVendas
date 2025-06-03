package com.prado.ApiVendaTeste.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "vendedor")
@Entity(name = "vendedor")
@EqualsAndHashCode(of = "id")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    private String telefone;
}
