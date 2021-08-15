package com.grupotapiceria.tapiceria.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupotapiceria.tapiceria.model.Inventario;
import com.grupotapiceria.tapiceria.service.InventarioService;

@RestController
@RequestMapping("/api/inventario/")
public class InventarioRest {
@Autowired
	
	private InventarioService inventarioService;
	//Metodo para postear el administrador
	@PostMapping
	private ResponseEntity<Inventario> guardar(@RequestBody Inventario inventario) {
		Inventario temporal = inventarioService.create(inventario);

		try {
			return ResponseEntity.created(new URI("/api/inventario" + temporal.getId_inventario())).body(temporal);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	//listar administradores
	@GetMapping
	private ResponseEntity<List<Inventario>> ListarTodasLosInventarios() {
		return ResponseEntity.ok(inventarioService.getInventarios());

	}
	
	
	@GetMapping(value = "{id_inventario}")
	private ResponseEntity<Optional<Inventario>> ListarInventarioPorId(@PathVariable("id_inventario") Long id_inventario) {
		return ResponseEntity.ok(inventarioService.findById(id_inventario));

	}


}
