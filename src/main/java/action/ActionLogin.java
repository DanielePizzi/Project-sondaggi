package action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dbManager.DBManagerLogin;

/**
 * Action che permette di effettuare la login
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionLogin extends ActionSupport implements SessionAware {

	/**
	 * Email della persona che vuole effettuare la login
	 */
	private String Email;

	/**
	 * Password della persona che vuole effettuare la login
	 */
	private String password;

	/**
	 * Mappa per memorizzare le connessioni degli utenti
	 */
	SessionMap<String, String> sessionmap;

	/**
	 * Getter dell'attributo email
	 * 
	 * @return String
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * Setter dell'attributo email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * Getter dell'attributo password
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter dell'attributo password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Metodo che invoca il metodo validate e restituisce success se validate ha
	 * restituito true, failure altrimenti
	 * 
	 * @return String success se validate ha restituito true, failure altrimenti
	 */
	public String execute() {
		DBManagerLogin dbml = new DBManagerLogin();
		if (dbml.validate(Email, password)) {
			return "success";
		} else
			return "failure";
	}

	/**
	 * Metodo che memorizza il login dell'utente in una mappa
	 * 
	 * @param Map
	 *            mappa in cui sono memorizzato i login
	 */
	public void setSession(Map map) {
		SessionMap sessionmap = (SessionMap) map;
		sessionmap.put("login", "true");

	}

	/**
	 * Metodo che toglie dalla mappa la sessione
	 * 
	 * @return String
	 */
	public String logout() {
		if (sessionmap != null) {
			sessionmap.invalidate();
		}
		return "success";
	}
}
