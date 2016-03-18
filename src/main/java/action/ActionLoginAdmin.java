package action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dbManager.DBManagerAdministrator;

/**
 * Action che permette di effettuare la login all'admin
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionLoginAdmin extends ActionSupport implements SessionAware {

	/**
	 * Email dell'admin
	 */
	private String Email;

	/**
	 * Password dell'admin
	 */
	private String password;

	/**
	 * Mappa per memorizzare le connessioni dell'admin
	 */
	SessionMap<String, Object> sessionmap;

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
	 * Metodo che invoca il metodo validateAdmin e restituisce success se
	 * validateAdmin ha restituito true, failure altrimenti
	 * 
	 * @return String success se validateAdmin ha restituito true, failure
	 *         altrimenti
	 */
	public String execute() {
		DBManagerAdministrator dbml = new DBManagerAdministrator();
		if (dbml.validateAdmin(Email, password)) {
			sessionmap.put("email", Email);

			return "success";
		} else
			return "failure";

	}

	public void setSession(Map<String, Object> sessionmap) {
		this.sessionmap = (SessionMap<String, Object>) sessionmap;
	}

	public SessionMap<String, Object> getSessionmap() {
		return sessionmap;
	}

	public void setSessionmap(SessionMap<String, Object> sessionmap) {
		this.sessionmap = sessionmap;
	}
}