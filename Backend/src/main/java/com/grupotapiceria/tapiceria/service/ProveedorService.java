package com.grupotapiceria.tapiceria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupotapiceria.tapiceria.model.Proveedor;
import com.grupotapiceria.tapiceria.repositorio.ProveedorRepository;

@Service

public class ProveedorService {
	@Autowired
	private ProveedorRepository proveedorRepository;
	
	public Proveedor create(Proveedor proveedor) {
		return proveedorRepository.save(proveedor) ;
	}
	
	public List<Proveedor> getAllProveedors(){
		return proveedorRepository.findAll();
		
	}
	
	public void delete(Proveedor proveedor) {
		proveedorRepository.delete(proveedor);
	}

	public Optional<Proveedor> findById(Long id_proveedor){
		return proveedorRepository.findById(id_proveedor);
		
	}
}
