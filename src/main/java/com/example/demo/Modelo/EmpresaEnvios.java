package com.example.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "empresa_de_envios")
@ApiModel
public class EmpresaEnvios {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_empresa")
	private int idEmpresa;

	@Column(name = "razon_social")
	private String razonSocial;

	@Column(name = "costo_kg_extra")
	private double costoKgExtra;

	@Column(name = "maximo_peso_paquete")
	private double pesoMaximoDelPaquete;

	@OneToMany(mappedBy = "empresa")
	private List<Tarifa> tarifas;

	@OneToMany(mappedBy = "empresa")
	private List<EntregaADomicilo> entregasADomicilio;

	public void addTarifa(Tarifa tarifa) {
		tarifa.setEmpresa(this);
		this.tarifas.add(tarifa);
	}

	public void addEntregaADomicilo(EntregaADomicilo entrega) {
		entrega.setEmpresa(this);
		this.entregasADomicilio.add(entrega);
	}

	public EmpresaEnvios() {
		super();
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public double getCostoKgExtra() {
		return costoKgExtra;
	}

	public void setCostoKgExtra(double costoKgExtra) {
		this.costoKgExtra = costoKgExtra;
	}

	public double getPesoMaximoDelPaquete() {
		return pesoMaximoDelPaquete;
	}

	public void setPesoMaximoDelPaquete(double pesoMaximoDelPaquete) {
		this.pesoMaximoDelPaquete = pesoMaximoDelPaquete;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(costoKgExtra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + idEmpresa;
		temp = Double.doubleToLongBits(pesoMaximoDelPaquete);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((razonSocial == null) ? 0 : razonSocial.hashCode());
//		result = prime * result + ((tarifas == null) ? 0 : tarifas.hashCode());
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
		EmpresaEnvios other = (EmpresaEnvios) obj;
		if (Double.doubleToLongBits(costoKgExtra) != Double.doubleToLongBits(other.costoKgExtra))
			return false;
		if (idEmpresa != other.idEmpresa)
			return false;
		if (Double.doubleToLongBits(pesoMaximoDelPaquete) != Double.doubleToLongBits(other.pesoMaximoDelPaquete))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		return true;
	}

}
