package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Survey;

/**
 * Action che permette di modificare il nome di un sondaggio
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionModifySurvey extends ActionSupport {

	/**
	 * Vecchio nome del sondaggio
	 */
	private String oldName;

	/**
	 * Nuovo nome del sondaggio
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
	 * Metodo che invoca il metodo updateSurvey e restituisce success se
	 * updateSurvey ha restituito true, failure altrimenti
	 * 
	 * @return String success se updateSurvey ha restituito true, failure
	 *         altrimenti
	 */
	public String modify() {
		Survey s = new Survey();
		if (s.updateSurvey(newName, oldName)) {
			return "success";
		}
		return "failure";
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

}
