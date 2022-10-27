package Cecinato_cs2022.Azienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

public class RepartoDipendenti {
	private Persona dipendente;
	private String valoriUtente;
	boolean result;
	Scanner s = new Scanner(System.in);

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
				} catch (PersonaException e) {
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
			} catch (PersonaException e) {
				System.err.println(e.getMessage());
			}
			do {
				try {
					System.out.println("Inserisci il numero aziendale del dipendente");
					System.out.println("il formato da rispettare è: '+39 3298934789'");
					valoriUtente = s.nextLine();
					result = dipendente.addNumeroTelefonoAziendale(valoriUtente);
				} catch (PersonaException e) {
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
				} catch (PersonaException e) {
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
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(dipendente.visualizzaRuoloDipendente())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
		} catch (

		PersonaException e) {
			System.err.println(e.getMessage());
		}
		return dipendente;
	}

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
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		return stringa;
	}

	public void acquisizioneInformazioniDipendenti(Set<Persona> elencoDipendenti) {
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
					System.out
							.println("Inserisci 7 se vuoi aggiungere il nome dell'azienda in cui lavora il dipendente");
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
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(dipendente.visualizzaNomeAziendaDipendente())) {
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
							valoriUtente = s.nextLine();
							result = dipendente.modificaEmailAziendale();
						} catch (PersonaException e) {
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
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(dipendente.visualizzaNumeroTelefonoAziendaleDipendente())) {
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
							} catch (PersonaException e) {
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
							} catch (PersonaException e) {
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
		} catch (

		PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

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
								result = dipendente.addNome(valoriUtente);
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
								result = dipendente.addEta(valoreUtenteint);
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
						break;
					case "5":
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
						break;
					case "6":
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
						break;
					case "7":
						do {
							try {
								System.out.println("Inserisci il nome dell'azienda in cui lavora il dipendente");
								valoriUtente = s.nextLine();
								result = dipendente.addNomeAzienda(valoriUtente);
							} catch (PersonaException e) {
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
							valoriUtente = s.nextLine();
							result = dipendente.addEmailAziendale();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "9":
						do {
							try {
								System.out.println("Inserisci il numero aziendale del dipendente");
								System.out.println("il formato da rispettare è: '+39 3298934789'");
								valoriUtente = s.nextLine();
								result = dipendente.addNumeroTelefonoAziendale(valoriUtente);
							} catch (PersonaException e) {
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
								result = dipendente.addtipologiaContratto(valoriUtente);
							} catch (PersonaException e) {
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
								result = dipendente.addRuolo(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(dipendente.visualizzaRuoloDipendente())) {
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
				System.err.println("il codice identificativo " + valoriUtente + " non presente");
			}
		} catch (

		PersonaException e) {
			System.err.println(e.getMessage());
		}

	}

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
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
							}
						break;
					case "8":
						try {
							dipendente.eliminaEmailAziendale();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "9":
							try {
								dipendente.eliminaNumeroTelefonoAziendale();
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
							}
						break;
					case "10":
							try {
								dipendente.eliminatipologiaContratto();
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
							}
						break;
					case "11":
							try {
								dipendente.eliminaRuolo();
							} catch (PersonaException e) {
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
		} catch (

		PersonaException e) {
			System.err.println(e.getMessage());
		}

	}
}
