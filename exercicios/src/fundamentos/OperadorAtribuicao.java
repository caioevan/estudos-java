package fundamentos;

public class OperadorAtribuicao {

	
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b; Adição
		c -= a; // c = c - a; Subtração
		c *= b; // c = c * b; Multiplicação
		c /= a; // c = c / a; Divisão
		c %= 2; // c = c % a; Módulo (resto da divisão)
		
		System.out.println(c);
	}
}
