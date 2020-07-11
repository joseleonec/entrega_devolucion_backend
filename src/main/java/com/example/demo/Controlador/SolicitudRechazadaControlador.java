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
//import com.example.demo.modelo.SolicitudRechazada;
//import com.example.demo.repository.SolicitudRechazadaRepositorio;
//
//@RestController
//@RequestMapping("/api/solicitudrechazada")
//@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.DELETE,
//		RequestMethod.POST, RequestMethod.PUT })
//public class SolicitudRechazadaControlador {
//	
//	@Autowired
//	SolicitudRechazadaRepositorio solicitudRechazadaRepositorio;
//
//	@GetMapping
//	public Iterable<SolicitudRechazada> getAll() {
//		return solicitudRechazadaRepositorio.findAll();
//	}
//
//	@GetMapping("/{id}")
//	public SolicitudRechazada getById(@PathVariable(value = "id") Integer id) {
//		return solicitudRechazadaRepositorio.findById(id).orElseGet(() -> {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "SolicitudAprobada no encontrada");
//		});
//	}
//	
//	@GetMapping("/idsolicitud={id}")
//	public Iterable<SolicitudRechazada> getByIdCliente(@PathVariable(value = "id") Integer id) {
//		return solicitudRechazadaRepositorio.findBySolicitudDevolucionIdSolicitud(id);
//	}
//	
//	@PostMapping
//	public SolicitudRechazada guardar(@RequestBody SolicitudRechazada solicitudAprobada) {
//		return solicitudRechazadaRepositorio.save(solicitudAprobada);
//	}
//
//	@PutMapping
//	public SolicitudRechazada update(@RequestBody SolicitudRechazada solicitudAprobada) {
//		return solicitudRechazadaRepositorio.save(solicitudAprobada);
//	}
//
//	@DeleteMapping("/{id}")
//	public void borrar(@PathVariable(value = "id") Integer id) {
//		if (solicitudRechazadaRepositorio.findById(id).isPresent()) {
//			solicitudRechazadaRepositorio.delete(solicitudRechazadaRepositorio.findById(id).get());
//		} else {
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "SolicitudAprobada no encontrada");
//		}
//	}
//}
