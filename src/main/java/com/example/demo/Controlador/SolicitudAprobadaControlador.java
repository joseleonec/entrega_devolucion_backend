//package com.example.demo.controlador;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.server.ResponseStatusException;
//
//import com.example.demo.modelo.SolicitudAprobada;
//import com.example.demo.repository.SolicitudAprobadaRepositorio;
//
//@RestController
//@RequestMapping("/api/solicitudaprobada")
//@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
//		RequestMethod.POST, RequestMethod.PUT })
//public class SolicitudAprobadaControlador {
//	
//	@Autowired
//	SolicitudAprobadaRepositorio solicitudAprobadaRepositorio;
//
//	@GetMapping
//	public Iterable<SolicitudAprobada> getAll() {
//		return solicitudAprobadaRepositorio.findAll();
//	}
//
//	@GetMapping("/{id}")
//	public SolicitudAprobada getById(@PathVariable(value = "id") Integer id) {
//		return solicitudAprobadaRepositorio.findById(id).orElseGet(() -> {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "SolicitudAprobada no encontrada");
//		});
//	}
//	
//	@GetMapping("/idsolicitud={id}")
//	public Iterable<SolicitudAprobada> getByIdCliente(@PathVariable(value = "id") Integer id) {
//		return solicitudAprobadaRepositorio.findBySolicitudDevolucionIdSolicitud(id);
//	}
//	
//	@PostMapping
//	public SolicitudAprobada guardar(@RequestBody SolicitudAprobada solicitudAprobada) {
//		return solicitudAprobadaRepositorio.save(solicitudAprobada);
//	}
//
//	@PutMapping
//	public SolicitudAprobada update(@RequestBody SolicitudAprobada solicitudAprobada) {
//		return solicitudAprobadaRepositorio.save(solicitudAprobada);
//	}
//
//	@DeleteMapping("/{id}")
//	public void borrar(@PathVariable(value = "id") Integer id) {
//		if (solicitudAprobadaRepositorio.findById(id).isPresent()) {
//			solicitudAprobadaRepositorio.delete(solicitudAprobadaRepositorio.findById(id).get());
//		} else {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "SolicitudAprobada no encontrada");
//		}
//	}
//}
