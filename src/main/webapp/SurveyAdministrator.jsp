<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sondaggi</title>
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
	<h1>
		<center>Elenco Sondaggi</center>
	</h1>
	<table border="1" align="center">
		<tr>
			<td><b>Sondaggio</b></td>
			<td><b>Domande</b></td>
			<td><b>Modifica</b></td>
			<td><b>Cancella</b></td>
		</tr>
		<s:iterator value="listSurvey">
			<tr>
				<td><s:property value="top" /></td>
				<td><a
					href="<s:url action='getQuestion'> 
							<s:param name="survey" value="top" />
								</s:url>">Domande
				</a></td>
				<td><a
					href="<s:url action='newNameSurvey'> 
						<s:param name="oldName" value="top" />
							</s:url>">Modifica
				</a></td>
				<td><a
					href="<s:url action='removeSurvey'> 
						<s:param name="name" value="top" />
							</s:url>">Cancella
				</a></td>
			</tr>
		</s:iterator>
	</table>
	<br>
	<center>
		<form action="addSurvey">

			<s:textfield name="categoria" type="hidden"></s:textfield>

			<button type="submit" name="aggiungi">Aggiungi</button>
		</form>
		<br> <br>
		<button onclick="location.href='HomePageAdministrator.jsp'"
			type="submit" name="homepage">HomePage</button>
	</center>

</body>
</html>