package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10,10);
		
		Monstro monstro = new Monstro(10,11);
		
		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println("Monstro tem => " + monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println("Monstro tem => " + monstro.vida);

	

		
	}
}
