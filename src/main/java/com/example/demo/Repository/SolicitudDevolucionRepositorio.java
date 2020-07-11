package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.SolicitudDevolucion;

public interface SolicitudDevolucionRepositorio extends JpaRepository<SolicitudDevolucion, Integer>{

	public Iterable<SolicitudDevolucion> findByIdCliente(Integer idCliente);
}
