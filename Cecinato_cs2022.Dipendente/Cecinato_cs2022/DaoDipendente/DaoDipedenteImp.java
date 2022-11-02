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
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.ServiceDipendente.DaoDipendente;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class DaoDipedenteImp implements DaoDipendente {
	private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
	private static Set<Televisore> listaTv = new HashSet<Televisore>();
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

	private void inizializateTv(Persona dip) {
		try {
			dip.visualizzaElencoTvRiparate().stream().forEach(s -> {
				try {
					new TelevisoreBase(s.getTvRiparata().visualizzaSeriale());
					listaTv.add(s.getTvRiparata());
				} catch (TelevisoreException e) {
					System.err.println(e.getMessage());
				}
			});
		
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

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
			} catch (PersonaException e) {
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
	
	public Set<Televisore> elencoTv(){
		return listaTv;
	}

}
