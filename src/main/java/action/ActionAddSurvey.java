package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Survey;

/**
 * Action che permette di aggiungere sondaggi
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionAddSurvey extends ActionSupport {

	/**
	 * Nomde del sondaggio
	 */
	private String survey;

	/**
	 * Nome della categoria di riferimento del sondaggio
	 */
	private String categoria;

	/**
	 * Metodo che ritorna la stringa "success"
	 * 
	 * @return String
	 */
	public String execute() {
		return "success";
	}

	/**
	 * * Metodo che invoca il metodo addSurvey e restituisce success se
	 * addSurvey ha restituito true, failure altrimenti
	 * 
	 * @return String success se addSurvey ha restituito true, failure
	 *         altrimenti
	 */
	public String execute2() {
		Survey s = new Survey();
		boolean result = s.addSurvey(survey, categoria);
		if (result == true) {
			return "success";
		} else {
			return "failure";
		}
	}

	/**
	 * Getter dell'attributo survey
	 * 
	 * @return String
	 */
	public String getSurvey() {
		return survey;
	}

	/**
	 * Setter dell'attributo survey
	 * 
	 * @param survey
	 */
	public void setSurvey(String survey) {
		this.survey = survey;
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

}
