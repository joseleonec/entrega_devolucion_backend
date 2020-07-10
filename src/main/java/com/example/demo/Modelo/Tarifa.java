package com.example.demo.modelo;

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
public class Tarifa {


//	@EmbeddedId
//	private TarifaKey idTarifa;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tarifa")
	private int idTarifa;

	@Column(name = "id_parroquia")
	private int idParroquia;

	@Column(name = "id_empresa")
	private int idEmpresa;

	@Column(name = "costo")
	private double costo;

	@Column(name = "minutos_estimados")
	private double minutosEstimados;
	
//	@ManyToOne
//	@MapsId("idEmpresa") // nombre del atributo de la clase EmpresaEnvios
//	@JoinColumn(name = "id_empresa")
//	private EmpresaEnvios empresaEnvios;
//	
//	@ManyToOne
//	@MapsId("idParroquia") // nombre del atributo de la clase Parroquia
//	@JoinColumn(name = "id_parroquia")
//	private Parroquia parroquia;

//	public Tarifa(TarifaKey idTarifa, Parroquia parroquia, EmpresaEnvios empresaEnvios, double costo,
//			double minutosEstimados) {
//		super();
//		this.idTarifa = idTarifa;
//		this.parroquia = parroquia;
//		this.empresaEnvios = empresaEnvios;
//		this.costo = costo;
//		this.minutosEstimados = minutosEstimados;
//	}

	public Tarifa(int idTarifa, int idParroquia, int idEmpresa, double costo, double minutosEstimados) {
		super();
		this.idTarifa = idTarifa;
		this.idParroquia = idParroquia;
		this.idEmpresa = idEmpresa;
		this.costo = costo;
		this.minutosEstimados = minutosEstimados;
	}

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

//	public Parroquia getParroquia() {
//		return parroquia;
//	}
//
//	public void setParroquia(Parroquia parroquia) {
//		this.parroquia = parroquia;
//	}
//
//	public EmpresaEnvios getEmpresaEnvios() {
//		return empresaEnvios;
//	}
//
//	public void setEmpresaEnvios(EmpresaEnvios empresaEnvios) {
//		this.empresaEnvios = empresaEnvios;
//	}

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

	public int getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}

	public int getIdParroquia() {
		return idParroquia;
	}

	public void setIdParroquia(int idParroquia) {
		this.idParroquia = idParroquia;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(costo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + idEmpresa;
		result = prime * result + idParroquia;
		result = prime * result + idTarifa;
		temp = Double.doubleToLongBits(minutosEstimados);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(costo) != Double.doubleToLongBits(other.costo))
			return false;
		if (idEmpresa != other.idEmpresa)
			return false;
		if (idParroquia != other.idParroquia)
			return false;
		if (idTarifa != other.idTarifa)
			return false;
		if (Double.doubleToLongBits(minutosEstimados) != Double.doubleToLongBits(other.minutosEstimados))
			return false;
		return true;
	}

}
