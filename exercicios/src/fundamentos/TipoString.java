package fundamentos;

public class TipoString {

	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";

		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa")); // Retorna valor booleano true ou false se caso a String começar com a palavra que pesquisamos;
		System.out.println(s.endsWith("tarde")); // // Retorna valor booleano true ou false se caso a String terminar com a palavra que pesquisamos;
		System.out.println(s.toLowerCase().startsWith("boa")); // toLowerCase() transforma a String toda em minúsculo| toUpperCase() em maiísculo;
		System.out.println(s.length()); // Retorna um valor inteiro com o número de caracteres da String;
		System.out.println(s.equals("boa tarde")); // Retorna um valor booleano true ou false comparando a String com o valor que definimos no método;
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Igual o "equals()" porém ignora o "case" (se está escrito em minúsculo ou maiúsculo);
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		System.out.printf("O senhor %s %s tem %d e recebe um salário de R$ %.2f.", nome, sobrenome, idade, salario);
		/*
		 * Uma forma de não ficar concatenando toda hora, como no primeiro exemplo, podemos usar o System.out.printf(), passando a frase e as variáveis
		 * que queremos que apareça no print. %s retorna o valor String, %d retorna o valro inteiro e %f retorna o valor real (ponto flutuante).
		 * No %f podemos ainda modificar a qunatidade de casas decimais que ele irá retornar da seguinte forma. Ex.:  %.2f (2 casas decimais);
		 * */
		
		String frase = String.format("\nO senhor %s %s tem %d e recebe um salário de R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		// Outra forma de fazer é armazenando em uma variável, utilizando o método "String.format()"
		
		
	}
}
