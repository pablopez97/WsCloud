package com.pruebaMVC.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//PONEMOS LA ETIQUETA ENTITY PORQUE QUEREMOS QUE LA CLASE SEA CONTROLADA POR JPA DATA
@Entity
public class Usuario {
	
	//CON ESTO INDICAMOS QUE ID ES CLAVE PRIMARIA
	@Id
	@GeneratedValue
	//CON ESTO DECIMOS QUE EL VALOR SE VA A AUTOINCREMENTAR EN LA BASE DE DATOS
	private int id;
	private String nombre;
	private String password;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
