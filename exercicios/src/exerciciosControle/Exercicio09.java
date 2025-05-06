package exerciciosControle;

import java.util.Scanner;

public class Exercicio09 {
/*Crie um programa que recebe 10 valores e ao final imprima o maior número.*/
/* - A cada inclusão de um novo número pelo usuário, teria uma verificação se esse número é maior do que o que foi digitado anteriormente.
 * - Se for, esse número deverá ser armazenado em uma variável. Se não, pula para a próxima inclusão.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero = 0;
		double resultado = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Informe um número:");
			numero = entrada.nextDouble();
			
			if(numero > resultado) {
				resultado = numero;
			}
			
		}
		
		System.out.printf("Maior número informado foi de: %.2f", resultado);
		
		entrada.close();
	}
}
