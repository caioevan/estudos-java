package exerciciosTeste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroMaisEconomico {
/* Este programa consegue ler do usuário alguns modelos de carros e o consumo deles, incrementar essas informações em duas listas: listaCarro e 
 * listaConsumo. Definimos quantos carros o usuário deseja adicionar a lissta (tamanho da lista), o usuário informa os modelos e consumos, e o
 * programa retorna qual carro dos listados é o mais econômico e informa para cada carro quantos litros são necessários para percorrer uma distância
 * de 1000 km e quanto isso custará, levando em conta que o preço da gasolina é de R$ 6,89.*/
	
/*REFATORAR ESSE CÓDIGO UTILIZANDO UM OBJETO CARRO COM OS ATRIBUTOS: MODELO, CONSUMO.*/
	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner entrada = new Scanner(System.in);
		String modeloCarro;
		Double consumo;
		Double melhorConsumo = (double) 0;
		List<String> listaModelo = new ArrayList<String>();
		List<Double> listaConsumo = new ArrayList<Double>();
		
		//Definindo o tamanho da lista.
		System.out.println("Quantos carros deseja adicionar a lista?");
		int numLista = entrada.nextInt();
		entrada.nextLine();
		
		//Incrementando a lista com for.
		for(int i = 0; i < numLista; i++) {
			System.out.println("Informe o modelo desejado: ");
			modeloCarro = entrada.nextLine();
			listaModelo.add(modeloCarro);
			
			System.out.printf("Informe o consumo %s: \n", modeloCarro);
			consumo = entrada.nextDouble();
			entrada.nextLine();
			listaConsumo.add(consumo);
		}
		
		//Carro mais economico
		for (int i = 0; i < numLista; i++) {
			if(melhorConsumo < listaConsumo.get(i)) {
				melhorConsumo = listaConsumo.get(i);
			}
		}
		Integer indice = listaConsumo.indexOf(melhorConsumo);
		System.out.printf("Modelo mais econômico: %s | %.2fKm / L\n", listaModelo.get(indice), listaConsumo.get(indice));
		
		//Quantos litros são necessários para percorrer 1000 Km e quanto isso gastará, considerando gasolina a R$ 6,89.
		for (int i = 0; i < numLista; i++) {
			double consumo1000 = 1000 / listaConsumo.get(i);
			double gastoConsumo1000 = consumo1000 * 6.89;
			System.out.printf("Modelo %s que tem o consumo de %.2fKm/L usará %.2f litros para percorrer 1000km e gastará R$%.2f\n", 
					listaModelo.get(i), listaConsumo.get(i), consumo1000, gastoConsumo1000);
		}
		
		entrada.close();
	}
}
