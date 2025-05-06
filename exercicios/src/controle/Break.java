package controle;


public class Break {
/*
 * Break interrompe o fluxo comum do código. Após a variável i chegar no número 5, o mesmo entra no IF e encontra o berak, forçando a parada do FOR.
 * */
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Fim");
	}
}
