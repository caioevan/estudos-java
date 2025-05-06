package controle;

import java.util.Scanner;

public class DesafioWhile {
	/*
	 * .Calcular a média das notas de uma escola; .Ler uma nota válida do usuário
	 * (de 0 a 10); .Armazenar essa nota em uma variável "total"; .Sempre que o
	 * usuário digitar uma nova nota, é acressentada na variável "total"; ."total"
	 * irá armazenar a soma de todas as notas; .Criar outra variável para guardar
	 * quantas notas válidas foram digitadas; .Quando o usuário digitar "-1" é para
	 * finalizar o looping, mostar a média das notas, o "total" das notas e a
	 * quantidade de notas válidas.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Inicializando todas as variáveis.
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) { // Enquanto variável nota for diferente de -1, rode o bloco de código abaixo:
			System.out.print("Infome uma nota (ou -1 para sair): ");
			nota = entrada.nextDouble(); // Lendo a nota digitada pelo usuário.

			if (nota >= 0 && nota <= 10) { // Se a nota que o usuário digitou for maior ou igual a 0 E menor ou igual a 10, rode o bloco de código abaixo:
				total += nota; // Incrementando na variável "total" o valor que estiver em "nota".
				quantidadeDeNotas++; // Incrementando 1 no valor de "quantidadeDeNotas".
			//Após isso, a estrutura "IF" termina, volta para o "WHILE" e faz a comparação (nota != 1). Se for true, o usuário digita outra nota e entra
			//no "IF" mais uma vez.
			} else if (nota != -1) { // Caso a nota digitada pelo usuário não esteja no range de maior ou igual a 0 E menor ou igual a 10, entra no "ELSE"
				System.out.println("Informe uma nota válida!"); // Toda nota digitada fora do range do "IF" e que for diferente de -1, vai retornar essa mensagem.
			}
		}

		System.out.println("A média das notas é de: " + total / quantidadeDeNotas);
		System.out.println("O total de notas somadas é de: " + quantidadeDeNotas);
		System.out.println("O total das notas é de: " + total);

		entrada.close();
	}
}
