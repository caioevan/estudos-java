package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		// Resultado foi um Opcional<Integer>, por isso usamos o .get() para visualizar o valor na variável
		// O Parallel Stream não altera o resultado nesse caso, por não ter um valor inical sendo passado
		Integer total1 = nums.parallelStream()
			.reduce(soma).get();
		System.out.println(total1);
		
		// Se usarmos o Parallel Stream nesse caso, o reduce irá usar o valor inicial para cada chamada paralela, alterando o valor final desejado.
		// Ideal é usar o stream convencional nesse caso
		// Como passamos um valor Integer como acumulador nesse caso de reduce, ele sempre retornará um Integer ao invés de um Opcional Integer,
		// pois mesmo que não tenha valor na referência, irá retornar o valor inicial do acumulador.
		Integer total2 = nums.stream()
			.reduce(100, soma);
		System.out.println(total2);
		
		// Resultado foi um Opcional<Integer>...
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}
}
