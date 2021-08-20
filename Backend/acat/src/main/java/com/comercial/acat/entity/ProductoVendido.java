package com.comercial.acat.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="productovendido")
public class ProductoVendido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproductovendido;
	
	private String nombre;
	
private String codigo;
	
	private float precio;
	
	private long cantidad;
	
	@Lob
	private String foto;
	
	 @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "fk_venta",  nullable = true, unique = true, updatable = true)//name: Nombre para la relacion m-1, updatable:true=actualizable   
	 @JsonBackReference(value="venta-provendido")
	    private Venta venta;

	public ProductoVendido() {
		super();
	}
	
	public ProductoVendido(String nombre, String codigo, long cantidad, String foto, float precio, Venta venta) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.foto = foto;
		this.precio = precio;
		this.venta = venta;
	}

	public int getIdproductovendido() {
		return idproductovendido;
	}

	public void setIdproductovendido(int idproductovendido) {
		this.idproductovendido = idproductovendido;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	



}
