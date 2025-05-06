package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(2520.89, 27.5, "Notebook", true);
		Produto p2 = new Produto(550.99, 32.5, "Mouse", false);
		Produto p3 = new Produto(57.90, 12.5, "Resma de papel", false);
		Produto p4 = new Produto(3999.99, 35.0, "Playstation 5", true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> bomDesconto = p -> p.desconto >= 30;
		Predicate<Produto> freteGratis = p -> p.freteGratis;
		Function<Produto, String> anuncio = p -> "O " + p.nome + " está com um desconto imperdível de " + p.desconto
		+ "% e com frete grátis, não peca essa oportunidade!";
		
		produtos.stream()
			.filter(bomDesconto)
			.filter(freteGratis)
			.map(anuncio)
			.forEach(System.out::println);
		
	}
}
