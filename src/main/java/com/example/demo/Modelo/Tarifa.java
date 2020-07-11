package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class Tarifa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_tarifa")
	private int idTarifa;
	
	@Column(name = "costo")
	private double costo;

	@Column(name = "minutos_estimados")
	private double minutosEstimados;
	
    @ManyToOne
    @JoinColumn(name="id_parroquia")
	private Parroquia parroquia;
    
    @ManyToOne
    @JoinColumn(name="id_empresa")
	private EmpresaEnvios empresa;
    

	public Tarifa() {
		super();
	}


	public int getIdTarifa() {
		return idTarifa;
	}


	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
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


	public Parroquia getParroquia() {
		return parroquia;
	}


	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}


	public EmpresaEnvios getEmpresa() {
		return empresa;
	}


	public void setEmpresa(EmpresaEnvios empresa) {
		this.empresa = empresa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(costo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + idTarifa;
		temp = Double.doubleToLongBits(minutosEstimados);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(costo) != Double.doubleToLongBits(other.costo))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (idTarifa != other.idTarifa)
			return false;
		if (Double.doubleToLongBits(minutosEstimados) != Double.doubleToLongBits(other.minutosEstimados))
			return false;
		if (parroquia == null) {
			if (other.parroquia != null)
				return false;
		} else if (!parroquia.equals(other.parroquia))
			return false;
		return true;
	}




}
