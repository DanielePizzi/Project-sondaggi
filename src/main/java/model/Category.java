package model;

import java.sql.SQLException;
import java.util.ArrayList;

import dbManager.DBManagerGuest;
import dbManager.DBManagerUser;
import dbManager.DBManagerAdministrator;

/**
 * Classe che implementa i metodi per l'inserimento,la modifica e la
 * cancellazione delle categorie
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class Category {

	/**
	 * Nome della categoria
	 */
	private String name;

	/**
	 * Metodo che ritorna tutte le categorie
	 * 
	 * @return ArrayList<String> Tutte le categorie
	 */
	public ArrayList<String> getAllCategory() {
		ArrayList<String> category;
		DBManagerAdministrator dbma = new DBManagerAdministrator();
		category = dbma.selectAllCategory();
		return category;
	}

	/**
	 * Metodo che aggiunge una categoria, ritorna true se l'operazione è andata
	 * a buon fine altrimenti false
	 * 
	 * @param name
	 *            Categoria da aggiungere
	 * @return boolean true se l'operazione è andata a buon fine altrimenti
	 *         false
	 */
	public boolean addCategory(String name) {
		DBManagerAdministrator dbmu = new DBManagerAdministrator();
		try {
			if (dbmu.insertCategory(name).equals("success")) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Metodo che modifica il nome di una categoria, ritorna true se la modifica
	 * è andata a buon fine altrimenti false
	 * 
	 * @param newName
	 *            Nuovo nome della categoria
	 * @param oldName
	 *            Vecchio nome della categoria
	 * @return boolean ritorna true se la modifica è andata a buon fine
	 *         altrimenti false
	 * 
	 */
	public boolean updateCategory(String newName, String oldName) {
		DBManagerAdministrator dbmu = new DBManagerAdministrator();
		if (dbmu.insertUpdateCategory(newName, oldName).equals("success")) {
			return true;
		}
		return false;
	}

	/**
	 * Metodo che rimuove una categoria
	 * 
	 * @param name
	 *            Nome della categoria da rimuovere
	 */
	public void removeCategory(String name) {
		DBManagerAdministrator dbmu = new DBManagerAdministrator();
		dbmu.deleteCategory(name);
	}

	/**
	 * Metodo che restituisce tutte le categorie di un utente
	 * 
	 * @param email
	 *            email dell'utente di cui verrano restituite le categorie
	 * @return ArrayList<String> categorie dell'utente
	 */
	public ArrayList<String> getAllCategoryUser(String email) {
		ArrayList<String> category;
		DBManagerUser dbmu = new DBManagerUser();
		category = dbmu.selectAllCategoryUser(email);
		return category;
	}

}
