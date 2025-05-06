package exerciciosControle;

import java.util.Scanner;

public class Exercicio08 {
/*Criar um programa que receba uma palavra e imprime no console letra por letra.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva qualquer palavra:");
		String palavra = entrada.nextLine();
		
		int numCaracteres = palavra.length();
		
		for(int i = 0; i < numCaracteres; i++) {
			System.out.printf("[%s]", palavra.charAt(i));
		}
		
		entrada.close();
	}
}
