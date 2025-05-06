package exerciciosControle;

import java.util.Calendar;

public class Exercicio02 {
//	Criar um programa informa se o ano atual é um ano bissexto;
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int ano = cal.get(Calendar.YEAR);
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 1))) {
			System.out.printf("Ano %d é bissexto!", ano);
		}else {
			System.out.printf("Ano %d não é bissexto!", ano);
		}
		
	}
}
