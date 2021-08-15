package com.grupotapiceria.tapiceria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupotapiceria.tapiceria.model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {

	
}
