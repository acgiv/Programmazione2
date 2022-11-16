package Cecinato_cs2022.DaoTelevisore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.TelevisoreService.DaoTelevisore;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE:DaoTelevisoreImp </b>
 * <p>
 * Quest'interfaccia ha lo scopo di implementare tutti i metodi che consento di
 * salvare e leggere su file i televisori.
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

public class DaoTelevisoreImp implements DaoTelevisore {

	/**
	 * 
	 * <b> METODO: savenewALLtv</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutte le televisioni presenti
	 * nella lista di nome tv passata come parametro.
	 * <p>
	 * Il salvataggio consentirà di iterare l'elenco di televisori e salvare direttamente su file
	 * gli oggetti di tipo Televisore
	 * 
	 * @param tv lista che contiene tutte le televisioni da salvate sul file
	 * 
	 */

	public void savenewALLtv(Set<Televisore> tv) {
		FileOutputStream fileout = null;
		ObjectOutputStream oss;
		try {
			fileout = new FileOutputStream(ConstantGlobal.PERCORSO_FILE_TELEVISORE);
			oss = new ObjectOutputStream(fileout);
			Iterator<Televisore> element = tv.iterator();
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
	 * <b> METODO: readFileAllTelevisore</b>
	 * <p>
	 * Questo metodo consente di leggere tutti i televisori salvati su file
	 * 
	 * 
	 * @return tv Variabile ti tipo Set  che contiente tutte le tv lette da file
	 */

	public Set<Televisore> readFileAllTelevisore() {
		FileInputStream filein = null;
		Set<Televisore> tv = new HashSet<Televisore>();
		try {
			filein = new FileInputStream(ConstantGlobal.PERCORSO_FILE_TELEVISORE);
			try (ObjectInputStream input = new ObjectInputStream(filein)) {
				while (filein.available() > 0) { /// legge il buffer se è diverso da zero
					Object o = input.readObject(); 
					if (o != null) {
						if (o instanceof Televisore) { /// controllo se l'instaza è di tipo Televisore
							new TelevisoreBase(((Televisore) o).visualizzaSeriale()); /// inizializza la tv per popolare la lista di seriali 
							tv.add(((Televisore) o));
						}
					}
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			} catch (TelevisoreException e) {
				System.err.println(e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (FileNotFoundException e) {
			tv = new HashSet<Televisore>();
		}
		return tv;
	}

}
