package com.comercial.acat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.comercial.acat.entity.ProductoStock;
import com.comercial.acat.repository.ProductoStockRepository;

@Service
@Transactional
public class ProductoStockService {
	
	@Autowired
	ProductoStockRepository psr;
	
	public ProductoStock CrearProductoStock(ProductoStock ps){
		return psr.save(ps);
	}
	

	    public List<ProductoStock> findAll(){
			return psr.findAll(); 
		}
		
		public Optional<ProductoStock> getById(int idproducto){
			return psr.findById(idproducto);
		}
	    
		public Optional<ProductoStock> findId(int id) {
			return psr.findById(id);
		}
	  
	    public void delete(int id) {
	        psr.deleteById(id);
	    }
	    
	    public boolean existsById(int id) {
			return psr.existsById(id);
		}


}
