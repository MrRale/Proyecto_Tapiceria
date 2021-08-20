package com.comercial.acat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comercial.acat.entity.Pedido;
import com.comercial.acat.entity.Producto;
import com.comercial.acat.repository.PedidoRepository;

@Service
@Transactional
public class PedidoService {
	
	
	@Autowired
	PedidoRepository pr;
	
	
	public Pedido CrearPedido(Pedido p) {
		return pr.save(p);
	}
	

	    public List<Pedido> findAll(){
			return pr.findAll(); 
		}
		
		public Optional<Pedido> getById(int idpedido){
			return pr.findById(idpedido);
			//devuelve un proyecto filtrado por id
		}
	    
	  
	    public void delete(int id) {
	        pr.deleteById(id);
	    }
	    
	    public boolean existsById(int id) {
			return pr.existsById(id);
		}

	
	

}
