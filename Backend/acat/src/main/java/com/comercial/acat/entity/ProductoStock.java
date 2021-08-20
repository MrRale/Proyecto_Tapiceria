package com.comercial.acat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="productostock")
public class ProductoStock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproductostock;
	
    private String nombre;
	
	private String codigo;
	
	@Lob
	private String foto;
	
	private float precio;
	
	private int existencia;


	
	public ProductoStock() {
		super();
	}
	
	
	public ProductoStock(String nombre, String codigo, String foto, float precio, int existencia) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.foto = foto;
		this.precio=precio;
		this.existencia = existencia;
	}


	public int getIdstock() {
		return idproductostock;
	}


	public void setIdstock(int idstock) {
		this.idproductostock = idstock;
	}


	public int getExistencia() {
		return existencia;
	}


	public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void restarExistencia(int existencia) {
        this.existencia -= existencia;
    }


	public int getIdproductostock() {
		return idproductostock;
	}


	public void setIdproductostock(int idproductostock) {
		this.idproductostock = idproductostock;
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
