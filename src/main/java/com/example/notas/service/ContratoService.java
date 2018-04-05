package com.example.notas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notas.model.Contrato;
import com.example.notas.repository.ContratoCustomRepository;

@Service
public class ContratoService {

	@Autowired
	private ContratoCustomRepository contratoCustomRepository;
	
	@Transactional
	public Contrato save(Contrato contrato) {
		return contratoCustomRepository.Insert(contrato);
	}
	
	public List<Contrato> listarTodos() {
		return contratoCustomRepository.listAll();
	}
}
