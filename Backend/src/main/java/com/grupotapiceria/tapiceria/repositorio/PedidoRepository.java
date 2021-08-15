package com.grupotapiceria.tapiceria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupotapiceria.tapiceria.model.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
