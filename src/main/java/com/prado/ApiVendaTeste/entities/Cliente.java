package com.prado.ApiVendaTeste.entities;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "cliente")
@Entity(name = "cliente")
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    private String telefone;
}
