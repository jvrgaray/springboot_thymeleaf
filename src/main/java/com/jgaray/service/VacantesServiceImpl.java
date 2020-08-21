/*
 * @(#)VacantesServiceImpl.java
 *
 * Copyright (c) BANCO DE CHILE (Chile). All rights reserved.
 *
 * All rights to this product are owned by BANCO DE CHILE and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by BANCO DE CHILE.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.jgaray.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import com.jgaray.model.Vacante;

/**
 * @author 2b-0088
 *
 */
public class VacantesServiceImpl implements IVacanteService {

	private List<Vacante> lista = null;
	
	public VacantesServiceImpl() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		lista = new  LinkedList<Vacante>();
		
		try {
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("vacante 1");
			v1.setDescripcion("descripcion 1");
			v1.setFecha(simpleDateFormat.parse("01-01-2020"));
			v1.setSalario(1000.0);
			v1.setDestacado(1);
			
			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("vacante 2");
			v2.setDescripcion("descripcion 2");
			v2.setFecha(simpleDateFormat.parse("02-02-2020"));
			v2.setSalario(2000.0);
			v2.setDestacado(0);

			
			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("vacante 3");
			v3.setDescripcion("descripcion 3");
			v3.setFecha(simpleDateFormat.parse("03-03-2020"));
			v3.setSalario(3000.0);
			v3.setDestacado(0);

			
			Vacante v4 = new Vacante();
			v4.setId(4);
			v4.setNombre("vacante 4");
			v4.setDescripcion("descripcion 4");
			v4.setFecha(simpleDateFormat.parse("04-04-2020"));
			v4.setSalario(4000.0);
			v4.setDestacado(1);

			
			lista.add(v1);
			lista.add(v2);
			lista.add(v3);
			lista.add(v4);
		} catch(ParseException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

	@Override
	public List<Vacante> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

}
