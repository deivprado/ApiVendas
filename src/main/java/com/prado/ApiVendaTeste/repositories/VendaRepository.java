package com.prado.ApiVendaTeste.repositories;

import com.prado.ApiVendaTeste.entities.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
