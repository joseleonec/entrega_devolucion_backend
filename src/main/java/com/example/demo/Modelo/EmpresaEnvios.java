package com.example.demo.Modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa_de_envios")
public class EmpresaEnvios {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_empresa")
	private Long idEmpresa;
	@Column(name = "razon_social")
	private String razonSocial;
	@Column(name = "min_paquetes_por_viaje")
	private int minimoDePaquetesPorViaje;
	@Column(name = "costo_km_extra")
	private double costoKmExtra;
	@Column(name = "costo_kg_extra")
	private double costoKgExtra;
	@Column(name = "maximo_peso_paquete")
	private double pesoMaximoDelPaquete;

	@OneToMany(mappedBy = "parroquia")
	private Set<Tarifa> tarifas = new HashSet<Tarifa>();

	public EmpresaEnvios(String razonSocial, int minimoDePaquetesPorViaje, double costoKmExtra, double costoKgExtra,
			double pesoMaximoDelPaquete) {
		super();
		this.razonSocial = razonSocial;
		this.minimoDePaquetesPorViaje = minimoDePaquetesPorViaje;
		this.costoKmExtra = costoKmExtra;
		this.costoKgExtra = costoKgExtra;
		this.pesoMaximoDelPaquete = pesoMaximoDelPaquete;
	}

	public EmpresaEnvios() {
		super();
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getMinimoDePaquetesPorViaje() {
		return minimoDePaquetesPorViaje;
	}

	public void setMinimoDePaquetesPorViaje(int minimoDePaquetesPorViaje) {
		this.minimoDePaquetesPorViaje = minimoDePaquetesPorViaje;
	}

	public double getCostoKmExtra() {
		return costoKmExtra;
	}

	public void setCostoKmExtra(double costoKmExtra) {
		this.costoKmExtra = costoKmExtra;
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

	public Set<Tarifa> getTarifas() {
		return tarifas;
	}

	public void setTarifas(Set<Tarifa> tarifas) {
		this.tarifas = tarifas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(costoKgExtra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(costoKmExtra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
		result = prime * result + minimoDePaquetesPorViaje;
		temp = Double.doubleToLongBits(pesoMaximoDelPaquete);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((razonSocial == null) ? 0 : razonSocial.hashCode());
		result = prime * result + ((tarifas == null) ? 0 : tarifas.hashCode());
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
		if (Double.doubleToLongBits(costoKmExtra) != Double.doubleToLongBits(other.costoKmExtra))
			return false;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		if (minimoDePaquetesPorViaje != other.minimoDePaquetesPorViaje)
			return false;
		if (Double.doubleToLongBits(pesoMaximoDelPaquete) != Double.doubleToLongBits(other.pesoMaximoDelPaquete))
			return false;
		if (razonSocial == null) {
			if (other.razonSocial != null)
				return false;
		} else if (!razonSocial.equals(other.razonSocial))
			return false;
		if (tarifas == null) {
			if (other.tarifas != null)
				return false;
		} else if (!tarifas.equals(other.tarifas))
			return false;
		return true;
	}

}

//CREATE TABLE "empresa_de_envios" (
//  "id_empresa" serial ,
//  "razon_social" VARCHAR (50),
//  "min_paquetes_por_viaje" integer,
//  "costo_km_extra" numeric(2),
//  "costo_kg_extra" numeric(2),
//  "peso_maximo_por_paquete" numeric(2),
//  PRIMARY KEY ("id_empresa")
//);
