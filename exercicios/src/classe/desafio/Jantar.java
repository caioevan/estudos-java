package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Feijão", 0.250);
		System.out.println(c1.imprimirComida());
		
		Comida c2 = new Comida("Arroz", 0.300);
		System.out.println(c2.imprimirComida() + "\n");
		
		Pessoa p1 = new Pessoa("João", 73.200);
		
		System.out.println("Antes de comer:");
		System.out.println(p1.imprimirPessoa() + "\n");
		
		p1.comer(c1);
		
		System.out.printf("Depois de comer %s\n", c1.nomeComida);
		System.out.println(p1.imprimirPessoa() + "\n");
		
		p1.comer(c2);
		
		System.out.printf("Depois de comer %s e %s\n", c1.nomeComida, c2.nomeComida);
		System.out.println(p1.imprimirPessoa());
	}
	
}
