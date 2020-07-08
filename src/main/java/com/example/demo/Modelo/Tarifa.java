package com.example.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class Tarifa {

	@EmbeddedId
	private TarifaKey id;

	@ManyToOne
	@MapsId("idParroquia") // nombre del atributo de la clase Parroquia
	@JoinColumn(name = "id_parroquia")
	private Parroquia parroquia;

	@ManyToOne
	@MapsId("idEmpresa") // nombre del atributo de la clase EmpresaEnvios
	@JoinColumn(name = "id_empresa")
	private EmpresaEnvios empresaEnvios;

	@Column(name = "costo")
	private double costo;
	@Column(name = "minutos_estimados")
	private double minutosEstimados;

	public Tarifa(double costo, double minutosEstimados) {
		super();
		this.costo = costo;
		this.minutosEstimados = minutosEstimados;
	}

	public Tarifa(TarifaKey id, Parroquia parroquia, EmpresaEnvios empresaEnvios, double costo,
			double minutosEstimados) {
		super();
		this.id = id;
		this.parroquia = parroquia;
		this.empresaEnvios = empresaEnvios;
		this.costo = costo;
		this.minutosEstimados = minutosEstimados;
	}

	public Tarifa(TarifaKey id, Parroquia parroquia, EmpresaEnvios empresaEnvios) {
		super();
		this.id = id;
		this.parroquia = parroquia;
		this.empresaEnvios = empresaEnvios;
	}

	public Tarifa(Parroquia parroquia, EmpresaEnvios empresaEnvios) {
		super();
		this.parroquia = parroquia;
		this.empresaEnvios = empresaEnvios;
	}

	public Tarifa() {
		super();
	}

	public TarifaKey getId() {
		return id;
	}

	public void setId(TarifaKey id) {
		this.id = id;
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public EmpresaEnvios getEmpresaEnvios() {
		return empresaEnvios;
	}

	public void setEmpresaEnvios(EmpresaEnvios empresaEnvios) {
		this.empresaEnvios = empresaEnvios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresaEnvios == null) ? 0 : empresaEnvios.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((parroquia == null) ? 0 : parroquia.hashCode());
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
		Tarifa other = (Tarifa) obj;
		if (empresaEnvios == null) {
			if (other.empresaEnvios != null)
				return false;
		} else if (!empresaEnvios.equals(other.empresaEnvios))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parroquia == null) {
			if (other.parroquia != null)
				return false;
		} else if (!parroquia.equals(other.parroquia))
			return false;
		return true;
	}

}
