package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
/*Diferente da Fila, a Pilha tem o comportamento de Last in, Firts out (LiFo). O ultimo a entrar na pilha, é o primeiro a sair. Portanto a ordem 
 * de entrada desta pilha é: O pequeno príncipe -> don quixote -> o hobbit; e a ordem de saída é o contrário.*/
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Prícipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());
	}
}
