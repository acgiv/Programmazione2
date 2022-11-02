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

public class ControlliGlobal {

	public static String upperCaseFirst(String stringa) {
		String result = "";
		List<String> s1 = Arrays.asList(stringa.split("\\s"));

		for (int i = 0; i < s1.size(); i++) {
			result += String.valueOf(s1.get(i)).substring(0, 1).toUpperCase();
			;
			result += String.valueOf(s1.get(i)).substring(1, String.valueOf(s1.get(i)).length()).toLowerCase();
			if (i != s1.size() - 1) {
				result += " ";
			}
		}
		return result;
	}

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
	
	public static ArrayList<Object> controlloPersona(String id, Set<Persona> persona) throws  DipendenteException, ClienteException {
		ArrayList<Object> result = new ArrayList<Object>();
		if (StringUtils.isNotBlank(id)) {
			Iterator<Persona> element = persona.iterator();
			while (element.hasNext()) {
					Persona pr = element.next();
				if ((pr instanceof Cliente && StringUtils.equals(pr.VisualizzaCodiceFiscale(), id)) ||(pr instanceof Dipendente && StringUtils.equals(id, pr.visualizzaCodiceIdentificativoDipendete()))) {
					result.add(0, true);
					result.add(1, pr);
				}
			}
		}
		return result;

	}
}
