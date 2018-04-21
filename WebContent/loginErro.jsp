<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Banco inter</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>
<body>
<div class="alert alert-danger" role="alert">
<h1> quem es tu seu otario!</h1> </div>
 
 <h3>Favor login novamente</h3>
<form action="ServletLogin">
CPF: <input type="text" name= "cpfcliente"><br>
senha: <input type="password"  name="senhacliente"><br><br>
<input class="btn btn-primary" type="submit" value="Acessar">
</form>
 
 
</div>
</body>
</html>