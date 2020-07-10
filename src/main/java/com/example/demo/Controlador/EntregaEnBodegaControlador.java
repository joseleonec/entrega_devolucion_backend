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

import com.example.demo.modelo.EntregaEnBodega;
import com.example.demo.repository.EntregaEnBodegaRepositorio;

@RestController
@RequestMapping("/api/entregaenbodega")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class EntregaEnBodegaControlador {
	@Autowired
	EntregaEnBodegaRepositorio entregaEnBodegaRepositorio;

	@GetMapping
	public Iterable<EntregaEnBodega> getAll() {
		return entregaEnBodegaRepositorio.findAll();
	}

	@GetMapping("/{id}")
	public EntregaEnBodega getById(@PathVariable(value = "id") Integer id) {
		return entregaEnBodegaRepositorio.findById(id).orElseGet(() -> {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "EntregaEnBodega no encontrada");
		});
	}

	@PostMapping
	public EntregaEnBodega guardar(@RequestBody EntregaEnBodega EntregaEnBodega) {
		return entregaEnBodegaRepositorio.save(EntregaEnBodega);
	}

	@PutMapping
	public EntregaEnBodega update(@RequestBody EntregaEnBodega EntregaEnBodega) {
		return entregaEnBodegaRepositorio.save(EntregaEnBodega);
	}

	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (entregaEnBodegaRepositorio.findById(id).isPresent()) {
			entregaEnBodegaRepositorio.delete(entregaEnBodegaRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "EntregaEnBodega no encontrada");
		}
	}
}
