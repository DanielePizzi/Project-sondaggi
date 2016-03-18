package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import model.Category;

/**
 * Action che resituisce la lista delle categorie
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetCategory extends ActionSupport {

	/**
	 * lista delle categorie
	 */
	private ArrayList<String> listCategory;

	/**
	 * Metodo che invoca il metodo getAllCategory e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		listCategory = new ArrayList<String>();
		Category c = new Category();
		listCategory = c.getAllCategory();
		return "success";

	}

	/**
	 * Getter dell'attributo ListCategory
	 * 
	 * @return String
	 */
	public ArrayList<String> getListCategory() {
		return listCategory;
	}

	/**
	 * Setter dell'attributo ListCategory
	 * 
	 * @param listCategory
	 */
	public void setListCategory(ArrayList<String> listCategory) {
		this.listCategory = listCategory;
	}

}