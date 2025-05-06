package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		//Interface funcional Predicate - retorna true ou false a operação que estiver especificada na função.
//......Interface funcional predicate|Função que vai retornar true ou false no "test"
//......recebendo um tipo Produto....|
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
