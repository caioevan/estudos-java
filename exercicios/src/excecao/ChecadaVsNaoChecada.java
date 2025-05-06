package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	//Exceções tem que ser "lançadas" com a palavra reservada =throw= para ser executada em sistema.
	
	// Exceção NÃO checada ou NÃO verificada
	// Exceção do tipo Runtime não tem a obrigatoriedade de ser tratada, apesar de o sistema travar abruptamente.
	// Temos a opção de tratar ou não.
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem lega #01!");
	}
	//Exceção checada e verificada
	//Tem que deixar escrito na assinatura do método o lançamento da exceção
	//A exceção tem que ser tratada, pois caso o contrário ocorrerá um erro de compilação.
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem lega #02!");
	}
}
