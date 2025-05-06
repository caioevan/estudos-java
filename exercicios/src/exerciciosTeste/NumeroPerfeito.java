package exerciciosTeste;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		int n = entrada.nextInt();
		int soma = 0;
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				soma += i;
			}
		}
		
		System.out.printf("Número: %d\n", n);
		System.out.printf("Soma dos divisores: %d\n", soma);
		
		if(n == soma) {
			System.out.println("Número perfeito!");
		}else {
			System.out.println("Não é número perfeito!");
		}
		
		entrada.close();
	}
}
