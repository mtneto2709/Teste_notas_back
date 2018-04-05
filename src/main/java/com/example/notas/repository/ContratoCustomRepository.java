package com.example.notas.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.sql.Insert;
import org.springframework.stereotype.Repository;

import com.example.notas.model.Contrato;

@Repository
public class ContratoCustomRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Contrato> listAll() {
		return entityManager.createQuery("FROM Contrato", Contrato.class).getResultList();
	}
	
	public Contrato Insert(Contrato contrato) {
		return entityManager.merge(contrato);
	}
	
}
