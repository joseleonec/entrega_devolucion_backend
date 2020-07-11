package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "nota_de_credito")
@ApiModel
public class NotaDeCredito {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_nota")
	private int idNotaDeCredito;

	@OneToOne
	@JoinColumn(name = "id_solicitud", unique = true)
	private SolicitudDevolucion solicitudDevolucion;
	
	@Column(name = "monto", nullable = false)
	private double monto;

	@Column(name = "autorizacion_SRI", nullable = false)
	private int autorizacionSRI;

	public NotaDeCredito() {
		super();
	}

	public int getIdNotaDeCredito() {
		return idNotaDeCredito;
	}


	public SolicitudDevolucion getSolicitudDevolucion() {
		return solicitudDevolucion;
	}

	public void setSolicitudDevolucion(SolicitudDevolucion solicitudDevolucion) {
		this.solicitudDevolucion = solicitudDevolucion;
	}

	public void setIdNotaDeCredito(int idNotaDeCredito) {
		this.idNotaDeCredito = idNotaDeCredito;
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
		if (Double.doubleToLongBits(monto) != Double.doubleToLongBits(other.monto))
			return false;
		return true;
	}

}
