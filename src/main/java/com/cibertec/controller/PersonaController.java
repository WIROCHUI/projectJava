package com.cibertec.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.model.Empleado;
import com.cibertec.service.IEstadoCivilService;
import com.cibertec.service.IPaisService;
import com.cibertec.service.IPersonaService;
import com.cibertec.service.ITipoEmpleadoService;

@Controller
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	
	@Autowired
	private IPaisService paisService;
	
	@Autowired
	private IEstadoCivilService estadoCivilService;
	
	@Autowired
	private ITipoEmpleadoService tipoEmpleadoService;
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/persona")
	public String index(Model model) {
		model.addAttribute("list",personaService.getAll());
		return "inicio";
	}
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("listPaises",paisService.getAll());
		model.addAttribute("listEstado",estadoCivilService.getAll());
		model.addAttribute("listTipo",tipoEmpleadoService.getAll());
		
		if (id != null && id !=0 ) {
			model.addAttribute("persona", personaService.get(id));
		} else {
			model.addAttribute("persona", new Empleado());
		}		
		return "save";
	}
	
	@PostMapping("/save")
	public String save(@Valid Empleado persona, BindingResult result, Model model, RedirectAttributes attribute) {
		if (result.hasErrors()) {
			model.addAttribute("listPaises",paisService.getAll());
			model.addAttribute("listEstado",estadoCivilService.getAll());
			model.addAttribute("listTipo",tipoEmpleadoService.getAll());
			System.out.println("Existieron errores en el formulario");
			return "save";
		}		
		
		personaService.save(persona);
		attribute.addFlashAttribute("success", "Cliente registrado exitosamente");		
		return "redirect:/persona";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id, Model model, RedirectAttributes attribute) {
		personaService.delete(id);	
		attribute.addFlashAttribute("warning", "Cliente eliminado");		
		return "redirect:/persona";
	}

}
