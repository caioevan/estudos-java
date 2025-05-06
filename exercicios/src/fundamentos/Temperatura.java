package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (F° - 32) X (5/9) = C°
		double F = 100;
		int x = 32;
		double y = 5.0/9.0;
		final double celsius = (F - x) * y;
		System.out.println(celsius);
	}
	
}
