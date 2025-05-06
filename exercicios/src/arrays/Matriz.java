package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem sua turma? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("\nQuantas notas deseja inserir? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[qtdeAlunos][qtdeNotas];
		
		double totalTurma = 0;
		int contador = 0;
		
		for(int i = 0; i < notasTurma.length; i++) {
			
			for(int j = 0; j < notasTurma[i].length; j++) {
				
				System.out.printf("\nInforme a %d° nota do aluno %d: ", j + 1, i + 1);
				notasTurma[i][j] = entrada.nextDouble();
				totalTurma += notasTurma[i][j];
				contador++;
				
			}
			
		}
		
		double mediaTurma = totalTurma / contador;
		
		System.out.println("\nA média da turma é de : " + mediaTurma);
		
		entrada.close();
	}
}
