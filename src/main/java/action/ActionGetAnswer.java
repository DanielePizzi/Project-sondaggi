package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import model.Question;

/**
 * Action che restituisce le risposte riferite ad una domanda
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionGetAnswer extends ActionSupport {

	/**
	 * Domanda di riferimento delle risposte
	 */
	private String question;

	/**
	 * Lista delle risposte
	 */
	private ArrayList<String> listAnswer;

	/**
	 * Metodo che invoca il metodo getAnswers e restituisce success
	 * 
	 * @return String success
	 */
	public String execute() {
		Question q = new Question();
		q.getAnswers(question);
		return "success";
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
	 * Getter dell'attributo ListAnswer
	 * 
	 * @return String
	 */
	public ArrayList<String> getListAnswer() {
		return listAnswer;
	}

	/**
	 * Setter dell'attributo ListAnswer
	 * 
	 * @param listAnswer
	 */
	public void setListAnswer(ArrayList<String> listAnswer) {
		this.listAnswer = listAnswer;
	}

}
