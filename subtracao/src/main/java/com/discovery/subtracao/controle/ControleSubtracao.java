package com.discovery.subtracao.controle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.discovery.subtracao.dominio.Resultado;

@RestController
public class ControleSubtracao {
	@GetMapping("/subtrair-valor-{valor1}-menos-valor-{valor2}")
	public ResponseEntity<?> somar(@PathVariable double valor1, @PathVariable double valor2) {
		double subtracao = valor1 - valor2;
		Resultado resultado = new Resultado(subtracao);
		return new ResponseEntity<Resultado>(resultado, HttpStatus.ACCEPTED);
	}
}