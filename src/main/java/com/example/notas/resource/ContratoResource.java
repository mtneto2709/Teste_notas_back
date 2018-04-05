package com.example.notas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notas.model.Contrato;
import com.example.notas.service.ContratoService;

	@RestController
	@RequestMapping("/contrato")
	public class ContratoResource {
		
		@Autowired
		private ContratoService contratoService;
		
		@PostMapping
		public ResponseEntity<?> inserir(@RequestBody Contrato contrato) {
			Contrato contratoinserido = contratoService.save(contrato);
			return ResponseEntity.ok(contratoinserido);
		}
		
		@GetMapping
		public ResponseEntity<?> listarTodos(){
			List<Contrato> contratos = contratoService.listarTodos();
			return ResponseEntity.ok(contratos);
		}

	}
