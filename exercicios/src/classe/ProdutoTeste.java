package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);

		
		Produto p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;;
		
		System.out.printf("Produto: %s | Preço: R$ %.2f\n", p1.nome, p1.preco);
		System.out.printf("Produto: %s | Preço: R$ %.2f\n", p2.nome, p2.preco);
		
		double totalCarrinho = p1.precoComDesconto(0.05) + p2.precoComDesconto();
	
		
		System.out.printf("\nProduto: %s | Preço final: R$ %.2f\nProduto: %s | Preço final: R$ %.2f\n\nTotal do carrinho: %.2f", 
				p1.nome, p1.precoComDesconto(0.05), p2.nome, p2.precoComDesconto(), totalCarrinho);
		
	}
}
