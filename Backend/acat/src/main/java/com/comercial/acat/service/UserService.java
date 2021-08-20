package com.comercial.acat.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comercial.acat.entity.Producto;
import com.comercial.acat.entity.ProductoStock;
import com.comercial.acat.entity.Usuario;
import com.comercial.acat.repository.UserRepository;

import antlr.collections.List;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	public Usuario CrearUsuario(Usuario usuario) {
		return ur.save(usuario);
	}
	
//	public Optional<Usuario> getOne(String cedula){
//		return ur.findByCedula(cedula); //devuelve los productos por nombre
//	}

	  public List findAll(){
			 ur.findAll();
			return (List) ur.findAll(); 
		}
	    
	
//	  public boolean existeUsuario(String correo, String clave) {
//		  return ur.buscarUsuario(correo, clave);
//	  }
	  
	public Optional<Usuario> traerUsuario(int id) {
		return  ur.findById(id);
	}
		
		public Optional<Usuario> getById(int idusuario){
			return ur.findById(idusuario);
			// devuelve un proyecto filtrado por id
		}
	    
	  
	    public void delete(int id) {
	        ur.deleteById(id);
	    }
	    
	    public boolean existsById(int id) {
			return ur.existsById(id);
		}	
}
