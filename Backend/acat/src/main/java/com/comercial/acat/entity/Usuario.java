package com.comercial.acat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")

public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuario;
	private Long cedulausuario;
	private String nombreusuario;
	private String apellidousuario;
	private String claveusuario;
	private String telefonousuario;
	private String direccionusuario;
	private String correousuario;
	private int rolusuario;
	
	public Usuario() {
		//super();
	}

	public Usuario(String nombreusuario, Long cedula, String apellidousuario, String claveusuario,
			String telefonousuario, String direccionusuario, String correousuario, int rolusuario) {
	    //super();
		this.nombreusuario = nombreusuario;
		this.cedulausuario = cedula;
		this.apellidousuario = apellidousuario;
		this.claveusuario = claveusuario;
		this.telefonousuario = telefonousuario;
		this.direccionusuario = direccionusuario;
		this.correousuario = correousuario;
		this.rolusuario = rolusuario;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getApellidousuario() {
		return apellidousuario;
	}

	public void setApellidousuario(String apellidousuario) {
		this.apellidousuario = apellidousuario;
	}


	public String getClaveusuario() {
		return claveusuario;
	}

	public void setClaveusuario(String claveusuario) {
		this.claveusuario = claveusuario;
	}

	public String getTelefonousuario() {
		return telefonousuario;
	}

	public void setTelefonousuario(String telefonousuario) {
		this.telefonousuario = telefonousuario;
	}

	public String getDireccionusuario() {
		return direccionusuario;
	}

	public void setDireccionusuario(String direccionusuario) {
		this.direccionusuario = direccionusuario;
	}

	public int getRolusuario() {
		return rolusuario;
	}

	public void setRolusuario(int rolusuario) {
		this.rolusuario = rolusuario;
	}

	public Long getCedulausuario() {
		return cedulausuario;
	}

	public void setCedulausuario(Long cedulausuario) {
		this.cedulausuario = cedulausuario;
	}

	public String getCorreousuario() {
		return correousuario;
	}

	public void setCorreousuario(String correousuario) {
		this.correousuario = correousuario;
	}
	
	
	
	
	
	
	
	
	
}
