package com.grupotapiceria.tapiceria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupotapiceria.tapiceria.model.Inventario;
import com.grupotapiceria.tapiceria.repositorio.InventarioRepository;

@Service
public class InventarioService {

@Autowired
	
	private InventarioRepository inventarioRepository;
	
	
	//metodo para guardar el administrador
	public Inventario create (Inventario inventario) {
		 return  inventarioRepository.save(inventario);
		  
	  }
	//listar administrador
	
	 public List<Inventario> getInventarios(){
		  return inventarioRepository.findAll();
		  
	  }
	
	 //metodo de boorrado
	 
	 
	 
	
	 public Optional<Inventario> findById (Long id_inventario) {
		 return  inventarioRepository.findById(id_inventario);
		  
	  }
	
}
