package com.jgaray.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jgaray.model.Vacante;

@Controller
public class HomeController {
	@GetMapping("/tabla")
	public String motrarTabla(Model model) {
		List<Vacante> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		
		model.addAttribute("vacante", vacante);
		return "detalle";
	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de sistemas");
		lista.add("Auxiliar de contabilidad");
		lista.add("Vendor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		return "listado";
	}
	
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
//		model.addAttribute("mensaje", "Bienvenidos a empleos App");
//		model.addAttribute("fecha", new Date());
		
		String nombre = "Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fechaPub", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		
		return "home";
	}
	
	private List<Vacante> getVacantes(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		List<Vacante> lista = new  LinkedList<Vacante>();
		
		try {
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("vacante 1");
			v1.setDescripcion("descripcion 1");
			v1.setFecha(simpleDateFormat.parse("01-01-2020"));
			v1.setSalario(1000.0);
			
			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("vacante 2");
			v2.setDescripcion("descripcion 2");
			v2.setFecha(simpleDateFormat.parse("02-02-2020"));
			v2.setSalario(2000.0);
			
			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("vacante 3");
			v3.setDescripcion("descripcion 3");
			v3.setFecha(simpleDateFormat.parse("03-03-2020"));
			v3.setSalario(3000.0);
			
			Vacante v4 = new Vacante();
			v4.setId(4);
			v4.setNombre("vacante 4");
			v4.setDescripcion("descripcion 4");
			v4.setFecha(simpleDateFormat.parse("04-04-2020"));
			v4.setSalario(4000.0);
			
			lista.add(v1);
			lista.add(v2);
			lista.add(v3);
			lista.add(v4);
		} catch(ParseException e) {
			System.out.println("Error: "+e.getMessage());
		}
		return lista;
	}
}
