package com.grupotapiceria.tapiceria.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupotapiceria.tapiceria.model.Pedido;
import com.grupotapiceria.tapiceria.service.PedidoService;




@RestController
@RequestMapping("/api/pedido/")
public class PedidoRest {
@Autowired
	
	private PedidoService pedidoService;
	//Metodo para postear el administrador
	@PostMapping
	private ResponseEntity<Pedido> guardar(@RequestBody Pedido pedido) {
		Pedido temporal = pedidoService.create(pedido);

		try {
			return ResponseEntity.created(new URI("/api/pedido" + temporal.getId_pedido())).body(temporal);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	//listar administradores
	@GetMapping
	private ResponseEntity<List<Pedido>> ListarTodasLosPedidos() {
		return ResponseEntity.ok(pedidoService.getPedidos());

	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarPedido(@RequestBody Pedido pedido) {
		pedidoService.delete(pedido);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id_pedido}")
	private ResponseEntity<Optional<Pedido>> ListarPedidoPorId(@PathVariable("id_pedido") Long id_pedido) {
		return ResponseEntity.ok(pedidoService.findById(id_pedido));

	}

	

}
