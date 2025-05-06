package exerciciosFundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa a temperatura em Fahrenheit: ");
		double F = entrada.nextDouble();
		
		double C = ((F - 32) * 5) / 9;
		
		System.out.printf("A temperatura convertida para Celsius é de %.2f", C);
		
		entrada.close();
	}
}
