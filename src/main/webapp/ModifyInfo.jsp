<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pannello Modifica Dati</title>
<script>
	function controllodatichagemail() {
		oldEmail = document.modemail.oldEmail.value;
		newEmail = document.modemail.newEmail.value;
		passd = document.modemail.password.value;
		var emailRegEx = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if (document.modemail.oldEmail.value.charAt(0) == "") {
			alert("Il campo oldEmail è obbligatorio!");
			return false;
		} else if (document.modemail.newEmail.value.charAt(0) == "") {
			alert("Il campo newEmail è obbligatorio!");
			return false;
		} else if (document.modemail.password.value.charAt(0) == "") {
			alert("Il campo Password è obbligatorio!");
			return false;
		} else if (document.modemail.newEmail.value.search(emailRegEx) == -1) {
			alert("Inserisci un email in formato valio.");
			return false;
		}
		return true;
	}

	function controllodatichagpass() {
		oldpsw = document.modepass.oldpsw.value;
		Email = document.modepass.Email.value;
		newpsw = document.modepass.newpsw.value;

		if (document.modepass.oldpsw.value.charAt(0) == "") {
			alert("Il campo oldPassword è obbligatorio!");
			return false;
		} else if (document.modepass.Email.value.charAt(0) == "") {
			alert("Il campo Email è obbligatorio!");
			return false;
		} else if (document.modepass.newpsw.value.charAt(0) == "") {
			alert("Il campo newPassword è obbligatorio!");
			return false;

		}
		return true;
	}
</script>

<style>
body {
	background-image:
		url(http://www.kaleidoscopeadventures.com/wp-content/uploads/2014/11/ka-background-1500x1500.jpg);
}

margin {:0 150 px;}
h1 {
	color: maroon;
	text-align: center;
	font-family: serif
}
small {
	color: black;}
table {
	color: maroon;}
</style>
</head>

<body>
	<table border="1" border="1"
		style="text-align: center; margin-left: auto; margin-right: auto">
		<tr>
			<td>
				<h2>Change Password</h2>
				<form action="modifypass" name="modepass"
					onsubmit="return controllodatichagpass();">
					Email <input type="text" name="Email" placeholder="name@server.exp" /><br>
					oldPassword <input type="password" name="oldpsw" /><br>
					newPassword <input type="password" name="newpsw" /> <br> <input
						type="submit" value="Conferma" />
				</form>




				<h2>Change Email</h2>
				<form action="modifyemail" name="modemail"
					onsubmit="return controllodatichagemail();">
					OldEmail <input type="text" name="oldEmail"
						placeholder="name@server.exp" /><br> NewEmail <input
						type="text" name="newEmail" placeholder="name@server.exp" /><br>
					Password <input type="password" name="password" />

					<!-- Bottone che al click invia i dati -->

					<br> <input type="submit" value="Conferma" />

				</form>
			</td>
		</tr>
	</table>

	<hr>

	<small>Copyright 2016, Gruppo Pizzi</small>
</body>

</html>