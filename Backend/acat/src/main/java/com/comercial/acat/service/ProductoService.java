package com.comercial.acat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comercial.acat.entity.Pedido;
import com.comercial.acat.entity.Producto;
import com.comercial.acat.repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {
	
	@Autowired
	ProductoRepository pr;
	
	public Producto CrearProducto(Producto p) {
		return pr.save(p);
	}
	

	    public List<Producto> findAll(){
			return pr.findAll(); 
		}
		
		public Optional<Producto> getById(int idproducto){
			return pr.findById(idproducto);
			//devuelve un proyecto filtrado por id
		}
	    
	  
	    public void delete(int id) {
	        pr.deleteById(id);
	    }
	    
	    public boolean existsById(int id) {
			return pr.existsById(id);
		}

	
	

}
