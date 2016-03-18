package model;

import java.sql.SQLException;
import java.util.ArrayList;

import dbManager.DBManagerUser;
import dbManager.DBManagerAdministrator;

/**
 * Classe che implementa i metodi per l'inserimento,la modifica e la
 * cancellazione delle domande
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class Question {

	/**
	 * Testo della domanda
	 */
	private String question;

	/**
	 * Risposte della domanda
	 */
	private ArrayList<String> answer;

	/**
	 * Metodo che ritorna tutte le domande di un sondaggio
	 * 
	 * @param survey
	 *            Nome del sondaggio
	 * @return ArrayList<String> Domande del sondaggio
	 */
	public ArrayList<String> getAllQuestion(String survey) {
		ArrayList<String> question;
		DBManagerAdministrator dbmg = new DBManagerAdministrator();
		question = dbmg.selectAllQuestion(survey);
		return question;
	}

	/**
	 * Metodo che aggiunge la domanda , ritorna true se l'operazione è andata a
	 * buon fine altrimenti false
	 * 
	 * @param question
	 *            Domanda da inserire
	 * @param survey
	 *            Sondaggio di riferimento
	 * @return boolean true se l'operazione è andata a buon fine altrimenti
	 *         false
	 */
	public boolean addQuestion(String question, String survey) {
		DBManagerAdministrator dbmu = new DBManagerAdministrator();
		try {
			if (dbmu.insertQuestion(question, survey).equals("success")) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Metodo che aggiunge le risposte SiNo, ritorna true se l'operazione è
	 * andata a buon fine altrimenti false
	 * 
	 * @param question
	 *            Domanda di riferimento
	 * @return boolean ritorna true se l'operazione è andata a buon fine
	 *         altrimenti false
	 * 
	 */
	public boolean addAnswerSiNo(String question) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		if (dbma.insertAnswerSiNo(question).equals("success")){
			return true;
		}
		return false;
	}

	/**
	 * Metodo che aggiunge le risposte multiple, ritorna true se l'operazione è
	 * andata a buon fine altrimenti false
	 * 
	 * @param question
	 *            Domanda di riferimento
	 * @param answer1
	 *            Risposta numero 1
	 * @param answer2
	 *            Risposta numero 2
	 * @param answer3
	 *            Risposta numero 3
	 * @param answer4
	 *            Risposta numero 4
	 * @return boolean ritorna true se l'operazione è andata a buon fine
	 *         altrimenti false
	 * 
	 */
	public boolean addAnswerMultiple(String question, String answer1, String answer2, String answer3, String answer4) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		dbma.insertAnswerMultiple(question, answer1, answer2, answer3, answer4);
		return true;
	}

	/**
	 * Metodo che ritorna tutte le domande del sondaggio
	 * 
	 * @param survey
	 *            Sondaggio di riferimento
	 * @return ArrayList<Question> Domande del sondaggio
	 */
	public ArrayList<Question> getAllQuestionUser(String survey) {
		ArrayList<Question> question;
		DBManagerUser dbmu = new DBManagerUser();
		question = dbmu.selectAllQuestionUser(survey);
		return question;
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
	 * Getter dell'attributo answer
	 * 
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getAnswer() {
		return answer;
	}

	/**
	 * Setter dell'attributo answer
	 * 
	 * @param answer
	 */
	public void setAnswer(ArrayList<String> answer) {
		this.answer = answer;
	}

	/**
	 * Metodo che rimuove una domanda
	 * 
	 * @param name
	 *            Nome della domanda
	 */
	public void removeQuestion(String name) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		dbma.deleteQuestion(name);
	}

	/**
	 * Metodo che restituisce le risposte riferite alla domanda di riferimento
	 * 
	 * @param question
	 *            Domanda di riferimento
	 * @return ArrayList<String> Risposte alla domanda
	 */
	public ArrayList<String> getAnswers(String question) {
		ArrayList<String> answers;
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		answers = dbma.selectAnswers(question);
		return answers;
	}

}
