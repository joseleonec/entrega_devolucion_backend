package com.example.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entrega_en_bodega")
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

}
