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
import com.comercial.acat.entity.Pedido;
import com.comercial.acat.entity.Producto;
import com.comercial.acat.service.ProductoService;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {
	
	@Autowired
	ProductoService ps;
	

@DeleteMapping("/delete/{idproducto}")
public ResponseEntity<?> Delete (@PathVariable ("idproducto") int idproducto){
	ps.delete(idproducto);
	return new ResponseEntity(new Mensaje("Producto eliminado correctamente"),HttpStatus.OK);
}

@GetMapping ("/listar")
public ResponseEntity<List<Producto>> list(){
	List<Producto> list = ps.findAll();
	return new ResponseEntity<List<Producto>>(list, HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Producto> saveProducto( @Valid @RequestBody Producto productoRequest)
{
	return new ResponseEntity<>(ps.CrearProducto(productoRequest), HttpStatus.OK);
}

@PutMapping("/actualizar")
public ResponseEntity<Producto> updateProducto(@Valid @RequestBody Producto productoRequest) {
	return new ResponseEntity<>(ps.CrearProducto(productoRequest), HttpStatus.OK);
}	



}
