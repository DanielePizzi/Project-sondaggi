package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import model.Survey;

/**
 * Action che restituisce la lista dei sondaggi riferiti ad una determinata
 * categoria
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetSurvey extends ActionSupport {

	/**
	 * categoria di riferimento dei sondaggi
	 */
	private String categoria;

	/**
	 * lista dei sondaggi
	 */
	private ArrayList<String> listSurvey;

	/**
	 * Metodo che invoca il metodo getAllSurvey e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		Survey s = new Survey();
		listSurvey = s.getAllSurvey(categoria);
		return "success";
	}

	/**
	 * Getter dell'attributo categoria
	 * 
	 * @return String
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Setter dell'attributo categoria
	 * 
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Getter dell'attributo getListSurvey
	 * 
	 * @return String
	 */
	public ArrayList<String> getListSurvey() {
		return listSurvey;
	}

	/**
	 * Setter dell'attributo getListSurvey
	 * 
	 * @param listSurvey
	 */
	public void setListSurvey(ArrayList<String> listSurvey) {
		this.listSurvey = listSurvey;
	}

}
