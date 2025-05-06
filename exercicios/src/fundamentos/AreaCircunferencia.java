package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4; // Definição de variável: tipo da variável, nome, valor
		final double PI = 3.14159; // Para definir uma constante, basta colocar o "final" antes do tipo da variável
								   // Uma convenção é usar o nome da contante em MAIÚSCULO
		
		double area = PI * (raio * raio);
		
		System.out.println("Área = " + area + " m²");
	}
}
