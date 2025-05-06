package lambdas;

public class Multiplicar implements Calculo{

	@Override
	public double execultar(double a, double b) {
		return a * b;
	}
}
