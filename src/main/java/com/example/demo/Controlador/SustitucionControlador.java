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

import com.example.demo.modelo.Sustitucion;
import com.example.demo.repository.SustitucionRepositorio;

@RestController
@RequestMapping("/api/sustitucion")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class SustitucionControlador {
	@Autowired
	SustitucionRepositorio sustitucionRepositorio;

	@GetMapping
	public Iterable<Sustitucion> getAll() {
		return sustitucionRepositorio.findAll();
	}

	@GetMapping("/{id}")
	public Sustitucion getById(@PathVariable(value = "id") Integer id) {
		return sustitucionRepositorio.findById(id).orElseGet(() -> {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Sustitucion no encontrada");
		});
	}

	@PostMapping
	public Sustitucion guardar(@RequestBody Sustitucion sustitucion) {
		return sustitucionRepositorio.save(sustitucion);
	}

	@PutMapping
	public Sustitucion update(@RequestBody Sustitucion sustitucion) {
		return sustitucionRepositorio.save(sustitucion);
	}

	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (sustitucionRepositorio.findById(id).isPresent()) {
			sustitucionRepositorio.delete(sustitucionRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Sustitucion no encontrada");
		}
	}
}
