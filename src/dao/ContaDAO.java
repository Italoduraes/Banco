package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cliente;
import model.Conta;

public class ContaDAO {


	// atributo

	private Connection conexao;

	public ContaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	// metodo que retorna um cliente

		public ArrayList<Conta> getConta(int idCliente) {

		String query = "SELECT * FROM conta WHERE idcliente=?";
		ArrayList<Conta> resultado = new ArrayList<Conta>();
		
		
			PreparedStatement ps= null;
			ResultSet rs = null;
			
			// verificar se o cliente existe no BD

			try {
				// Preparar o SQL
				ps = conexao.prepareStatement(query);
				
				ps.setInt(1, idCliente);
				
				rs = ps.executeQuery();
				while (rs.next()) {
					   resultado.add(new  Conta(rs.getInt("idCliente"), rs.getInt("idConta"), rs.getString("numeroconta") , rs.getString("agenciaconta"), rs.getString("tipoconta")));
				}

			     rs.close();
			     ps.close();

			} catch (Exception e) {
	   
			}
			return resultado;
		}
		
}
