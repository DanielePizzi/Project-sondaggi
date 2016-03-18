package dbManager;

import java.util.ArrayList;

import model.Question;

/**
 * Classe utilizzata per la gestione del DB per quanto riguarda l'user
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class DBManagerUser extends DBManager {

	/**
	 * Metodo che seleziona tutte le categorie presenti nel DB alle quali l'user
	 * si è registrato
	 * 
	 * @param email
	 *            Email dell'user
	 * @return ArrayList<String> Categorie alle quali l'user si è registrato
	 */
	public ArrayList<String> selectAllCategoryUser(String email) {
		ArrayList<String> listCategory;
		listCategory = op.query("SELECT C.nome FROM Categoria AS C, " + "Visualizza AS V,User AS U WHERE email= '"
				+ email + "' " + "AND U.idUser=V.iduser AND C.IdCategoria=V.IdCategoria;");
		return listCategory;
	}

	/**
	 * Metodo che seleziona tutti i sondaggi presenti nel DB ai quali l'user può
	 * rispondere
	 * 
	 * @param category
	 *            Categoria di riferimento del sondaggio
	 * @return ArrayList<String> Sondaggi ai quali l'user può rispondere
	 */
	public ArrayList<String> selectAllSurveyUser(String category) {
		ArrayList<String> result;
		result = op.query("SELECT idCategoria FROM Categoria WHERE nome='" + category + "';");
		int idCategory = Integer.parseInt(result.get(0));
		result = op.query("SELECT nome FROM Sondaggio WHERE idCategoria='" + idCategory + "';");
		return result;
	}

	/**
	 * Metodo che permette di modificare nel DB la password
	 * 
	 * @param email
	 *            Email dell'utente
	 * @param oldpsw
	 *            Vecchia password
	 * @param newpsw
	 *            Nuova password
	 * @return String ritorna success se la modifica è andata a buon fine,
	 *         failure altrimenti
	 */
	public String insertUpdatePsw(String email, String oldpsw, String newpsw) {
		int result = op.insUpDel("UPDATE User SET password = '" + newpsw + "' WHERE email = '" + email
				+ "' AND  password='" + oldpsw + "'  ;");
		if (result > 0) {
			return "success";
		} else {
			return "failure";
		}
	}

	/**
	 * Metodo che permette di modificare nel DB l'email
	 * 
	 * @param oldEmail
	 *            Vecchia email
	 * @param newEmail
	 *            Nuova email
	 * @param password
	 *            Password dell'utente
	 * @return String ritorna success se la modifica è andata a buon fine,
	 *         failure altrimenti
	 */
	public String insertUpdateEmail(String oldEmail, String newEmail, String password) {
		int result = op.insUpDel("UPDATE User SET email = '" + newEmail + "' WHERE email = '" + oldEmail
				+ "' AND  password='" + password + "'  ;");
		if (result > 0) {
			return "success";
		} else {
			return "failure";
		}
	}

	/**
	 * Metodo che seleziona tutte le domande presenti nel DB alle quali l'user
	 * può rispondere
	 * 
	 * @param survey
	 *            Sondaggio di riferimento delle domande
	 * @return ArrayList<Question> Domande alle quali l'user può rispondere
	 */
	public ArrayList<Question> selectAllQuestionUser(String survey) {
		ArrayList<String> result;
		ArrayList<String> result2;
		ArrayList<Question> listQuestion = new ArrayList<Question>();
		result = op.query("SELECT idSondaggio FROM Sondaggio WHERE nome='" + survey + "';");
		int idSurvey = Integer.parseInt(result.get(0));
		result = op.query("SELECT idDomanda FROM Domanda WHERE idSondaggio='" + idSurvey + "';");
		for (int i = 0; i < result.size(); i++) {
			Question q = new Question();
			int idQuestion = Integer.parseInt(result.get(i));
			result2 = op.query("SELECT nome FROM Domanda WHERE idSondaggio='" + idSurvey + "' and idDomanda='"
					+ idQuestion + "';");
			q.setQuestion(result2.get(0));
			q.setAnswer(op
					.query("SELECT nome FROM Risposta AS R,Risposta_Domanda AS RD WHERE R.IdRisposta = RD.IdRisposta AND RD.IdDomanda ="
							+ idQuestion + ";"));
			listQuestion.add(q);
		}
		return listQuestion;
	}
}
