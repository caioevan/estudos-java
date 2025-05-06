package exerciciosFundamentos;

import java.util.Scanner;

public class ResultadoQuadradoCubo {
/*
 * Ler um valor do usuário e imprimir esse valor ao quadrado e ao cubo
 * */
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		System.out.printf("%.2f é o valor ao quadrado e %.2f é o valor ao cubo", Math.pow(valor, 2), Math.pow(valor, 3));
		
		entrada.close();
	}
}
