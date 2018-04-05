package com.example.notas.service;

import com.example.notas.model.TipoContrato;
import com.example.notas.repository.TipoContratoCustomRepository;
import com.example.notas.repository.TipocontratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class TipoContratoService {

    @Autowired
    private TipoContratoCustomRepository tipoContratoCustomRepository;

    @Transactional
    public TipoContrato save(TipoContrato tipoContrato) {
        return tipoContratoCustomRepository.insert(tipoContrato);
    }

    public List<TipoContrato> listarTodos() {
        return tipoContratoCustomRepository.listAll();
    }
    
    /*
    @Transactional
    public TipoContrato delete(TipoContrato tipoContrato) {
    	return tipoContratoCustomRepository.delete(tipoContrato);
    }
    */
    
    
}
