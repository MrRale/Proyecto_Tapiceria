package com.comercial.acat.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comercial.acat.dto.Mensaje;
import com.comercial.acat.entity.Usuario;
import com.comercial.acat.service.UserService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")

public class UsuarioController {
	@Autowired
	UserService us ;
	
	

@DeleteMapping("/delete/{idusuario}")
public ResponseEntity<?> Delete (@PathVariable ("idusuario") int idusuario){
	us.delete(idusuario);
	return new ResponseEntity(new Mensaje("Usuario eliminado correctamente"),HttpStatus.OK);
}

//@GetMapping ("/listar")
//public ResponseEntity<List<Usuario>> list(){
//	List list = us.findAll();
//	return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK); 

@GetMapping ("/{cedula}")
public ResponseEntity<Usuario> getByCedula (@PathVariable("cedula") int cedula){
	System.out.printf("");
	if (!us.existsById(cedula))
		return new ResponseEntity(("no existe"), HttpStatus.NOT_FOUND);
	Usuario user = us.traerUsuario(cedula).get();
	return new ResponseEntity<Usuario>(user, HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Usuario> saveUsuario( @Valid @RequestBody Usuario usuarioRequest)
{
	return new ResponseEntity<>(us.CrearUsuario(usuarioRequest), HttpStatus.OK);
}

@PutMapping("/actualizar")
public ResponseEntity<Usuario> updateUsuario(@Valid @RequestBody Usuario usuarioRequest) {
	return new ResponseEntity<>(us.CrearUsuario(usuarioRequest), HttpStatus.OK);
}	


	
	
}
