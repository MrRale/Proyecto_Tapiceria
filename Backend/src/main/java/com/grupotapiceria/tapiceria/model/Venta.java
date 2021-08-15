package com.grupotapiceria.tapiceria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id_venta;
	
	@ManyToOne
	@JoinColumn(name="id_pedido")
	private Pedido pedido;

	public Venta() {
		
	}

	public Venta(long id_venta, Pedido pedido) {
		super();
		this.id_venta = id_venta;
		this.pedido = pedido;
	}

	public long getId_venta() {
		return id_venta;
	}

	public void setId_venta(long id_venta) {
		this.id_venta = id_venta;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	

}
