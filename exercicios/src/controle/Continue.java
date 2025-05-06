package controle;

public class Continue {
/*
 * Continue apenas interrompe o laço atual de repetição, pulando para o próximo.
 * */
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}
}
