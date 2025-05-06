package fundamentos;

public class TiposPrimitivos {

	
	public static void main(String[] args) {
		/*
		 * 8 Tipos primitivos:
		 * 
		 * 6 tipos numéricos: byte, short, int, long, float, double
		 * byte, short, int e long representam números inteiros
		 * byte - 1 byte | short - 2 byte | int - 4 byte | long - 8 byte
		 * float e double armazenam números reais (ponto flutuante)
		 * float - 4 byte | double - 8 byte;
		 * 
		 * Os outros 2 tipos primitivos são: char e boolean
		 * char - armazena 1 caractere
		 * boolean - armazena "true" ou "false"
		 * 
		 * O java considera os valores literais inteiros do tipo "int", e pontos flutuantes como
		 * "float" (valores literais são os que nós declaramos diretamente no código, sem ser 
		 * entrada de valores via banco de dados ou inputs)
		 * 
		 * 
		 * */

		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		//Como se trata de um valor litera e esse valor passou da capacidade de armazenamento 
		// do tipo "int", temos que infomar ao java que esse valor é um "long" colocando a letra
		// "L" ao final do valor
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = true;
		
		//Tipo char
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Números de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos Acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
