package com.example.notas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.notas.model.TipoContrato;

@Repository
public class TipoContratoCustomRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<TipoContrato> listAll() {
		return entityManager.createQuery("FROM TipoContrato", TipoContrato.class).getResultList();
	}

	public TipoContrato insert(TipoContrato tipoContrato) {
		return entityManager.merge(tipoContrato);
	}
	
/*
 * 	public TipoContrato delete(TipoContrato tipoContrato) {
 	return entityManager.merge(tipoContrato);
	}
	*/
}
