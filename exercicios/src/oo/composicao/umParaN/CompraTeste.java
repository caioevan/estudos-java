package oo.composicao.umParaN;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.49);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
}
