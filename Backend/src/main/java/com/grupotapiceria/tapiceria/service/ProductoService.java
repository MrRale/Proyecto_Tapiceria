package com.grupotapiceria.tapiceria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupotapiceria.tapiceria.model.Producto;
import com.grupotapiceria.tapiceria.repositorio.ProductoRepository;

@Service
public class ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	
	
	public Producto create (Producto producto) {
		
		return productoRepository.save(producto);
	}
	
	public List<Producto> getAllProductos(){
		
		return productoRepository.findAll();
	}
	
	public void delete(Producto producto) {
		productoRepository.delete(producto);
	}
	
	public Optional<Producto> findById(Long id_producto){
		return productoRepository.findById(id_producto);
		
	}

	
}
