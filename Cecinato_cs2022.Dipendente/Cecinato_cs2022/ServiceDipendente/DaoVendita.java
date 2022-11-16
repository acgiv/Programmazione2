package Cecinato_cs2022.ServiceDipendente;

/**
 * 
 * <p>
 * <b> INTERFACCIA: DaoVendita </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di salvare e leggere su file delle vendite.
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


public interface DaoVendita {
	
	/**
	 * 
	 * <b> METODO:  scriviFileVendita</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutte le vendite presenti nella stringa di nome vendite passata come parametro.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * @param vendite Variabile di tipo String che contiene tutte le vendite da salvate sul file
	 *      
	 */
	
	public void scriviFileVendita(String vendite);

}
