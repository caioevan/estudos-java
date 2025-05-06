package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		//Apenas para fins didáticos, estamos criando um Set com dados de tipos diferentes, porém, o mais comum e correto é criar um Set com dados
		//do mesmo tipo.
		//Nenhuma collection permite dados de tipos primitivos, porém, se passado um tipo primitivo, ele faz a conversão automárica para a classe
		//de cada tipo.
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String (já é classe)
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste"); // Set não permite valores duplicados.
		conjunto.add('x'); // Set não permite valores duplicados.
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));// Removendo itens;
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x')); // item excluido do conjunto acima.
		System.out.println(conjunto.contains(1)); // verifica se o elemento está ou não contido no conjunto.
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums);// Interseção entre dois conjuntos. retém apenas os valores que sejam iguais entre dois conjuntos.
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
