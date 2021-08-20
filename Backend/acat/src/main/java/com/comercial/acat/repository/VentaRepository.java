package com.comercial.acat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.comercial.acat.entity.Venta;

@Repository
@Transactional
public interface VentaRepository  extends JpaRepository<Venta, Integer> {
	
	
	
}