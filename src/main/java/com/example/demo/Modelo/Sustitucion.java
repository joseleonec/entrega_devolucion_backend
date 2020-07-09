package com.example.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nota_de_credito")
public class Sustitucion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_sustitucion")
	private int idSustitucion;
	
	@Column(name ="id _solicitud", nullable = false)
	private int idSolicitud;
	
	@Column(name="monto", nullable = false)
	private double monto;
	
	@Column(name="id_producto_sustituto", nullable = false)
	private double idProductoSustituto;
	
	
	
}

