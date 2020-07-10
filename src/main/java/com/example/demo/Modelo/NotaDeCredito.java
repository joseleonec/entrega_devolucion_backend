package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nota_de_credito")
public class NotaDeCredito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_nota")
	private int idNotaDeCredito;

	
	@Column(name = "id_solicitud", nullable = false)
	private int idSolicitud;

	@Column(name = "monto", nullable = false)
	private double monto;

	@Column(name = "autorizacion_SRI", nullable = false)
	private int autorizacionSRI;

	
	public NotaDeCredito() {
		super();
	}

	public NotaDeCredito(int idNotaDeCredito, int idSolicitud, double monto, int autorizacionSRI) {
		super();
		this.idNotaDeCredito = idNotaDeCredito;
		this.idSolicitud = idSolicitud;
		this.monto = monto;
		this.autorizacionSRI = autorizacionSRI;
	}

	public int getIdNotaDeCredito() {
		return idNotaDeCredito;
	}

	public void setIdNotaDeCredito(int idNotaDeCredito) {
		this.idNotaDeCredito = idNotaDeCredito;
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

	public int getAutorizacionSRI() {
		return autorizacionSRI;
	}

	public void setAutorizacionSRI(int autorizacionSRI) {
		this.autorizacionSRI = autorizacionSRI;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + autorizacionSRI;
		result = prime * result + idNotaDeCredito;
		result = prime * result + idSolicitud;
		long temp;
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
		NotaDeCredito other = (NotaDeCredito) obj;
		if (autorizacionSRI != other.autorizacionSRI)
			return false;
		if (idNotaDeCredito != other.idNotaDeCredito)
			return false;
		if (idSolicitud != other.idSolicitud)
			return false;
		if (Double.doubleToLongBits(monto) != Double.doubleToLongBits(other.monto))
			return false;
		return true;
	}

}
