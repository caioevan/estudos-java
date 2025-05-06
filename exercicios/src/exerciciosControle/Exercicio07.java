package exerciciosControle;

import java.util.Scanner;

public class Exercicio07 {
/*
 * Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. 
 * Tente utilizar a estrutura do while.
 * 
 * */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			if(numero > 0) {
				soma += numero;
				System.out.printf("\nA soma é %d\n\n", soma);
			}
		}while(numero > 0);
		
		System.out.println("\nVocê digitou um número proibido! (negativo)");
		
		entrada.close();
	}
}
