package com.prado.ApiVendaTeste.repositories;

import com.prado.ApiVendaTeste.entities.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
