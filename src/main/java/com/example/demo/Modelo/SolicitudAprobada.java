//package com.example.demo.modelo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "solicitud_aprobada")
//public class SolicitudAprobada {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id_solicitud_aprobada")
//	private int idSolicitudAprobada;
//	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="id_solicitud", unique = true)
//	private SolicitudDevolucion solicitudDevolucion;
//	
//	@OneToOne(mappedBy = "solicitudAprobada",  fetch = FetchType.LAZY)
//	private NotaDeCredito notaDeCredito;
//	
////	@OneToOne(fetch = FetchType.LAZY)
////	@MapsId("idSustitucion")
//	@OneToOne(mappedBy = "solicitudAprobada")
//	private Sustitucion sustitucion;
//
//	public SolicitudAprobada() {
//		super();
//	}
//
//
//	public int getIdSolicitudAprobada() {
//		return idSolicitudAprobada;
//	}
//
//
//	public SolicitudDevolucion getSolicitudDevolucion() {
//		return solicitudDevolucion;
//	}
//
//
////	public NotaDeCredito getNotaDeCredito() {
////		return notaDeCredito;
////	}
//
//
////	public Sustitucion getSustitucion() {
////		return sustitucion;
////	}
//
//
//	public void setIdSolicitudAprobada(int idSolicitudAprobada) {
//		this.idSolicitudAprobada = idSolicitudAprobada;
//	}
//
//
//	public void setSolicitudDevolucion(SolicitudDevolucion solicitudDevolucion) {
//		this.solicitudDevolucion = solicitudDevolucion;
//	}
//
////	public void setNotaDeCredito(NotaDeCredito notaDeCredito) {
////		this.notaDeCredito = notaDeCredito;
////	}
//
//
////	public void setSustitucion(Sustitucion sustitucion) {
////		this.sustitucion = sustitucion;
////	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idSolicitudAprobada;
//		result = prime * result + ((notaDeCredito == null) ? 0 : notaDeCredito.hashCode());
//		result = prime * result + ((solicitudDevolucion == null) ? 0 : solicitudDevolucion.hashCode());
//		result = prime * result + ((sustitucion == null) ? 0 : sustitucion.hashCode());
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
//		SolicitudAprobada other = (SolicitudAprobada) obj;
//		if (idSolicitudAprobada != other.idSolicitudAprobada)
//			return false;
//		if (notaDeCredito == null) {
//			if (other.notaDeCredito != null)
//				return false;
//		} else if (!notaDeCredito.equals(other.notaDeCredito))
//			return false;
//		if (solicitudDevolucion == null) {
//			if (other.solicitudDevolucion != null)
//				return false;
//		} else if (!solicitudDevolucion.equals(other.solicitudDevolucion))
//			return false;
//		if (sustitucion == null) {
//			if (other.sustitucion != null)
//				return false;
//		} else if (!sustitucion.equals(other.sustitucion))
//			return false;
//		return true;
//	}
//	
//	
//	
//}
