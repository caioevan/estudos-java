package fundamentos;

class ConversaoStringNumero {

	public static void main(String[] args) {

		String valor1 = "12.3";
		String valor2 = "15.9";

		System.out.println(valor1 + valor2); // Concatenou as Strings

		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		/*
		 * O parseDouble ou parseInt ou parseFloat ou parseLong.... transforma uma
		 * string em um número caso o que esteja na string for um número.
		 * 
		 */

		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média é: " + soma / 2);

	}
}
