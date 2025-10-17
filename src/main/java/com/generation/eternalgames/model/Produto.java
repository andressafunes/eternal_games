package com.generation.eternalgames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity 
@Table (name = "tb_produtos")
public class Produto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column(length = 100) 
	@NotBlank(message = "O atributo titulo é obrigatório") 
	@Size(min = 5, max = 100, message ="O atributo titulo deve conter no minimo 5 e no maximo 100 caracteres") 
	private String titulo;
	
	@Column(length = 1000) 
	@NotBlank(message = "O atributo descrição é obrigatório") 
	@Size(min = 10, max = 1000, message ="O atributo descrição deve conter no minimo 5 e no maximo 100 caracteres") 
	private String descricao;
	
	@Column(length = 50) 
	@Size(min = 5, max = 50, message ="O atributo estudio deve conter no minimo 5 e no maximo 50 caracteres") 
	private String estudio;
	
	@NotBlank(message = "O atributo foto é obrigatório") 
	private String foto;
	
	@NotNull(message = "O atributo preço é obrigatório")
	private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}
