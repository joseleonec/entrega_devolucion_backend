package com.example.demo.Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class Tarifa implements Serializable {

	private static final long serialVersionUID = 1L;

//	@EmbeddedId
//	private TarifaKey idTarifa;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id_tarifa")
	private int idTarifa;
	
	@ManyToOne
	@MapsId("idEmpresa") // nombre del atributo de la clase EmpresaEnvios
	@JoinColumn(name = "id_empresa")
	private EmpresaEnvios empresaEnvios;
	
	@ManyToOne
	@MapsId("idParroquia") // nombre del atributo de la clase Parroquia
	@JoinColumn(name = "id_parroquia")
	private Parroquia parroquia;

	@Column(name = "costo")
	private double costo;
	@Column(name = "minutos_estimados")
	private double minutosEstimados;

//	public Tarifa(TarifaKey idTarifa, Parroquia parroquia, EmpresaEnvios empresaEnvios, double costo,
//			double minutosEstimados) {
//		super();
//		this.idTarifa = idTarifa;
//		this.parroquia = parroquia;
//		this.empresaEnvios = empresaEnvios;
//		this.costo = costo;
//		this.minutosEstimados = minutosEstimados;
//	}

	public Tarifa() {
		super();
	}

//	public TarifaKey getIdTarifa() {
//		return idTarifa;
//	}
//
//	public void setIdTarifa(TarifaKey idTarifa) {
//		this.idTarifa = idTarifa;
//	}

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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getMinutosEstimados() {
		return minutosEstimados;
	}

	public void setMinutosEstimados(double minutosEstimados) {
		this.minutosEstimados = minutosEstimados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresaEnvios == null) ? 0 : empresaEnvios.hashCode());
//		result = prime * result + ((idTarifa == null) ? 0 : idTarifa.hashCode());
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
//		if (idTarifa == null) {
//			if (other.idTarifa != null)
//				return false;
//		} else if (!idTarifa.equals(other.idTarifa))
//			return false;
		if (parroquia == null) {
			if (other.parroquia != null)
				return false;
		} else if (!parroquia.equals(other.parroquia))
			return false;
		return true;
	}

}
