package com.example.notas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="r2d2.fin_tipocontrato")
public class TipoContrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pktipocontrato;
	
	private String sigla;
	
	@NotEmpty
	private String  tipocontrato;

	public long getPktipocontrato() {
		return pktipocontrato;
	}

	public void setPktipocontrato(Integer pktipocontrato) {
		this.pktipocontrato = pktipocontrato;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTipocontrato() {
		return tipocontrato;
	}

	public void setTipocontrato(String tipocontrato) {
		this.tipocontrato = tipocontrato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (pktipocontrato ^ (pktipocontrato >>> 32));
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
		TipoContrato other = (TipoContrato) obj;
		if (pktipocontrato != other.pktipocontrato)
			return false;
		return true;
	}
	
	
}
