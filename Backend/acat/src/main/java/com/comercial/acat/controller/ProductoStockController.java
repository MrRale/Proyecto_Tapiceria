package com.comercial.acat.controller;

import java.util.List;
import java.util.Optional;

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
import com.comercial.acat.entity.Producto;
import com.comercial.acat.entity.ProductoStock;
import com.comercial.acat.entity.ProductoVendido;
import com.comercial.acat.entity.Venta;
import com.comercial.acat.repository.ProductoStockRepository;
import com.comercial.acat.repository.ProductoVendidoRepository;
import com.comercial.acat.repository.VentaRepository;
import com.comercial.acat.service.ProductoService;
import com.comercial.acat.service.ProductoStockService;

@RestController
@RequestMapping("/productostock")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoStockController {
	
	@Autowired
	ProductoStockService ps;
	@Autowired
	ProductoStockRepository psr;
	@Autowired
	ProductoVendidoRepository pvr;

	

@DeleteMapping("/delete/{idproducto}")
public ResponseEntity<?> Delete (@PathVariable ("idproducto") int idproducto){
	ps.delete(idproducto);
	return new ResponseEntity(new Mensaje("Producto de stock eliminado correctamente"),HttpStatus.OK);
}

@GetMapping ("/listar")
public ResponseEntity<List<ProductoStock>> list(){
	List<ProductoStock> list = ps.findAll();
	return new ResponseEntity<List<ProductoStock>>(list, HttpStatus.OK);
}

@PostMapping("/pagar/{cantidad}")
public ResponseEntity<Producto> comprarProducto(@Valid @RequestBody ProductoStock proSelect, @PathVariable ("cantidad") int cantidad ){
	
	 
	 Venta v = new Venta();
	 
	ProductoStock prostock =  ps.findId(proSelect.getIdproductostock()).get();
	
//	System.out.printf("Existencia del producto stock: "+prostock.getExistencia());
//	System.out.printf("valor de cantidad que llega: "+cantidad);
	
	prostock.restarExistencia(cantidad);//se menoran productos del stock
	ps.CrearProductoStock(prostock);//se guardan los productos restantes
	System.out.printf("valor que viene en cantidad :"+ cantidad);
	ProductoVendido pv = new ProductoVendido(prostock.getNombre(), prostock.getCodigo(), 
	    cantidad, prostock.getFoto() , prostock.getPrecio() , v);
	pvr.save(pv);	
	return  new ResponseEntity("Venta realizada", HttpStatus.OK);
}

@PostMapping
public ResponseEntity<ProductoStock> saveProductoStock( @Valid @RequestBody ProductoStock productoRequest)
{
	return new ResponseEntity<>(ps.CrearProductoStock(productoRequest), HttpStatus.OK);
}

@PutMapping("/actualizar")
public ResponseEntity<ProductoStock> updateProductoStock(@Valid @RequestBody ProductoStock productoRequest) {
	return new ResponseEntity<>(ps.CrearProductoStock(productoRequest), HttpStatus.OK);
}	



}
