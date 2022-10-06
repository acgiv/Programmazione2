package Cecinato_cs2022.main;

import java.util.Scanner;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.Persona.Cliente;
import Cecinato_cs2022.PojoTelevisore.*;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;
import Cecinato_cs2022.pojoDipendente.Dipendente;

public class Azienda {
	public static void main(String[] args) throws PersonaException {	
		String scelta;
		String valoriUtente;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("scegli che tipologia di televisore Vuoi inserire");
			System.out.println("Seleziona 1 se televisore di tipo Base");
			System.out.println("Seleziona 2 se Televisore di tipo Medio");
			System.out.println("Seleziona 3 se Televisore di tipo Avanzato");
			scelta =s.nextLine();
			switch (scelta) {
			case "1":
				boolean result;
				System.out.println("Inserisci il seriale dalla televisore.");
				
				System.out.println("Il seriale è composto da 12 numeri.");
				valoriUtente = s.nextLine();
				Televisore tv;
				try {
					tv = new TelevisoreBase(valoriUtente);
					do{
						System.out.println("Inserisci La marca dalla televisore.");
						System.out.println("Se vuoi visualizzare le marche dei televisori inserisca 1");
						if(s.nextLine().equals("1") ) {
							tv.visualizzanomiMarcheTv();
						}
						System.out.println("Inserisci La marca dalla televisore.");
						valoriUtente = s.nextLine();
						result =tv.addMarcaTv(tv, valoriUtente);
					}while(result==false);
					
					do{
						System.out.println("Inserisci l'altezza dalla televisore.");
						System.out.println("Attenzione l'altezza minima della tv è:"+ConstantGlobal.ALTEZZA_MINIMA_TV);
						System.out.println("L'altezza massima è:" + ConstantGlobal.ALTEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result =tv.addAltezzaTv(tv, valoriUtente);
					}while(result==false);
					do{
						System.out.println("Inserisci la larghezza dalla televisore.");
						System.out.println("Attenzione la larghezza minima della tv è:"+ConstantGlobal.LARGHEZZA_MINIMA_TV);
						System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result =tv.addLarghezzaTv(tv, valoriUtente);
					}while(result==false);
					do{
						System.out.println("Inserisci la diagonale dalla televisore.");
						System.out.println("Attenzione la diagonale minima della tv è:"+ConstantGlobal.DIAGONALE_MINIMA_TV);
						System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result =tv.addDiagonaleTv(tv, valoriUtente);
					}while(result==false);
					do{
						System.out.println("Inserisci La risoluzione dalla televisore.");
						System.out.println("Se vuoi visualizzare le risoluzione delle tv");
						if(s.nextLine().equals("1") ) {
							tv.visualizzaRisoluzioniSchermiTv();;
						}
						System.out.println("Inserisci la risoluzione dalla televisore.");
						valoriUtente = s.nextLine();
						result =tv.addRisoluzioneTv(tv, valoriUtente);
					}while(result==false);
					do{
						System.out.println("Inserisci La tipologia di schermo dalla televisore.");
						System.out.println("Se vuoi visualizzare le tipologie di schermo delle tv");
						if(s.nextLine().equals("1") ) {
							tv.visualizzaTipologieSchermoTv();
						}
						System.out.println("Inserisci la tipologia di schermo dalla televisore.");
						valoriUtente = s.nextLine();
						result =tv.addTiposchermoTv(tv, valoriUtente);
					}while(result==false);			
					
				} catch (TelevisoreException e) {
					System.err.println(e.getMessage());
				}

				break;
			case "2":
				break;
			case "3":
			break;
			}
		}

	}
}
