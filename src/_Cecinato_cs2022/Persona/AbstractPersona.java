package _Cecinato_cs2022.Persona;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ExceptionPersona.PersonaException;

public abstract class AbstractPersona {

	private final static Set<String> elencoCodiceIdentificativo = new TreeSet<String>();
	private final static Set<String> elencoCodiceFiscale = new TreeSet<String>();
	
	final boolean controlloIdentificativo(String codiceIdentidicativo) throws PersonaException {
		boolean result = true;
		if (codiceIdentidicativo.matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_IDENTIFICATIVO)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (element.next().equals(codiceIdentidicativo))
					result = false;
			}
			if (result) {
				elencoCodiceIdentificativo.add(codiceIdentidicativo);
			} else {
				throw new PersonaException("Il codice Identificativo esiste già");
			}
		} else {
			throw new PersonaException("Il codice Identificativo è errato");
		}
		return result;
	}
	
	final boolean controlloCodiceFiscale(String codiceFiscale) throws PersonaException {
		boolean result = true;
		if (codiceFiscale.matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_FISCALE)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (element.next().equals(codiceFiscale))
					result = false;
			}
			if (result) {
				elencoCodiceFiscale.add(codiceFiscale);
			} else {
				throw new PersonaException("Il codice fiscale esiste già");
			}
		} else {
			throw new PersonaException("Il codice fiscale è errato");
		}
		return result;
	}
	
		
	

}
