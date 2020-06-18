package com.serasa.empresa;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 @Entity
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String razaoSocial;
	private String endereco;
	private Integer numero;
	private String bairro;
	private String telefone;
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;
	
	public Empresa () {
		
	}
	
	public Empresa(long id, String razaoSocial, String endereco, Integer numero, String bairro, String telefone,
			
			LocalDate dataCadastro) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Empresa other = (Empresa) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", endereco=" + endereco + ", numero=" + numero
				+ ", bairro=" + bairro + ", telefone=" + telefone + ", dataCadastro=" + dataCadastro + "]";
	}
	
	
	
	
	
 }
	
	
	
	
	
