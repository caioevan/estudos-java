package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	double total;
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	double obterValorTotal() {
		for(Item item: itens) {
			total += item.totalItem();
		}
		return total;
	}
}
