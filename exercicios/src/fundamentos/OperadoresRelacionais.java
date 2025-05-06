package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		/*
		 * Operadores Relacionais:
		 * 
		 *  ==  Igual
		 *  >   Maior que
		 *  <   Menor que
		 *  >=  Maior ou igual
		 *  <=  Menor ou igual
		 *  !=  Diferente (not equal)
		 * */
		
		int a = 5;
		int b = 6;
		
		System.out.println(a == b); // Operador igual que
		System.out.println(a > b); // Operador maior que
		System.out.println(a < b); // Operador menor que
		System.out.println(a >= b); // Operador maior ou igual
		System.out.println(a <= b); // Operador menor ou igual
		System.out.println(a != b); // Operador diferente
		
		//Ex prático
		double nota = 7.5;
		boolean bomComportamento = true; // Operador atribuição
		boolean passouPorMedia = nota >= 7; // Operador relacional
		boolean temDesconto = bomComportamento && passouPorMedia; // Operador Lógico
		System.out.println("Tem desconto? " + temDesconto);
		
	}
}
