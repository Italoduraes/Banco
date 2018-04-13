package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAO;
import dao.Conexao;
import model.Cliente;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recuperar os parametros 
		String cpfCliente = request.getParameter("cpfcliente");
		String senhaCliente = request.getParameter("senhacliente");
		
		
		PrintWriter out=  response.getWriter();
		
		//obter uma conexao com o BD
		Connection conexao = Conexao.getConexao();
		
		//Instanciar objeto CLienteDAO
		ClienteDAO cd = new ClienteDAO(conexao);
		if(cd.isCliente(cpfCliente, senhaCliente)) {
			// obter cliente 
			Cliente c = cd.getCliente(cpfCliente, senhaCliente);
			out.println("Oi " + c.getNomeCliente());
		}else {
			out.println("Cliente inválido");
		}
		
		
	}

}
