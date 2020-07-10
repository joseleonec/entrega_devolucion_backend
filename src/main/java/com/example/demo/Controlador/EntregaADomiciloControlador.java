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

import com.example.demo.modelo.EntregaADomicilo;
import com.example.demo.repository.EntregaADomiciloRepositorio;

@RestController
@RequestMapping("/api/entregadomicilio")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class EntregaADomiciloControlador {

	@Autowired
	EntregaADomiciloRepositorio entregaADomiciloRepositorio;
	
	@GetMapping
	public Iterable<EntregaADomicilo> getAll(){
		return entregaADomiciloRepositorio.findAll();
	}
	
	@GetMapping("/{id}")
	public EntregaADomicilo getById(@PathVariable(value = "id") Integer id) {
		return entregaADomiciloRepositorio.findById(id).orElseGet( () ->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "entregaADomicilo no encontrada");			
		});
	}
	
	@PostMapping
	public EntregaADomicilo guardar(@RequestBody EntregaADomicilo entregaADomicilo) {
		return entregaADomiciloRepositorio.save(entregaADomicilo);
	}
	
	@PutMapping
	public EntregaADomicilo update(@RequestBody EntregaADomicilo entregaADomicilo) {
		return entregaADomiciloRepositorio.save(entregaADomicilo);
	}
	
	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (entregaADomiciloRepositorio.findById(id).isPresent()) {
			entregaADomiciloRepositorio.delete(entregaADomiciloRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "entregaADomicilo no encontrada");	
		}
	}	
}
