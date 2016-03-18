package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Category;

/**
 * Action che permette di modificare il nome di una categoria
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionModifyCategory extends ActionSupport {

	/**
	 * Vecchio nome della categoria
	 */
	private String oldName;

	/**
	 * Nuovo nome della categoria
	 */
	private String newName;

	/**
	 * Metodo che ritorna la stringa "success"
	 * 
	 * @return String
	 */
	public String execute() {
		System.out.println(oldName);
		return "success";
	}

	/**
	 * Metodo che invoca il metodo updateCategory e restituisce success se
	 * updateCategory ha restituito true, failure altrimenti
	 * 
	 * @return String success se updateCategory ha restituito true, failure
	 *         altrimenti
	 */
	public String modify() {
		Category c = new Category();
		if (c.updateCategory(newName, oldName)) {
			return "success";
		}
		return "failure";
	}

	/**
	 * Getter dell'attributo newName
	 * 
	 * @return String
	 */
	public String getNewName() {
		return newName;
	}

	/**
	 * Setter dell'attributo newName
	 * 
	 * @param newName
	 */
	public void setNewName(String newName) {
		this.newName = newName;
	}

	/**
	 * Getter dell'attributo oldName
	 * 
	 * @return String
	 */
	public String getOldName() {
		return oldName;
	}

	/**
	 * Setter dell'attributo oldName
	 * 
	 * @param oldName
	 */
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

}
