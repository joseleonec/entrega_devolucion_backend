package com.example.demo.Modelo;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "tarifa")
public class Tarifa {

	@EmbeddedId
	private TarifaKey id;

	@ManyToOne
	@MapsId("student_id")
	@JoinColumn(name = "student_id")
	private Parroquia student;

	@ManyToOne
	@MapsId("course_id")
	@JoinColumn(name = "course_id")
	private EmpresaEnvios course;

}
