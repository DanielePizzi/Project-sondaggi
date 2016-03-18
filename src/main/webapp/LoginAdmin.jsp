<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Admin</title>
<style>
body{
   
   background-image: url(http://www.kaleidoscopeadventures.com/wp-content/uploads/2014/11/ka-background-1500x1500.jpg
   );
    }
margin:0 150px ;}
h1{color: maroon;
    text-align:center;
    font-family: serif}
   
    small {
  color: black;
}
   

table{    color: maroon;}
</style>



<script>

function controllodatiadmin() {
	password = document.logadm.password.value;
	Email = document.logadm.Email.value;
	
	
	if (document.logadm.Email.value.charAt(0) == "") {
		alert("Il campo Email è obbligatorio!");
		return false;
	} else if (document.logadm.password.value.charAt(0) == "") {
		alert("Il campo password è obbligatorio!");
		return false; 
	} 
		return true;
}
</script>
</head>

 <table border="1" border="1"
		style="text-align: center; margin-left: auto; margin-right: auto">
		<tr>
			<td>
				<h2>Effettua il Login alla pagina amministrazione</h2>
				<form action="loginadmin" name="logadm" onSubmit="return controllodatiadmin()">
					>Email <input type="text" name="Email" placeholder="name@server.exp" /><br>
					>Password <input type="password" name="password" />
					<!-- Bottone che al click invia i dati -->
					<br>
					<input type="submit" value="Accedi" />
				</form>
			</td>
		</tr>
	</table>
	
	<hr> 

<small>Copyright 2016, Gruppo Pizzi</small> 
	
</body>

</html>