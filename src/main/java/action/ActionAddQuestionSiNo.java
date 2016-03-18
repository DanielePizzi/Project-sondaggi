package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Question;

/**
 * Action che permette di aggiungere domande di tipo SiNO
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionAddQuestionSiNo extends ActionSupport {

	/**
	 * Testo della domanda da aggiungere
	 */
	private String question;

	/**
	 * Nome del sondaggio di riferimento per la domanda
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
	 * Metodo che invoca i metodi addQuestion e addAnswerSiNo e ritorna success
	 * se entrambi hanno restituito true, failure altrimenti
	 * 
	 * @return String ritorna success se entrambi hanno restituito true, failure
	 *         altrimenti
	 */
	public String execute2() {
		Question q = new Question();
		boolean result1 = q.addQuestion(question, survey);
		boolean result2 = q.addAnswerSiNo(question);
		if (result1 && result2 == true) {
			return "success";
		} else {
			return "failure";
		}
	}

	/**
	 * Getter dell'attributo question
	 * 
	 * @return String
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Setter dell'attributo question
	 * 
	 * @param question
	 */
	public void setQuestion(String question) {
		this.question = question;
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
