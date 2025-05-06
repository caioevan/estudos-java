package arrays;

import java.util.Scanner;

public class DesafioArray {
/*Calcular a média das notas de um aluno que o usuário irá passar para o programa.
 * Quantas notas você quer informar? "usuário responde com a quantidade de notas"
 * 
 * */
	public static void main(String[] args) {
		
		System.out.print("Quantas notas você deseja informar? ");
		Scanner entrada = new Scanner(System.in);
		int qntNotas = entrada.nextInt();
		
		double[] notas = new double[qntNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("\nInforme a nota %d: ", i + 1);
			notas[i] = entrada.nextDouble();
			System.out.printf("Nota %d = %.1f\n\n", i + 1, notas[i]);
		}
		
		double total = 0;
		
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.printf("A média do aluno foi de %.1f", total / notas.length);
		
		entrada.close();
	}
}

