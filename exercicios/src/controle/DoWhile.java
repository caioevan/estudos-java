package controle;

import java.util.Scanner;

public class DoWhile {
/*
 * DO WHILE
 * 
 * Na estrutuda do do while, primeiro dizemos o que o programa vai fazer no "do", depois dizemos a condição de saída do laço de repetição no "while".
 * Traduzindo, é como se a gente falasse para o programa "Faça isso enquanto isso for verdade"
 * Faça isso "do{...} " enquanto "while("isso")" for verdade.
 * 
 * */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa dizer as palavras mágicas... ");
			System.out.print("Você deseja sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! Até mais!");
		
		entrada.close();
	}
}
