package com.example.demo.Controlador;

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

import com.example.demo.Modelo.Parroquia;
import com.example.demo.Repository.ParroquiaRepositorio;

@RestController
@RequestMapping("/api/parroquia")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class ParroquiaControlador {

	@Autowired
	ParroquiaRepositorio parroquiaRepositorio;

	@GetMapping
	public Iterable<Parroquia> getAll() {
		return parroquiaRepositorio.findAll();
	}

	@GetMapping("/{id}")
	public Parroquia getById(@PathVariable(value = "id") Integer id) {
		return parroquiaRepositorio.findById(id).orElseGet(() -> {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empresa de Envios no encontrada");
		});
	}

	@PostMapping
	public Parroquia guardar(@RequestBody Parroquia parroquia) {
		return parroquiaRepositorio.save(parroquia);
	}

	@PutMapping
	public Parroquia update(@RequestBody Parroquia parroquia) {
		return parroquiaRepositorio.save(parroquia);
	}

	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (parroquiaRepositorio.findById(id).isPresent()) {
			parroquiaRepositorio.delete(parroquiaRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empresa de Envios no encontrada");
		}
	}
}
