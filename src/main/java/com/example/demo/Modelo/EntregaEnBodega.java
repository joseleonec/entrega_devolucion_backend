package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name = "entrega_en_bodega")
@ApiModel
public class EntregaEnBodega {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_entrega_bodega")
	private int idEntregaBodega;

	@Column(name = "id_ubicacion")
	private Long idUbicacion;
	
	@Column(name = "id_despachador")
	private Long idDespachador;
	
	@Column(name = "id_factura")
	private Long idFactura;

	@Column(name ="prioridad")
	private int prioridad;

	@Column(name = "estado",length = 10)
	private String estado;

	@Column(name ="peso_kg")
	private double pesoKg;

	public EntregaEnBodega(int idEntregaBodega, Long idUbicacion, Long idDespachador, Long idFactura, int prioridad,
			String estado, double pesoKg) {
		super();
		this.idEntregaBodega = idEntregaBodega;
		this.idUbicacion = idUbicacion;
		this.idDespachador = idDespachador;
		this.idFactura = idFactura;
		this.prioridad = prioridad;
		this.estado = estado;
		this.pesoKg = pesoKg;
	}

	public EntregaEnBodega() {
		super();
	}

	public int getIdEntregaBodega() {
		return idEntregaBodega;
	}

	public void setIdEntregaBodega(int idEntregaBodega) {
		this.idEntregaBodega = idEntregaBodega;
	}

	public Long getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Long idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Long getIdDespachador() {
		return idDespachador;
	}

	public void setIdDespachador(Long idDespachador) {
		this.idDespachador = idDespachador;
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
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((idDespachador == null) ? 0 : idDespachador.hashCode());
		result = prime * result + idEntregaBodega;
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
		result = prime * result + ((idUbicacion == null) ? 0 : idUbicacion.hashCode());
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
		EntregaEnBodega other = (EntregaEnBodega) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (idDespachador == null) {
			if (other.idDespachador != null)
				return false;
		} else if (!idDespachador.equals(other.idDespachador))
			return false;
		if (idEntregaBodega != other.idEntregaBodega)
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
		if (Double.doubleToLongBits(pesoKg) != Double.doubleToLongBits(other.pesoKg))
			return false;
		if (prioridad != other.prioridad)
			return false;
		return true;
	}

}
