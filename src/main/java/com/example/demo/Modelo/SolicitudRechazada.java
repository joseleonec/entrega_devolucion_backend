//package com.example.demo.modelo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "solicitud_rechazada")
//public class SolicitudRechazada {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id_solicitud_rechazada")
//	private int idSolicitudRechazada;
//
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_solicitud",unique = true)
//	private SolicitudDevolucion solicitudDevolucion;
//
//	public int getIdSolicitudRechazada() {
//		return idSolicitudRechazada;
//	}
//
//
//	public SolicitudDevolucion getSolicitudDevolucion() {
//		return solicitudDevolucion;
//	}
//
//
//	public SolicitudRechazada() {
//		super();
//	}
//
//
//	public void setIdSolicitudRechazada(int idSolicitudRechazada) {
//		this.idSolicitudRechazada = idSolicitudRechazada;
//	}
//
//
//	public void setSolicitudDevolucion(SolicitudDevolucion solicitudDevolucion) {
//		this.solicitudDevolucion = solicitudDevolucion;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idSolicitudRechazada;
//		result = prime * result + ((solicitudDevolucion == null) ? 0 : solicitudDevolucion.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		SolicitudRechazada other = (SolicitudRechazada) obj;
//		if (idSolicitudRechazada != other.idSolicitudRechazada)
//			return false;
//		if (solicitudDevolucion == null) {
//			if (other.solicitudDevolucion != null)
//				return false;
//		} else if (!solicitudDevolucion.equals(other.solicitudDevolucion))
//			return false;
//		return true;
//	}
//
//}
