package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizandoDados {
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Informe o ID a ser atualizado: ");
		final int id = entrada.nextInt();
		
		String select = "SELECT * FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		
		ResultSet r = stmt.executeQuery();
		//FORMA DO PROFESSOR:
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt("codigo"), r.getString("nome"));
			
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		}else {
			System.out.println("Pessoa não encontrada!");
		}
		
//		FORMA QUE EU FIZ:
//		while(resultado.next()) {
//			int codigo = resultado.getInt("codigo");
//			String nome = resultado.getString("nome");
//			System.out.println("\n" + codigo + "=>>" + nome);	
//		}
//		
//		
//		System.out.println("\nInforme o nome que deseja substituir: ");
//		String novoNome = entrada.next();
//		
//		sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
//		stmt = conexao.prepareStatement(sql);
//		stmt.setString(1, novoNome);
//		stmt.setInt(2, id);
//		stmt.execute();
//		
//		sql = "SELECT * FROM pessoas WHERE codigo = ?";
//		stmt = conexao.prepareStatement(sql);
//		stmt.setInt(1, id);
//		
//		resultado = stmt.executeQuery();
//		
//		System.out.println("\nNovo nome alterado para: ");
//		
//		while(resultado.next()) {
//			int codigo = resultado.getInt("codigo");
//			String nome = resultado.getString("nome");
//			System.out.println("\n" + codigo + "=>>" + nome);	
//		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
