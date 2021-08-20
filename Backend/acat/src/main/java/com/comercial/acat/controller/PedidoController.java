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
import com.comercial.acat.service.PedidoService;

@RestController
@RequestMapping("/pedido")
@CrossOrigin(origins = "http://localhost:4200")
public class PedidoController {
	@Autowired
	PedidoService ps;

@DeleteMapping("/delete/{idpedido}")
public ResponseEntity<?> Delete (@PathVariable ("idpedido") int idpedido){
	ps.delete(idpedido);
	return new ResponseEntity(new Mensaje("Pedido eliminado correctamente"),HttpStatus.OK);
}

@GetMapping ("/listar")
public ResponseEntity<List<Pedido>> list(){
	List<Pedido> list = ps.findAll();
	return new ResponseEntity<List<Pedido>>(list, HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Pedido> savePedido( @Valid @RequestBody Pedido pedidoRequest)
{
	return new ResponseEntity<>(ps.CrearPedido(pedidoRequest), HttpStatus.OK);
}


@PutMapping("/actualizar")
public ResponseEntity<Pedido> updatePedido(@Valid @RequestBody Pedido pedidoRequest) {
	return new ResponseEntity<>(ps.CrearPedido(pedidoRequest), HttpStatus.OK);
}	



}
