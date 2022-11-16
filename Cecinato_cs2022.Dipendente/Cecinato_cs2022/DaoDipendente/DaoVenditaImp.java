package Cecinato_cs2022.DaoDipendente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ServiceDipendente.DaoVendita;

/**
 * 
 * <p>
 * <b> CLASSE: DaoVenditaImp </b>
 * <p>
 * Quest'interfaccia ha lo scopo di implementare tutti i metodi che consento di
 * salvare e leggere su file le vendite.
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

public class DaoVenditaImp  implements DaoVendita{
	
	/**
	 * 
	 * <b> METODO: scriviFileVendita</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutte le vedinte presenti
	 * nella stringa di nome vendite passata come parametro.

	 * 
	 * @param vendite stringa che contiene tutti i dipendenti da salvate sul file
	 * 
	 */
	
	public  void scriviFileVendita(String vendite) {
	    String path = ConstantGlobal.PERCORSO_FILE_VENDITA;
	    try {
	        File file = new File(path); /// perso del file
	        FileWriter fw = new FileWriter(file); ///apertura del file
	        BufferedWriter bw = new BufferedWriter(fw); ///inizializzo il buffer per il salvataggio sul file
	        bw.write(vendite); /// scrivere su file la stringa contente le tv vendute
	        bw.flush();
	        bw.close();
	    }
	    catch(IOException e) {
	        System.err.println(e.getMessage());
	    }
	}
}
