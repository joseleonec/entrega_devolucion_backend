package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud_rechazada")
public class SolicitudRechazada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_solicitud_rechazada")
	private int idSolicitudRechazada;

	@OneToOne
	@JoinColumn(name = "id_solicitud")
	private SolicitudDevolucion solicitudDevolucion;
	

}
