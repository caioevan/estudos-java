package oo.composicao.desafio;

public class Item {

	int quantidade;
	Produto produto;
	double total;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	double totalItem() {
		return total = produto.preco * quantidade;
	}
	
}
