package com.comercial.acat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.comercial.acat.entity.Venta;
import com.comercial.acat.repository.VentaRepository;

@RestController
@RequestMapping("/venta")
@CrossOrigin(origins = "http://localhost:4200")
public class VentaController {
	@Autowired
	VentaRepository vr;
	
	@GetMapping ("/listar")
	public ResponseEntity<List<Venta>> list(){
		List<Venta> list = vr.findAll();
		return new ResponseEntity<List<Venta>>(list, HttpStatus.OK);
	}

}
