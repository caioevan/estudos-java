package fundamentos;

public class ConversaoNumeroString {
// Convertendo número para string
	
	public static void main(String[] args) {
		Integer num1 = 10000; // Utilizando Wrapper, podemos usar anotação ponto direto na variável;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // Transformando tipo primitivo em wrapper direto no println, e usando anotação ponto
															 // para transformar em string;
		
		System.out.println(("" + num1).length()); // Forçando uma transformação em string concatenando um espaço vazio com o número;
	}
}
