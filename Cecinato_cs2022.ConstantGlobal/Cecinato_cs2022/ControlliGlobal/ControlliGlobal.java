package Cecinato_cs2022.ControlliGlobal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: ControlliGlobal </b>
 * <p>
 * Questa classe ha lo scopo di definire tutti i controlli globali da poter
 * riutilizzare in tutte le classi in cui si ha bisogno
 * 
 * 
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

public class ControlliGlobal {

	/**
	 * 
	 * <b> OPERAZIONE: upperCaseFirst </b>
	 * <p>
	 * Quest'operazione consente di controllare la correttazza di com'è stata
	 * scritta la stringa. Questo metodo consente di convertile la prima lettera di
	 * ogni parola in masiuscolo. Le restanti lettere verranno convertite in
	 * minuscolo.
	 * 
	 * @param stringa Variabile di tipo stringa che contiene le parole da
	 *                convertire.
	 * 
	 * @return result Variabile di tipo String che contente le parole convertite
	 */

	public static String upperCaseFirst(String stringa) {
		String result = "";
		List<String> s1 = Arrays.asList(stringa.split("\\s")); /// converte le parole della stringa in un array.Ogni
																/// volta che trova uno spazio inserisce la parola
																/// nell'array

		for (int i = 0; i < s1.size(); i++) {
			result += String.valueOf(s1.get(i)).substring(0, 1).toUpperCase(); /// converte la prima parola in maiuscolo
			;
			result += String.valueOf(s1.get(i)).substring(1, String.valueOf(s1.get(i)).length()).toLowerCase(); /// converte
																												/// le
																												/// restanti
																												/// parole
																												/// in
																												/// minuscolo
			if (i != s1.size() - 1) {
				result += " ";
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloSeriale </b>
	 * <p>
	 * Quest'operazione consente di controllare se il codice seriale è presente
	 * nella lista di tv fornite.
	 * 
	 * @param seriale    Variabile di tipo stringa che contiene il codice seriale di
	 *                   12 cifre del televisore
	 * @param televisore Lista di tipo Televisore che contente la lista di tv
	 *                   fornite
	 * @return result Array di oggetti contiene se il seriale è stato trovato oppure
	 *         no
	 */

	public static ArrayList<Object> controlloSeriale(String seriale, Set<Televisore> televisore) {
		ArrayList<Object> result = new ArrayList<Object>();
		if (StringUtils.isNotBlank(seriale)) {
			Iterator<Televisore> element = televisore.iterator();
			while (element.hasNext()) {
				Televisore tv = element.next();
				if (StringUtils.equals(tv.visualizzaSeriale(), seriale)) {
					result.add(0, true);
					result.add(1, tv);
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloPersona </b>
	 * <p>
	 * Quest'operazione consente di controllare se il codice fiscale o il codice
	 * dipendente della persona è presente nella lista persona
	 * 
	 * @param id      Variabile di tipo stringa che contiene il codice fiscale /
	 *                codice identicativo della perosona
	 * @param persona Lista contenete la lista di persone
	 * @return result Array di oggetti contiene se il codice identificativo / codice
	 *         fiscale è stato trovato oppure no
	 * @throws DipendenteException solleva un eccezione nel caso cui il meotodo di
	 *                             visualizzazione del codice fiscale viene
	 *                             utilizzato dal dipendente
	 * @throws ClienteException    solleva un eccezione nel caso cui il meotodo di
	 *                             visualizzazione del codice identificativo viene
	 *                             utilizzato dal cliente
	 */

	public static ArrayList<Object> controlloPersona(String id, Set<Persona> persona)
			throws DipendenteException, ClienteException {
		ArrayList<Object> result = new ArrayList<Object>();
		if (StringUtils.isNotBlank(id)) {
			Iterator<Persona> element = persona.iterator();
			while (element.hasNext()) {
				Persona pr = element.next();
				if ((pr instanceof Cliente && StringUtils.equals(pr.VisualizzaCodiceFiscale(), id))
						|| (pr instanceof Dipendente
								&& StringUtils.equals(id, pr.visualizzaCodiceIdentificativoDipendete()))) {
					result.add(0, true);
					result.add(1, pr);
				}
			}
		}
		return result;

	}
}
