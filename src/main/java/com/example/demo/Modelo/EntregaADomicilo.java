package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "entrega_a_domicilio")
@ApiModel
public class EntregaADomicilo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_entrega_domicilio")
	private int idEntregaDomicilio;

	@Column(name = "id_ubicacion")
	private int idUbicacion;

    @ManyToOne
    @JoinColumn(name="id_empresa")
	private EmpresaEnvios empresa;

	@Column(name = "id_factura")
	private int idFactura;

	@Column(name = "prioridad")
	private int prioridad;

	@Column(length = 10)
	private String estado;

	@Column(name = "peso_kg")
	private double pesoKg;

	public EntregaADomicilo() {
		super();
	}

	public int getIdEntregaDomicilio() {
		return idEntregaDomicilio;
	}

	public void setIdEntregaDomicilio(int idEntregaDomicilio) {
		this.idEntregaDomicilio = idEntregaDomicilio;
	}

	public int getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public EmpresaEnvios getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaEnvios empresa) {
		this.empresa = empresa;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + idEntregaDomicilio;
		result = prime * result + idFactura;
		result = prime * result + idUbicacion;
		long temp;
		temp = Double.doubleToLongBits(pesoKg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + prioridad;
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
		EntregaADomicilo other = (EntregaADomicilo) obj;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (idEntregaDomicilio != other.idEntregaDomicilio)
			return false;
		if (idFactura != other.idFactura)
			return false;
		if (idUbicacion != other.idUbicacion)
			return false;
		if (Double.doubleToLongBits(pesoKg) != Double.doubleToLongBits(other.pesoKg))
			return false;
		if (prioridad != other.prioridad)
			return false;
		return true;
	}


}
