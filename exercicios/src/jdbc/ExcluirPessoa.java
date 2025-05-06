package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		String sql = "DELETE FROM pessoas WHERE codigo > ?";
		
		System.out.println("Informe o codigo da pessoa a ser excluida: ");
		int codigo = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		}else {
			System.out.println("Nada feito!");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
