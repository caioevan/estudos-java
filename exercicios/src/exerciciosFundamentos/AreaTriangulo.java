package exerciciosFundamentos;

import java.util.Scanner;

public class AreaTriangulo {
/*
 * Ler do usuário a base e altura de um triângulo e imprimir sua área.
 * */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa o tamanho da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Informa o tamanho da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("O tamanho da área do triângulo é de %.2f", area);
		
		entrada.close();
	}
}
