package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
//		for(int i = 1; i <=5; i++){
//			System.out.println(valor);
//			valor += "#";
//		}
		
		// Versão desafio
		// Não pode usar valor numérico para cotrolar o laço!
//		String numero = "1";
		for(; !valor.equals("######");) {
			System.out.println(valor);
			valor += "#";
		}
	}
}
