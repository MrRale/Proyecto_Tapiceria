package com.grupotapiceria.tapiceria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_proveedor;

	private String ci;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	
	@OneToMany
	@JoinColumn(name="id_inventario")
 private List<Inventario> inventario;

	// Constructor Vacio

	public Proveedor() {

	}

	public Proveedor(long id_proveedor, String ci, String nombre, String apellido, String direccion, String telefono,
			List<Inventario> inventario) {
		this.id_proveedor = id_proveedor;
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.inventario = inventario;
	}

	public long getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(long id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
	

	
}
