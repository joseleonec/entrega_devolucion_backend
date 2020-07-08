package com.example.demo.Modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "parroquia")
public class Parroquia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_parroquia")
	private Long idParroquia;
	@Column(name = "nombre_parroquia", length = 50)
	private String nombreParroquia;
	
	@ManyToMany
	@JoinTable(
	  name = "tarifa", 
	  joinColumns = @JoinColumn(name = "id_parroquia"), 
	  inverseJoinColumns = @JoinColumn(name = "id_empresa"))
	Set<EmpresaEnvios> likedCourses;
	
	public Long getIdParroquia() {
		return idParroquia;
	}
	public void setIdParroquia(Long idParroquia) {
		this.idParroquia = idParroquia;
	}
	public String getNombreParroquia() {
		return nombreParroquia;
	}
	public void setNombreParroquia(String nombreParroquia) {
		this.nombreParroquia = nombreParroquia;
	}
}

//CREATE TABLE "parroquia" (
//		  "id_parroquia" serial ,
//		  "nombre_parroquia" VARCHAR (50),
//		  PRIMARY KEY ("id_parroquia")
//		);
