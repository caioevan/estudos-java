package exerciciosTeste;

import java.util.Scanner;

public class SaltoEmDistancia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		
		do {
			System.out.println("Informe o nome do atleta: ");
			nome = entrada.nextLine();
			if(!nome.equals("")) {
				double[] saltos = new double[5];
				double soma = 0;
				for(int i = 0; i < 5; i++) {
					System.out.println("Informe o " + (i + 1) + "° salto");
					saltos[i] = entrada.nextDouble();
					entrada.nextLine();
					soma += saltos[i];
				}
				double media = soma / 5;
				System.out.println("Atleta: " + nome);
				System.out.print("Saltos: | ");
				for(double salto: saltos) {
					System.out.print(salto + " | ");
				}
				System.out.printf("\nMedia dos saltos: %.2f\n", media);
			}
		}while(!nome.equals(""));
		
		entrada.close();
	}
}