package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	/*
	 * A partir de um Scanner, pegar 3 string usando nextLine() pegando os ultimos 3
	 * salários de um funcionário e calculando a médias desses ultimos 3 salários.
	 * 
	 * O funcionário tem a possibilidade de digitar o salário usando "." ou "," e o
	 * código é para funcionar nessas 2 ocasiões
	 * 
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu ultimo salário: ");
		String salario1 = entrada.nextLine().replace(',', '.');

		System.out.println("Digite seu penúltimo salário: ");
		String salario2 = entrada.nextLine().replace(',', '.');

		System.out.println("Digite seu anti penúltimo salário: ");
		String salario3 = entrada.nextLine().replace(',', '.');

		double salario1num = Double.parseDouble(salario1);
		double salario2num = Double.parseDouble(salario2);
		double salario3num = Double.parseDouble(salario3);

		System.out.println("A média dos seus ultimos 3 salários é de: " + (salario1num + salario2num + salario3num) / 3);

		entrada.close();
	}
}
