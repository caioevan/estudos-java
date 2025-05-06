package fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número da operação: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segunda número da operação: ");
		double num2 = entrada.nextDouble();
				
		System.out.println("Informa qual operador você deseja:| + | - | * | / | % | ");
		String operador = entrada.next();
		
		String resultado = operador.equals("+") ? 
				Double.toString(num1 + num2) : operador.equals("-") ? 
				Double.toString(num1 - num2) : operador.equals("*") ? 
				Double.toString(num1 * num2) : operador.equals("/") ? 
				Double.toString(num1 / num2) : operador.equals("%") ? 
				Double.toString(num1 % num2) : "Informe um operador do anteriores";
		
		System.out.println("O resultado da sua operação é: " + resultado);
		entrada.close();
	}
}
