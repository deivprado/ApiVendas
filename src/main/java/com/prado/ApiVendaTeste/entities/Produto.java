package com.prado.ApiVendaTeste.entities;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "produto")
@Entity(name = "produto")
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;

    private String descricao;
    @NotNull
    private double preco;

}
