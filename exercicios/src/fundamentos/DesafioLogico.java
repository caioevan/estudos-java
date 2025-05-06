package fundamentos;

public class DesafioLogico {

	public static void main(String[] args) {
		/*
		 * Trabalho na terça (V ou F)
		 * Trabalho na quinta (V ou F)
		 * 
		 * Se os 2 trabalhos derem certo, comprar TV de 50" no shopping com a família;
		 * Se um dos trabalhos der certo, comprar TV de 32" no shopping com a família;
		 * Dando certo um dos dois trabalhos, irão comprar a TV e tomar sorvete;
		 * */
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		String and = Boolean.toString(trabalho1 && trabalho2);
		String or = Boolean.toString(trabalho1 ^ trabalho2);
		String xor = Boolean.toString(trabalho1 || trabalho2);
		
		System.out.println(and.replace("true", "A família irá comprar uma TV de 50").replace("false", "Que pena, melhor ficar em casa"));
		System.out.println(or.replace("true", "A família irá comprar uma TV de 32").replace("false", "Que pena, melhor ficar em casa"));
		System.out.println(xor.replace("true", "Que bomm, vamos tomar sorvete!!").replace("false", "Que pena, melhor ficar em casa"));
		
	}
}
