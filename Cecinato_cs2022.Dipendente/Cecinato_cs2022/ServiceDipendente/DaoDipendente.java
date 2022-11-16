package Cecinato_cs2022.ServiceDipendente;

import java.util.Set;

import Cecinato_cs2022.ServicePersona.Persona;


/**
 * 
 * <p>
 * <b> INTERFACCIA: DaoDipendente  </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di salvare e leggere su file dei dipendenti.
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

public interface DaoDipendente {
	
	/**
	 * 
	 * <b> METODO:  saveNewAllDipendente</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutti i dipendenti presenti nella lista di nome dipendente passata come parametro.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * @param dipendente lista che contiene tutti i dipendenti da salvate sul file
	 *      
	 */
	
	public void saveNewAllDipendente(Set<Persona> dipendente) ;
	
	/**
	 * 
	 * <b> METODO: readFileAllDipendente</b>
	 * <p>
	 * Questo metodo consente di leggere tutti i dipedenti salvati su file
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 *   
	 * @return lista di dipendenti letti dal file
	 */
	
	
	public Set<Persona> readFileAllDipendente();
	
	


}
