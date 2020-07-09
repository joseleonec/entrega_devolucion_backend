package com.example.demo.Modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "entrega_a_domicilio")
public class EntregaADomicilo {

	@Id
	@Column(name = "id_entrega_domicilio")
	private Long idEntregaDomicilio;
	@Column(name = "id_ubicacion")
	private Long idUbicacion;
	@Column(name = "id_empresa")
	private Long idEmpresa;
	@Column(name = "id_factura")
	private Long idFactura;
	private int prioridad;
	private String estado;
	private double peso;
	public Long getIdEntregaDomicilio() {
		return idEntregaDomicilio;
	}
	public void setIdEntregaDomicilio(Long idEntregaDomicilio) {
		this.idEntregaDomicilio = idEntregaDomicilio;
	}
	public Long getIdUbicacion() {
		return idUbicacion;
	}
	public void setIdUbicacion(Long idUbicacion) {
		this.idUbicacion = idUbicacion;
	}
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public Long getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Long idFactura) {
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public EntregaADomicilo() {
		super();
	}
	public EntregaADomicilo(Long idEntregaDomicilio, Long idUbicacion, Long idEmpresa, Long idFactura, int prioridad,
			String estado, double peso) {
		super();
		this.idEntregaDomicilio = idEntregaDomicilio;
		this.idUbicacion = idUbicacion;
		this.idEmpresa = idEmpresa;
		this.idFactura = idFactura;
		this.prioridad = prioridad;
		this.estado = estado;
		this.peso = peso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
		result = prime * result + ((idEntregaDomicilio == null) ? 0 : idEntregaDomicilio.hashCode());
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
		result = prime * result + ((idUbicacion == null) ? 0 : idUbicacion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
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
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		if (idEntregaDomicilio == null) {
			if (other.idEntregaDomicilio != null)
				return false;
		} else if (!idEntregaDomicilio.equals(other.idEntregaDomicilio))
			return false;
		if (idFactura == null) {
			if (other.idFactura != null)
				return false;
		} else if (!idFactura.equals(other.idFactura))
			return false;
		if (idUbicacion == null) {
			if (other.idUbicacion != null)
				return false;
		} else if (!idUbicacion.equals(other.idUbicacion))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (prioridad != other.prioridad)
			return false;
		return true;
	}
	
//	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private EmpresaEnvios empresaEnvios;
//	
	
}
