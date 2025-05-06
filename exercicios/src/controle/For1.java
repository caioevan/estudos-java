package controle;

public class For1 {

	public static void main(String[] args) {
		
//		int contador = 1;
		
//		while(contador <=10) {
//			System.out.println("Bom dia! " + contador);
//			contador++;
//		}
		
		// Estrutura do for: for(a; b; c){} onde: a = variável do contador; b = condição para repetição; c = manipulação da variável (incremento).
		for(int contador = 0; contador <= 20; contador += 2) {
			System.out.println("Bom dia! " + contador);		
		}
		
		/*
		 * Laço infinito:
		 * 
		 * for(;;){
		 * 	System.out.print("Infinito!");
		 * }
		 * 
		 * OU
		 * 
		 * for(;true;){
		 * 	System.out.print("Infinito!");
		 * }
		 *	
		 * */
	}
}
