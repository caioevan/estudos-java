package oo.heranca.desafio;

//Criar classes mais expecíficas (Civic, Ferrari) que irá herdar da classe Carro.
//Na classe mais genérica, terá velocidade atual, ter um método acelerar e um método frear. Por padrão, acelerar aumenta velodidade em 5 e frear diminui em 5;
public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}

	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}
}
