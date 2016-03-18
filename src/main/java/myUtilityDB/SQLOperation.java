package myUtilityDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe che implementa i metodi per effettuare query,inserimenti,cancellazioni
 * e modifiche sul DB
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class SQLOperation {

	/**
	 * Configurazione del DB
	 */
	ConfigurationDB config;

	/**
	 * Costruttore di SQLOperation
	 * 
	 * @param config
	 *            Configurazione del DB
	 */
	public SQLOperation(ConfigurationDB config) {
		this.config = config;
	}

	/**
	 * Metodo che permette di effettuare query al DB
	 * 
	 * @param query
	 *            query da effettuare al DB
	 * @return ArrayList<String> risultato della query
	 */
	public ArrayList<String> query(String query) {
		ArrayList<String> queryRes = new ArrayList<String>();
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(this.config.getUrl(), this.config.getUser(),
					this.config.getPassword());
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					queryRes.add(rs.getString(i));
				}
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return queryRes;
	}

	/**
	 * Metodo che permette di effettuare inserimenti, modifiche e cancellazioni
	 * sul DB
	 * 
	 * @param insert
	 *            inserimento, modifica o cancellazione da eseguire sul DB
	 * @return int il numero di righe che ha modificato altrimenti se non viene
	 *         modificata nessuna riga ritorna 0
	 */
	public int insUpDel(String insert) {
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(this.config.getUrl(), this.config.getUser(),
					this.config.getPassword());
			Statement stmt = conn.createStatement();
			result = stmt.executeUpdate(insert);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}
