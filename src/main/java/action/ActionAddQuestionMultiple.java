package action;

import com.opensymphony.xwork2.ActionSupport;

import model.Question;

/**
 * Action che permette di aggiungere domande multiple
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionAddQuestionMultiple extends ActionSupport {

	/**
	 * Testo della domanda
	 */
	private String question;

	/**
	 * Sondaggio di riferimento della domanda
	 */
	private String survey;

	/**
	 * Risposta numero 1
	 */
	private String answer1;

	/**
	 * Risposta numero 2
	 */
	private String answer2;

	/**
	 * Risposta numero 3
	 */
	private String answer3;

	/**
	 * Risposta numero 4
	 */
	private String answer4;

	/**
	 * Metodo che ritorna la stringa "success"
	 * 
	 * @return String
	 */
	public String execute() {
		return "success";
	}

	/**
	 * Metodo che invoca i metodi addQuestion e addAnswerMultiple e ritorna
	 * success se entrambi hanno restituito true, failure altrimenti
	 * 
	 * @return String ritorna success se entrambi hanno restituito true, failure
	 *         altrimenti
	 */
	public String execute2() {
		Question q = new Question();
		boolean result1 = q.addQuestion(question, survey);
		boolean result2 = q.addAnswerMultiple(question, answer1, answer2, answer3, answer4);
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

	/**
	 * Getter dell'attributo answer1
	 * 
	 * @return String
	 */
	public String getAnswer1() {
		return answer1;
	}

	/**
	 * Setter dell'attributo answer1
	 * 
	 * @param answer1
	 */
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	/**
	 * Getter dell'attributo answer2
	 * 
	 * @return String
	 */
	public String getAnswer2() {
		return answer2;
	}

	/**
	 * Setter dell'attributo answer2
	 * 
	 * @param answer2
	 */
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	/**
	 * Getter dell'attributo answer3
	 * 
	 * @return String
	 */
	public String getAnswer3() {
		return answer3;
	}

	/**
	 * Setter dell'attributo answer3
	 * 
	 * @param answer3
	 */
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	/**
	 * Getter dell'attributo answer4
	 * 
	 * @return String
	 */
	public String getAnswer4() {
		return answer4;
	}

	/**
	 * Setter dell'attributo answer4
	 * 
	 * @param answer4
	 */
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

}
