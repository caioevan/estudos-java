package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
/*
 * Domingo -> 1
 * Segunda -> 2
 * Terça -> 3
 * Quarta -> 4
 * Quinta -> 5
 * Sexta -> 6
 * Sábado -> 7
 * */
	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Digite o dia da semana:");
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Dia 1!");
		}else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Dia 2!");
		}else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			System.out.println("Dia 3!");
		}else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Dia 4!");
		}else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Dia 5!");
		}else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Dia 6!");
		}else if (dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Dia 7!");
		}else {
			System.out.println("Digite um dia válido!");
		}
		
	}
}
