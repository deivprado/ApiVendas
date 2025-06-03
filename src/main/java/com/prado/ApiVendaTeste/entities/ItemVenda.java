package com.prado.ApiVendaTeste.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "venda_it")
@Entity(name = "itemVenda")
@EqualsAndHashCode(of = "id")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantidade;

    private double preco_unitario;

    private double subtotal;

    @ManyToOne
    @JoinColumn(name = "venda_id", referencedColumnName = "id", nullable = false)
    private Venda venda;

    @ManyToOne
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = false)
    private Produto produto;


}
