package fundamentos;

public class OperadorTernario {
/*
 * Operador Ternário
 * 
 * Utiliza 2 operadores para nos trazer um resultado.
 * Como mostra o exemplo abaixo, estamos armazenando na String "resultado" a resposta se a variavel media é maior ou igual a 7.0
 * Utilizando o operador "?", após isso digitamos o que queremos mostrar caso o resultado for True, depois utilizamos o operador ":", e o que queremos
 * mostrar caso o resultado for False.
 * 
 * Muito parecido com a estrutura de controle IF ELSE.
 * 
 * */
	public static void main(String[] args) {
		
		double media = 2.6;
		String resultado = media >= 7.0 ? "aprovado." : "em recuperação."; // Se true, armazenará "aprovado.", se false, armazenará "em recuperação."		
		System.out.println("O aluno está " + resultado);
		
		String resultadoFinal = media >= 7.0 ? "Aprovado!" : media >= 5.0 ? "Em recuperação!" : "Reprovado!";
		System.out.println("O aluno está " + resultadoFinal);
		// Acima, um exemplo de um operador ternario dentro de outro operador ternário. Parecido com IF ELSE IF.
		
	}
}
