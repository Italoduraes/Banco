package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import model.Cliente;

public class ClienteDAO {

	// atributo

	private Connection conexao;

	public ClienteDAO(Connection conexao) {
		this.conexao = conexao;
	}

	// metodo que verifica se o cliente existe com cpf e senha corretos

	public boolean isCliente(String cpfCliente, String senhaCliente) {

		// Instanciar os objetos
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean resultado = false;
		// verificar se o cliente existe no BD

		try {
			// Preparar o SQL
			ps = conexao.prepareStatement("SELECT idcliente From cliente WHERE cpfcliente = ?  AND senhacliente = ?");
			// setar os parametros do SQL
			ps.setString(1, cpfCliente);
			ps.setString(2, senhaCliente);

			// executar o SQL

			rs = ps.executeQuery();

			// verificar se o rs retornou resultado
			resultado = rs.first();

		} catch (SQLException e) {
		    e.printStackTrace();
		}
		return resultado;
	}
	
	// metodo que retorna um cliente

		public Cliente getCliente(String cpfCliente, String senhaCliente) {

			// Instanciar os objetos
			PreparedStatement ps = null;
			ResultSet rs= null;
			Cliente resultado = null ;
			
			
			
			// verificar se o cliente existe no BD

			try {
				// Preparar o SQL
				ps = conexao.prepareStatement("SELECT idcliente, cpfcliente, nomecliente, senhacliente  From cliente WHERE cpfcliente = ?  AND senhacliente = ?");
				// setar os parametros do SQL
				ps.setString(1, cpfCliente);
				ps.setString(2, senhaCliente);

				// executar o SQL

				rs = ps.executeQuery();

				// verificar se o rs retornou resultado
			     rs.first();
				
			     resultado = new  Cliente(rs.getInt("idcliente"), rs.getString("cpfcliente"), rs.getString("nomecliente"), rs.getString("senhacliente"));
				
			     rs.close();
			     ps.close();

			} catch (SQLException e) {
	            e.printStackTrace();
			}
			return resultado;
		}
		
		
	

}
