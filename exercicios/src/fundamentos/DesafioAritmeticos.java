package fundamentos;

public class DesafioAritmeticos {

	
	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		
//		System.out.println(b);
		
		var parte1 = ((1-5) * (2-7) / 2);
		System.out.println(parte1);
		
		var parte1pow = Math.pow(parte1, 2);
		System.out.println(parte1pow);
		
		var parte2 = 6 * (3+2);
		System.out.println(parte2);
		
		var parte2pow = Math.pow(parte2, 2);
		System.out.println(parte2pow);
		
		var parte3 = parte2pow / (3*2);
		System.out.println(parte3);
		
		var parte4 = parte3 - parte1pow;
		System.out.println(parte4);
		
		var parte4pow = Math.pow(parte4, 3);
		System.out.println(parte4pow);
		
		var parteFinal = parte4pow / (Math.pow(10, 3));
		System.out.println(parteFinal);
		
		
	}
}
