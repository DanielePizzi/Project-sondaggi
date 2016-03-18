package action;

import java.util.ArrayList;

import model.Question;

/**
 * Action che restituisce la lista delle domande riferite al sondaggio in base
 * alla categoria scelta dall'utente
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetQuestionUser {

	/**
	 * lista delle domande riferite al sondaggio 
	 */
	private ArrayList<Question> listQuestionUser;

	/**
	 * Sondaggio di riferimento delle domande
	 */
	private String survey;

	/**
	 * Metodo che invoca il metodo getAllQuestionUser e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		listQuestionUser = new ArrayList<Question>();
		Question q = new Question();
		listQuestionUser = q.getAllQuestionUser(survey);
		return "success";

	}

	/**
	 * Getter dell'attributo ListQuestionUser
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<Question> getListQuestionUser() {
		return listQuestionUser;
	}

	/**
	 * Setter dell'attributo ListQuestionUser
	 * 
	 * @param listQuestion
	 */
	public void setListQuestionUser(ArrayList<Question> listQuestionUser) {
		this.listQuestionUser = listQuestionUser;
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
