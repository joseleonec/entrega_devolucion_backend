package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.modelo.SolicitudDevolucion;
import com.example.demo.repository.SolicitudDevolucionRepositorio;

@RestController
@RequestMapping("/api/solicituddevolucion")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class SolicitudDevolucionControlador {
	@Autowired
	SolicitudDevolucionRepositorio solicitudDevolucionRepositorio;

	@GetMapping
	public Iterable<SolicitudDevolucion> getAll() {
		return solicitudDevolucionRepositorio.findAll();
	}
	
	@GetMapping("/idcliente={id}")
	public Iterable<SolicitudDevolucion> getByIdCliente(@PathVariable(value = "id") Integer id) {
		return solicitudDevolucionRepositorio.findByIdCliente(id);
	}

	@GetMapping("/{id}")
	public SolicitudDevolucion getById(@PathVariable(value = "id") Integer id) {
		return solicitudDevolucionRepositorio.findById(id).orElseGet(() -> {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "SolicitudDevolucion no encontrada");
		});
	}

	@PostMapping
	public SolicitudDevolucion guardar(@RequestBody SolicitudDevolucion solicitudDevolucion) {
		return solicitudDevolucionRepositorio.save(solicitudDevolucion);
	}

	@PutMapping
	public SolicitudDevolucion update(@RequestBody SolicitudDevolucion solicitudDevolucion) {
		return solicitudDevolucionRepositorio.save(solicitudDevolucion);
	}

	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (solicitudDevolucionRepositorio.findById(id).isPresent()) {
			solicitudDevolucionRepositorio.delete(solicitudDevolucionRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "SolicitudDevolucion no encontrada");
		}
	}
}
