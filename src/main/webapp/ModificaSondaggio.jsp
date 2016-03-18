<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica Sondaggio</title>
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
         <h4>Inserisci nuovo nome categoria:</h4>
         
         <s:form action="modifySurvey">
         	<s:param name="oldName" value="name"/>
         	<s:textfield name="oldName" label="vecchio nome" />
          	<s:textfield name="newName" label="nuovo nome" maxlength="50" />
         	<s:submit value="Conferma" />
         </s:form>
    </body>
</html>