package com.generation.eternalgames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.eternalgames.model.Produto;

public interface ProdutoRepository  extends JpaRepository <Produto, Long> {
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	public List<Produto> findAllByPrecoLessThanOrderByPrecoAsc(BigDecimal preco);
	
	public List<Produto> findAllByPrecoGreaterThanOrderByPrecoAsc(BigDecimal preco);

}
