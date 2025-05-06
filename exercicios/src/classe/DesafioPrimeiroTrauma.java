package classe;

public class DesafioPrimeiroTrauma {

	static int i = 3;
	/*Para acessar um atributo de instancia em métodos "static", devemos instanciar um objeto dentro do método e acessar a variável via 
	 * anotação ponto. Ou, alterar o atributo para "static", assim podemos acessar ele dentro do método static.*/
	public static void main(String[] args) {
		
//		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
		System.out.println(i);
		
	}
}
