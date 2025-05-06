package exerciciosTeste.banco;

import java.util.Scanner;

public class Conta {
	Scanner entrada = new Scanner(System.in);
	String nome;
	int conta;
	double saldo;
	
	Conta(){
		
	}
	
	Conta(String nome, int conta, double saldo){
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	void depositar() {
		System.out.println("Informe o valor que deseja depositar: ");
		double valor = entrada.nextDouble();
		if (valor > 0) {
			saldo += valor;
			System.out.println("O valor de R$" + valor + " foi depositado!");
		}else {
			System.out.println("Operação negada! Deposite um valor maior que 0!");
		}
	}
	
	void sacar() {
		System.out.println("Informe o valor que deseja sacar: ");
		double valor = entrada.nextDouble();
		double saldo = this.saldo;
		saldo -= valor;
		if((saldo) <= 0) {
			System.out.println("Operação negada! Saque um valor menor que seu saldo disponível!");
			System.out.println("Saldo disponível: " + this.saldo + "R$");
		}else {
			this.saldo -= valor;
			System.out.println("O valor de R$" + valor + " foi sacado!");
		}
	}
	
	void saldoConta() {
		System.out.println("Seu saldo é de R$" + saldo);
	}
	
	void transferir(Conta c) {
		System.out.println("Digite a conta para quem deseja transferir: ");
		int conta = entrada.nextInt();
		if(conta != c.conta) {
			System.out.println("Informe uma conta existente!");
		}else {
			System.out.println("Informe o valor que deseja transferir: ");
			double valor = entrada.nextDouble();
			double saldo = this.saldo;
			
			if((saldo -= valor) <= 0) {
				System.out.println("Operação negada! Transfira um valor menor que seu saldo disponível!");
				System.out.println("Saldo disponível: " + this.saldo + "R$");
			}else {
				this.saldo -= valor;
				c.saldo += valor;
				System.out.println("O valor de R$" + valor + " foi transferido para " + c.nome + "!");
			}
		}
	}
}
