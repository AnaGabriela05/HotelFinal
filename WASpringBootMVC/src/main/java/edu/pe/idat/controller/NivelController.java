package edu.pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.pe.idat.model.Descuento_temporadaXcategoria;
import edu.pe.idat.model.Habitacion;
import edu.pe.idat.model.Nivel;
import edu.pe.idat.model.Temporada;
import edu.pe.idat.service.NivelService;

@Controller
public class NivelController {
	@Autowired
	private NivelService service;
	
	@GetMapping("/listar_nivel")
	public String frmListanivel(Model model) {
		
		
		
		model.addAttribute("lista",service.listar_nivel());
		
		
		
		return "listar_nivel";
	        
			
			
		
	}
	
	@GetMapping("/listar_nivel/registrar_nivel")
	public String crear_nivel(Model model) {
		
		Nivel tempo = new Nivel();
		
		model.addAttribute("nivel",tempo);
		
		
		return "registrar_nivel";
	}
	
	
	@GetMapping("listar_nivel/actualizar_nivel/{id}")
	public String editar_Temporada(@PathVariable("id")String idtempo,Model model) {
		
		Nivel nivel = service.buscar_nivel_id(idtempo);
		
		
		model.addAttribute("nivel_encontrado",nivel);
	
		
		return "actualizar_nivel";
	}
	
	
	@PostMapping("/actua_nivel")
	
	public String actualizarNivel( Nivel nivel) {
		service.actualizarNiveles(nivel);
		return "redirect:/listar_nivel";
	}
	
	
	@PostMapping("/generar_nivel")
	
	public String generar_Nivel( Nivel nivel) {
		service.registrarNiveles(nivel);
		return "redirect:/listar_nivel";
	}
	
	
	
	
	
	
}

	
	
