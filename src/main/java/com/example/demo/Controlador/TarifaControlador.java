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

import com.example.demo.modelo.Tarifa;
import com.example.demo.repository.TarifaRepositorio;

@RestController
@RequestMapping("/api/tarifa")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class TarifaControlador {

	@Autowired
	TarifaRepositorio tarifaRepositorio;

	@GetMapping
	public Iterable<Tarifa> getAll() {
		return tarifaRepositorio.findAll();
	}

	@GetMapping("/{id}")
	public Tarifa getById(@PathVariable(value = "id") Integer id) {
		return tarifaRepositorio.findById(id).orElseGet(() -> {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tarifa no encontrada");
		});
	}

	@PostMapping
	public Tarifa guardar(@RequestBody Tarifa tarifa) {
		return tarifaRepositorio.save(tarifa);
	}

	@PutMapping
	public Tarifa update(@RequestBody Tarifa tarifa) {
		return tarifaRepositorio.save(tarifa);
	}

	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (tarifaRepositorio.findById(id).isPresent()) {
			tarifaRepositorio.delete(tarifaRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "tarifa no encontrada");
		}
	}
}
