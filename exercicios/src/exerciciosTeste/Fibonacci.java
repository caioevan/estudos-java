package exerciciosTeste;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
/*Esse programa retorna a sequência de Fibonacci com a quantidade de indices que for determinado pelo usuário.*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Informe um número maior que 0 e menor que 46:");
			n = entrada.nextInt();
			if(n <= 0 || n >= 46) {
				System.out.println("O número não pode ser menor que 0 ou maior que 46!");
			}
		}while(n <= 0 || n >= 46);
		
		
		int f[] = new int[n];
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2; i < n; i++) {
			
			f[i] = f[i-1] + f[i-2];
		}
		
		System.out.println(Arrays.toString(f));
		
		entrada.close();
	}
}
