package com.grupotapiceria.tapiceria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupotapiceria.tapiceria.model.Administrador;
import com.grupotapiceria.tapiceria.repositorio.AdministradorRepository;
@Service
public class AdministradorService {
	
	@Autowired
	
	private AdministradorRepository administradorRepository;
	
	
	//metodo para guardar el administrador
	public Administrador create (Administrador administrador) {
		 return  administradorRepository.save(administrador);
		  
	  }
	
	//listar administrador
	
	 public List<Administrador> getAdministradors(){
		  return administradorRepository.findAll();
		  
	  }
	
	 //metodo de boorrado
	 
	 public void  delete (Administrador administrador) {
		 administradorRepository.delete(administrador);
		  
	  }
	 
	
	 public Optional<Administrador> findById (Long id_admin) {
		 return  administradorRepository.findById(id_admin);
		  
	  }

}
