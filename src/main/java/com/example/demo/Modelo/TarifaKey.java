package com.example.demo.Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TarifaKey implements Serializable{

	@Column(name = "id_parroquia")
	private Long idParroquia;

	@Column(name = "id_empresa")
	private Long idEmpresa;
	
	public TarifaKey(Long idParroquia, Long idEmpresa) {
		super();
		this.idParroquia = idParroquia;
		this.idEmpresa = idEmpresa;
	}

	public Long getIdParroquia() {
		return idParroquia;
	}

	public void setIdParroquia(Long idParroquia) {
		this.idParroquia = idParroquia;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
		result = prime * result + ((idParroquia == null) ? 0 : idParroquia.hashCode());
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
		TarifaKey other = (TarifaKey) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		if (idParroquia == null) {
			if (other.idParroquia != null)
				return false;
		} else if (!idParroquia.equals(other.idParroquia))
			return false;
		return true;
	}

	
}
