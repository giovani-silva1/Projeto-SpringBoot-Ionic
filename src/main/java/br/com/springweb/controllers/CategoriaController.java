package br.com.springweb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Teste Rest Realizado";
	}
}
