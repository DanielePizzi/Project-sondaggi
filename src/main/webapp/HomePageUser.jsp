<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home User</title>
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
	<h1 style="text-align: center">Benvenuto nella tua home page</h1>

	<div align="center">

		<form action="getAllCategoryUser">
			<s:textfield name="email" type="hidden" />
			<button type="submit" name="rispondiAiSondaggi">Rispondi ai
				sondaggi</button>
		</form>
		<br>
		<form action="">
			<button type="submit" name="visualizzaRisposte">Visualizza
				risposte</button>
		</form>
		<br>

		<FORM ACTION="ModifyInfo.jsp">
			<INPUT TYPE="submit" VALUE="Modifica Dati Personali">
		</FORM>

	</div>

</body>
</html>