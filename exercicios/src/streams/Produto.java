package streams;

public class Produto {

	final Double preco;
	final Double desconto;
	final String nome;
	final boolean freteGratis;
	
	public Produto(Double preco, Double desconto, String nome, boolean freteGratis) {
		this.preco = preco;
		this.desconto = desconto;
		this.nome = nome;
		this.freteGratis = freteGratis;
	}	
}
