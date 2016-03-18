package action;

import com.opensymphony.xwork2.ActionSupport;

import model.User;

/**
 * Action che permette di modificare il profilo di un utente
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ActionModifyProfile extends ActionSupport {

	/**
	 * Email dell'utente
	 */
	private String Email;

	/**
	 * Nuova email
	 */
	private String newEmail;

	/**
	 * Vecchia email
	 */
	private String oldEmail;

	/**
	 * Vecchia password
	 */
	private String oldpsw;

	/**
	 * Nuova password
	 */
	private String newpsw;

	/**
	 * Password dell'utente
	 */
	private String password;

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
	 *            Email dell'utente
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * Getter dell'attributo newEmail
	 * 
	 * @return String
	 */
	public String getNewEmail() {
		return newEmail;
	}

	/**
	 * Setter dell'attributo newEmail
	 * 
	 * @param newEmail
	 */
	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}

	/**
	 * Getter dell'attributo oldEmail
	 * 
	 * @return String
	 */
	public String getOldEmail() {
		return oldEmail;
	}

	/**
	 * Setter dell'attributo oldEmail
	 * 
	 * @param oldEmail
	 */
	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}

	/**
	 * Getter dell'attributo oldpsw
	 * 
	 * @return String
	 */
	public String getOldpsw() {
		return oldpsw;
	}

	/**
	 * Setter dell'attributo oldpsw
	 * 
	 * @param oldpsw
	 */
	public void setOldpsw(String oldpsw) {
		this.oldpsw = oldpsw;
	}

	/**
	 * Getter dell'attributo newpsw
	 * 
	 * @return String
	 */
	public String getNewpsw() {
		return newpsw;
	}

	/**
	 * Setter dell'attributo newpsw
	 * 
	 * @param newpsw
	 */
	public void setNewpsw(String newpsw) {
		this.newpsw = newpsw;
	}

	/**
	 *
	 * Metodo che invoca il metodo updatePassword e restituisce success se
	 * updatePassword ha restituito true, failure altrimenti
	 * 
	 * @return String success se updatePassword ha restituito true, failure
	 *         altrimenti
	 */
	public String modPsw() {
		User u = new User();
		if (u.updatePassword(Email, oldpsw, newpsw)) {
			return "success";
		} else {
			return "failure";
		}
	}

	/**
	 *
	 * Metodo che invoca il metodo updateEmail e restituisce success se
	 * updateEmail ha restituito true, failure altrimenti
	 * 
	 * @return String success se updateEmail ha restituito true, failure
	 *         altrimenti
	 */
	public String modEmail() {
		User c = new User();
		if (c.updateEmail(oldEmail, newEmail, password)) {
			return "success";
		} else {
			return "failure";
		}
	}
}