package com.comercial.acat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.comercial.acat.entity.ProductoVendido;

@Repository
@Transactional
public interface ProductoVendidoRepository  extends JpaRepository<ProductoVendido, Integer> {

}
