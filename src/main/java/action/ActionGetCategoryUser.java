package action;

import java.util.ArrayList;

import model.Category;

/**
 * Action che resituisce la lista delle categorie scelte dall'utente
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetCategoryUser {

	/**
	 * categorie scelte dall'utente
	 */
	private ArrayList<String> listCategoryUser;

	/**
	 * Email dell'user
	 */
	private String email;

	/**
	 * Metodo che invoca il metodo getAllCategoryUser e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		listCategoryUser = new ArrayList<String>();
		Category c = new Category();
		listCategoryUser = c.getAllCategoryUser(email);
		return "success";
	}

	/**
	 * 1 Getter dell'attributo ListCategoryUser
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getListCategoryUser() {
		return listCategoryUser;
	}

	/**
	 * Setter dell'attributo ListCategoryUser
	 * 
	 * @param listCategoryUser
	 */
	public void setListCategoryUser(ArrayList<String> listCategoryUser) {
		this.listCategoryUser = listCategoryUser;
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

}
