package exerciciosFundamentos;

import java.util.Scanner;

public class CalculadoraIMC {
/*
 * Ler o peso e altura do usuário e imprimir o IMC
 * */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		double altura = entrada.nextDouble();
		
		double IMC = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu índice IMC é de %.2f", IMC);
		
		entrada.close();
		
	}
}
