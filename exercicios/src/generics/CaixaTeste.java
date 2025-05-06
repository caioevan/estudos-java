package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Olá");
		System.out.println(caixaA.abrir());
	}
}
