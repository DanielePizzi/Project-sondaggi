package myUtilityDB;

/**
 * Classe che implementa i metodi per la connessione al DB
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public class ConfigurationDB {

	/**
	 * URL del DB
	 */
	private String url;

	/**
	 * Nome dell'user del DB
	 */
	private String user;

	/**
	 * Password del DB
	 */
	private String password;

	/**
	 * Costruttore di ConfigurationDB
	 * 
	 * @param url
	 *            URL del DB
	 * @param user
	 *            Nome dell'user del DB
	 * @param password
	 *            Password del DB
	 */
	public ConfigurationDB(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}

	/**
	 * Getter dell'attributo url
	 * 
	 * @return String
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * Getter dell'attributo user
	 * 
	 * @return String
	 */
	public String getUser() {
		return this.user;
	}

	/**
	 * Getter dell'attributo password
	 * 
	 * @return String
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Setter dell'attributo url
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Setter dell'attributo user
	 * 
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Setter dell'attributo password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
