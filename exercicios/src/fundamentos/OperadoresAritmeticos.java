package fundamentos;

public class OperadoresAritmeticos {
/*
 * Operadores Aritméticos:
 * + Soma
 * - Subtração
 * (/) Divisão
 * * Multiplicação
 * % Módulo (resto da divisão)
 * 
 * */
	public static void main(String[] args) {
		
		System.out.println(2 + 3); // Utilizando operadores aritméticos direto no suystem.out
		
		var x = 34.56; // Java inferindo que o valor da variável é um double;
		double y = 2.2;
		
		System.out.println(x + y); // Utilizando operadores aritméticos com variáveis
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // Utilizando o CAST, transformando o valor b de int para double, para mostrar um resultado ponto flutuante;
		
		System.out.println(a % b); // Utilizando o resto da divisão (Módulo %)
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b); // Java utiliza dos princípios da matemática, primeiro resolvendo a multiplixação (a * b), depois realizando
										   // a soma (x + y) e finalmente a subtração (x + y) - (a * b);
		
	}
}
