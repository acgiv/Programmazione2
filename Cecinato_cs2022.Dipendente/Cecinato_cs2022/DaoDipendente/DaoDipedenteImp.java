package Cecinato_cs2022.DaoDipendente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.Dipendente.Vendita;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.ServiceDipendente.DaoDipendente;
import Cecinato_cs2022.ServicePersona.Persona;


/**
 * 
 * <p>
 * <b> CLASSE: DaoDipedenteImp </b>
 * <p>
 * Quest'interfaccia ha lo scopo di implementare tutti i metodi che consento di
 * salvare e leggere su file i dipendenti.
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

public class DaoDipedenteImp implements DaoDipendente {
	private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);   /// impostato il format della data = dd/mm/aaaa
	
	
	/**
	 * 
	 * <b> METODO: saveNewAllDipendente</b>
	 * <p>
	 * Questo metodo consente di scrivere sul file tutte i dipendenti presenti
	 * nella lista di nome dipendente passata come parametro.
	 * <p>
	 * Il salvataggio consentirà di iterare l'elenco di dipendenti e salvare direttamente su file
	 * gli oggetti di tipo Persona
	 * 
	 * @param dipendente lista che contiene tutti i dipendente da salvate sul file
	 * 
	 */
	
	@Override
	public void saveNewAllDipendente(Set<Persona> dipendente) {
		FileOutputStream fileout = null;
		ObjectOutputStream oss;
		Persona dp = null;
		try {
			fileout = new FileOutputStream(ConstantGlobal.PERCORSO_FILE_DIPENDENTE);
			oss = new ObjectOutputStream(fileout);

			Iterator<Persona> element = dipendente.iterator();
			while (element.hasNext()) {
				dp = element.next();
				oss.writeObject(dp);
				oss.flush();
			}
			oss.writeObject(sdf.format(Dipendente.getDataGiorno()));
			oss.close();
		} catch (Exception e) {
		}

	}
	
	/**
	 * 
	 * <b> METODO: inizializateTv</b>
	 * <p>
	 * Questo metodo consente di inizializzare i dipendenti letti da file
	 * 
	 * 
	 */
	
	
	private void inizializateTv(Persona dip) {
		try {
			dip.visualizzaElencoTvRiparate().stream().forEach(s -> {
				try {
					new TelevisoreBase(s.getTvRiparata().visualizzaSeriale()); /// iniziazzato il seriale del televisore
				} catch (TelevisoreException e) {
					System.err.println(e.getMessage());
				}
			});
			dip.visualizzaElencoTvVendute().stream().forEach(s -> {
				try {
					/// inizializzo le vendite fatte sul dipendete
					new Vendita(s.getIdDipendente(), s.getPrezzoVedita(), s.getTv(),sdf.format(s.getDataVendita()), s.getCliente());
				} catch (TelevisoreException e) {
					System.err.println(e.getMessage());
				} catch (ParseException e) {
					System.err.println(e.getMessage());
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
				}
			});
		
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * 
	 * <b> METODO: readFileAllDipendente</b>
	 * <p>
	 * Questo metodo consente di leggere tutti dipedneti salvati su file
	 * 
	 * 
	 * @return dipendente Variabile ti tipo Set che contiente tutti i dipendenti letti da file
	 */
	
	@Override
	public Set<Persona> readFileAllDipendente() {
		FileInputStream filein = null;
		Persona dl = null;
		Set<Persona> dipendente = new HashSet<Persona>();
		try {
			filein = new FileInputStream(ConstantGlobal.PERCORSO_FILE_DIPENDENTE);
			try (ObjectInputStream input = new ObjectInputStream(filein)) {
				while (filein.available() > 0) {
					Object o = input.readObject();
					if (o != null) {
						if (o instanceof Persona) {
							dl = (Persona) o;
							new Dipendente(dl.visualizzaCodiceIdentificativoDipendete());
							dipendente.add(dl);
							inizializateTv(dl);

						} else if (o instanceof String) {
							Dipendente.setDataGiorno(sdf.parse((String.valueOf(o))));
						}
					}
				}

			} catch (IOException e) {
				System.err.println(e.getMessage());
			} catch (ParseException e) {
				System.err.println(e.getMessage());
			} catch (DipendenteException e) {
				System.err.println(e.getMessage());
			} catch (ClienteException e) {
				System.err.println(e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (FileNotFoundException e) {
			dipendente = new HashSet<Persona>();
		}
		return dipendente;
	}
	

}
