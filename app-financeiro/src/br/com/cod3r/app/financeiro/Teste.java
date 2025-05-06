package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.CalculadoraImpl;

public class Teste {
	public static void main(String[] args) {
	
		CalculadoraImpl calc = new CalculadoraImpl();
		System.out.println(calc.soma(2, 3, 4));
	}
}
