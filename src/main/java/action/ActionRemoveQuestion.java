package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Question;

/**
 * Action che permette di rimuovere domande
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionRemoveQuestion extends ActionSupport {

	/**
	 * Nome del sondaggio
	 */
	String name;

	/**
	 *
	 * Metodo che invoca il metodo removeQuestion e restituisce success se
	 * removeQuestion ha restituito true
	 * 
	 * @return String success se removeQuestion ha restituito true
	 */
	public String execute() {
		Question q = new Question();
		q.removeQuestion(name);
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
