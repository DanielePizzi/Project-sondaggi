<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>


<style>
body {
	background-image:
		url(http://www.kaleidoscopeadventures.com/wp-content/uploads/2014/11/ka-background-1500x1500.jpg
   );
}

h1 {
	color: maroon;
	text-align: center;
	font: italic 2.5em Georgia;
}

table {
	color: #black;
}

small {
	color: #666666;
}

textfield {
	color: maroon;
}
</style>



</head>
<body>
	<h1 style="text-align: center">Prego inserisci i dati richiesti</h1>
	<table border="1" border="1"
		; style="text-align: center; margin-left: auto; margin-right: auto">
		<tr>
			<td><s:form action="register" id="registr"
					onsubmit="return validateEmail(email);">
					<s:textfield name="name" label="Nome" maxlength="25" />
					<s:textfield name="surname" label="Cognome" maxlength="25" />
					<s:textfield name="email" label="Email" placeholder="name@server.exp" />
					<s:textfield name="password" label="Password" />
					<s:checkboxlist label="Categorie" name="listCategoryResult"
						list="listCategory" value="listCategoryResult"></s:checkboxlist>
					<s:submit value="Registrati" />

				</s:form> <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>

				<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
				<script
					src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
				<script
					src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>
				<script>
					$("#registr").validate({

						rules : {
							name : "required",
							surname : "required",
							email : "required",
							password : "required"
						},
						messages : {
							name : "il campo è obbligatorio",
							surname : "il campo è obbligatorio",
							email : " il campo è obbligatorio",

						password : " il campo è obbligatorio",
						}

					});
					function validateEmail(emailField) {
						var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
						if (reg.test(emailField.value) == false) {
							alert('Email non inserita o formato non valido!');
							return false;
						}
						return true;
					}
				</script></td>
		</tr>
	</table>
	<hr>
	<small>Copyright 2016, Gruppo Pizzi</small>
</body>
</html>