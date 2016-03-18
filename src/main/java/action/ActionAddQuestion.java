package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Question;
import model.Survey;

/**
 * Action che permette di aggiungere domande
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionAddQuestion extends ActionSupport {

	/**
	 * Nome del sondaggio di riferimento alle domande
	 */
	private String survey;

	/**
	 * Metodo che ritorna la stringa "success"
	 * 
	 * @return String
	 */
	public String execute() {
		return "success";
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

}
