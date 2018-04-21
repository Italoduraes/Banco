<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ page import="model.Cliente" %>
    <%@ page import="model.Conta" %>
    <%@ page import="java.util.ArrayList" %>
    
     <% Cliente c = (Cliente)request.getAttribute("cliente"); %>
    <% ArrayList<Conta> contas = (ArrayList<Conta>)request.getAttribute("detalhes"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Banco Inter - Login Sucesso </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">

</head>
<body>
<div class="alert alert-success" role="alert">
 <h1> Acertoooo seu miseravel!<br/>
  seja bem-vindo <%= c.getNomeCliente() %>! </h1>
     <hr class="my-4">
     <p class="lead">Suas contas:</p> 
  <table>
  <% for(int i = 0; i < contas.size(); i++){%>
	  
	  <tr><a href="detalheConta?id=<%= contas.get(i).getIdcliente()%>&numeroconta=<%= contas.get(i).getNumeroconta()%>&agenciaconta=<%= contas.get(i).getAgenciaconta()%>&tipoconta=<%= contas.get(i).getTipoconta()%>"><%= contas.get(i).getNumeroconta() %></a></tr><br/>
	  
 <% } %>
  </table>
  
</div>
</body>
</html>