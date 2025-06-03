package com.prado.ApiVendaTeste.repositories;

import com.prado.ApiVendaTeste.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
