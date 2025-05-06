package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data(17, 9, 1998);
		
		Data data2 = new Data();
		data2.dia = 14;
		data2.mes = 8;
		data2.ano = 1999;
		
//		System.out.printf("Data de aniversário de Izabela: %d / %d / %d\n", data1.dia, data1.mes, data1.ano);
//		System.out.printf("Data de aniversário de Caio: %d / %d / %d", data2.dia, data2.mes, data2.ano);
		System.out.printf("Data de aniversário de Izabela: %s\n", data1.obterData());
		System.out.printf("Data de aniversário de Caio: %s", data2.obterData());
		
		
		
	}
}
