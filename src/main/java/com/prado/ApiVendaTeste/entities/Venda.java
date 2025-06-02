package com.prado.ApiVendaTeste.entities;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "venda")
@Entity(name = "venda")
@EqualsAndHashCode(of = "id")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //private LocalDateTime dataCompra;

    @NotNull
    private double total;

    @OneToMany
    @JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id", nullable = false)
    private Vendedor vendedor;
}
