package exerciciosControle;

import java.util.Scanner;

public class Exercicio01 {
// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("Número está entre 0 e 10");
			if(numero % 2 == 0) {
				System.out.println("Número é par!");
			}else {
				System.out.println("Número é impar!");
			}
		}else {
			System.out.println("Número não está entre 0 e 10");
		}
		
		entrada.close();
	}
}
