package Cecinato_cs2022.Azienda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.DaoDipendente.DaoVenditaImp;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.Dipendente.Riparazione;
import Cecinato_cs2022.Dipendente.Vendita;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.DipendenteException.RiparazioneException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServiceDipendente.DaoVendita;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: RepartoDipendenti </b>
 * <p>
 * Questa classe consente gestire tutte le funzionalità relative ai dipendenti
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

public class RepartoDipendenti {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	/**
	 * {@link Persona} instanza che indica il dipendente
	 * 
	 */

	private Persona dipendente;
	/**
	 * {@link Persona} instanza che indica i valori inseriti dall'utente
	 * 
	 */
	private String valoriUtente;
	/**
	 * {@link boolean} instanza che indica i risultati dei controlli
	 * 
	 */
	boolean result;

	/**
	 * {@link Scanner} instanza che consentirà di acquisire i dalti dell'utente
	 * 
	 */
	Scanner s = new Scanner(System.in);

	/**
	 * {@link SimpleDateFormat } instanza consente di formattare la data
	 * 
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);

	/**
	 * 
	 * <b> METODO: acquisizioneDipendente </b>
	 * <p>
	 * Questo metodo consente di acquisire un nuovo dipendente e le informazioni
	 * inserite dall'utente relativo al dipedente
	 * 
	 * 
	 * 
	 * @return dipendente variabile di tipo Persona contenente il dipendente
	 * 
	 * 
	 */

	public Persona acquisizioneDipendente() {
		try {
			System.out.println("Inserisci il codice identificativo del dipendente");
			System.out.println("il codice identificativo è costituito da 10 numeri interi");
			valoriUtente = s.nextLine();
			dipendente = new Dipendente(valoriUtente);
			do {
				try {
					System.out.println("Inserisci il nome del dipendente");
					valoriUtente = s.nextLine();
					result = dipendente.addNome(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci il cognome del dipendente");
					valoriUtente = s.nextLine();
					result = dipendente.addCognome(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.VisualizzaCognome())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci l'età del dipendente");
					System.out.println(
							"L'età minima che il dipendente può avere è : " + ConstantGlobal.ETA_MINIMA_CLIENTE);
					System.out.println(
							"L'età Massima che il dipendente può avere è : " + ConstantGlobal.ETA_MASSIMA_CLIENTE);
					int valoreUtenteint = s.nextInt();
					result = dipendente.addEta(valoreUtenteint);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (dipendente.VisualizzaEta() > 0) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci 1 se vuoi visualizzare i generi presenti");
					valoriUtente = s.next();
					s.nextLine();
					if (StringUtils.equals(valoriUtente, "1")) {
						dipendente.visualizzaElencoGenerePersona();
					}
					System.out.println("Inserisci il genere del dipendente");
					valoriUtente = s.nextLine();
					result = dipendente.addGenere(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (dipendente.VisualizzaGenere() != null) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);

			do {
				try {
					System.out.println("Inserisci la data di nascita del dipendente");
					System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
					valoriUtente = s.nextLine();
					result = dipendente.addDataNascita(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.VisualizzaDataNascita())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci la città di nascita del dipendente");
					valoriUtente = s.nextLine();
					result = dipendente.addCitta(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.VisualizzaCitta())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci il nome dell'azienda in cui lavora il dipendente");
					valoriUtente = s.nextLine();
					result = dipendente.addNomeAzienda(valoriUtente);
				} catch (ClienteException | DipendenteException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.visualizzaNomeAziendaDipendente())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			try {
				System.out.println("Inserimento automatico dell'email del dipendente");
				result = dipendente.addEmailAziendale();
			} catch (ClienteException | DipendenteException e) {
				System.err.println(e.getMessage());
			}
			do {
				try {
					System.out.println("Inserisci il numero aziendale del dipendente");
					System.out.println("il formato da rispettare è: '+39 3298934789'");
					valoriUtente = s.nextLine();
					result = dipendente.addNumeroTelefonoAziendale(valoriUtente);
				} catch (ClienteException | DipendenteException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.visualizzaNumeroTelefonoAziendaleDipendente())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci 1 se vuoi visualizzare i la tipologie di contratto presenti");
					valoriUtente = s.next();
					s.nextLine();
					if (StringUtils.equals(valoriUtente, "1")) {
						dipendente.VisualizzaElencoTipologiaContratto();
					}
					System.out.println("Inserisci il contratto del dipendente");
					valoriUtente = s.nextLine();
					result = dipendente.addtipologiaContratto(valoriUtente);
				} catch (DipendenteException e) {
					System.err.println(e.getMessage());
					if (dipendente.visualizzatipologiaContrattoDipendente() != null) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci il ruolo del dipendete all'interno dell'azienda");
					valoriUtente = s.nextLine();
					result = dipendente.addRuolo(valoriUtente);
				} catch (DipendenteException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.visualizzaRuoloDipendente())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
		} catch (ClienteException e) {
			System.err.println(e.getMessage());

		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}
		return dipendente;
	}

	/**
	 * 
	 * <b> METODO: visualizzaElencoDipendenti </b>
	 * <p>
	 * Questo metodo consente di far visualizzare le informazioni tutti i dipendenti
	 * sotto forma di tabella
	 * 
	 * @param dipendenti lista cotenente i dipendenti
	 * 
	 * @return stringa variabile di tipo stringa contenente le infromazioni di tutti
	 *         i dipendenti in formato tabellare
	 * 
	 * 
	 */

	public String visualizzaElencoDipendenti(Set<Persona> dipendenti) {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += String.format("| %133s %109s", ConstantGlobal.TITOLO_TABELLA_DIPENDENTE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_DIPENDENTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		if (!dipendenti.isEmpty()) {
			Iterator<Persona> elenco_dipendenti = dipendenti.iterator();
			while (elenco_dipendenti.hasNext()) {
				Persona d = elenco_dipendenti.next();
				try {
					stringa += String.format(
							"| %16s %7s %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %16s %5s %28s %5s %15s %4s %13s %5s %17s %6s \n",
							d.visualizzaCodiceIdentificativoDipendete(), " | ", d.VisualizzaNome(), " | ",
							d.VisualizzaCognome(), " | ", d.VisualizzaEta(), " | ", d.VisualizzaGenere(), " | ",
							d.VisualizzaDataNascita(), " | ", d.VisualizzaCitta(), " | ", d.visualizzaRuoloDipendente(),
							" | ", d.visualizzaEmailAziendaleDipendente(), " | ",
							d.visualizzaNumeroTelefonoAziendaleDipendente(), " | ", d.visualizzaNomeAziendaDipendente(),
							" | ", d.visualizzatipologiaContrattoDipendente(), " | ");
					stringa += String
							.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
							.concat("\n");
				} catch (ClienteException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		return stringa;
	}

	/**
	 * 
	 * <b> METODO: acquisizioneDipendente </b>
	 * <p>
	 * Questo metodo consente di acquisire le informazioni mancati di un dipendente
	 * esistente inserite dall'utente
	 * 
	 * @param elencoDipendenti lista contenente i dipendenti
	 * 
	 * 
	 */

	public void acquisizioneInformazioniDipendenti(Set<Persona> elencoDipendenti) {
		if (!elencoDipendenti.isEmpty()) {
			System.out.println("Inserisci 1 se vuoi visalizzare i dipendenti presenti");
			valoriUtente = s.nextLine();
			if (StringUtils.equals(valoriUtente, "1")) {
				System.out.println(visualizzaElencoDipendenti(elencoDipendenti));
			}
			System.out.println("Inserisci il codice identificato della persona che vuoi modificare i dati.");
			valoriUtente = s.nextLine();
			ArrayList<Object> resultControllo;
			try {
				resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoDipendenti);
				if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
					dipendente = (Persona) resultControllo.get(1);
					do {
						System.out.println("Inserisci 1 se vuoi aggiungere il nome del dipendente");
						System.out.println("Inserisci 2 se vuoi aggiungere il cognome del dipendente");
						System.out.println("Inserisci 3 se vuoi aggiungere l' età del dipendente");
						System.out.println("Inserisci 4 se vuoi aggiungere il genere del dipendente");
						System.out.println("Inserisci 5 se vuoi aggiungere la data di nascita del dipendente");
						System.out.println("Inserisci 6 se vuoi aggiungere la citta di nascita del dipendente");
						System.out.println(
								"Inserisci 7 se vuoi aggiungere il nome dell'azienda in cui lavora il dipendente");
						System.out.println("Inserisci 8 se vuoi aggiungere l'email aziendale del dipendente");
						System.out.println("Inserisci 9 se vuoi aggiungere il numero telefonico del dipendente");
						System.out.println("inserisci 10 se vuoi aggiungere il tipo di contratto del dipendente");
						System.out.println("inserisci 11 se vuoi aggiungere il ruolo che si occupa il dipendente");
						valoriUtente = s.nextLine();
						switch (valoriUtente) {
						case "1":
							do {
								try {
									System.out.println("Inserisci il nome del dipendente");
									valoriUtente = s.nextLine();
									result = dipendente.modificaNome(valoriUtente);
								} catch (PersonaException e) {
									System.err.println(e.getMessage());
									if (StringUtils.isAllEmpty(dipendente.VisualizzaNome())) {
										result = true;
									} else {
										result = false;
									}
								}

							} while (result == false);
							break;
						case "2":
							do {
								try {
									System.out.println("Inserisci il cognome del dipendente");
									valoriUtente = s.nextLine();
									result = dipendente.modificaCognome(valoriUtente);
								} catch (PersonaException e) {
									System.err.println(e.getMessage());
									if (StringUtils.isAllEmpty(dipendente.VisualizzaCognome())) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "3":
							do {
								try {

									System.out.println("Inserisci l'età del dipendente");
									System.out.println("L'età minima che il dipendente può avere è : "
											+ ConstantGlobal.ETA_MINIMA_CLIENTE);
									System.out.println("L'età Massima che il dipendente può avere è : "
											+ ConstantGlobal.ETA_MASSIMA_CLIENTE);
									int valoreUtenteint = s.nextInt();
									result = dipendente.modificaEta(valoreUtenteint);
								} catch (InputMismatchException e) {
									System.err.println("Hai inserito un valore non intero");
									s.nextLine();
								} catch (PersonaException e) {
									System.err.println(e.getMessage());
									if (dipendente.VisualizzaEta() == 0) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "4":
							do {
								try {
									System.out.println("Inserisci 1 se vuoi visualizzare i generi presenti");
									valoriUtente = s.next();
									s.nextLine();
									if (StringUtils.equals(valoriUtente, "1")) {
										dipendente.visualizzaElencoGenerePersona();
									}
									System.out.println("Inserisci il genere del dipendente");
									valoriUtente = s.nextLine();
									result = dipendente.modificaGenere(valoriUtente);
								} catch (PersonaException e) {
									System.err.println(e.getMessage());
									if (dipendente.VisualizzaGenere() == null) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "5":
							do {
								try {
									System.out.println("Inserisci la data di nascita del dipendente");
									System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
									valoriUtente = s.nextLine();
									result = dipendente.modificaDataNascita(valoriUtente);
								} catch (PersonaException e) {
									System.err.println(e.getMessage());
									if (StringUtils.isAllEmpty(dipendente.VisualizzaDataNascita())) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "6":
							do {
								try {
									System.out.println("Inserisci la città di nascita del dipendente");
									valoriUtente = s.nextLine();
									result = dipendente.modificaCitta(valoriUtente);
								} catch (PersonaException e) {
									System.err.println(e.getMessage());
									if (StringUtils.isAllEmpty(dipendente.VisualizzaCitta())) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "7":
							do {
								try {
									System.out.println("Inserisci il nome dell'azienda in cui lavora il dipendente");
									valoriUtente = s.nextLine();
									result = dipendente.modificaNomeAzienda(valoriUtente);
								} catch (DipendenteException e) {
									System.err.println(e.getMessage());
									if (StringUtils.isAllEmpty(dipendente.visualizzaNomeAziendaDipendente())) {
										result = true;
									} else {
										result = false;
									}
								} catch (ClienteException e) {
									System.err.println(e.getMessage());
									result = true;
								}
							} while (result == false);
							break;
						case "8":
							try {
								System.out.println("Inserimento automatico dell'email del dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificaEmailAziendale();
							} catch (DipendenteException e) {
								System.err.println(e.getMessage());
							}
							break;
						case "9":
							do {
								try {
									System.out.println("Inserisci il numero aziendale del dipendente");
									System.out.println("il formato da rispettare è: '+39 3298934789'");
									valoriUtente = s.nextLine();
									result = dipendente.modificaNumeroTelefonoAziendale(valoriUtente);
								} catch (DipendenteException e) {
									System.err.println(e.getMessage());
									if (StringUtils
											.isAllEmpty(dipendente.visualizzaNumeroTelefonoAziendaleDipendente())) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "10":
							do {
								try {
									System.out.println(
											"Inserisci 1 se vuoi visualizzare i la tipologie di contratto presenti");
									valoriUtente = s.next();
									s.nextLine();
									if (StringUtils.equals(valoriUtente, "1")) {
										dipendente.VisualizzaElencoTipologiaContratto();
									}
									System.out.println("Inserisci il contratto del dipendente");
									valoriUtente = s.nextLine();
									result = dipendente.modificatipologiaContratto(valoriUtente);
								} catch (DipendenteException e) {
									System.err.println(e.getMessage());
									if (dipendente.visualizzatipologiaContrattoDipendente() == null) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						case "11":
							do {
								try {
									System.out.println("Inserisci il ruolo del dipendete all'interno dell'azienda");
									valoriUtente = s.nextLine();
									result = dipendente.modificaRuolo(valoriUtente);
								} catch (DipendenteException e) {
									System.err.println(e.getMessage());
									if (StringUtils.isAllEmpty(dipendente.visualizzaRuoloDipendente())) {
										result = true;
									} else {
										result = false;
									}
								}
							} while (result == false);
							break;
						default:
							System.err.println("Hai inserito un valore non presente nel menù");
							break;
						}
						System.out.println("Inserisci 1 se vuoi fare altre operazioni su questo dipendente");
						valoriUtente = s.nextLine();
					} while (StringUtils.equals(valoriUtente, "1"));
				} else {
					System.err.println("il codice identiticativo" + valoriUtente + " non esite");
				}
			} catch (ClienteException e) {
				System.err.println(e.getMessage());
			} catch (DipendenteException e) {
				System.err.println(e.getMessage());
			}
		} else {
			System.err.println(
					"Non possono essere aggiunti dati al dipendente, perchè non ci sono ancora i dipendenti all'interno dell'azienda");
		}
	}

	/**
	 * 
	 * <b> METODO: modificaInformazioniDipendenti </b>
	 * <p>
	 * Questo metodo consente di modificare le informazioni di un dipendente
	 * esistente inserite dall'utente
	 * 
	 * @param elencoDipendenti lista contenente i dipendenti
	 * 
	 * 
	 */

	public void modificaInformazioniDipendenti(Set<Persona> elencoDipendenti) {
		System.out.println("Inserisci 1 se vuoi visalizzare i dipendenti presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaElencoDipendenti(elencoDipendenti));
		}
		System.out.println("Inserisci il codice identificato della persona che vuoi modificare i dati.");
		valoriUtente = s.nextLine();
		ArrayList<Object> resultControllo;
		try {
			resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoDipendenti);
			if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
				dipendente = (Persona) resultControllo.get(1);
				do {
					System.out.println("Inserisci 1 se vuoi modificare il nome del dipendente");
					System.out.println("Inserisci 2 se vuoi modificare il cognome del dipendente");
					System.out.println("Inserisci 3 se vuoi modificare l' età del dipendente");
					System.out.println("Inserisci 4 se vuoi modificare il genere del dipendente");
					System.out.println("Inserisci 5 se vuoi modificare la data di nascita del dipendente");
					System.out.println("Inserisci 6 se vuoi modificare la citta di nascita del dipendente");
					System.out
							.println("Inserisci 7 se vuoi modificare il nome dell'azienda in cui lavora il dipendente");
					System.out.println("Inserisci 8 se vuoi modificare l'email aziendale del dipendente");
					System.out.println("Inserisci 9 se vuoi modificare il numero telefonico del dipendente");
					System.out.println("inserisci 10 se vuoi modificare il tipo di contratto del dipendente");
					System.out.println("inserisci 11 se vuoi modificare il ruolo che si occupa il dipendente");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						do {
							try {
								System.out.println("Inserisci il nome del dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificaNome(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.VisualizzaNome())) {
									result = true;
								} else {
									result = false;
								}
							}

						} while (result == false);
						break;
					case "2":
						do {
							try {
								System.out.println("Inserisci il cognome del dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificaCognome(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.VisualizzaCognome())) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "3":
						do {
							try {

								System.out.println("Inserisci l'età del dipendente");
								System.out.println("L'età minima che il dipendente può avere è : "
										+ ConstantGlobal.ETA_MINIMA_CLIENTE);
								System.out.println("L'età Massima che il dipendente può avere è : "
										+ ConstantGlobal.ETA_MASSIMA_CLIENTE);
								int valoreUtenteint = s.nextInt();
								result = dipendente.modificaEta(valoreUtenteint);
							} catch (InputMismatchException e) {
								System.err.println("Hai inserito un valore non intero");
								s.nextLine();
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (dipendente.VisualizzaEta() != 0) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "4":
						do {
							try {
								System.out.println("Inserisci 1 se vuoi visualizzare i generi presenti");
								valoriUtente = s.next();
								s.nextLine();
								if (StringUtils.equals(valoriUtente, "1")) {
									dipendente.visualizzaElencoGenerePersona();
								}
								System.out.println("Inserisci il genere del dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificaGenere(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (dipendente.VisualizzaGenere() != null) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "5":
						do {
							try {
								System.out.println("Inserisci la data di nascita del dipendente");
								System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
								valoriUtente = s.nextLine();
								result = dipendente.modificaDataNascita(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.VisualizzaDataNascita())) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "6":
						do {
							try {
								System.out.println("Inserisci la città di nascita del dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificaCitta(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.VisualizzaCitta())) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "7":
						do {
							try {
								System.out.println("Inserisci il nome dell'azienda in cui lavora il dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificaNomeAzienda(valoriUtente);
							} catch (DipendenteException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.visualizzaNomeAziendaDipendente())) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "8":
						try {
							System.out.println("Inserimento automatico dell'email del dipendente");
							result = dipendente.modificaEmailAziendale();
						} catch (DipendenteException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "9":
						do {
							try {
								System.out.println("Inserisci il numero aziendale del dipendente");
								System.out.println("il formato da rispettare è: '+39 3298934789'");
								valoriUtente = s.nextLine();
								result = dipendente.modificaNumeroTelefonoAziendale(valoriUtente);
							} catch (DipendenteException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.visualizzaNumeroTelefonoAziendaleDipendente())) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "10":
						do {
							try {
								System.out.println(
										"Inserisci 1 se vuoi visualizzare i la tipologie di contratto presenti");
								valoriUtente = s.next();
								s.nextLine();
								if (StringUtils.equals(valoriUtente, "1")) {
									dipendente.VisualizzaElencoTipologiaContratto();
								}
								System.out.println("Inserisci il contratto del dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.modificatipologiaContratto(valoriUtente);
							} catch (DipendenteException e) {
								System.err.println(e.getMessage());
								if (dipendente.visualizzatipologiaContrattoDipendente() != null) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "11":
						do {
							try {
								System.out.println("Inserisci il ruolo del dipendete all'interno dell'azienda");
								valoriUtente = s.nextLine();
								result = dipendente.modificaRuolo(valoriUtente);
							} catch (DipendenteException e) {
								System.err.println(e.getMessage());

							}
						} while (result == false);
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel menù");
						break;
					}
					System.out.println("Inserisci 1 se vuoi fare altre operazioni su questo dipendente");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			} else {
				System.err.println("il codice identificativo " + valoriUtente + " non presente");
			}

		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * 
	 * <b> METODO: eliminaInformazioniDipendenti </b>
	 * <p>
	 * Questo metodo consente di eliminare le informazioni di un dipendente
	 * esistente
	 * 
	 * @param elencoDipendenti lista contenente i dipendenti
	 * 
	 * 
	 */

	public void eliminaInformazioniDipendenti(Set<Persona> elencoDipendenti) {
		System.out.println("Inserisci 1 se vuoi visalizzare i dipendenti presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaElencoDipendenti(elencoDipendenti));
		}
		System.out.println("Inserisci il codice identificato della persona che vuoi modificare i dati.");
		valoriUtente = s.nextLine();
		ArrayList<Object> resultControllo;
		try {
			resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoDipendenti);
			if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
				dipendente = (Persona) resultControllo.get(1);
				do {
					System.out.println("Inserisci 1 se vuoi eliminare il nome del dipendente");
					System.out.println("Inserisci 2 se vuoi eliminare il cognome del dipendente");
					System.out.println("Inserisci 3 se vuoi eliminare l' età del dipendente");
					System.out.println("Inserisci 4 se vuoi eliminare il genere del dipendente");
					System.out.println("Inserisci 5 se vuoi eliminare la data di nascita del dipendente");
					System.out.println("Inserisci 6 se vuoi eliminare la citta di nascita del dipendente");
					System.out
							.println("Inserisci 7 se vuoi eliminare il nome dell'azienda in cui lavora il dipendente");
					System.out.println("Inserisci 8 se vuoi eliminare l'email aziendale del dipendente");
					System.out.println("Inserisci 9 se vuoi eliminare il numero telefonico del dipendente");
					System.out.println("inserisci 10 se vuoi eliminare il tipo di contratto del dipendente");
					System.out.println("inserisci 11 se vuoi eliminare il ruolo che si occupa il dipendente");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						try {
							result = dipendente.eliminaNome();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "2":
						try {
							dipendente.eliminaCognome();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "3":
						try {
							dipendente.eliminaEta();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "4":
						try {
							dipendente.eliminaGenere();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "5":

						try {
							dipendente.eliminaDataNascita();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "6":
						try {
							dipendente.eliminaCitta();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "7":
						try {
							dipendente.eliminaNomeAzienda();
						} catch (DipendenteException | ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "8":
						try {
							dipendente.eliminaEmailAziendale();
						} catch (DipendenteException | ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "9":
						try {
							dipendente.eliminaNumeroTelefonoAziendale();
						} catch (DipendenteException | ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "10":
						try {
							dipendente.eliminatipologiaContratto();
						} catch (DipendenteException | ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "11":
						try {
							dipendente.eliminaRuolo();
						} catch (DipendenteException | ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel menù");
						break;
					}
					System.out.println("Inserisci 1 se vuoi fare altre operazioni su questo dipendente");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			} else {
				System.err.println("il codice identificativo " + valoriUtente + " non presente");
			}
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * 
	 * <b> METODO: riparazioneTv</b>
	 * <p>
	 * Questo metodo consente di riparare un televisore. Nel caso uno dei paramentri
	 * passati sia voto verrà alzata un eccezione
	 * 
	 * @param elencoTv         lista contenete i televisori. Da questa lista verrà
	 *                         scelto il televisore da riparare.
	 * @param elencoClienti    lista contenete i clienti. Da questa lista verrà
	 *                         scelto il proprientario del televisore
	 * @param elencoDipendenti lista contenete i televisori. Da questa lista verrà
	 *                         scelto il dipendente che effettuerà la riparazione
	 */

	public void riparazioneTv(Set<Televisore> elencoTv, Set<Persona> elencoClienti, Set<Persona> elencoDipendenti) {
		ArrayList<Object> resultControllo;
		ArrayList<Object> valoriInput = new ArrayList<Object>();
		FornitoreTv fornitore = new FornitoreTv();
		AccettazioneClienti accettazioneClienti = new AccettazioneClienti();
		try {
			if (!elencoDipendenti.isEmpty()) {
				System.out.println("Inserisci 1 se vuoi visalizzare i dipendenti presenti");
				valoriUtente = s.nextLine();
				if (StringUtils.equals(valoriUtente, "1")) {
					System.out.println(visualizzaElencoDipendenti(elencoDipendenti));
				}
				System.out.println(
						"Inserisci il codice identificato del dipendente che deve effetturare la riparazione.");
				valoriUtente = s.nextLine();
				resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoDipendenti);
				if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
					dipendente = (Persona) resultControllo.get(1);
					if (!elencoTv.isEmpty()) {
						System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
						valoriUtente = s.nextLine();
						if (StringUtils.equals(valoriUtente, "1")) {
							System.out.println(fornitore.visualizzaTvFornite(elencoTv));
						}
						System.out.println("Inserisci il seriale dalla televisore che vuoi selezionare");
						System.out.println("Il seriale è composto da 12 numeri.");
						valoriUtente = s.nextLine();
						ArrayList<Object> risultato = ControlliGlobal.controlloSeriale(valoriUtente, elencoTv);
						if (!risultato.isEmpty()) {
							if (risultato.get(0).equals(true)) {
								valoriInput.add(0, risultato.get(1));
								if (!elencoClienti.isEmpty()) {
									System.out.println("Inserisci 1 se vuoi visalizzare i clienti presenti");
									valoriUtente = s.nextLine();
									if (StringUtils.equals(valoriUtente, "1")) {
										System.out.println(accettazioneClienti.visualizzaElencoClienti(elencoClienti));
									}
									System.out.println("Inserisci il codice fiscale del cliente che vuoi selezionare.");
									System.out.println("Il seriale è composto da 12 numeri.");
									valoriUtente = s.nextLine();
									resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoClienti);
									if (!resultControllo.isEmpty()) {
										if (resultControllo.get(0).equals(true)) {
											valoriInput.add(1, resultControllo.get(1));
											System.out.println("Inserisci la data della richiesta della riparazione");
											System.out.println("il formato della data è: gg/mm/aaaa");
											valoriInput.add(2, s.nextLine());
											System.out.println("Inserisci la data prevista consegna della riparazione");
											System.out.println("il formato della data è: gg/mm/aaaa");
											valoriInput.add(3, s.nextLine());
											System.out.println("Inserisci le iformazioni sulla riparazione");
											System.out.println("ATTENZIONE SCRIVI TUTTO SULLA STESSA RIGA");
											valoriInput.add(4, s.nextLine());
											System.out.println("Inserisci costo della riparazione");
											System.out.println(
													"Utilizzare il '.' se si ha bisogno di inserire anche i valori decimali");
											valoriInput.add(5, s.nextLine());
											dipendente.riparaTv(String.valueOf(valoriInput.get(2)),
													String.valueOf(valoriInput.get(3)),
													String.valueOf(valoriInput.get(5)),
													((Cliente) ((Persona) valoriInput.get(1))),
													((Televisore) valoriInput.get(0)),
													String.valueOf(valoriInput.get(4)));
											elencoTv.remove(((Televisore) valoriInput.get(0)));
										}

									}

								}
							}
						} else {
							System.err.println(
									"non può essere venduta nessuna tv essendo che macano i clienti a cui vendere il prodotto");
						}
					} else {
						System.err.println(
								"non può essere venduta nessuna tv essendo che macano i televisori nel magazzino");
					}
				}
			} else {
				System.err.println("non può essere venduta nessuna tv essendo che macano i dipendenti nell'azienda");

			}
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		} catch (RiparazioneException e) {
			System.err.println(e.getMessage());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * 
	 * <b> METODO: visualizzaRiparazioniDipendente </b>
	 * <p>
	 * Questo metodo consente di far visualizzare le informazioni di tutte le tv
	 * riparate di un determinato dipendente
	 * 
	 * @param elencoDipendenti lista cotenente i dipendenti
	 * 
	 * @return stringa variabile di tipo stringa contenente tutte le informazioni
	 *         delle tv riparate da un dipendente
	 * 
	 * 
	 */

	public String visualizzaRiparazioniDipendente(Set<Persona> elencoDipendenti) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n");
		stringa += String.format("| %133s %89s", ConstantGlobal.TITOLO_TABELLA_LISTA_TV_RIPARATE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_ELENCO_TV_RIPARATE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n");
		System.out.println("Inserisci 1 se vuoi visalizzare i dipendenti presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaElencoDipendenti(elencoDipendenti));
		}
		System.out.println("Inserisci il codice identificato della persona che vuoi visualizzare i dati.");
		valoriUtente = s.nextLine();
		ArrayList<Object> resultControllo;
		try {
			resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoDipendenti);
			if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
				dipendente = (Persona) resultControllo.get(1);
				Set<Riparazione> tvRiparate = dipendente.visualizzaElencoTvRiparate();
				Iterator<Riparazione> element = tvRiparate.iterator();
				while (element.hasNext()) {
					Riparazione r = element.next();
					stringa += String.format(
							"| %14s %4s %9s %6s %9s %5s %11s %6s %13s %6s %16s %1s %11s %8s %13s %6s %13s %9s %35s %7s \n",
							r.getTvRiparata().visualizzaSeriale(), " | ", r.getTvRiparata().visualizzaTipologiaTv(),
							" | ", r.getTvRiparata().visualizzaMarca(), " | ",
							r.getClienteRiparazione().VisualizzaNome(), " | ",
							r.getClienteRiparazione().VisualizzaCognome(), " | ",
							r.getClienteRiparazione().VisualizzaCodiceFiscale(), " | ",
							simpleDateFormat.format(r.getDataRichiestaRiparazione()), " | ",
							simpleDateFormat.format(r.getDataPrevistaConsegna()), " | ", r.getCostoRiparazione() + "€",
							" | ", r.getInformazioneRiparazione(), " | ");
					stringa += String
							.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
							.concat("\n");
				}
			}
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}
		return stringa;
	}

	/**
	 * 
	 * <b> METODO: venditaTv</b>
	 * <p>
	 * Questo metodo consente di vendere un televisore. Nel caso uno dei paramentri
	 * passati sia voto verrà alzata un eccezione
	 * 
	 * @param elencoTv         lista contenete i televisori. Da questa lista verrà
	 *                         scelto il televisore da vendere.
	 * @param elencoClienti    lista contenete i clienti. Da questa lista verrà
	 *                         scelto l'acquirente del televisore
	 * @param elencoDipendenti lista contenete i televisori. Da questa lista verrà
	 *                         scelto il dipendente che effettuerà la vendita
	 */

	public void venditaTv(Set<Televisore> elencoTv, Set<Persona> elencoClienti, Set<Persona> elencoDipendenti) {
		ArrayList<Object> resultControllo;
		ArrayList<Object> valoriInput = new ArrayList<Object>();
		FornitoreTv fornitore = new FornitoreTv();
		AccettazioneClienti accettazioneClienti = new AccettazioneClienti();
		if (!elencoDipendenti.isEmpty()) {
			try {
				System.out.println("Inserisci 1 se vuoi visalizzare i dipendenti presenti");
				valoriUtente = s.nextLine();
				if (StringUtils.equals(valoriUtente, "1")) {
					System.out.println(visualizzaElencoDipendenti(elencoDipendenti));
				}
				System.out.println("Inserisci il codice identificato del dipendente che deve effetturare la vendita.");
				valoriUtente = s.nextLine();
				resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoDipendenti);
				if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
					dipendente = (Persona) resultControllo.get(1);
					if (!elencoTv.isEmpty()) {
						System.out.println("Inserisci 1 se vuoi visalizzare le tv presenti");
						valoriUtente = s.nextLine();
						if (StringUtils.equals(valoriUtente, "1")) {
							System.out.println(fornitore.visualizzaTvFornite(elencoTv));
						}
						System.out.println("Inserisci il seriale dalla televisore che vuoi selezionare");
						System.out.println("Il seriale è composto da 12 numeri.");
						valoriUtente = s.nextLine();
						ArrayList<Object> risultato = ControlliGlobal.controlloSeriale(valoriUtente, elencoTv);
						if (!risultato.isEmpty()) {
							if (risultato.get(0).equals(true)) {
								valoriInput.add(0, risultato.get(1));
								if (!elencoClienti.isEmpty()) {
									System.out.println("Inserisci 1 se vuoi visalizzare i clienti presenti");
									valoriUtente = s.nextLine();
									if (StringUtils.equals(valoriUtente, "1")) {
										System.out.println(accettazioneClienti.visualizzaElencoClienti(elencoClienti));
									}
									System.out.println("Inserisci il codice fiscale del cliente che vuoi selezionare.");
									System.out.println("Il seriale è composto da 12 numeri.");
									valoriUtente = s.nextLine();
									resultControllo = ControlliGlobal.controlloPersona(valoriUtente, elencoClienti);
									if (!resultControllo.isEmpty()) {
										if (resultControllo.get(0).equals(true)) {
											valoriInput.add(1, resultControllo.get(1));
											System.out.println("Inserisci il prezzo del televisore che vuoi vendere");
											System.out.println(
													"Utilizzare il '.' nel caso si voglia inserire la virgola");
											valoriInput.add(2, s.nextLine());
											try {
												dipendente.vendiTv((Televisore) valoriInput.get(0),
														((Cliente) ((Persona) valoriInput.get(1))),
														String.valueOf(valoriInput.get(2)));
												elencoTv.remove(((Televisore) valoriInput.get(0)));
											} catch (DipendenteException e) {
												System.err.println(e.getMessage());
											}

										}

									}

								}
							}
						} else {
							System.err.println(
									"non può essere venduta nessuna tv essendo che macano i clienti a cui vendere il prodotto");
						}
					} else {
						System.err.println(
								"non può essere venduta nessuna tv essendo che macano i televisori nel magazzino");

					}
				}
			} catch (PersonaException e) {
				System.err.println(e.getMessage());
			} catch (TelevisoreException e) {
				System.err.println(e.getMessage());
			} catch (ClienteException e) {
				System.err.println(e.getMessage());
			} catch (DipendenteException e) {
				System.err.println(e.getMessage());
			}

		} else {
			System.err.println("non può essere venduta nessuna tv essendo che macano i dipendenti nell'azienda");
		}
	}

	/**
	 * 
	 * <b> METODO: visualizzaAllRiparazioni </b>
	 * <p>
	 * Questo metodo consente di far visualizzare le informazioni di tutte le tv
	 * riparate
	 * 
	 * @param elencoDipendenti lista cotenente i dipendenti
	 * 
	 * @return stringa variabile di tipo stringa contenente le infromazioni di tutte
	 *         le informazioni delle tv riparate
	 * 
	 * 
	 */

	public String visualizzaAllRiparazioni(Set<Persona> elencoDipendenti) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
		String stringa = null;
		Set<Riparazione> tvAllRiparate = new HashSet<Riparazione>();
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n");
		stringa += String.format("| %162s %89s", ConstantGlobal.TITOLO_TABELLA_LISTA_TV_RIPARATE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_ELENCO_TV_RIPARATE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n");

		try {
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
					stringa += String.format(
							"| %20s %7s %14s %4s %9s %6s %9s %5s %11s %6s %13s %6s %16s %1s %11s %8s %13s %6s %13s %9s %35s %7s \n",
							r.getSerialeDipendente(), " | ", r.getTvRiparata().visualizzaSeriale(), " | ",
							r.getTvRiparata().visualizzaTipologiaTv(), " | ", r.getTvRiparata().visualizzaMarca(),
							" | ", r.getClienteRiparazione().VisualizzaNome(), " | ",
							r.getClienteRiparazione().VisualizzaCognome(), " | ",
							r.getClienteRiparazione().VisualizzaCodiceFiscale(), " | ",
							simpleDateFormat.format(r.getDataRichiestaRiparazione()), " | ",
							simpleDateFormat.format(r.getDataPrevistaConsegna()), " | ", r.getCostoRiparazione() + "€",
							" | ", r.getInformazioneRiparazione(), " | ");
					stringa += String
							.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
							.concat("\n");
				}
			}
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}
		return stringa;
	}

	/**
	 * 
	 * <b> METODO: visualizzaAllRiparazioniRangeDate </b>
	 * <p>
	 * Questo metodo consente di far visualizzare le informazioni di tutte le tv
	 * riparate in un range di date
	 * 
	 * @param elencoDipendenti lista cotenente i dipendenti
	 * 
	 * @return stringa variabile di tipo stringa contenente le infromazioni di tutte
	 *         le informazioni delle tv riparate
	 * 
	 * 
	 */

	public String visualizzaAllRiparazioniRangeDate(Set<Persona> elencoDipendenti) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
		ArrayList<String> stringa = new ArrayList<String>();
		Set<Riparazione> tvAllRiparate = new HashSet<Riparazione>();

		System.out.println("inserisci la data di partenza dell'inizio della ricerca");
		String inizioData = s.nextLine();
		System.out.println("inserisci la data di fine della ricerca");
		String fineData = s.nextLine();
		stringa.add(String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n"));
		stringa.add(String.format("| %162s %89s", ConstantGlobal.TITOLO_TABELLA_LISTA_TV_RIPARATE, "|\n"));
		stringa.add(String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n"));
		stringa.add(ConstantGlobal.TABELLA_ELENCO_TV_RIPARATE);
		stringa.add(String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
				.concat("\n"));

		if (!elencoDipendenti.isEmpty()) {

			elencoDipendenti.stream().forEach(s -> {
				try {
					tvAllRiparate.addAll(s.visualizzaElencoTvRiparate());
				} catch (ClienteException e) {
					System.err.println(e.getMessage());
				}
			});
			tvAllRiparate.stream()
					.sorted(Comparator.comparing(p -> ((Riparazione) p).getSerialeDipendente()).reversed()
							.thenComparing(p -> ((Riparazione) p).getTvRiparata().visualizzaTipologiaTv()).reversed())
					.forEach(r -> {
						try {
							if (r.getDataPrevistaConsegna().after(sdf.parse(inizioData))
									&& r.getDataRichiestaRiparazione().after(sdf.parse(inizioData))
									&& r.getDataPrevistaConsegna().before(sdf.parse(fineData))
									&& r.getDataPrevistaConsegna().before(sdf.parse(fineData))) {
								stringa.add(String.format(
										"| %20s %7s %14s %4s %9s %6s %9s %5s %11s %6s %13s %6s %16s %1s %11s %8s %13s %6s %13s %9s %35s %7s \n",
										r.getSerialeDipendente(), " | ", r.getTvRiparata().visualizzaSeriale(), " | ",
										r.getTvRiparata().visualizzaTipologiaTv(), " | ",
										r.getTvRiparata().visualizzaMarca(), " | ",
										r.getClienteRiparazione().VisualizzaNome(), " | ",
										r.getClienteRiparazione().VisualizzaCognome(), " | ",
										r.getClienteRiparazione().VisualizzaCodiceFiscale(), " | ",
										simpleDateFormat.format(r.getDataRichiestaRiparazione()), " | ",
										simpleDateFormat.format(r.getDataPrevistaConsegna()), " | ",
										r.getCostoRiparazione() + "€", " | ", r.getInformazioneRiparazione(), " | "));
								stringa.add(String
										.join("",
												Collections.nCopies(
														ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE, "_"))
										.concat("\n"));
							}
						} catch (ParseException | DipendenteException e) {
							System.out.println();
						}
					});

		}

		return String.join("", stringa);
	}

	/**
	 * 
	 * <b> METODO: visualizzaAllVendite </b>
	 * <p>
	 * Questo metodo consente di far visualizzare le informazioni di tutte le tv
	 * vendute dai dipedenti
	 * 
	 * @param elencoDipendenti lista cotenente i dipendenti
	 * 
	 * @return stringa variabile di tipo stringa contenente le infromazioni di tutte
	 *         le tv vendute
	 * 
	 * 
	 */

	public String visualizzaAllVendite(Set<Persona> elencoDipendenti) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
		String stringa = null;
		Set<Vendita> tvAllRiparate = new HashSet<Vendita>();
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_VENDUTE, "_"))
				.concat("\n");
		stringa += String.format("| %118s %101s", ConstantGlobal.TITOLO_TABELLA_LISTA_TV_VENDUTE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_VENDUTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_ELENCO_TV_VENDUTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_VENDUTE, "_"))
				.concat("\n");

		try {
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
					stringa += String.format(
							"|  %11s %6s %17s %12s %13s %4s %12s %8s %10s %6s %13s %6s %15s %7s %17s %4s %13s %6s %13s %7s \n",
							r.getIdFattura(), " | ", r.getIdDipendente(), " | ", r.getTv().visualizzaSeriale(), " | ",
							r.getTv().visualizzaTipologiaTv(), " | ", r.getTv().visualizzaMarca(), " | ",
							r.getCliente().VisualizzaNome(), " | ", r.getCliente().VisualizzaCognome(), " | ",
							r.getCliente().VisualizzaCodiceFiscale(), " | ",
							simpleDateFormat.format(r.getDataVendita()), " | ", r.getPrezzoVedita() + "€", " | ");
					stringa += String
							.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_ELENCO_TV_VENDUTE, "_"))
							.concat("\n");
				}
			}
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}
		return stringa;
	}
	
	/**
	 * 
	 * <b> METODO: scriviFileTVendute </b>
	 * <p>
	 * Questo metodo consente di scrivere su file tutte le informazioni di tutte le tv
	 * vendute dai dipendenti ordiante per data vendita
	 * 
	 * @param elencoDipendenti lista cotenente i dipendenti
	 * 
	 * 
	 */

	public void scriviFileTVendute(Set<Persona> elencoDipendenti) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
		ArrayList<String> stringa = new ArrayList<String>();
		Set<Vendita> tvAllVendute = new HashSet<Vendita>();
		DaoVendita salvaVendita = new DaoVenditaImp();
		if (!elencoDipendenti.isEmpty()) {
			elencoDipendenti.stream().forEach(s -> {
				try {
					tvAllVendute.addAll(s.visualizzaElencoTvVendute());
				} catch (ClienteException e) {
					System.err.println(e.getMessage());
				}
			});
			stringa.add(ConstantGlobal.TABELLA_ELENCO_TV_VENDUTE);
			tvAllVendute.stream().sorted(Comparator.comparing(p -> ((Vendita) p).getDataVendita())).forEach(r -> {
				try {
					stringa.add(String.format(
							"|  %11s %6s %17s %12s %13s %4s %12s %8s %10s %6s %13s %6s %15s %7s %17s %4s %13s %6s %13s %7s \n",
							r.getIdFattura(), " | ", r.getIdDipendente(), " | ", r.getTv().visualizzaSeriale(), " | ",
							r.getTv().visualizzaTipologiaTv(), " | ", r.getTv().visualizzaMarca(), " | ",
							r.getCliente().VisualizzaNome(), " | ", r.getCliente().VisualizzaCognome(), " | ",
							r.getCliente().VisualizzaCodiceFiscale(), " | ",
							simpleDateFormat.format(r.getDataVendita()), " | ", r.getPrezzoVedita() + "€", " | "));
				} catch (DipendenteException e) {
					System.err.println(e.getMessage());
				}

			});
		}
		salvaVendita.scriviFileVendita(String.join("", stringa));

	}
}