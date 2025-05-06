package exerciciosTeste.lampada;

public class Lampada {

	boolean status;
	
	Lampada(){
		status = true;
	}
	
	void interruptor() {
		if(status == true) {
			status = false;	
		}else {
			status = true;
		}
	}
	
	void estado() {
		if(status == true) {
			System.out.println("A lâmpada está ligada!");
		}else {
			System.out.println("A lâmpada está desligada!");
		}
	}
}
