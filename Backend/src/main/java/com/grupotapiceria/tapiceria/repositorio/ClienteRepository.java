package com.grupotapiceria.tapiceria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupotapiceria.tapiceria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
