package fundamentos;

public class OperadorUnario {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1; Operador pós fixado unário de incremento de adição;
		a--; // a = a - 1; Operador pós fixado unário de incremento de subtração;
		
		++b; // b = b + 1; Operador pré fixado unário de incremento de adição;
		--b; // b = b - 1; Operador pré fixado unário de incremento de subtração;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--);
		/*
		 * Na tabela de precedência do Java, o operador pré fixado tem preferência sobre o operador pós fixado. A preferência no caso do exemplo acima
		 * fica da seguinte forma:
		 * 1°: ++a (incremento de adição da variável a)
		 * 2°: == (comparação da variável a incrementada com a variável b)
		 * 3°: b-- (incremento de subtração da variável b)
		 * 
		 * Por essa razão, irá retornar um true dessa operação:
		 * 1°: 1+1 = 2;
		 * 2°: 2 == 2; true (Resultado booleano)
		 * 3°: 2-1 = 1; (código pula essa parte quando tem o retorno booleano acima)
		 * */
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
