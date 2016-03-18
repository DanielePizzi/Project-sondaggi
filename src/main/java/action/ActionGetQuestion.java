package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import model.Question;

/**
 * Action che restituisce la lista di domande relative ad un sondaggio
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetQuestion extends ActionSupport {

	/**
	 * lista di domande
	 */
	private ArrayList<String> listQuestion;

	/**
	 * Sondaggio di riferimento
	 */
	private String survey;

	/**
	 * Metodo che invoca il metodo getAllQuestion e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		listQuestion = new ArrayList<String>();
		Question q = new Question();
		listQuestion = q.getAllQuestion(survey);
		return "success";
	}

	/**
	 * Getter dell'attributo ListQuestion
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getListQuestion() {
		return listQuestion;
	}

	/**
	 * Setter dell'attributo ListQuestion
	 * 
	 * @param listQuestion
	 */
	public void setListQuestion(ArrayList<String> listQuestion) {
		this.listQuestion = listQuestion;
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
