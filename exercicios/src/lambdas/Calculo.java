package lambdas;

@FunctionalInterface
public interface Calculo {

	double execultar(double a, double b);
	
	default String legal () {
		return "Legal";
	}
	
	static String muitoLegal () {
		return "Muito Legal";
	}
	
}
