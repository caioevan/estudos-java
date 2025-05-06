package exerciciosControle;

import java.util.Scanner;

public class Exercicio04 {
/*
 * Criar um programa que receba um número e diga se ele é um número primo.
 * */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 100; i++) {
			if(i % 1 == 0 && i % i == 0) {
				if (i == 1) {
					System.out.print(".");
				}else if((i == 2 || i == 3) || (i == 5 || i == 7)) {
					System.out.print(i + ".");
				}else if ((i % 2 != 0 && i % 3 != 0) && (i % 5 != 0 && i % 7 != 0)){
					System.out.print(i + ".");
				}else {
					System.out.print(".");
				}
			}
		}
		
		entrada.close();
	}
}