package com.example.demo.modelo;
//package com.example.demo.Modelo;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//
//@Embeddable
//public class TarifaKey implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Column(name = "id_parroquia")
//	private int idParroquia;
//
//	@Column(name = "id_empresa")
//	private int idEmpresa;
//	
//	public TarifaKey() {}
//	
//	public TarifaKey(int idParroquia, int idEmpresa) {
//		super();
//		this.idParroquia = idParroquia;
//		this.idEmpresa = idEmpresa;
//	}
//
//	public int getIdParroquia() {
//		return idParroquia;
//	}
//
//	public void setIdParroquia(int idParroquia) {
//		this.idParroquia = idParroquia;
//	}
//
//	public int getIdEmpresa() {
//		return idEmpresa;
//	}
//
//	public void setIdEmpresa(int idEmpresa) {
//		this.idEmpresa = idEmpresa;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + idEmpresa;
//		result = prime * result + idParroquia;
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
//		TarifaKey other = (TarifaKey) obj;
//		if (idEmpresa != other.idEmpresa)
//			return false;
//		if (idParroquia != other.idParroquia)
//			return false;
//		return true;
//	}
//
//	
//	
//}
