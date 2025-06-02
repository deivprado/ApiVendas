package com.prado.ApiVendaTeste.entities;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "estoque")
@Entity(name = "estoque")
@EqualsAndHashCode(of = "id")
public class Estoque {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int quantidade;

    @OneToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = false)
    private Produto produto;
}
