package com.example.notas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notas.model.NotaFiscal;
import com.example.notas.repository.NotaFiscalCustomRepository;

@Service
public class NotaFiscalService {
	
	@Autowired
	private NotaFiscalCustomRepository notaFiscalCustomRepository;
	
	public List<NotaFiscal> listarTodos() {
		return notaFiscalCustomRepository.listAll();
	}
	
	@Transactional
	public NotaFiscal save(NotaFiscal notaFiscal) {
		return notaFiscalCustomRepository.insert(notaFiscal);
	}

}
