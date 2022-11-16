package Cecinato_cs2022.DaoCliente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServiceCliente.DaoCliente;
import Cecinato_cs2022.ServicePersona.Persona;

/**
 * 
 * <p>
 * <b> CLASSE: DaoClienteImp </b>
 * <p>
 * Quest'interfaccia ha lo scopo di implementare tutti i metodi che consento di
 * salvare e leggere su file i clienti.
 * 
 * @author <i> Alberto Cecinato </i> <br>
 *         Gruppo 79<br>
 *         Matricola: 706576 <br>
 *         Email: <u> cecinatoa@gmail.com </u>
 * 
 * @version 1.0 <br>
 *          Date: 03.11.2022 <br>
 * 
 */


public class DaoClienteImp  implements DaoCliente{
	
	/**
	 * 
	 * <b> METODO: savenewALLtv</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutte i clienti presenti
	 * nella lista di nome cliente passata come parametro.
	 * <p>
	 * Il salvataggio consentirà di iterare l'elenco di clienti e salvare direttamente su file
	 * gli oggetti di tipo Persona
	 * 
	 * @param cliente lista che contiene tutti i clienti da salvate sul file
	 * 
	 */
	
	public void savenewALLClienti(Set<Persona> cliente) {
		FileOutputStream fileout = null;
		ObjectOutputStream oss;
		try {
			fileout = new FileOutputStream(ConstantGlobal.PERCORSO_FILE_CLIENTE);
			oss = new ObjectOutputStream(fileout);
			Iterator<Persona> element = cliente.iterator();
			while (element.hasNext()) {
				oss.writeObject(element.next());
				oss.flush();
			}
			oss.close();
		} catch (Exception e) {
		}
	}
	
	/**
	 * 
	 * <b> METODO: readFileAllClienti</b>
	 * <p>
	 * Questo metodo consente di leggere tutti clienti salvati su file
	 * 
	 * 
	 * @return cliente Variabile ti tipo Set che contiente tutti i clienti letti da file
	 */

	public Set<Persona> readFileAllClienti() {
		FileInputStream filein = null;
		Set<Persona> cliente = new HashSet<Persona>();
		try {
			filein = new FileInputStream(ConstantGlobal.PERCORSO_FILE_CLIENTE);
			try (ObjectInputStream input = new ObjectInputStream(filein)) {
				while (filein.available() > 0) {  /// legge il buffer se è diverso da zero
					Object o = input.readObject();
					if(o != null) {
						if(o instanceof Persona ) { /// controllo se l'instaza è di tipo Persona
							Persona cl = ((Persona)  o );
							new Cliente(cl.VisualizzaCodiceFiscale());/// inizializza il cliente per popolare la lista di codici fiscali 
							cliente.add(cl);
						}
					}
				}
				
			} catch (PersonaException | DipendenteException |ClassNotFoundException  | IOException e) {
				System.err.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return cliente;
	}

}
