package dbManager;

import myUtilityDB.*;

/**
 * Classe utilizzata per la gestione del DB
 * 
 * @author GruppoPizzi
 * @version 17-03-2016
 */
public abstract class DBManager {
	/**
	 * Configurazione del DB
	 */
	ConfigurationDB c = new ConfigurationDB("jdbc:mysql://localhost/sondaggi", "root", "1234");;
	
	/**
	 * Oggetto SQLOperation
	 */
	SQLOperation op = new SQLOperation(c);;
}
