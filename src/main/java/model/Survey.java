package model;

import java.sql.SQLException;
import java.util.ArrayList;

import dbManager.DBManagerAdministrator;
import dbManager.DBManagerUser;

/**
 * Classe che implementa i metodi per l'inserimento,la modifica e la
 * cancellazione dei sondaggi
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class Survey {

	/**
	 * Metodo che ritorna tutti i sondaggi di una categoria
	 * 
	 * @param categoria
	 *            Nome della categoria
	 * @return ArrayList<String> Sondaggi della categoria
	 */
	public ArrayList<String> getAllSurvey(String categoria) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		return dbma.selectAllSurvey(categoria);
	}

	/**
	 * Metodo che modifica il nome di un sondaggio, ritorna true se la modifica
	 * è andata a buon fine altrimenti false
	 *
	 * @param newName
	 *            Nuovo nome del sondaggio
	 * @param oldName
	 *            Vecchio nome del sondaggio
	 * @return ritorna true se la modifica è andata a buon fine altrimenti false
	 *
	 */
	public boolean updateSurvey(String newName, String oldName) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		if (dbma.insertUpdateSurvey(newName, oldName).equals("success")) {
			return true;
		}
		return false;
	}

	/**
	 * Metodo che rimuove un sondaggio
	 * 
	 * @param name
	 *            Nome del sondaggio da rimuovere
	 */
	public void removeSurvey(String name) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		dbma.deleteSurvey(name);
	}

	/**
	 * Metodo che aggiunge un sonaggio, ritorna true se l'operazione è andata a
	 * buon fine altrimenti false
	 * 
	 * @param survey
	 *            Sondaggio da aggiungere
	 * @param category
	 *            Categoria di riferimento del sondaggio
	 * @return boolean ritorna true se l'operazione è andata a buon fine
	 *         altrimenti false
	 */
	public boolean addSurvey(String survey, String category) {
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		try {
			if (dbma.insertSurvey(survey, category).equals("success")) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Metodo che ritorna tutti i sondaggi a cui può rispondere l'utente
	 * 
	 * @param category
	 *            Categoria di riferimento del sondaggio
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getAllSurveyUser(String category) {
		DBManagerUser dbmu = new DBManagerUser();
		return dbmu.selectAllSurveyUser(category);
	}

}
