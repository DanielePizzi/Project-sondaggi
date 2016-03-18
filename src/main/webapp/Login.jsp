<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage SondaggiBernacchi</title>
<style>
body {
	background-image:
		url(http://www.kaleidoscopeadventures.com/wp-content/uploads/2014/11/ka-background-1500x1500.jpg
   );
}

margin
:
0
 
150
px
 
;
}
h1 {
	color: maroon;
	text-align: center;
	font-family: serif
}

small {
	color: black;
}

a:link {
	color: red;
}

a:visited {
	color: red;
}

a:hover {
	color: maroon;
	background-color: #708090;
}

table {
	color: maroon;
}
</style>


<script type="text/javascript">
	function controllodati() {
		email = document.modulo.email.value;
		password = document.modulo.password.value;
		if (document.modulo.email.value.charAt(0) == "") {
			alert("Il campo Email è obbligatorio!");
			return false;
		} else if (document.modulo.password.value.charAt(0) == "") {
			alert("Il campo Password è obbligatorio!");
			return false;
		} else {
			return true;
		}
	}
</script>

</head>

<table border="1" border="1"
	style="text-align: center; margin-left: auto; margin-right: auto">
	<tr>
		<td><img height="300" width="300"
			src="http://www.clker.com/cliparts/5/0/H/I/F/e/a-book-without-background-hi.png">
		</td>

		<td>
			<h2>Effettua il Login</h2>
			<form action="login" name="modulo" onSubmit="return controllodati()">
				Email <input type="text" name="email" /><br> Password <input
					type="password" name="password" />
				<!-- Bottone che al click invia i dati -->
				<br> <input type="submit" value="Conferma" />
			</form>
			<form action="getCategory">
				<h2>
					Oppure <input type="submit" value="Registrati" /> al nostro sito
				</h2>
			</form>
		</td>
	</tr>
</table>

<hr>

<small>Copyright 2016, Gruppo Pizzi</small>
<p align="right">
	<a href=LoginAdmin.jsp>AdminLogin</a>
</p>

</body>

</html>