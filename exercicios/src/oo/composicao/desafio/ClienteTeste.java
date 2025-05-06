package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Carlos");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		cliente1.adicionarCompras(compra1);
		compra1.adicionarItem(new Item(new Produto("Notebook", 3500.00), 3));
		compra1.adicionarItem(new Item(new Produto("Celular", 2500.00), 2));
		compra2.adicionarItem(new Item(new Produto("Teclado", 200.00), 5));
		compra2.adicionarItem(new Item(new Produto("Mouse", 100.00), 5));
		
		System.out.println(compra1.obterValorTotal());
		System.out.println(compra2.obterValorTotal());
		System.out.println(cliente1.obterValorTotal());
		
		
		
	}
	
}
