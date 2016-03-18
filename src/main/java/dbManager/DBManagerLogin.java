package dbManager;

import java.sql.*;
import java.util.ArrayList;

/**
 * Classe utilizzata per la gestione del DB per quanto riguarda la login
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class DBManagerLogin extends DBManager {

	/**
	 * Metodo che controlla se l'email e la password immessi dall'utente sono
	 * presenti nel DB
	 * 
	 * @param Email
	 *            email immessa dall'utente
	 * @param password
	 *            password immessa dall'utente
	 * @return boolean
	 */
	public boolean validate(String Email, String password) {
		ArrayList<String> result;
		result = op.query("SELECT * FROM user WHERE email = '" + Email + "' and password ='" + password + "';");
		if (result.isEmpty()) {
			return false;
		}
		return true;
	}
}
