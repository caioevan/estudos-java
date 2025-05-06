package classe;

public class ValorVsReferenccia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());

		
	}
}
