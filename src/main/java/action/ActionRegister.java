package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import model.Register;

/**
 * Action che permette di registrarsi al sito
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionRegister extends ActionSupport {

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
	 * Lista delle categorie scelte dall'utente
	 */
	private ArrayList<String> listCategoryResult = new ArrayList<String>();

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
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 *
	 * Metodo che invoca il metodo registration e restituisce success se
	 * registration ha restituito true, failure altrimenti
	 * 
	 * @return String success se registration ha restituito true, failure
	 *         altrimenti
	 */
	public String execute() {
		Register u = new Register(name, surname, email, password, listCategoryResult);
		Boolean result = u.registration();
		if (result == true) {
			return "success";
		} else {
			return "failure";
		}
	}
}
