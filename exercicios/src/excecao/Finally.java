package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		try{
			System.out.println(7 / entrada.nextInt());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {// Aqui a sentença de código sempre será executada no sistema, mesmo se a exceção cair no catch
			System.out.println("Finalmente...");
			entrada.close();
		}
		
		System.out.println("Fim! :)");
	}
}
