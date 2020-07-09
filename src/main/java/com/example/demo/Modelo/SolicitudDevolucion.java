package com.example.demo.Modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "solicitud_devolucion")
public class SolicitudDevolucion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_solicitud")
	private int idSolicitud;
	
	@Column(name = "id_producto", nullable = false)
	private int idProducto;
	
	@Column(name = "id_factura", nullable = false)
	private int idFactura;
	
	@Column(name = "id_cliente", nullable = false)
	private int idCliente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_de_registro", nullable = false)
	private Calendar fechaDeRegistro;

	@Column(name = "motivo_devolucion", length = 20, nullable = false)
	private String motivoDevolucion;

	@Column(name = "estado_aprobacion", nullable = false, length = 10)
	private String estadoAprobacion;

}
