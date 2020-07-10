package com.example.demo.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "entrega_a_domicilio")
public class EntregaADomicilo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_entrega_domicilio")
	private Long idEntregaDomicilio;

	@Column(name = "id_ubicacion")
	private Long idUbicacion;

	@Column(name = "id_empresa")
	private Long idEmpresa;

	@Column(name = "id_factura")
	private Long idFactura;

	@Column(name = "prioridad")
	private int prioridad;

	@Column(length = 10)
	private String estado;

	@Column(name = "peso_kg")
	private double pesoKg;

	public EntregaADomicilo(Long idEntregaDomicilio, Long idUbicacion, Long idEmpresa, Long idFactura, int prioridad,
			String estado, double pesoKg) {
		super();
		this.idEntregaDomicilio = idEntregaDomicilio;
		this.idUbicacion = idUbicacion;
		this.idEmpresa = idEmpresa;
		this.idFactura = idFactura;
		this.prioridad = prioridad;
		this.estado = estado;
		this.pesoKg = pesoKg;
	}

//	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private EmpresaEnvios empresaEnvios;
//	

}
