<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aggiungi Domanda Multipla</title>
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
	<center>
		<h4>Inserisci testo domanda:</h4>
	</center>

	<center>
		<form action="addQuestionMultiple2">
			<s:textfield name="survey" type="hidden"></s:textfield>
			<s:textfield name="question" maxlength="255"></s:textfield>
			<br>

			<h4>Aggiungi Risposte:</h4>

			<s:textfield name="answer1" maxlength="255"></s:textfield>
			<br />
			<s:textfield name="answer2" maxlength="255"></s:textfield>
			<br />
			<s:textfield name="answer3" maxlength="255"></s:textfield>
			<br />
			<s:textfield name="answer4" maxlength="255"></s:textfield>
			<br>
			<button type="submit">Conferma</button>
		</form>
	</center>

</body>
</html>