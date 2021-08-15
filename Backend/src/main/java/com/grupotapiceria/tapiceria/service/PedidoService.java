package com.grupotapiceria.tapiceria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupotapiceria.tapiceria.model.Pedido;

import com.grupotapiceria.tapiceria.repositorio.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	
	private PedidoRepository pedidoRepository;
	
	
	//metodo para guardar el administrador
	public Pedido create (Pedido pedido) {
		 return  pedidoRepository.save(pedido);
		  
	  }
	//listar administrador
	
	 public List<Pedido> getPedidos(){
		  return pedidoRepository.findAll();
		  
	  }
	
	 //metodo de boorrado
	 
	 public void  delete (Pedido pedido) {
		 pedidoRepository.delete(pedido);
		  
	  }
	 
	
	 public Optional<Pedido> findById (Long id_pedido) {
		 return  pedidoRepository.findById(id_pedido);
		  
	  }

	
}
