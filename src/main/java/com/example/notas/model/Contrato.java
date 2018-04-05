package com.example.notas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="r2d2.fin_contrato")
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pkcontrato;
	
	@NotNull
	private Integer fkinterveniente;
	
	private Integer fktipocontrato;
	
	@NotNull
	private Double valorcontrato;
	
	private Date datainicio;
	
	private Date datafim;
	
	private Double custobase;
	
	private Boolean vigente;

	public Integer getPkcontrato() {
		return pkcontrato;
	}

	public void setPkcontrato(Integer pkcontrato) {
		this.pkcontrato = pkcontrato;
	}

	public Integer getFkinterveniente() {
		return fkinterveniente;
	}

	public void setFkinterveniente(Integer fkinterveniente) {
		this.fkinterveniente = fkinterveniente;
	}

	public Integer getFktipocontrato() {
		return fktipocontrato;
	}

	public void setFktipocontrato(Integer fktipocontrato) {
		this.fktipocontrato = fktipocontrato;
	}

	public Double getValorcontrato() {
		return valorcontrato;
	}

	public void setValorcontrato(Double valorcontrato) {
		this.valorcontrato = valorcontrato;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getDatafim() {
		return datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public Double getCustobase() {
		return custobase;
	}

	public void setCustobase(Double custobase) {
		this.custobase = custobase;
	}

	public Boolean getVigente() {
		return vigente;
	}

	public void setVigente(Boolean vigente) {
		this.vigente = vigente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pkcontrato == null) ? 0 : pkcontrato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (pkcontrato == null) {
			if (other.pkcontrato != null)
				return false;
		} else if (!pkcontrato.equals(other.pkcontrato))
			return false;
		return true;
	}

	

}

