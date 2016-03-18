<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elenco domande</title>
<style>
body{
   
   background-image: url(http://www.kaleidoscopeadventures.com/wp-content/uploads/2014/11/ka-background-1500x1500.jpg
   );}
h1{color: maroon;
    text-align:center;
    font:  italic 2.5em Georgia;
}
table{    color: #black;}
small {
  color: #666666;
}
textfield {color: maroon;}
</style>
</head>
<body>
<body>
	<h1>
		<center>Elenco domande</center>
	</h1>

		<s:iterator value="listQuestionUser">
			<s:property value="question" />
			<br><br>
			<s:radio name="top" list="answer"/>
			<br><br>
		</s:iterator>

</body>
</body>
</html>