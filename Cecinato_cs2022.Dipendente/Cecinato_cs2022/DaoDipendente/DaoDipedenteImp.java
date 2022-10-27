package Cecinato_cs2022.DaoDipendente;

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
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServiceDipendente.DaoDipendente;
import Cecinato_cs2022.ServicePersona.Persona;

public class DaoDipedenteImp implements DaoDipendente {

	@Override
	public void saveNewAllDipendente(Set<Persona> dipendente) {
		FileOutputStream fileout = null;
		ObjectOutputStream oss;
		try {
			fileout = new FileOutputStream(ConstantGlobal.PERCORSO_FILE_DIPENDENTE);
			oss = new ObjectOutputStream(fileout);
			Iterator<Persona> element = dipendente.iterator();
			while (element.hasNext()) {
				oss.writeObject(element.next());
				oss.flush();
			}
			oss.close();
		} catch (Exception e) {
		}
		
	}

	@Override
	public Set<Persona> readFileAllDipendente() {
		FileInputStream filein = null;
		Set<Persona> dipendente = new HashSet<Persona>();
		try {
			filein = new FileInputStream(ConstantGlobal.PERCORSO_FILE_DIPENDENTE);
			try (ObjectInputStream input = new ObjectInputStream(filein)) {
				while (filein.available() > 0) {
					Persona dl = ((Persona) input.readObject());
					if(dl != null) {
						new Dipendente(dl.visualizzaCodiceIdentificativoDipendete());
						dipendente.add(dl);
					}
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
				dipendente = new HashSet<Persona>();
			} catch (PersonaException e) {
				System.err.println(e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return dipendente;
	}

}
