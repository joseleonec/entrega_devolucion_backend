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

import com.example.demo.modelo.NotaDeCredito;
import com.example.demo.repository.NotaDeCreditoRepositorio;

@RestController
@RequestMapping("/api/notadecredito")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
		RequestMethod.POST, RequestMethod.PUT })
public class NotaDeCreditoControlador {
	

	@Autowired
	NotaDeCreditoRepositorio notaDeCreditoRepositorio;
	
	@GetMapping
	public Iterable<NotaDeCredito> getAll(){
		return notaDeCreditoRepositorio.findAll();
	}
	
	@GetMapping("/{id}")
	public NotaDeCredito getById(@PathVariable(value = "id") Integer id) {
		return notaDeCreditoRepositorio.findById(id).orElseGet( () ->{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "NotaDeCredito no encontrada");			
		});
	}
	
	@PostMapping
	public NotaDeCredito guardar(@RequestBody NotaDeCredito notaDeCredito) {
		return notaDeCreditoRepositorio.save(notaDeCredito);
	}
	
	@PutMapping
	public NotaDeCredito update(@RequestBody NotaDeCredito notaDeCredito) {
		return notaDeCreditoRepositorio.save(notaDeCredito);
	}
	
	@DeleteMapping("/{id}")
	public void borrar(@PathVariable(value = "id") Integer id) {
		if (notaDeCreditoRepositorio.findById(id).isPresent()) {
			notaDeCreditoRepositorio.delete(notaDeCreditoRepositorio.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "NotaDeCredito no encontrada");	
		}
	}	

}
