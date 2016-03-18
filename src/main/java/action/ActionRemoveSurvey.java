package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Survey;

/**
 * Action che permette di rimuovere sondaggi
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionRemoveSurvey extends ActionSupport {

	/**
	 * Nome del sondaggio
	 */
	String name;

	/**
	 *
	 * Metodo che invoca il metodo removeSurvey e restituisce success se
	 * removeSurvey ha restituito true
	 * 
	 * @return String success se removeSurvey ha restituito true
	 */
	public String execute() {
		Survey s = new Survey();
		s.removeSurvey(name);
		return "success";
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
