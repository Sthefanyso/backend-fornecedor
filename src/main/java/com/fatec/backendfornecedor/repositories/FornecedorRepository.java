package com.fatec.backendfornecedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.backendfornecedor.entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository <Fornecedor, Integer> {
    
}
