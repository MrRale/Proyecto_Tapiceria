package com.comercial.acat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comercial.acat.entity.ProductoStock;


@Repository
public interface ProductoStockRepository  extends JpaRepository<ProductoStock, Integer>{
	
	

}
