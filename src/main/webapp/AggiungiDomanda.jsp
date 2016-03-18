<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi Domande</title>
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
<style>
body {
	background-color: lightblue;
}

button {
	color: red;
}
</style>
</head>

<body>
	<center>
		<h1>Aggiungi domande:</h1>
	</center>

	<center>
		<form action="addQuestionSiNo">
			<s:textfield name="survey" type="hidden"></s:textfield>
			<button type="submit">Aggiungi Domanda SiNo</button>
		</form>
		<br>

		<form action="addQuestionMultiple">
			<s:textfield name="survey" type="hidden"></s:textfield>
			<button type="submit">Aggiungi Domanda Multipla</button>
		</form>
		<br>

		<form action="categorieESondaggi">
			<button type="submit" name="categorie e sondaggi">Fine</button>
		</form>
	</center>

</body>

</html>