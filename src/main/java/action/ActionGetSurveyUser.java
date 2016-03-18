package action;

import java.util.ArrayList;

import model.Survey;

/**
 * Action che restituisce la lista dei sondaggi riferiti alla categoria scelta
 * dall'utente
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetSurveyUser {

	/**
	 * Categoria scelta dall'utente
	 */
	private String category;

	/**
	 * Lista dei sondaggi riferiti alla categoria scelta dall'utente
	 */
	private ArrayList<String> listSurveyUser;

	/**
	 * Metodo che invoca il metodo getAllSurveyUser e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		Survey s = new Survey();
		listSurveyUser = s.getAllSurveyUser(category);
		return "success";
	}

	/**
	 * Getter dell'attributo category
	 * 
	 * @return String
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Setter dell'attributo category
	 * 
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Getter dell'attributo ListSurveyUser
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getListSurveyUser() {
		return listSurveyUser;
	}

	/**
	 * Setter dell'attributo ListSurveyUser
	 * 
	 * @param listSurveyUser
	 */
	public void setListSurveyUser(ArrayList<String> listSurveyUser) {
		this.listSurveyUser = listSurveyUser;
	}
}
