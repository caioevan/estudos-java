package classe.desafio;

public class Comida {

	String nomeComida;
	double pesoComida;
	
	Comida(){
		
	}
	
	Comida(String nomeCom, double pesoCom){
		nomeComida = nomeCom;
		pesoComida = pesoCom;
	}
	
	String imprimirComida(){
		return String.format("Nome da comida: %s | Peso da comida: %.3f", nomeComida, pesoComida);
	}
	
}
