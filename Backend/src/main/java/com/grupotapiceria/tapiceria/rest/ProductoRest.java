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

import com.grupotapiceria.tapiceria.model.Producto;
import com.grupotapiceria.tapiceria.service.ProductoService;

@RestController
@RequestMapping("/api/producto/")
public class ProductoRest {
	@Autowired
	private ProductoService productoService;
	
	@PostMapping
	private ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
		Producto temporal = productoService.create(producto);

		try {
			return ResponseEntity.created(new URI("/api/producto" + temporal.getId_producto())).body(temporal);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<Producto>> ListarTodasLosProductos() {
		return ResponseEntity.ok(productoService.getAllProductos());

	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarProducto(@RequestBody Producto producto) {
		productoService.delete(producto);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "{id_producto}")
	private ResponseEntity<Optional<Producto>> ListarProductoPorId(@PathVariable("id_producto") Long id_producto) {
		return ResponseEntity.ok(productoService.findById(id_producto));

	}

}
