package com.example.notas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.notas.model.NotaFiscal;

@Repository
public class NotaFiscalCustomRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<NotaFiscal> listAll() {
		return entityManager.createQuery("FROM NotaFiscal", NotaFiscal.class).getResultList();
	}

	public NotaFiscal insert(NotaFiscal notaFiscal) {
		return entityManager.merge(notaFiscal);
	}
}
