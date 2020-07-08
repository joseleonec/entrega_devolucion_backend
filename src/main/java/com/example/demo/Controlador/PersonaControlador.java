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

import com.example.demo.Modelo.Persona;
import com.example.demo.Repository.PersonaRepositorio;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin(origins = "*", allowedHeaders = "*",methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST, RequestMethod.PUT})
public class PersonaControlador {
	
	@Autowired
	PersonaRepositorio personaRepo;
	
	@GetMapping
	public Iterable<Persona> getAll(){
		return personaRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Persona getById(@PathVariable(value = "id") Integer id) {
		return personaRepo.findById(id).orElseGet( () ->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Persona no encontrada");			
		});
	}
	
	@PostMapping
	public Persona guardar(@RequestBody Persona persona) {
		return personaRepo.save(persona);
	}
	
	@PutMapping
	public Persona update(@RequestBody Persona persona) {
		return personaRepo.save(persona);
	}
	
	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (personaRepo.findById(id).isPresent()) {
			personaRepo.delete(personaRepo.findById(id).get());
			//personaRepo.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Persona no encontrada");	
		}
	}
}
