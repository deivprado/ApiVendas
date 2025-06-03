package com.prado.ApiVendaTeste.repositories;

import com.prado.ApiVendaTeste.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
