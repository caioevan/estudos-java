package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Estrada {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Carro civic = new Civic();

		System.out.println(ferrari.velocidadeDoAr());
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.acelerar();	
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		civic.acelerar();
		System.out.println(civic);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		civic.frear();
		System.out.println(civic);
		
		civic.frear();
		System.out.println(civic);
		
		civic.frear();
		System.out.println(civic);
		
		civic.frear();
		System.out.println(civic);
		
		civic.frear();
		System.out.println(civic);
		
	}
}
