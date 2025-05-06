package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	double total;
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompras(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
