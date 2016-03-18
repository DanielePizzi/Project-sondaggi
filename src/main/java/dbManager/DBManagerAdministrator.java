package dbManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

/**
 * Classe utilizzata per la gestione del DB per quanto riguarda l'amministratore
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class DBManagerAdministrator extends DBManager {

	/**
	 * Questo metodo inserisce un utente nel database con la lista di categorie
	 * associate, in particolare inserisce un record nella tabella User e tanti
	 * record quante sono le categorie scelte nella tabella Visualizza.
	 * 
	 * @param u
	 * @return String
	 * @throws SQLException
	 */
	public String insertCategory(String nameCategory) throws SQLException {
		ArrayList<String> result;
		result = op.query("SELECT idAmministratore FROM Amministratore LIMIT 1;");
		int idAmministratore = Integer.parseInt(result.get(0));
		int valid = op.insUpDel("INSERT INTO Categoria (nome, idAmministratore) " + "VALUES (" + "'" + nameCategory
				+ "'," + idAmministratore + ");");
		if (valid == 0) {
			return "failure";
		} else {
			return "success";
		}
	}

	/**
	 * Metodo che seleziona tutte le categorie presenti nel DB
	 * 
	 * @return ArrayList<String> Tutte le categorie presenti nel DB
	 */
	public ArrayList<String> selectAllCategory() {
		ArrayList<String> listCategory;
		listCategory = op.query("select nome from categoria");
		return listCategory;
	}

	/**
	 * Metodo che modifica il nome di una categoria nel DB, ritorna success se
	 * la modifica è andata a buon fine failure altrimenti
	 * 
	 * @param newName
	 *            Nuovo nome della categoria
	 * @param oldName
	 *            Vecchio nome della categoria
	 * @return String ritorna success se la modifica è andata a buon fine
	 *         failure altrimenti
	 */
	public String insertUpdateCategory(String newName, String oldName) {
		int result = op.insUpDel("UPDATE Categoria SET nome = '" + newName + "' WHERE nome = '" + oldName + "';");
		if (result > 0) {
			return "success";
		} else {
			return "failure";
		}
	}

	/**
	 * Metodo che seleziona tutti i sondaggi presenti nel DB
	 * 
	 * @param categoria
	 *            Cetegoria di riferimento del sondaggio
	 * @return ArrayList<String> tutti i sondaggi presenti nel DB
	 */
	public ArrayList<String> selectAllSurvey(String categoria) {
		ArrayList<String> result;
		result = op.query("SELECT idCategoria FROM Categoria WHERE nome='" + categoria + "';");
		int idCategoria = Integer.parseInt(result.get(0));
		result = op.query("SELECT nome FROM Sondaggio WHERE idCategoria='" + idCategoria + "';");
		return result;
	}

	/**
	 * Metodo che elimina una categoria dal DB
	 * 
	 * @param name
	 *            Categoria da eliminare
	 */
	public void deleteCategory(String name) {
		ArrayList<String> result;
		ArrayList<String> result2;
		result = op.query("SELECT idCategoria FROM Categoria WHERE nome='" + name + "';");
		int idCategoria = Integer.parseInt(result.get(0));
		op.insUpDel("DELETE FROM Categoria WHERE idCategoria=" + idCategoria + ";");
	}

	/**
	 * Metodo che modifica il nome di un sondaggio presente nel DB, ritorna
	 * success se la modifica è andata a buon fine altrimenti failure
	 * 
	 * @param newName
	 *            Nuovo nome del sondaggio
	 * @param oldName
	 *            Vecchio nome del sondaggio
	 * @return
	 */
	public String insertUpdateSurvey(String newName, String oldName) {
		int result = op.insUpDel("UPDATE Sondaggio SET nome = '" + newName + "' WHERE nome = '" + oldName + "';");
		if (result > 0) {
			return "success";
		} else {
			return "failure";
		}

	}

	/**
	 * Metodo che elimina un sondaggio dal DB
	 * 
	 * @param name
	 *            Sondaggio da eliminare
	 */
	public void deleteSurvey(String name) {
		ArrayList<String> result;
		result = op.query("SELECT idsondaggio FROM sondaggio WHERE nome='" + name + "';");
		int idSondaggio = Integer.parseInt(result.get(0));
		op.insUpDel("DELETE FROM Sondaggio WHERE idSondaggio=" + idSondaggio + ";");
	}

	/**
	 * Metodo che seleziona tutte le domande presenti nel DB
	 * 
	 * @param sondaggio
	 *            Sondaggio di riferimento delle domande
	 * @return ArrayList<String> tutte le domande presenti nel DB
	 */
	public ArrayList<String> selectAllQuestion(String sondaggio) {
		ArrayList<String> result;
		result = op.query("SELECT idSondaggio FROM Sondaggio WHERE nome='" + sondaggio + "';");
		int idSondaggio = Integer.parseInt(result.get(0));
		result = op.query("SELECT nome FROM Domanda WHERE idSondaggio='" + idSondaggio + "';");
		return result;
	}

	/**
	 * Metodo che inserisce un sonaggio nel DB, ritorna success se l'inserimento
	 * è andato a buon fine altrimenti failure
	 * 
	 * 
	 * @param nameSurvey
	 *            Nome del sondaggio
	 * @param nameCategory
	 *            Nome della categoria di riferimento del sondaggio
	 * @return String ritorna success se l'inserimento è andato a buon fine
	 *         altrimenti failure
	 * @throws SQLException
	 */
	public String insertSurvey(String nameSurvey, String nameCategory) throws SQLException {
		ArrayList<String> result;
		result = op.query("SELECT idCategoria FROM Categoria WHERE nome ='" + nameCategory + "';");
		int idCategory = Integer.parseInt(result.get(0));
		int valid = op.insUpDel("INSERT INTO Sondaggio (nome, idCategoria) " + "VALUES (" + "'" + nameSurvey + "',"
				+ idCategory + ");");
		if (valid == 0) {
			return "failure";
		} else {
			return "success";
		}
	}

	/**
	 * Metodo che inserisce una domanda nel DB, ritorna success se l'inserimento
	 * è andato a buon fine altrimenti failure
	 * 
	 * @param nameQuestion
	 *            Nome della domanda
	 * @param nameSurvey
	 *            Nome del sondaggio di riferimento della domanda
	 * @return String ritorna success se l'inserimento è andato a buon fine
	 *         altrimenti failure
	 * @throws SQLException
	 */
	public String insertQuestion(String nameQuestion, String nameSurvey) throws SQLException {
		ArrayList<String> result;
		result = op.query("SELECT idSondaggio FROM Sondaggio WHERE nome ='" + nameSurvey + "';");
		int idSurvey = Integer.parseInt(result.get(0));
		int valid = op.insUpDel(
				"INSERT INTO Domanda (nome, idSondaggio) " + "VALUES (" + "'" + nameQuestion + "'," + idSurvey + ");");
		if (valid == 0) {
			return "failure";
		} else {
			return "success";
		}
	}

	/**
	 * Metodo che inserisce le risposte Si e No nel DB, ritorna success se
	 * l'inserimento è andato a buon fine
	 * 
	 * @param question
	 *            Domanda di riferimento delle risposte
	 * @return String ritorna success se l'inserimento è andato a buon fine
	 * 
	 */
	public String insertAnswerSiNo(String question) {
		ArrayList<String> result;
		result = op.query("SELECT idDomanda FROM Domanda WHERE nome ='" + question + "';");
		int idDomanda = Integer.parseInt(result.get(0));
		int valid1=checkAndInsertAnswer(idDomanda, "si");
		int valid2=checkAndInsertAnswer(idDomanda, "no");
		if (valid1==0 || valid2==0){
			return "failure";
		}
		return "success";
	}

	/**
	 * Metodo che verifica che la rispota non sia già presente nel DB e che non
	 * sia una stringha vuota. Se il controllo viene superato allora la risposta
	 * verrà aggiunta al DB
	 *
	 * @param idDomanda
	 *            Domanda di riferimento della risposta
	 * @param answer
	 *            Risposta
	 */
	public int checkAndInsertAnswer(int idDomanda, String answer) {
		ArrayList<String> result;
		int valid=0;
		if (answer != null) {
			op.insUpDel("INSERT INTO Risposta (nome) VALUES ('" + answer + "');");
			result = op.query("SELECT idRisposta FROM Risposta WHERE nome ='" + answer + "';");
			int idRisposta = Integer.parseInt(result.get(0));
			valid=op.insUpDel("INSERT INTO Risposta_Domanda (idRisposta, idDomanda) " + "VALUES (" + idRisposta + ","
					+ idDomanda + ");");
			
		}
		return valid;
	}

	/**
	 * Metodo che inserisce le risposte multiple nel DB, ritorna success se
	 * l'inserimento è andato a buon fine
	 *
	 * @param question
	 *            Domanda di riferimento delle risposte
	 * @param answer1
	 *            Risposta numero 1
	 * @param answer2
	 *            Risposta numero 2
	 * @param answer3
	 *            Risposta numero 3
	 * @param answer4
	 *            Risposta numero 4
	 * @return
	 */
	public String insertAnswerMultiple(String question, String answer1, String answer2, String answer3,
			String answer4) {
		ArrayList<String> result;
		result = op.query("SELECT idDomanda FROM Domanda WHERE nome ='" + question + "';");
		System.out.println(result.get(0));
		int idDomanda = Integer.parseInt(result.get(0));

		checkAndInsertAnswer(idDomanda, answer1);
		checkAndInsertAnswer(idDomanda, answer2);
		checkAndInsertAnswer(idDomanda, answer3);
		checkAndInsertAnswer(idDomanda, answer4);

		return "success";
	}

	/**
	 * Metodo che verifica l'email e la password dell'amministratore è presente
	 * nel DB
	 * 
	 * @param Email
	 *            email dell'amministratore
	 * @param password
	 *            password dell'amministratore
	 * @return boolean true se verifica è OK, false altrimenti
	 */
	public boolean validateAdmin(String Email, String password) {
		ArrayList<String> result;
		result = op.query("SELECT  idAmministratore FROM amministratore WHERE email = '" + Email
				+ "' and binary password ='" + password + "';");
		if (result.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * Metodo che elimina una domanda dal DB
	 * 
	 * @param name
	 *            Testo della domanda da eliminare
	 */
	public void deleteQuestion(String name) {
		ArrayList<String> result;
		result = op.query("SELECT iddomanda FROM domanda WHERE nome='" + name + "';");
		int idDomanda = Integer.parseInt(result.get(0));
		op.insUpDel("DELETE FROM Domanda WHERE idDomanda=" + idDomanda + ";");
	}

	/**
	 * Metodo che seleziona dal DB le risposte di una domanda
	 * 
	 * @param question
	 *            Domanda di riferimento delle risposte
	 * @return ArrayList<String> risposte della domanda
	 */
	public ArrayList<String> selectAnswers(String question) {
		ArrayList<String> result;
		result = op.query("SELECT iddomanda FROM domanda WHERE nome='" + question + "';");
		int idDomanda = Integer.parseInt(result.get(0));
		result = op.query("SELECT nome FROM Risposta AS R, Risposta_Domanda AS RD WHERE RD.idDomanda=" + idDomanda
				+ " AND RD.idRisposta = R.IdRisposta;");
		return result;
	}

}
