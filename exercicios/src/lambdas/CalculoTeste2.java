package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> {return x + y; };
		System.out.println(calculo.execultar(2, 3));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.execultar(2, 3));
		
		calculo = (x, y) -> x / y;
		System.out.println(calculo.execultar(10, 5));
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
