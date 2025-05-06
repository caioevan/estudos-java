package exerciciosFundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double C = entrada.nextDouble();
		
		double F = (C * 1.8) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é %.2f", F);
		
		entrada.close();
	}
}
