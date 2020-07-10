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
@Table(name = "solicitud_aprobada")
public class SolicitudAprobada {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_solicitud_aprobada")
	private int idSolicitudAprobada;
	
	@OneToOne
    @JoinColumn(name="id_solicitud")
	private SolicitudDevolucion solicitudDevolucion;
	
	@OneToOne(mappedBy = "solicitudAprobada")
	private NotaDeCredito notaDeCredito;
	
	@OneToOne(mappedBy = "solicitudAprobada")
	private Sustitucion sustitucion;
	
}
