package com.grupotapiceria.tapiceria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_producto;

	private long cantidad;
	private float precio;
	private String descripcion;
	private String nombre;

	@ManyToOne
	@JoinColumn(name= "id_pedido")
	private Pedido pedido;
	@ManyToOne
	@JoinColumn(name= "id_inventario")
	private Inventario inventario;

	// Constructotrs
	public Producto() {

	}

	public Producto(long id_producto, long cantidad, float precio, String descripcion, String nombre, Pedido pedido,
			Inventario inventario) {
	
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.pedido = pedido;
		this.inventario = inventario;
	}

	public long getId_producto() {
		return id_producto;
	}

	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
	

	

}
