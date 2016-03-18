package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Category;

/**
 * Action che permette di aggiungere categorie
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionAddCategory extends ActionSupport {

	/**
	 * Nome della categoria
	 */
	private String name;

	/**
	 *
	 * Metodo che invoca il metodo addCategory e restituisce success se
	 * addCategory ha restituito true, failure altrimenti
	 * 
	 * @return String success se addCategory ha restituito true, failure
	 *         altrimenti
	 */
	public String execute() {
		Category c = new Category();
		boolean result = c.addCategory(name);
		if (result == true) {
			return "success";
		} else {
			return "failure";
		}
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
	 */
	public void setName(String name) {
		this.name = name;
	}

}
