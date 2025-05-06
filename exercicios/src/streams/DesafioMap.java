package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/**
		 * 1. Número para string binário... 6 => "110"
		 * 2. Inverter a string... "110 => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		System.out.print("Método usado pro mim: ");
		
		nums.stream()
		.map(n -> n.toBinaryString(n))
		.map(n -> new StringBuilder(n).reverse().toString())
		.map(n -> Integer.parseInt(n, 2))
		.forEach(System.out::print);
		
		System.out.print("\n\nMétodo usado pelo profesor: ");
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::print);
		
		
	}
}
