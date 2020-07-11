package com.example.demo.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy = "solicitudDevolucion",  fetch = FetchType.LAZY)
	private NotaDeCredito notaDeCredito;
	
	@OneToOne(mappedBy = "solicitudDevolucion")
	private Sustitucion sustitucion;


//	@OneToOne(mappedBy = "solicitudDevolucion",  fetch = FetchType.LAZY)
//	private SolicitudAprobada solicitudAprobada;
//
//	@OneToOne(mappedBy = "solicitudDevolucion",  fetch = FetchType.LAZY)
//	private SolicitudRechazada solicitudRechazada;

	public NotaDeCredito getNotaDeCredito() {
		return notaDeCredito;
	}

	public void setNotaDeCredito(NotaDeCredito notaDeCredito) {
		this.notaDeCredito = notaDeCredito;
	}

	public Sustitucion getSustitucion() {
		return sustitucion;
	}

	public void setSustitucion(Sustitucion sustitucion) {
		this.sustitucion = sustitucion;
	}

	public SolicitudDevolucion() {
		super();
	}

//	public SolicitudAprobada getSolicitudAprobada() {
//		return solicitudAprobada;
//	}
//
//	public SolicitudRechazada getSolicitudRechazada() {
//		return solicitudRechazada;
//	}
//
//	public void setSolicitudRechazada(SolicitudRechazada solicitudRechazada) {
//		this.solicitudRechazada = solicitudRechazada;
//	}
//
//	public void setSolicitudAprobada(SolicitudAprobada solicitudAprobada) {
//		this.solicitudAprobada = solicitudAprobada;
//	}

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Calendar getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(Calendar fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public String getMotivoDevolucion() {
		return motivoDevolucion;
	}

	public void setMotivoDevolucion(String motivoDevolucion) {
		this.motivoDevolucion = motivoDevolucion;
	}

	public String getEstadoAprobacion() {
		return estadoAprobacion;
	}

	public void setEstadoAprobacion(String estadoAprobacion) {
		this.estadoAprobacion = estadoAprobacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadoAprobacion == null) ? 0 : estadoAprobacion.hashCode());
		result = prime * result + ((fechaDeRegistro == null) ? 0 : fechaDeRegistro.hashCode());
		result = prime * result + idCliente;
		result = prime * result + idFactura;
		result = prime * result + idProducto;
		result = prime * result + idSolicitud;
		result = prime * result + ((motivoDevolucion == null) ? 0 : motivoDevolucion.hashCode());
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
		SolicitudDevolucion other = (SolicitudDevolucion) obj;
		if (estadoAprobacion == null) {
			if (other.estadoAprobacion != null)
				return false;
		} else if (!estadoAprobacion.equals(other.estadoAprobacion))
			return false;
		if (fechaDeRegistro == null) {
			if (other.fechaDeRegistro != null)
				return false;
		} else if (!fechaDeRegistro.equals(other.fechaDeRegistro))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (idFactura != other.idFactura)
			return false;
		if (idProducto != other.idProducto)
			return false;
		if (idSolicitud != other.idSolicitud)
			return false;
		if (motivoDevolucion == null) {
			if (other.motivoDevolucion != null)
				return false;
		} else if (!motivoDevolucion.equals(other.motivoDevolucion))
			return false;
		return true;
	}

}
