package fundamentos;

public class Wrappers {
/* Wrapper é a transformação de um tipo primitivo de variável em um objeto, onde podemos manipular o resultado dessa variável usando a notação ponto.
 * 
 * Primitivo x Objeto:
 * 
 * byte x Byte
 * short x Short
 * int x Interger
 * long x Long
 * float x Float
 * double x Double
 * boolean x Boolean
 * char x Character
 * 
*/	
	public static void main(String[] args) {
		
		
		Byte b = 100; // Transformando o tipo primitivo "byte" em um objeto "Byte";
		Short s = 1000; // Transformando o tipo primitivo "short" em um objeto "Short";
		Integer i = 10000; // Transformando o tipo primitivo "int" em um objeto "Integer";
		Long l = 1000000L; // Transformando o tipo primitivo "long" em um objeto "Long";
		
		System.out.println(b.byteValue()); // .byteValue() retorna o valor em byte do que está armazenado na variável
		System.out.println(s.toString()); // .toString() transforma um número em string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 4321.4569;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // Transformando uma string em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Transformando o valor booleano em string e usando uma notação ponto de string para ficar em maiúsculo
		
		Character c = '#';
		System.out.println(c + "...");
		
	}
}
