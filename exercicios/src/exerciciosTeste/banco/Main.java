package exerciciosTeste.banco;

public class Main {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Caio Henrique", 12345, 250.00);
		Conta c2 = new Conta("Izabela Cabral", 67890, 300.00);
		
		c1.depositar();
		c1.saldoConta();
		c1.transferir(c2);
		System.out.print("Caio: ");
		c1.saldoConta();
		System.out.print("\nIzabela: ");
		c2.saldoConta();
		
	}
}
