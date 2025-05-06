package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // Operador do and (condicao1 e condicao2)
		System.out.println(condicao1 || condicao2); // Operador do or (condicao1 ou condicao2)
		System.out.println(condicao1 ^ condicao2); // Operador do or exclusivo (ou condicao1 ou condicao2)
		System.out.println(!condicao1); // Operador do not (não condicão1)
		System.out.println(!condicao2 + "\n\n"); 
		
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println((false && false) + "\n\n");
		
		System.out.println("Tabela verdade OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println((false || false) + "\n\n");
		
		System.out.println("Tabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println((false ^ false) + "\n\n");
		
		System.out.println("Tabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
