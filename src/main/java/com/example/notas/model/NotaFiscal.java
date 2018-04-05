package com.example.notas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="r2d2.fin_notafiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pknotafiscal;
	
	@NotNull
	private Integer fkcontrato;
	
	@NotNull
	private Integer numero;
	
	@NotNull
	private Date dataemissao;
	
	private String competencia;
	
	@NotNull
	private Double valor;
	
	private Date datapagamento;
	
	private Double valorpago;

	public Integer getPknotafiscal() {
		return pknotafiscal;
	}

	public void setPknotafiscal(Integer pknotafiscal) {
		this.pknotafiscal = pknotafiscal;
	}

	public Integer getFkcontrato() {
		return fkcontrato;
	}

	public void setFkcontrato(Integer fkcontrato) {
		this.fkcontrato = fkcontrato;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataemissao() {
		return dataemissao;
	}

	public void setDataemissao(Date dataemissao) {
		this.dataemissao = dataemissao;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDatapagamento() {
		return datapagamento;
	}

	public void setDatapagamento(Date datapagamento) {
		this.datapagamento = datapagamento;
	}

	public Double getValorpago() {
		return valorpago;
	}

	public void setValorpago(Double valorpago) {
		this.valorpago = valorpago;
	}

}
