package com.grupotapiceria.tapiceria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupotapiceria.tapiceria.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
