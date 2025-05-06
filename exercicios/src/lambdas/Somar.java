package lambdas;

public class Somar implements Calculo{

	@Override
	public double execultar(double a, double b) {
		return a+b;
	}
}
