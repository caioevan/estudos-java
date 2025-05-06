package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	/*
	 * Converções para métodos do Repository (Nome é a variável presente na nossa entidade)
	 * 
	 * findByNomeContaining
	 * findByNomeIsContaining
	 * findByNomeContains
	 * 
	 * findByNomeStartsWith
	 * findByNomeEndsWith
	 * 
	 * findByNomeNotContaining
	 * 
	 * */
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
