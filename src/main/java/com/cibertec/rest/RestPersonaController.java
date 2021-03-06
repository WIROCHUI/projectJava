package com.cibertec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Empleado;
import com.cibertec.service.IPersonaService;

@RestController
@RequestMapping("/wspersonas")
public class RestPersonaController {

	@Autowired
	private IPersonaService personaService;
	
	@GetMapping
	public List<Empleado> listarPersonas(){
		return personaService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	public Empleado obtenerPersona(@PathVariable("id") Integer id){
		return personaService.get(id);
	}
	
	@PostMapping
	public void insertar(@RequestBody Empleado per){
		personaService.save(per);
	}
	
	@PutMapping
	public void modificar(@RequestBody Empleado per){
		personaService.save(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		personaService.delete(id);
	}
}
