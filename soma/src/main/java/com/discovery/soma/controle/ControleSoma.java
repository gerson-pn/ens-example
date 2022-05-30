package com.discovery.soma.controle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.discovery.soma.dominio.Resultado;

@RestController
public class ControleSoma {
	@GetMapping("/somar-valor-{valor1}-mais-valor-{valor2}")
	public ResponseEntity<?> somar(@PathVariable double valor1, @PathVariable double valor2) {
		double soma = valor1 + valor2;
		Resultado resultado = new Resultado(soma);
		return new ResponseEntity<Resultado>(resultado, HttpStatus.ACCEPTED);
	}
}