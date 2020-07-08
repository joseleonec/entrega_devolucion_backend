package com.example.demo.Modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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

	@OneToMany(mappedBy = "empresaEnvios")
	private Set<Tarifa> tarifas = new HashSet<Tarifa>();

//	@ManyToMany
//	@JoinTable(name = "tarifa", joinColumns = @JoinColumn(name = "id_parroquia"), inverseJoinColumns = @JoinColumn(name = "id_empresa"))
//	Set<EmpresaEnvios> empresasEnlazadas;


	public Parroquia() {
		super();
	}

	public Parroquia(String nombreParroquia) {
		super();
		this.nombreParroquia = nombreParroquia;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idParroquia == null) ? 0 : idParroquia.hashCode());
		result = prime * result + ((nombreParroquia == null) ? 0 : nombreParroquia.hashCode());
		result = prime * result + ((tarifas == null) ? 0 : tarifas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parroquia other = (Parroquia) obj;
		if (idParroquia == null) {
			if (other.idParroquia != null)
				return false;
		} else if (!idParroquia.equals(other.idParroquia))
			return false;
		if (nombreParroquia == null) {
			if (other.nombreParroquia != null)
				return false;
		} else if (!nombreParroquia.equals(other.nombreParroquia))
			return false;
		if (tarifas == null) {
			if (other.tarifas != null)
				return false;
		} else if (!tarifas.equals(other.tarifas))
			return false;
		return true;
	}

}

//CREATE TABLE "parroquia" (
//		  "id_parroquia" serial ,
//		  "nombre_parroquia" VARCHAR (50),
//		  PRIMARY KEY ("id_parroquia")
//		);