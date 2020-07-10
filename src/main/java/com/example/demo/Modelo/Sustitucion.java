package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sustitucion")
public class Sustitucion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_sustitucion")
	private int idSustitucion;

	@Column(name = "id_solicitud", nullable = false)
	private int idSolicitud;
	
	@Column(name = "id_producto_sustituto", nullable = false)
	private double idProductoSustituto;

	@Column(name = "monto", nullable = false)
	private double monto;


	public Sustitucion() {
		super();
	}

	public int getIdSustitucion() {
		return idSustitucion;
	}

	public void setIdSustitucion(int idSustitucion) {
		this.idSustitucion = idSustitucion;
	}

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getIdProductoSustituto() {
		return idProductoSustituto;
	}

	public void setIdProductoSustituto(double idProductoSustituto) {
		this.idProductoSustituto = idProductoSustituto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(idProductoSustituto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + idSolicitud;
		result = prime * result + idSustitucion;
		temp = Double.doubleToLongBits(monto);
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
		Sustitucion other = (Sustitucion) obj;
		if (Double.doubleToLongBits(idProductoSustituto) != Double.doubleToLongBits(other.idProductoSustituto))
			return false;
		if (idSolicitud != other.idSolicitud)
			return false;
		if (idSustitucion != other.idSustitucion)
			return false;
		if (Double.doubleToLongBits(monto) != Double.doubleToLongBits(other.monto))
			return false;
		return true;
	}
	
	

}
