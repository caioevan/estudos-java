package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida ingrediente1 = new Arroz(0.2);
		Comida ingrediente2 = new Feijao(0.1);
		Comida sobremesa = new Sorvete(0.4);
		
		System.out.println(convidado);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println("Depois de almoçar: " + convidado);
		
		convidado.comer(sobremesa);
		
		System.out.println("Depois da sobremesa: " + convidado);
		
	}
}
