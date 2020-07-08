package com.example.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column (name = "costo_km_extra" )
	private double costoKmExtra;
	@Column(name ="costo_kg_extra" )
	private double costoKgExtra;
	@Column(name = "maximo_peso_paquete" )
	private double pesoMaximoDelPaquete;
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
