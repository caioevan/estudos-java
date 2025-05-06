package exerciciosControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
/*
 * Jogo da adivinhação: 
 * Tentar adivinhar um número entre 0 - 100. 
 * Armazene um numero aleatório em uma variável. 
 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
 * */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int aleatorio = random.nextInt(101);
		
		System.out.println("JOGO DA ADIVINHAÇÃO!!\nVOCÊ TEM 10 TENTATIVAS PARA ADIVINHAR UM NÚMERO DE 01 A 100\n");
		
		for(int i = 10; i > 0; i--) {
			
			System.out.print("Informe um número de 0 a 100: ");
			int tentativa = entrada.nextInt();
			
			if(tentativa == aleatorio) {
				System.out.printf("\nParabéns!! Você adivinhou o número! O número era: %d", aleatorio);
				break;
			}else if ((i - 1) != 0 && tentativa > aleatorio){
				System.out.printf("\nQue pena, você digitou um número maior do que deveria! Você ainda tem %d tentativas para tentar acertar!\n\n", i - 1);
			}else if ((i - 1) != 0 && tentativa < aleatorio){
				System.out.printf("\nQue pena, você digitou um número menor do que deveria! Você ainda tem %d tentativas para tentar acertar!\n\n", i - 1);
			}else if ((i - 1) == 0) {
				System.out.printf("\nQue pena, você não conseguiu adivinhar o número %d!\n\n", aleatorio);
				break;
			}
			
		}
		
		entrada.close();
	}
}
