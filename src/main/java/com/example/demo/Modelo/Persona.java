package com.example.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@Entity
@Table(name = "Persona")
//@CrossOrigin(origins = "http://127.0.0.1:5502",methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST, RequestMethod.PUT})
//@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST, RequestMethod.PUT})
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "persona_id")
	private int id;
	
	@Column(name = "persona_nombre")
	private String nombre;
	
	@Column(name = "persona_cedula")
	private String cedula;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
		
}
