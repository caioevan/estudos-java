package classe;

public class Data {
	//Dia, mês, ano.
	int dia;
	int mes;
	int ano;
	
	Data () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.ano = mes;
		this.ano = ano;
	}
	
	String obterData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
