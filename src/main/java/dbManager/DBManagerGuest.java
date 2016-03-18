package dbManager;

import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

/**
 * Classe utilizzata per la gestione del DB per quanto riguarda il guest
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class DBManagerGuest extends DBManager {

	/**
	 * Questo metodo inserisce un utente nel database con la lista di categorie
	 * associate, in particolare inserisce un record nella tabella User e tanti
	 * record quante sono le categorie scelte nella tabella Visualizza.
	 * 
	 * @param u
	 * @return String
	 * @throws SQLException
	 */
	public String insertUser(User u) throws SQLException {
		ArrayList<String> result;
		int valid = op.insUpDel("INSERT INTO User (nome, cognome, email, password) " + "VALUES (" + "'" + u.getName()
				+ "'," + "'" + u.getSurname() + "'," + "'" + u.getEmail() + "'," + "'" + u.getPassword() + "');");
		if (valid == 0) {
			return "emailExists";
		}
		result = op.query("SELECT idUser FROM User WHERE email = '" + u.getEmail() + "';");
		int idUser = Integer.parseInt(result.get(0));

		int idCategory;
		for (int i = 0; i < u.getListCategory().size(); i++) {
			result = op.query("SELECT idCategoria FROM Categoria WHERE Nome = '" + u.getListCategory().get(i) + "';");
			idCategory = Integer.parseInt(result.get(0));
			op.insUpDel("INSERT INTO Visualizza (idUser, idCategoria) " + "VALUES (" + "'" + idUser + "'," + "'"
					+ idCategory + "'" + ");");
		}
		return "success";
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
}
