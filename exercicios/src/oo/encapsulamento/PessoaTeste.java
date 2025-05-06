package oo.encapsulamento;

public class PessoaTeste {

	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Carvalho", -45);
		p1.setIdade(230); // alterar variável
		
		System.out.println(p1.getIdade()); // acessando ou lendo variável
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
	}
}
