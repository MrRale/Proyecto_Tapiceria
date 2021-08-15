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

import com.grupotapiceria.tapiceria.model.Proveedor;
import com.grupotapiceria.tapiceria.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedor/")
public class ProveedorRest {
	
	@Autowired
	private ProveedorService proveedorService;
	
	@PostMapping
	private ResponseEntity<Proveedor> guardar(@RequestBody Proveedor proveedor) {
		Proveedor temporal = proveedorService.create(proveedor);

		try {
			return ResponseEntity.created(new URI("/api/cliente" + temporal.getId_proveedor())).body(temporal);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<Proveedor>> ListarTodasLosProveedores() {
		return ResponseEntity.ok(proveedorService.getAllProveedors());

	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarProveedor(@RequestBody Proveedor proveedor) {
		proveedorService.delete(proveedor);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id_proveedor}")
	private ResponseEntity<Optional<Proveedor>> ListarProveedorPorId(@PathVariable("id_proveedor") Long id_proveedor) {
		return ResponseEntity.ok(proveedorService.findById(id_proveedor));

	}

}
