package com.serasa.empresa;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Confiabilidade implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	private Integer id;
	private Double Confiabilidade;
	
	public Confiabilidade () {
		
	}

	public Confiabilidade(Integer id, Double confiabilidade) {
		super();
		this.id = id;
		Confiabilidade = confiabilidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getConfiabilidade() {
		return Confiabilidade;
	}

	public void setConfiabilidade(Double confiabilidade) {
		Confiabilidade = confiabilidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Confiabilidade other = (Confiabilidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Confiabilidade [id=" + id + ", Confiabilidade=" + Confiabilidade + "]";
	}
	
	

}
