package Cecinato_cs2022.Azienda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.Dipendente.Riparazione;
import Cecinato_cs2022.Dipendente.Vendita;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreAvanzato;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.PojoTelevisore.TelevisoreMedio;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class FornitoreTv {

	private Televisore tv;
	private String valoriUtente;
	boolean result;
	Scanner s = new Scanner(System.in);

	public Televisore fornisciTvBase() {
		try {
			System.out.println("Inserisci il seriale dalla televisore.");
			System.out.println("Il seriale è composto da 12 numeri.");
			valoriUtente = s.nextLine();
			tv = new TelevisoreBase(valoriUtente);

			do {
				System.out.println("\"Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
				if (s.nextLine().equals("1")) {
					tv.visualizzanomiMarcheTv();
				}
				System.out.println("Inserisci La marca dalla televisore.");
				valoriUtente = s.nextLine();
				result = tv.addMarcaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci l'altezza dalla televisore.");
				System.out.println(
						"Attenzione l'altezza del televisore deve essere maggiore o uguale dell altezza minima di: "
								+ ConstantGlobal.ALTEZZA_MINIMA_TV);
				System.out.println(
						"oppure minore o uguale dell'altezza massima di: :" + ConstantGlobal.ALTEZZA_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addAltezzaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci la larghezza dalla televisore.");
				System.out.println("Attenzione la larghezza minima della tv è:" + ConstantGlobal.LARGHEZZA_MINIMA_TV);
				System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addLarghezzaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci la diagonale dalla televisore.");
				System.out.println("Attenzione la diagonale minima della tv è:" + ConstantGlobal.DIAGONALE_MINIMA_TV);
				System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addDiagonaleTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci 1 se vuoi visualizzare la risoluzione della tv");
				if (s.nextLine().equals("1")) {
					tv.visualizzaRisoluzioniSchermiTv();
					;
				}
				System.out.println("Inserisci la risoluzione dello schermo dal televisore.");
				valoriUtente = s.nextLine();
				result = tv.addRisoluzioneTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
				if (s.nextLine().equals("1")) {
					tv.visualizzaTipologieSchermoTv();
				}
				System.out.println("Inserisci la tipologia di schermo dalla televisore.");
				valoriUtente = s.nextLine();
				result = tv.addTiposchermoTv(valoriUtente);
			} while (result == false);
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage());
		}
		return tv;
	}

	public void addcomponentiTvBase(Set<Televisore> listaTvFornite) {

		System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaTvFornite(listaTvFornite));
		}
		System.out.println("Inserisci il seriale dalla televisore che vuoi modficare.");
		System.out.println("Il seriale è composto da 12 numeri.");
		valoriUtente = s.nextLine();
		ArrayList<Object> risultato = ControlliGlobal.controlloSeriale(valoriUtente, listaTvFornite);
		if (!risultato.isEmpty()) {
			if (risultato.get(0).equals(true)) {
				do {
					Televisore tv = (Televisore) risultato.get(1);
					System.out.println("Inserisci 1 se vuoi aggiungere la marca della tv");
					System.out.println("Inserisci 2 se vuoi aggiungere l' altezza della tv");
					System.out.println("Inserisci 3 se vuoi aggiungere la larghezza della tv");
					System.out.println("Inserisci 4 se vuoi aggiungere la diagonale della tv");
					System.out.println("Inserisci 5 se vuoi aggiungere la risolzione dello shermo della tv");
					System.out.println("Inserisci 6 se vuoi aggiungere la tipologia dello schermo della tv");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						System.out.println("\"Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
						if (s.nextLine().equals("1")) {
							tv.visualizzanomiMarcheTv();
						}
						System.out.println("Inserisci La marca dalla televisore.");
						valoriUtente = s.nextLine();
						result = tv.addMarcaTv(valoriUtente);
						break;
					case "2":
						System.out.println("Inserisci l'altezza dalla televisore.");
						System.out.println(
								"Attenzione l'altezza del televisore deve essere maggiore o uguale dell altezza minima di: "
										+ ConstantGlobal.ALTEZZA_MINIMA_TV);
						System.out.println("oppure minore o uguale dell'altezza massima di: :"
								+ ConstantGlobal.ALTEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result = tv.addAltezzaTv(valoriUtente);
						break;
					case "3":
						System.out.println("Inserisci la larghezza dalla televisore.");
						System.out.println(
								"Attenzione la larghezza minima della tv è:" + ConstantGlobal.LARGHEZZA_MINIMA_TV);
						System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result = tv.addLarghezzaTv(valoriUtente);
						break;
					case "4":
						System.out.println("Inserisci la diagonale dalla televisore.");
						System.out.println(
								"Attenzione la diagonale minima della tv è:" + ConstantGlobal.DIAGONALE_MINIMA_TV);
						System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result = tv.addDiagonaleTv(valoriUtente);
						break;
					case "5":
						System.out.println("Inserisci 1 se vuoi visualizzare la risoluzione della tv");
						if (s.nextLine().equals("1")) {
							tv.visualizzaRisoluzioniSchermiTv();
							;
						}
						System.out.println("Inserisci la risoluzione dello schermo dal televisore.");
						valoriUtente = s.nextLine();
						result = tv.addRisoluzioneTv(valoriUtente);
						break;
					case "6":
						System.out
								.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
						if (s.nextLine().equals("1")) {
							tv.visualizzaTipologieSchermoTv();
						}
						System.out.println("Inserisci la tipologia di schermo dalla televisore.");
						valoriUtente = s.nextLine();
						result = tv.addTiposchermoTv(valoriUtente);
						break;
					default:
						System.out.println("Hai inserito un valore che non è presente nell'elenco");
						break;
					}
					System.out.println("Inserisci 1 se vuoi aggiungere altre informazioni su questa tv");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			}
		}
	}

	public Televisore fornisciTvMedio() {
		try {
			System.out.println("Inserisci il seriale dalla televisore.");
			System.out.println("Il seriale è composto da 12 numeri.");
			valoriUtente = s.nextLine();
			tv = new TelevisoreMedio(valoriUtente);
			do {
				System.out.println("\"Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
				System.out.println("Se vuoi visualizzare le marche dei televisori inserisca 1");
				if (s.nextLine().equals("1")) {
					tv.visualizzanomiMarcheTv();
				}
				System.out.println("Inserisci La marca dalla televisore.");
				valoriUtente = s.nextLine();
				result = tv.addMarcaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci l'altezza dalla televisore.");
				System.out.println(
						"Attenzione l'altezza del televisore deve essere maggiore o uguale dell altezza minima di: "
								+ ConstantGlobal.ALTEZZA_MINIMA_TV);
				System.out.println(
						"oppure minore o uguale dell'altezza massima di: :" + ConstantGlobal.ALTEZZA_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addAltezzaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci la larghezza dalla televisore.");
				System.out.println("Attenzione la larghezza minima della tv è:" + ConstantGlobal.LARGHEZZA_MINIMA_TV);
				System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addLarghezzaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci la diagonale dalla televisore.");
				System.out.println("Attenzione la diagonale minima della tv è:" + ConstantGlobal.DIAGONALE_MINIMA_TV);
				System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addDiagonaleTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci 1 se vuoi visualizzare le risoluzioni delle tv");
				System.out.println("Se vuoi visualizzare le risoluzione delle tv");
				if (s.nextLine().equals("1")) {
					tv.visualizzaRisoluzioniSchermiTv();
					;
				}
				System.out.println("Inserisci la risoluzione dello schermoschermo dal televisore.");
				valoriUtente = s.nextLine();
				result = tv.addRisoluzioneTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
				System.out.println("Se vuoi visualizzare le tipologie di schermo delle tv");
				if (s.nextLine().equals("1")) {
					tv.visualizzaTipologieSchermoTv();
				}
				System.out.println("Inserisci la tipologia di schermo dalla televisore.");
				valoriUtente = s.nextLine();
				result = tv.addTiposchermoTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println(
						"Inserisci il numero degli usb presenti nella tv. Il numero di usb da inserire è uguale a: "
								+ ConstantGlobal.NUM_USB_TV_MEDIO);
				valoriUtente = s.nextLine();
				result = false;
				if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_USB_TV_MEDIO)))
					result = tv.addNumberUsbTv(valoriUtente);
			} while (result == false);
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage());
		}
		return tv;
	}

	public void addcomponentiTvMedio(Set<Televisore> listaTvFornite) {

		System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaTvFornite(listaTvFornite));
		}
		System.out.println("Inserisci il seriale dalla televisore che vuoi modficare.");
		System.out.println("Il seriale è composto da 12 numeri.");
		valoriUtente = s.nextLine();
		ArrayList<Object> risultato = ControlliGlobal.controlloSeriale(valoriUtente, listaTvFornite);
		if (!risultato.isEmpty()) {
			if (risultato.get(0).equals(true)) {
				do {
					Televisore tv = (Televisore) risultato.get(1);
					System.out.println("Inserisci 1 se vuoi aggiungere la marca della tv");
					System.out.println("Inserisci 2 se vuoi aggiungere l' altezza della tv");
					System.out.println("Inserisci 3 se vuoi aggiungere la larghezza della tv");
					System.out.println("Inserisci 4 se vuoi aggiungere la diagonale della tv");
					System.out.println("Inserisci 5 se vuoi aggiungere la risolzione dello shermo della tv");
					System.out.println("Inserisci 6 se vuoi aggiungere la tipologia dello schermo della tv");
					System.out.println("Inserisci 7 se vuoi aggiungere il numero di usb della tv");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						System.out.println("\"Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
						if (s.nextLine().equals("1")) {
							tv.visualizzanomiMarcheTv();
						}
						System.out.println("Inserisci La marca dalla televisore.");
						valoriUtente = s.nextLine();
						tv.addMarcaTv(valoriUtente);
						break;
					case "2":
						System.out.println("Inserisci l'altezza dalla televisore.");
						System.out.println(
								"Attenzione l'altezza del televisore deve essere maggiore o uguale dell altezza minima di: "
										+ ConstantGlobal.ALTEZZA_MINIMA_TV);
						System.out.println("oppure minore o uguale dell'altezza massima di: :"
								+ ConstantGlobal.ALTEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						tv.addAltezzaTv(valoriUtente);
						break;
					case "3":
						System.out.println("Inserisci la larghezza dalla televisore.");
						System.out.println(
								"Attenzione la larghezza minima della tv è:" + ConstantGlobal.LARGHEZZA_MINIMA_TV);
						System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result = tv.addLarghezzaTv(valoriUtente);
						break;
					case "4":
						System.out.println("Inserisci la diagonale dalla televisore.");
						System.out.println(
								"Attenzione la diagonale minima della tv è:" + ConstantGlobal.DIAGONALE_MINIMA_TV);
						System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
						valoriUtente = s.nextLine();
						tv.addDiagonaleTv(valoriUtente);
						break;
					case "5":
						System.out.println("Inserisci 1 se vuoi visualizzare la risoluzione della tv");
						if (s.nextLine().equals("1")) {
							tv.visualizzaRisoluzioniSchermiTv();
							;
						}
						System.out.println("Inserisci la risoluzione dello schermo dal televisore.");
						valoriUtente = s.nextLine();
						tv.addRisoluzioneTv(valoriUtente);
						break;
					case "6":
						System.out
								.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
						if (s.nextLine().equals("1")) {
							tv.visualizzaTipologieSchermoTv();
						}
						System.out.println("Inserisci la tipologia di schermo dalla televisore.");
						valoriUtente = s.nextLine();
						tv.addTiposchermoTv(valoriUtente);
						break;
					case "7":
						System.out.println(
								"Inserisci il numero degli usb presenti nella tv. Il numero di usb da inserire è uguale a: "
										+ ConstantGlobal.NUM_USB_TV_MEDIO);
						valoriUtente = s.nextLine();
						if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_USB_TV_MEDIO)))
							tv.addNumberUsbTv(valoriUtente);
						break;
					default:
						System.out.println("Hai inserito un valore che non è presente nell'elenco");
						break;
					}
					System.out.println("Inserisci 1 se vuoi aggiungere altre informazioni su questa tv");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			}
		}
	}

	public Televisore fornisciTvAvanzato() {
		try {
			System.out.println("Inserisci il seriale dalla televisore.");
			System.out.println("Il seriale è composto da 12 numeri.");
			valoriUtente = s.nextLine();
			tv = new TelevisoreAvanzato(valoriUtente);
			do {
				System.out.println("\"Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
				System.out.println("Se vuoi visualizzare le marche dei televisori inserisca 1");
				if (s.nextLine().equals("1")) {
					tv.visualizzanomiMarcheTv();
				}
				System.out.println("Inserisci La marca dalla televisore.");
				valoriUtente = s.nextLine();
				result = tv.addMarcaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci l'altezza dalla televisore.");
				System.out.println(
						"Attenzione l'altezza del televisore deve essere maggiore o uguale dell altezza minima di: "
								+ ConstantGlobal.ALTEZZA_MINIMA_TV);
				System.out.println(
						"oppure minore o uguale dell'altezza massima di: :" + ConstantGlobal.ALTEZZA_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addAltezzaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci la larghezza dalla televisore.");
				System.out.println("Attenzione la larghezza minima della tv è:" + ConstantGlobal.LARGHEZZA_MINIMA_TV);
				System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addLarghezzaTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci la diagonale dalla televisore.");
				System.out.println("Attenzione la diagonale minima della tv è:" + ConstantGlobal.DIAGONALE_MINIMA_TV);
				System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
				valoriUtente = s.nextLine();
				result = tv.addDiagonaleTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci 1 se vuoi visualizzare le risoluzioni delle tv");
				System.out.println("Se vuoi visualizzare le risoluzione delle tv");
				if (s.nextLine().equals("1")) {
					tv.visualizzaRisoluzioniSchermiTv();
					;
				}
				System.out.println(
						"Inserisci 1 se vuoi visualizzare la risoluzione dello schermoschermo dal televisore.");
				valoriUtente = s.nextLine();
				result = tv.addRisoluzioneTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
				System.out.println("Se vuoi visualizzare le tipologie di schermo delle tv");
				if (s.nextLine().equals("1")) {
					tv.visualizzaTipologieSchermoTv();
				}
				System.out.println("Inserisci la tipologia di schermo dalla televisore.");
				valoriUtente = s.nextLine();
				result = tv.addTiposchermoTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println(
						"Inserisci il numero degli usb presenti nella tv. Il numero di usb da inserire è uguale a: "
								+ ConstantGlobal.NUMERO_USB_TV_AVANZATO);
				valoriUtente = s.nextLine();
				result = false;
				if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUMERO_USB_TV_AVANZATO)))
					result = tv.addNumberUsbTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println(
						"Inserisci il numero degli ingressi hdmi presenti nella tv. Il numero di hdmi da inserire è uguale a: "
								+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
				valoriUtente = s.nextLine();
				result = false;
				if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_HDMI_TV_AVANZATO)))
					result = tv.addNumberHdmiTv(valoriUtente);
			} while (result == false);
			do {
				System.out.println(
						"Inserisci il numero degli smart tv presenti nella tv. Il numero dei smart tv da inserire è uguale a: "
								+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
				valoriUtente = s.nextLine();
				result = false;
				if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_SMART_TV_AVANZATO)))
					result = tv.addNumberSmartTv(valoriUtente);
			} while (result == false);
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage());
		}
		return tv;
	}

	public void addcomponentiTvAvanzato(Set<Televisore> listaTvFornite) {

		System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaTvFornite(listaTvFornite));
		}
		System.out.println("Inserisci il seriale dalla televisore che vuoi modficare.");
		System.out.println("Il seriale è composto da 12 numeri.");
		valoriUtente = s.nextLine();
		ArrayList<Object> risultato = ControlliGlobal.controlloSeriale(valoriUtente, listaTvFornite);
		if (!risultato.isEmpty()) {
			if (risultato.get(0).equals(true)) {
				do {
					Televisore tv = (Televisore) risultato.get(1);
					System.out.println("Inserisci 1 se vuoi aggiungere la marca della tv");
					System.out.println("Inserisci 2 se vuoi aggiungere l' altezza della tv");
					System.out.println("Inserisci 3 se vuoi aggiungere la larghezza della tv");
					System.out.println("Inserisci 4 se vuoi aggiungere la diagonale della tv");
					System.out.println("Inserisci 5 se vuoi aggiungere la risolzione dello shermo della tv");
					System.out.println("Inserisci 6 se vuoi aggiungere la tipologia dello schermo della tv");
					System.out.println("Inserisci 7 se vuoi aggiungere il numero di usb della tv");
					System.out.println("Inserisci 7 se vuoi aggiungere il numero di hdmi della tv");
					System.out.println("Inserisci 7 se vuoi aggiungere il numero di smart tv della tv");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						System.out.println("\"Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
						if (s.nextLine().equals("1")) {
							tv.visualizzanomiMarcheTv();
						}
						System.out.println("Inserisci La marca dalla televisore.");
						valoriUtente = s.nextLine();
						tv.addMarcaTv(valoriUtente);
						break;
					case "2":
						System.out.println("Inserisci l'altezza dalla televisore.");
						System.out.println(
								"Attenzione l'altezza del televisore deve essere maggiore o uguale dell altezza minima di: "
										+ ConstantGlobal.ALTEZZA_MINIMA_TV);
						System.out.println("oppure minore o uguale dell'altezza massima di: :"
								+ ConstantGlobal.ALTEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						tv.addAltezzaTv(valoriUtente);
						break;
					case "3":
						System.out.println("Inserisci la larghezza dalla televisore.");
						System.out.println(
								"Attenzione la larghezza minima della tv è:" + ConstantGlobal.LARGHEZZA_MINIMA_TV);
						System.out.println("Attenzione la larghezza massima è:" + ConstantGlobal.LARGHEZZA_MASSIMA_TV);
						valoriUtente = s.nextLine();
						result = tv.addLarghezzaTv(valoriUtente);
						break;
					case "4":
						System.out.println("Inserisci la diagonale dalla televisore.");
						System.out.println(
								"Attenzione la diagonale minima della tv è:" + ConstantGlobal.DIAGONALE_MINIMA_TV);
						System.out.println("Attenzione la diagonale massima è:" + ConstantGlobal.DIAGONALE_MASSIMA_TV);
						valoriUtente = s.nextLine();
						tv.addDiagonaleTv(valoriUtente);
						break;
					case "5":
						System.out.println("Inserisci 1 se vuoi visualizzare la risoluzione della tv");
						if (s.nextLine().equals("1")) {
							tv.visualizzaRisoluzioniSchermiTv();
							;
						}
						System.out.println("Inserisci la risoluzione dello schermo dal televisore.");
						valoriUtente = s.nextLine();
						tv.addRisoluzioneTv(valoriUtente);
						break;
					case "6":
						System.out
								.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
						if (s.nextLine().equals("1")) {
							tv.visualizzaTipologieSchermoTv();
						}
						System.out.println("Inserisci la tipologia di schermo dalla televisore.");
						valoriUtente = s.nextLine();
						tv.addTiposchermoTv(valoriUtente);
						break;
					case "7":
						System.out.println(
								"Inserisci il numero degli usb presenti nella tv. Il numero di usb da inserire è uguale a: "
										+ ConstantGlobal.NUM_USB_TV_MEDIO);
						valoriUtente = s.nextLine();
						if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_USB_TV_MEDIO)))
							tv.addNumberUsbTv(valoriUtente);
						break;
					case "8":
						System.out.println(
								"Inserisci il numero degli ingressi hdmi presenti nella tv. Il numero di hdmi da inserire è uguale a: "
										+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
						valoriUtente = s.nextLine();
						if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_HDMI_TV_AVANZATO)))
							tv.addNumberHdmiTv(valoriUtente);
						break;
					case "9":
						System.out.println(
								"Inserisci il numero degli smart tv presenti nella tv. Il numero dei smart tv da inserire è uguale a: "
										+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
						valoriUtente = s.nextLine();
						if (StringUtils.equals(valoriUtente, String.valueOf(ConstantGlobal.NUM_SMART_TV_AVANZATO)))
							tv.addNumberSmartTv(valoriUtente);
						break;
					default:
						System.out.println("Hai inserito un valore che non è presente nell'elenco");
						break;
					}
					System.out.println("Inserisci 1 se vuoi aggiungere altre informazioni su questa tv");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			}
		}
	}

	public String visualizzaTvFornite(Set<Televisore> televisore) {
		String elenco;
		elenco = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		elenco += String.format("| %100s %86s ", ConstantGlobal.TITOLO_ELENCO_TV, "|\n");
		elenco += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		elenco += ConstantGlobal.TABELLA_ELENCO_TV;
		if (!televisore.isEmpty()) {
			List<Televisore> tv1 = new ArrayList<Televisore>(televisore);
			for (int i = 0; i < televisore.size(); i++) {
				elenco += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_"))
						.concat("\n");
				elenco += String.format("| %13s %2s %12s %3s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s",
						tv1.get(i).visualizzaSeriale(), " | ", tv1.get(i).visualizzaTipologiaTv(), " | ",
						tv1.get(i).visualizzaMarca(), " | ", tv1.get(i).visualizzaAltezza(), " | ",
						tv1.get(i).visualizzaLarghezza(), " | ", tv1.get(i).visualizzaDiagonale(), " | ",
						tv1.get(i).visualizzaRisoluzione(), " | ", tv1.get(i).visualizzaTipoSchermo(), " | ");
				if (tv1.get(i).visualizzaTipologiaTv() == ConstantGlobal.TIPOLOGIA_TV.BASE) {
					elenco += String.format(" %6s %9s %7s %10s %10s %10s\n", " ", " | ", " ", " | ", " ", " | ");
				} else if (tv1.get(i).visualizzaTipologiaTv() == ConstantGlobal.TIPOLOGIA_TV.MEDIO) {
					elenco += String.format(" %6s %9s %7s %10s %10s %10s\n", tv1.get(i).visualizzaNumeroUsb(), " | ",
							" ", " | ", " ", " | ");
				} else {
					elenco += String.format(" %6s %9s %7s %10s %10s %10s\n", tv1.get(i).visualizzaNumeroUsb(), " | ",
							tv1.get(i).visualizzaNumeroHdmi(), " | ", tv1.get(i).visualizzaNumeroSmartTv(), " | ");
				}
			}
			elenco += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_"))
					.concat("\n");
		}
		return elenco;
	}

	public void modificaTelevisore(Set<Televisore> tv) {
		System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaTvFornite(tv));
		}
		System.out.println("Inserisci il seriale dalla televisore che vuoi modficare.");
		System.out.println("Il seriale è composto da 12 numeri.");
		valoriUtente = s.nextLine();
		ArrayList<Object> result = ControlliGlobal.controlloSeriale(valoriUtente, tv);
		if (!result.isEmpty()) {
			if (result.get(0).equals(true)) {
				do {
					Televisore televisore = (Televisore) result.get(1);
					System.out.println("Inserisci 1 se vuoi modificare la marca della tv");
					System.out.println("Inserisci 2 se vuoi modificare l' altezza della tv");
					System.out.println("Inserisci 3 se vuoi modificare la larghezza della tv");
					System.out.println("Inserisci 4 se vuoi modificare la diagonale della tv");
					System.out.println("Inserisci 5 se vuoi modificare la risolzione dello shermo della tv");
					System.out.println("Inserisci 6 se vuoi modificare la tipologia dello schermo della tv");
					System.out.println("Inserisci 7 se vuoi modificare il numero degli ingressi usb della tv");
					System.out.println("Inserisci 8 se vuoi modificare il numero degli ingressi hdmi della tv");
					System.out.println("Inserisci 9 se vuoi modificare il numero degli smart tv della tv");
					System.out.println("inserisci 10 se vuoi modificare il seriale del televisore");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						System.out.println("Inserisci 1 se vuoi visualizzare la marca dalla televisore.");
						if (s.nextLine().equals("1")) {
							televisore.visualizzanomiMarcheTv();
						}
						System.out.println("Inserisci la marca del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaMarcaTv(valoriUtente);
						break;
					case "2":
						System.out.println("Inserisci l'altezza del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaAltezzaTv(valoriUtente);
						break;
					case "3":
						System.out.println("Inserisci la larghezza del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaLarghezzaTv(valoriUtente);
						break;
					case "4":
						System.out.println("Inserisci la diagonale del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaDiagonaleTv(valoriUtente);
						break;
					case "5":
						System.out.println("Inserisci 1 se vuoi visualizzare la risoluzione della tv");
						if (s.nextLine().equals("1")) {
							televisore.visualizzaRisoluzioniSchermiTv();
							;
						}
						System.out.println("Inserisci la risoluzione del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaRisoluzioneTv(valoriUtente);
						break;
					case "6":
						System.out
								.println("Inserisci 1 se vuoi visualizzare la tipologia di schermo dalla televisore.");
						if (s.nextLine().equals("1")) {
							televisore.visualizzaTipologieSchermoTv();
						}
						System.out.println("Inserisci la tipologia dello schermo del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaTiposchermoTv(valoriUtente);
						break;
					case "7":
						System.out.println(
								"Inserisci il numero degli ingressi sub dello schermo del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaNumberUsbTv(valoriUtente);
						break;
					case "8":
						System.out.println(
								"Inserisci il numero degli ingressi hdmi dello schermo del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaNumberHdmiTv(valoriUtente);
						break;
					case "9":
						System.out.println(
								"Inserisci il numero dei smart tv dello schermo del televisore che vuoi modificare");
						valoriUtente = s.nextLine();
						televisore.modificaNumberSmartTv(valoriUtente);
						break;
					case "10":
						System.out.println(
								"Inserisci il seriale televisore che vuoi modificare. Il seriale deve essere composto da 12 numeri");
						valoriUtente = s.nextLine();
						televisore.modificaSeriale(valoriUtente);
						break;
					}
					System.out.println("Inserisci 1 se vuoi aggiungere altre informazioni su questa tv");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			}
		} else {
			System.err.println("| Errore nell'inserimento |");
			System.err.print("hai inserito un seriale sbagliato");
		}
	}

	public void eliminaTelevisore(Set<Televisore> tv) {
		System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaTvFornite(tv));
		}
		System.out.println("Inserisci il seriale dalla televisore che vuoi modficare.");
		System.out.println("Il seriale è composto da 12 numeri.");
		valoriUtente = s.nextLine();
		ArrayList<Object> result = ControlliGlobal.controlloSeriale(valoriUtente, tv);
		if (!result.isEmpty()) {
			if (result.get(0).equals(true)) {
				Televisore televisore = (Televisore) result.get(1);
				do {
					System.out.println("Inserisci 1 se vuoi eliminare la marca della tv");
					System.out.println("Inserisci 2 se vuoi eliminare l' altezza della tv");
					System.out.println("Inserisci 3 se vuoi eliminare la larghezza della tv");
					System.out.println("Inserisci 4 se vuoi eliminare la diagonale della tv");
					System.out.println("Inserisci 5 se vuoi eliminare la risolzione dello shermo della tv");
					System.out.println("Inserisci 6 se vuoi eliminare la tipologia dello schermo della tv");
					System.out.println("Inserisci 7 se vuoi eliminare il numero degli ingressi usb della tv");
					System.out.println("Inserisci 8 se vuoi eliminare il numero degli ingressi hdmi della tv");
					System.out.println("Inserisci 9 se vuoi eliminare il numero degli smart tv della tv");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						try {
							televisore.eliminaMarcaTv();
						} catch (TelevisoreException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "2":
						try {
							televisore.eliminaAltezzaTv();
						} catch (TelevisoreException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "3":
						try {
							televisore.eliminaLarghezzaTv();
						} catch (TelevisoreException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "4":
						try {
							televisore.eliminaDiagonaleTv();
						} catch (TelevisoreException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "5":
						if (s.nextLine().equals("1")) {
							televisore.visualizzaRisoluzioniSchermiTv();
							;
						}
						try {
							televisore.eliminaRisoluzioneTv();
						} catch (TelevisoreException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "6":
						try {
							televisore.eliminaTiposchermoTv();
						} catch (TelevisoreException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "7":
						televisore.eliminaNumberUsbTv();
						break;
					case "8":
						televisore.eliminaNumberSmartTv();
						break;
					case "9":
						televisore.eliminaNumberSmartTv();
						break;
					}
					System.out.println("Inserisci 1 se vuoi eliminare altre informazioni su questa tv");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));

			}
		} else {
			System.err.println("| Errore nell'inserimento |");
			System.err.print("hai inserito un seriale sbagliato");
		}
	}

	public String visualizzaAllTvRiparate(Set<Persona> elencoDipendenti) {
		String stringa = null;
		Set<Riparazione> tvAllRiparate = new HashSet<Riparazione>();
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		stringa += String.format("| %105s %81s", ConstantGlobal.TITOLO_TABELLA_LISTA_TV_RIPARATE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		stringa += ConstantGlobal.TABELLA_ELENCO_TV;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		if (!elencoDipendenti.isEmpty()) {
			elencoDipendenti.stream().forEach(s -> {
				try {
					tvAllRiparate.addAll(s.visualizzaElencoTvRiparate());
				} catch (ClienteException e) {
					System.err.println(e.getMessage());
				}
			});
			Iterator<Riparazione> element = tvAllRiparate.iterator();
			while (element.hasNext()) {
				Riparazione r = element.next();
				Televisore tv = r.getTvRiparata();
				stringa += String.format("| %13s %2s %12s %3s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s",
						tv.visualizzaSeriale(), " | ", tv.visualizzaTipologiaTv(), " | ", tv.visualizzaMarca(), " | ",
						tv.visualizzaAltezza(), " | ", tv.visualizzaLarghezza(), " | ", tv.visualizzaDiagonale(), " | ",
						tv.visualizzaRisoluzione(), " | ", tv.visualizzaTipoSchermo(), " | ");
				if (tv.visualizzaTipologiaTv() == ConstantGlobal.TIPOLOGIA_TV.BASE) {
					stringa += String.format(" %6s %9s %7s %10s %10s %10s\n", " ", " | ", " ", " | ", " ", " | ");
				} else if (tv.visualizzaTipologiaTv() == ConstantGlobal.TIPOLOGIA_TV.MEDIO) {
					stringa += String.format(" %6s %9s %7s %10s %10s %10s\n", tv.visualizzaNumeroUsb(), " | ", " ",
							" | ", " ", " | ");
				} else {
					stringa += String.format(" %6s %9s %7s %10s %10s %10s\n", tv.visualizzaNumeroUsb(), " | ",
							tv.visualizzaNumeroHdmi(), " | ", tv.visualizzaNumeroSmartTv(), " | ");
				}
				stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_"))
						.concat("\n");
			}
			
		}

		return stringa;
	}
	
	public String visualizzaAllTvVendute(Set<Persona> elencoDipendenti) {
		String stringa = null;
		Set<Vendita> tvAllRiparate = new HashSet<Vendita>();
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		stringa += String.format("| %162s %89s", ConstantGlobal.TITOLO_TABELLA_LISTA_TV_RIPARATE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		stringa += ConstantGlobal.TABELLA_ELENCO_TV;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_")).concat("\n");
		if (!elencoDipendenti.isEmpty()) {
			elencoDipendenti.stream().forEach(s -> {
				try {
					tvAllRiparate.addAll(s.visualizzaElencoTvVendute());
				} catch (ClienteException e) {
					System.err.println(e.getMessage());
				}
			});
			Iterator<Vendita> element = tvAllRiparate.iterator();
			while (element.hasNext()) {
				Vendita r = element.next();
				Televisore tv = r.getTv();
				stringa += String.format("| %13s %2s %12s %3s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s",
						tv.visualizzaSeriale(), " | ", tv.visualizzaTipologiaTv(), " | ", tv.visualizzaMarca(), " | ",
						tv.visualizzaAltezza(), " | ", tv.visualizzaLarghezza(), " | ", tv.visualizzaDiagonale(), " | ",
						tv.visualizzaRisoluzione(), " | ", tv.visualizzaTipoSchermo(), " | ");
				if (tv.visualizzaTipologiaTv() == ConstantGlobal.TIPOLOGIA_TV.BASE) {
					stringa += String.format(" %6s %9s %7s %10s %10s %10s\n", " ", " | ", " ", " | ", " ", " | ");
				} else if (tv.visualizzaTipologiaTv() == ConstantGlobal.TIPOLOGIA_TV.MEDIO) {
					stringa += String.format(" %6s %9s %7s %10s %10s %10s\n", tv.visualizzaNumeroUsb(), " | ", " ",
							" | ", " ", " | ");
				} else {
					stringa += String.format(" %6s %9s %7s %10s %10s %10s\n", tv.visualizzaNumeroUsb(), " | ",
							tv.visualizzaNumeroHdmi(), " | ", tv.visualizzaNumeroSmartTv(), " | ");
				}
				stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV, "_"))
						.concat("\n");
			}
			
		}

		return stringa;
	}
}