package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@NotNull
	@Size(min=3, message="mínimo de 3 caracteres")
    private String nome;
	
	@NotNull
	@Size(min=8, message="mínimo de 8 caracteres")
    private String bula;
	
	@NotNull
	private int idFornecedor;
	
	@NotNull
	private String dataValidade;
	
	public Medicamento() {
		
	}
	

	public Medicamento(Long id, @NotNull @Size(min = 3, message = "mínimo de 3 caracteres") String nome,
			@NotNull @Size(min = 8, message = "mínimo de 8 caracteres") String senha,
			@NotNull @Email(message = "Informe o email") String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.bula = bula;
		this.idFornecedor = idFornecedor;
		this.dataValidade = dataValidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public int getidFornecedor() {
		return idFornecedor;
	}

	public void setidFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
    //metodos getts e setts
    
    
}
