package com.grupotapiceria.tapiceria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")

public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id_pedido;
		
	//private long id_producto;
	//private long id_cliente;
	private String fecha;
	private long cantidad;
	private long preciototal;
	
	
	

	//@ManyToOne
	//@JoinColumn(name="id_cliente")
	//private Cliente cliente;
	
	@OneToMany
	@JoinColumn(name="id_producto")
	private List<Producto> producto;
	//Relaciones
	@OneToMany
	@JoinColumn(name="id_venta")
	private List<Venta> venta;
	
	
	
	public Pedido() {
		
	}



	public Pedido(long id_pedido, String fecha, long cantidad, long preciototal, 
			List<Producto> producto, List<Venta> venta) {
	
		this.id_pedido = id_pedido;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.preciototal = preciototal;
		//this.cliente = cliente;
		this.producto = producto;
		this.venta = venta;
	}



	public long getId_pedido() {
		return id_pedido;
	}



	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public long getCantidad() {
		return cantidad;
	}



	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}



	public long getPreciototal() {
		return preciototal;
	}



	public void setPreciototal(long preciototal) {
		this.preciototal = preciototal;
	}



	


	public List<Producto> getProducto() {
		return producto;
	}



	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}



	public List<Venta> getVenta() {
		return venta;
	}



	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	
	
	
		
}
