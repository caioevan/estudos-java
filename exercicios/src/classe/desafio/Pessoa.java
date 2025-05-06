package classe.desafio;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;
	Comida c = new Comida();
	
	Pessoa (String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	double comer(Comida c){
		return pesoPessoa += c.pesoComida;
	}
	
	String imprimirPessoa() {
		return String.format("Nome da pessoa: %s | Peso da pessoa: %.3f", nomePessoa, pesoPessoa);
	}
}
