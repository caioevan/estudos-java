package exerciciosTeste;

import java.util.Scanner;

public class SaldoBancario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu saldo inicial:");
		double saldo = entrada.nextDouble();
		int operacao = 0;
		double valorOperacao = 0;
		
		do {
			System.out.println("Informe qual operação deseja fazer (1 -> Depósito | 2 -> Saque | 3 -> Sair):");
			operacao = entrada.nextInt();
			if(operacao < 1 || operacao > 3) {
				System.out.println("Esse número de operação não existe!");
			}else {
				switch(operacao) {
				case 1:
					System.out.println("Informe o valor do depósito: ");
					valorOperacao = entrada.nextDouble();
					saldo += valorOperacao;
					break;
				case 2:
					System.out.println("Informe o valor do saque: ");
					valorOperacao = entrada.nextDouble();
					saldo -= valorOperacao;
					break;
				default:
					break;
				}
			}
		}while(operacao != 3);
		
		if(saldo < 0) {
			System.out.printf("Saldo em conta é de %.2f: CONTA ESTOURADA!", saldo);
		}else if(saldo == 0) {
			System.out.printf("Saldo em conta é de %.2f: CONTA ZERADA!", saldo);
		}else {
			System.out.printf("Saldo em conta é de %.2f: CONTA PREFERENCIAL!", saldo);
		}
		
		entrada.close();
	}
}
