package com.jgaray.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jgaray.model.Vacante;
import com.jgaray.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	@Autowired
	private IVacanteService service;
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {
		Vacante vacante = service.buscarPorId(idVacante);
		
		System.out.println("vacante: "+vacante);
		model.addAttribute("vacante", vacante);

		return "detalle";
	}
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante, Model model) {
		System.out.println("Borrando vacante con id: "+ idVacante);
		return "mensaje";
	}
}
