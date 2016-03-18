package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Category;

/**
 * Action che permette di rimuovere categorie
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionRemoveCategory extends ActionSupport {

	/**
	 * Nome della categoria
	 */
	String name;

	/**
	 *
	 * Metodo che invoca il metodo removeCategory e restituisce success se
	 * removeCategory ha restituito true
	 * 
	 * @return String success se removeCategory ha restituito true
	 */
	public String execute() {
		Category c = new Category();
		c.removeCategory(name);
		return "success";
	}

	/**
	 * Getter dell'attributo name
	 * 
	 * @return
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
