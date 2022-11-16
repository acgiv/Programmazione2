package Cecinato_cs2022.ServiceCliente;

import java.util.Set;

import Cecinato_cs2022.ServicePersona.Persona;

/**
 * 
 * <p>
 * <b> INTERFACCIA: DaoCliente  </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di salvare e leggere su file dei clienti.
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

public interface DaoCliente {

	/**
	 * 
	 * <b> METODO: savenewALLClienti</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutti i clienti presenti nella lista di nome clienti passata come parametro.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * @param cliente lista che contiene tutti i clienti da salvate sul file
	 *      
	 */
	
	public void savenewALLClienti(Set<Persona> cliente) ;
	
	/**
	 * 
	 * <b> METODO: sreadFileAllClienti</b>
	 * <p>
	 * Questo metodo consente di leggere tutti i clienti salvati su file
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 *   
	 * @return lista di clienti letti dal file
	 */
	
	
	public Set<Persona> readFileAllClienti();

}
