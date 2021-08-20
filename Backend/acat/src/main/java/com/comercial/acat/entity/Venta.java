package com.comercial.acat.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idventa;
	
	
	private String fechaHora;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "venta", fetch = FetchType.EAGER)
	@JsonManagedReference(value="venta-provendido")
	private List<ProductoVendido> productosv;
	
	public Venta(int id) {
		super();
		this.idventa = id;
	}
	
	
	public Venta() {
		super();
	}


	public int getIdventa() {
		return idventa;
	}


	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}


	public String getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}


	public List<ProductoVendido> getProductosv() {
		return productosv;
	}


	public void setProductosv(List<ProductoVendido> productosv) {
		this.productosv = productosv;
	}
	
	
	
	

}
