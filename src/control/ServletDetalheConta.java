package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import dao.Conexao;
import dao.ContaDAO;
import model.Conta;

/**
 * Servlet implementation class ServletDetalharConta
 */
@WebServlet("/detalheConta")
public class ServletDetalheConta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//PrintWriter out = response.getWriter();

		//out.println("<html><head><link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\"></head><body>");

		
		
		int id = Integer.parseInt(request.getParameter("id"));
		String numeroconta = request.getParameter("numeroconta");
		String agenciaconta = request.getParameter("agenciaconta");
		String tipoconta = request.getParameter("tipoconta");

		Connection conexao = Conexao.getConexao();
		
		ContaDAO cd = new ContaDAO(conexao);
		
	
		
		//out.println("<p class=\"lead\" >" + numeroconta + "</p>");
		
		// Repassar o resquest/ response para p JSP
					RequestDispatcher rd = request.getRequestDispatcher("detalheConta.jsp");
					
					rd.forward(request, response);
		
		
		//out.println("</body>");

	}

}