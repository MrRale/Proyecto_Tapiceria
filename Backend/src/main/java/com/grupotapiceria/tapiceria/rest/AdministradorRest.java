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

import com.grupotapiceria.tapiceria.model.Administrador;
import com.grupotapiceria.tapiceria.service.AdministradorService;


@RestController
@RequestMapping("/api/administrador/")

public class AdministradorRest {
	@Autowired
	
	private AdministradorService administradorService;
	//Metodo para postear el administrador
	@PostMapping
	private ResponseEntity<Administrador> guardar(@RequestBody Administrador administrador) {
		Administrador temporal = administradorService.create(administrador);

		try {
			return ResponseEntity.created(new URI("/api/administrador" + temporal.getId_admin())).body(temporal);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	//listar administradores
	@GetMapping
	private ResponseEntity<List<Administrador>> ListarTodasLosAdministrador() {
		return ResponseEntity.ok(administradorService.getAdministradors());

	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarAdministrador(@RequestBody Administrador administrador) {
		administradorService.delete(administrador);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id_admin}")
	private ResponseEntity<Optional<Administrador>> ListarAdministradorPorId(@PathVariable("id_admin") Long id_admin) {
		return ResponseEntity.ok(administradorService.findById(id_admin));

	}


}
