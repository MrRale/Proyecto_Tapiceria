package com.comercial.acat.entity;

import java.util.Optional;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Producto")

public class Producto{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;

	private String nombre;
	
	private String codigo;
	
	private float precio;
	
	private long cantidad;
	
	@Lob
	private String foto;
	
	 @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "fk_pedido",  nullable = true, unique = true, updatable = true)//name: Nombre para la relacion m-1, updatable:true=actualizable   
	 @JsonBackReference
	    private Pedido pedido;

	public Producto() {
		super();
	}
	
	public Producto(String nombre, String codigo, long cantidad, String foto, float precio, Pedido pedido) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.foto = foto;
		this.precio = precio;
		this.pedido = pedido;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}