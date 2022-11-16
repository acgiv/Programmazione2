package Cecinato_cs2022.TelevisoreService;

import java.util.Set;
/**
 * 
 * <p>
 * <b> INTERFACCIA: DaoTelevisore  </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di salvare e leggere su file i televisori.
 * 
 * @author <i> Alberto Cecinato </i> <br>
 *         Gruppo 79<br>
 *         Matricola: 706576 <br>
 *         Email: <u> cecinatoa@gmail.com </u>
 * 
 * @version 1.0 <br>
 *          Date: 03.11.2022 <br>
 * 
 *
 */
public interface DaoTelevisore {
	
	/**
	 * 
	 * <b> METODO: readFileAllTelevisore</b>
	 * <p>
	 * Questo metodo consente di leggere tutti i televisori salvati su file
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 *   
	 * @return lista di televisori letti dal file
	 */
	
	public Set<Televisore> readFileAllTelevisore();
	/**
	 * 
	 * <b> METODO: savenewALLtv</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutte le televisioni presenti nella lista di nome tv passata come parametro.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * @param tv lista che contiene tutte le televisioni da salvate sul file
	 *      
	 */
	public void savenewALLtv(Set<Televisore> tv);
}
