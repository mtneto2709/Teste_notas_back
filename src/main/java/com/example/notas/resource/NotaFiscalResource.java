package com.example.notas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notas.model.NotaFiscal;
import com.example.notas.service.NotaFiscalService;

@RestController
@RequestMapping("/notafiscal")
public class NotaFiscalResource {
	
	@Autowired
	private NotaFiscalService notaFiscalService;
	
	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody NotaFiscal notaFiscal) {
		NotaFiscal notaFiscalInserida = notaFiscalService.save(notaFiscal);
		return ResponseEntity.ok(notaFiscalInserida);
	}
	
	@GetMapping
	public ResponseEntity<?> listarTodos() {
		List<NotaFiscal> notasFiscais = notaFiscalService.listarTodos();
		return ResponseEntity.ok(notasFiscais);
	}

}
