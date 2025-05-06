package fundamentos;

import java.util.Scanner;

public class TipoStringEqual {
/*
 * Sempre que for comparar String com String, não usar o operador "==" pois pode nos retonar um valor errado.
 * 
 * Sempre usar a notacão ponto .equals() para fazer comparação com Strings. Segue exemplo no main
 * 
 * */
	public static void main(String[] args) {
		
		String a = "2";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número 2");
		String b = entrada.next();
		/*OBSERVAÇÃO COM O .next() E O .nextLine()
		 * 
		 * Quando utilizamos o .next() o mesmo elimina os espaços em branco. Quando utilizamos o .nextLine() ele guarda os espaços em branco.
		 * Se atentar em relação a isso, caso utilize o .nextLine() e não queira considerar os espaços em braco, utilizar a notação ponto .trim()
		 * na String. Exemplo.:
		 * 
		 * String b = entrada.nextLine();
		 * System.out.println(a.equals(b.trim())); O .trim() irá zerar os espaços em branco caso o usuário digite com espaços;
		 * 
		 * */
		System.out.println(a == b); // Exemplo que mesmo o conteúdo das 2 variávies sejam igual, o resultado dá falso.
		System.out.println(a.equals(b)); // Utilizando o .equals() vemos que o resultado deu true, pois ele compara apenas os resultados guardados nas variáveis.
		
		entrada.close();
		
	}
}
