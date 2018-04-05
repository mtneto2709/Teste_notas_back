package com.example.notas.resource;

import java.util.List;

import com.example.notas.service.TipoContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notas.model.TipoContrato;
import com.example.notas.repository.TipoContratoCustomRepository;
import com.example.notas.repository.TipocontratoRepository;

@RestController
@RequestMapping("/tipocontrato")
public class TipoContratoResource {

	@Autowired
	private TipoContratoService tipoContratoService;

	@PostMapping
	public ResponseEntity<?> inserir(@RequestBody TipoContrato tipoContrato){
		TipoContrato tipoContratoInserido = tipoContratoService.save(tipoContrato);
		return ResponseEntity.ok(tipoContratoInserido);
	}

	@GetMapping
	public ResponseEntity<?> listarTodos(){
		return ResponseEntity.ok(tipoContratoService.listarTodos());
	}
	
	/*
	@DeleteMapping
	public ResponseEntity<?> deletar(@RequestBody TipoContrato tipoContrato) {
		TipoContrato tipoContratoDeletado = tipoContratoService.delete(tipoContrato);
		return ResponseEntity.ok(tipoContratoDeletado);
	}
	*/
}
