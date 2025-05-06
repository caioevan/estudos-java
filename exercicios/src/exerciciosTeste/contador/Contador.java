package exerciciosTeste.contador;

public class Contador {

	int n;
	
	Contador(int n){
		this.n = n;
	}
	
	void zerar() {
		this.n = 0;
	}
	
	void incrementar() {
		this.n++;
	}
	
	void decrementear() {
		this.n--;
	}
	
	void mostrar() {
		System.out.println(this.n);
	}
}
