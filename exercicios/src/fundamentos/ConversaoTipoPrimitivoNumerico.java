package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	/*
	 * Existem as conversões implícitas (onde o próprio Java faz implicitamente) e as conversões explícitas, também conhecido como CAST, onde nós
	 * forçamos uma conversão.
	 * 
	 * Conversões implícitas são feitas de um tipo com tamanho maior de armazenamento para um de tamanho menor.
	 * Ex.: long -> int | int -> short | short -> byte | double -> float
	 * 
	 * Convsersões explícitas são necessárias quando tem a possibilidade de perdermos algum tipo de iformação, por exemplo, conversão de um tipo com 
	 * tamanho menor de armazenamento para um de tamanho maior. (short -> int por ex.) Não se sabe se a informação que está armazenada no short caberá
	 * no int, por isso o Java exiger que nós forçamos essa conversão.
	 * 
	 * Outro exemplo é converter de um tipo ponto flutuante para um tipo inteiro (float -> int). Apesas dos dois tipos terem a mesma capacidade de arma-
	 * zenamento, podemos perder a informação das casas decimais ( float 1.99999 -> int 1), por isso é necessário que forçamos essa conversão.
	 * 
	 * */
	
	public static void main(String[] args) {
		
		double a = 1; // Conversão implícita de int -> double (tipo inteiro para tipo flutuante, tamanho menor para maior
		System.out.println(a);
		
		float b = (float )1.1234567888888; // Conversão explícita (CAST), o java considera o valor literal como double (tamanho maior para menor)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão explícita de um int para byte (tamanho maior para menor), exemplo onde perdemos a informação correta.
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // Conversão explícita de doublçe para int (tamanho maior para menor e ponto flutuante para inteiro), perdemos as informações
						 // das casa decimais;
		System.out.println(f);
		
	}
}
