package controle;

import java.util.Scanner;

public class WhileInderteminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = ""; // Iniciamos a variável com um vazio dentro dela
		
		while(!palavra.equalsIgnoreCase("sair")) { // O usuário só irá sair do looping se digitar a palavra "sair". Segue leitura do código:
			System.out.println("Digite algo: ");   // !palavra (not palavra, negação da variável palavra) for igual a "sair": O usuário irá ficar
			palavra = entrada.nextLine();		   // digitando palavras até digitar sair. O !palavra quer dizer exatamente que enquanto a variável
		}										   // palavra for diferente de "sair", irá realizar a estrutura de repetição solicitando que o usuário
												   // digite uma nova palavra, até digitar sair e finalizar a estrutura de repetição.
		entrada.close();
	}
}
