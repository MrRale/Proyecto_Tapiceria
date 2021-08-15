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
@Table(name="inventario")
public class Inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//generacion automaticamente el id_admin
	private long id_inventario;

	
	
	@ManyToOne
	@JoinColumn(name="id_admin")
	private Administrador administrador;
	
	@OneToMany
	@JoinColumn(name="id_producto")
	private List<Producto> producto;
	
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private Proveedor proveedor;

	public Inventario() {
		
	}

	public Inventario(long id_inventario, Administrador administrador, List<Producto> producto, Proveedor proveedor) {
		
		this.id_inventario = id_inventario;
		this.administrador = administrador;
		this.producto = producto;
		this.proveedor = proveedor;
	}

	public long getId_inventario() {
		return id_inventario;
	}

	public void setId_inventario(long id_inventario) {
		this.id_inventario = id_inventario;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
	
	
	
}
