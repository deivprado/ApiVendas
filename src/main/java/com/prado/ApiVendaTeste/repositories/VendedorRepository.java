package com.prado.ApiVendaTeste.repositories;

import com.prado.ApiVendaTeste.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
