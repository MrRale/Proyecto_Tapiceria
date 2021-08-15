package com.grupotapiceria.tapiceria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="administrador")
public class Administrador {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//generacion automaticamente el id_admin
	private long id_admin;
	
	@NotEmpty(message = "Ingrese el dato de la cedula")
	@Size(min=10,max = 10, message = "Ingrese el numero de cedula de 10 digitos")
	private String ci;
	@NotEmpty(message = "Ingrese el nombre")
	@Size(min=3,max = 30, message = "Ingrese correctamente el nombre")
	private String nombre;
	@NotEmpty(message = "Ingrese el apellido")
	@Size(min=3,max = 30, message = "Ingrese correctamente el apellido")
	private String apellido;
	@NotEmpty(message = "Ingrese la direccion")
	@Size(min=3,max = 30, message = "Ingrese correctamente la direccion")
	private String direccion;
	@NotEmpty(message = "Ingrese el telefono")
	@Size(min=7,max = 10, message = "Ingrese correctamente el telefono")
	private String telefono;
	@NotEmpty(message = "Ingrese la clave")
	@Size(min=8,max = 30, message = "Ingrese correctamente el nombre")
	private String clave;
	
	@OneToMany
	@JoinColumn(name="id_inventario")
	private List<Inventario> inventario;
	
	public Administrador() {
		
		
	}

	public Administrador(long id_admin,
			@NotEmpty(message = "Ingrese el dato de la cedula") @Size(min = 10, max = 10, message = "Ingrese el numero de cedula de 10 digitos") String ci,
			@NotEmpty(message = "Ingrese el nombre") @Size(min = 3, max = 30, message = "Ingrese correctamente el nombre") String nombre,
			@NotEmpty(message = "Ingrese el apellido") @Size(min = 3, max = 30, message = "Ingrese correctamente el apellido") String apellido,
			@NotEmpty(message = "Ingrese la direccion") @Size(min = 3, max = 30, message = "Ingrese correctamente la direccion") String direccion,
			@NotEmpty(message = "Ingrese el telefono") @Size(min = 7, max = 10, message = "Ingrese correctamente el telefono") String telefono,
			@NotEmpty(message = "Ingrese la clave") @Size(min = 8, max = 30, message = "Ingrese correctamente el nombre") String clave,
			List<Inventario> inventario) {
	
		this.id_admin = id_admin;
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.clave = clave;
		this.inventario = inventario;
	}

	public long getId_admin() {
		return id_admin;
	}

	public void setId_admin(long id_admin) {
		this.id_admin = id_admin;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}
	
	
	
	
	
	
	

}
