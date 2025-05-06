package oo.composicao.umParaN;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal() {
		
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
