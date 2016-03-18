package model;

import java.util.ArrayList;

import dbManager.DBManagerUser;

/**
 * Classe che implementa i metodi per l'inserimento,la modifica e la
 * cancellazione degli utenti
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class User {

	/**
	 * Nome dell'utente
	 */
	private String name;

	/**
	 * Cognome dell'utente
	 */
	private String surname;

	/**
	 * Email dell'utente
	 */
	private String email;

	/**
	 * Password dell'utente
	 */
	private String password;

	/**
	 * Categorie che può vedere l'utente
	 */
	private ArrayList<String> listCategory = new ArrayList<String>();

	/**
	 * Costruttore di User
	 * 
	 * @param name
	 *            Nome dell'utente
	 * @param surname
	 *            Cognome dell'utente
	 * @param email
	 *            Email dell'utente
	 * @param password
	 *            Password dell'utente
	 * @param listCategory
	 *            Categorie che può vedere l'utente
	 */
	public User(String name, String surname, String email, String password, ArrayList<String> listCategory) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.listCategory = listCategory;
	}

	/**
	 * Costruttore di User senza parametri
	 */
	public User() {

	}

	/**
	 * Getter dell'attributo name
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter dell'attributo name
	 * 
	 * @param name
	 *            Nome dell'utente
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter dell'attributo surname
	 * 
	 * @return String
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Setter dell'attributo surname
	 * 
	 * @param surname
	 *            Cognome dell'utente
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * Getter dell'attributo email
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter dell'attributo email
	 * 
	 * @param email
	 *            Email dell'utente
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter dell'attributo password
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter dell'attributo password
	 * 
	 * @param password
	 *            Password dell'utente
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Getter dell'attributo listCategory
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getListCategory() {
		return listCategory;
	}

	/**
	 * Setter dell'attributo listCategory
	 * 
	 * @param listCategory
	 *            Categorie che può vedere l'utente
	 */
	public void setListCategory(ArrayList<String> listCategory) {
		this.listCategory = listCategory;
	}

	/**
	 * Metodo che modifica l'email di un utente, ritorna true se la modifica è
	 * andata a buon fine altrimenti false
	 * 
	 * @param oldEmail
	 *            Vecchia email
	 * @param newEmail
	 *            Nuova email
	 * @param password
	 *            Password dell'utente
	 * @return boolean ritorna true se la modifica è andata a buon fine
	 *         altrimenti false
	 */
	public boolean updateEmail(String oldEmail, String newEmail, String password) {
		DBManagerUser dbmu = new DBManagerUser();
		if (dbmu.insertUpdateEmail(oldEmail, newEmail, password).equals("success")) {
			return true;
		}
		return false;
	}

	/**
	 * Metodo che modifica la password di un utente, ritorna true se la modifica
	 * è andata a buon fine altrimenti false
	 * 
	 * @param email
	 *            Email dell'utente
	 * @param oldpsw
	 *            Vecchia password
	 * @param newpsw
	 *            Nuova password
	 * @return boolean ritorna true se la modifica è andata a buon fine
	 *         altrimenti false
	 */
	public boolean updatePassword(String email, String oldpsw, String newpsw) {
		DBManagerUser dbmu = new DBManagerUser();
		if (dbmu.insertUpdatePsw(email, oldpsw, newpsw).equals("success")) {
			return true;
		}
		return false;
	}

}
