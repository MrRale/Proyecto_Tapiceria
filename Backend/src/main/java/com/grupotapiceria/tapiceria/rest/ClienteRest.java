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

import com.grupotapiceria.tapiceria.model.Cliente;
import com.grupotapiceria.tapiceria.service.ClienteService;

@RestController
@RequestMapping("/api/cliente/")
public class ClienteRest {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	private ResponseEntity<Cliente> guardar(@RequestBody Cliente cliente) {
		Cliente temporal = clienteService.create(cliente);

		try {
			return ResponseEntity.created(new URI("/api/cliente" + temporal.getId_cliente())).body(temporal);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<Cliente>> ListarTodasLosClientes() {
		return ResponseEntity.ok(clienteService.getAClientes());

	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCliente(@RequestBody Cliente cliente) {
		clienteService.delete(cliente);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id_cliente}")
	private ResponseEntity<Optional<Cliente>> ListarClientePorId(@PathVariable("id_cliente") Long id_cliente) {
		return ResponseEntity.ok(clienteService.findById(id_cliente));

	}

	

}
