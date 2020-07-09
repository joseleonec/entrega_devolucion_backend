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

import com.example.demo.Modelo.EmpresaEnvios;
import com.example.demo.Repository.EmpresaEnviosRepositorio;


@RestController
@RequestMapping("/api/empresa")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class EmpresaEnviosControlador {
	
	@Autowired
	EmpresaEnviosRepositorio empresaEnviosRepositorio;
	
	@GetMapping
	public Iterable<EmpresaEnvios> getAll(){
		return empresaEnviosRepositorio.findAll();
	}
	
	@GetMapping("/{id}")
	public EmpresaEnvios getById(@PathVariable(value = "id") Integer id) {
		return empresaEnviosRepositorio.findById(id).orElseGet( () ->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empresa de Envios no encontrada");			
		});
	}
	
	@PostMapping
	public EmpresaEnvios guardar(@RequestBody EmpresaEnvios empresa) {
		return empresaEnviosRepositorio.save(empresa);
	}
	
	@PutMapping
	public EmpresaEnvios update(@RequestBody EmpresaEnvios empresa) {
		return empresaEnviosRepositorio.save(empresa);
	}
	
	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (empresaEnviosRepositorio.findById(id).isPresent()) {
			empresaEnviosRepositorio.delete(empresaEnviosRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empresa de Envios no encontrada");	
		}
	}	
}