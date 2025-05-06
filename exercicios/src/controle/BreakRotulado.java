package controle;

public class BreakRotulado {
/*
 * Break rotulado é quando utilizamos o break porém apenas no rótulo que especificamos. Colocamos um rótulo no primeiro FOR, e especificamos
 * que deverá ser no rótulo "externo"
 * */
	 public static void main(String[] args) {
		
		 externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		 System.out.println("Fim");
	}
}
