package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {

	public static void main(String[] args) {
		
		Clientes c1 = new Clientes("Carlos", true, 5000);
		Clientes c2 = new Clientes("Junior", true, 2500);
		Clientes c3 = new Clientes("Maria", false, 0);
		Clientes c4 = new Clientes("Mario", true, 15000);
		Clientes c5 = new Clientes("Bruno", false, 0);
		Clientes c6 = new Clientes("Patricia", true, 1000);
		Clientes c7 = new Clientes("Jose", true, 6200);
		Clientes c8 = new Clientes("Pedro", true, 500);
		Clientes c9 = new Clientes("Bia", false, 0);
		Clientes c10 = new Clientes("Gui", true, 3500);
		
		List<Clientes> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);
		
		Predicate<Clientes> estaDevendo = c -> c.devendo;
		Predicate<Clientes> devendoMuito = c -> c.divida >= 4000;
		Function<Clientes, String> comunicado = c -> "Prezado cliente " + c.nome + ", Comunicamos "
				+ "que sua dívida será encaminhada para nosso setor jurídico";
		Function<Clientes, String> comunicado2 = c-> "Prezado cliente " + c.nome + ", Gostariamos "
				+ "de pedir sua colaboração e colocar as suas dívidas em dia. Por favor, entrar "
				+ "em contato com o nosso setor financeiro";
		Function<Clientes, String> saudacao = c-> "Prezado cliente " + c.nome + ", Gostariamos "
				+ "de agradecer por sua colaboração de estar em dias com o nosso financeiro, parabéns!!";
		
		clientes.stream()
			.filter(estaDevendo)
			.filter(devendoMuito)
			.map(comunicado)
			.forEach(System.out::println);
		
		clientes.stream()
			.filter(estaDevendo)
			.filter(devendoMuito.negate())
			.map(comunicado2)
			.forEach(System.out::println);;
			
		clientes.stream()
			.filter(estaDevendo.negate())
			.map(saudacao)
			.forEach(System.out::println);
	}
}
