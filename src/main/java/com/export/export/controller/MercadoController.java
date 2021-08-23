package com.export.export.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.argentina.entity.Mercado;
import com.argentina.service.MercadoSevice;


@RestController
@RequestMapping("/mercado")
public class MercadoController {
	
	@Autowired
	MercadoSevice mercado;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<Mercado>listar(){
		return mercado.listar();
	}
	
}
