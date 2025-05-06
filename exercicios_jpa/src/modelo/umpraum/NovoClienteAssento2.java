package modelo.umpraum;

import infra.DAO;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente ("Roidrigo", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
		
	}
}
