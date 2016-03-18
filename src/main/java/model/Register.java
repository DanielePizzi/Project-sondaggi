package model;

import java.sql.SQLException;
import java.util.ArrayList;

import dbManager.DBManagerGuest;

/**
 * Classe che implementa i metodi per effettuare la registrazione
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class Register {

	/**
	 * Nome della persona che si vuole registrare
	 */
	private String name;

	/**
	 * Cognome della persona che si vuole registrare
	 */
	private String surname;

	/**
	 * Email della persona che si vuole registrare
	 */
	private String email;

	/**
	 * Password della persona che si vuole registrare
	 */
	private String password;

	/**
	 * Lista delle categorie selezionate dall'utente
	 */
	private ArrayList<String> listCategoryResult = new ArrayList<String>();

	/**
	 * Costruttore di Register
	 * 
	 * @param name
	 *            Nome della persona che si vuole registrare
	 * @param surname
	 *            Cognome della persona che si vuole registrare
	 * @param email
	 *            Email della persona che si vuole registrare
	 * @param password
	 *            Password della persona che si vuole registrare
	 * @param listCategory
	 *            Lista delle categorie selezionate dall'utente
	 */
	public Register(String name, String surname, String email, String password, ArrayList<String> listCategoryResult) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.listCategoryResult = listCategoryResult;
	}

	/**
	 * Getter dell'attributo ListCategoryResult
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getListCategoryResult() {
		return listCategoryResult;
	}

	/**
	 * Setter dell'attributo ListCategoryResult
	 * 
	 * @param listCategoryResult
	 */
	public void setListCategoryResult(ArrayList<String> listCategoryResult) {
		this.listCategoryResult = listCategoryResult;
	}

	/**
	 * Metodo che permette di effettuare la registrazione
	 * 
	 * @return boolean true se la registrazione è avvenuta con successo, false
	 *         altrimenti
	 */
	public boolean registration() {
		User u = new User(name, surname, email, password, listCategoryResult);
		DBManagerGuest dbmg = new DBManagerGuest();
		String result;
		try {
			result = dbmg.insertUser(u);
			if (result.equals("success")) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
