package Cecinato_cs2022.Azienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

public class AccettazioneClienti {
	private Persona cliente;
	private String valoriUtente;
	boolean result;
	Scanner s = new Scanner(System.in);

	public Persona acquisizioneCliente() {
		try {
			System.out.println("Inserisci il codice fiscale della persona.");
			valoriUtente = s.nextLine();
			cliente = new Cliente(valoriUtente);
			do {
				try {
					System.out.println("Inserisci il nome del cliente");
					valoriUtente = s.nextLine();
					result = cliente.addNome(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci il cognome del cliente");
					valoriUtente = s.nextLine();
					result = cliente.addCognome(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(cliente.VisualizzaCognome())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci l'età del cliente");
					System.out
							.println("L'età minima che il cliente può avere è : " + ConstantGlobal.ETA_MINIMA_CLIENTE);
					System.out.println(
							"L'età Massima che il cliente può avere è : " + ConstantGlobal.ETA_MASSIMA_CLIENTE);
					int valoreUtenteint = s.nextInt();
					result = cliente.addEta(valoreUtenteint);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (cliente.VisualizzaEta() > 0) {
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
						cliente.visualizzaElencoGenerePersona();
					}
					System.out.println("Inserisci il genere del cliente");
					valoriUtente = s.nextLine();
					result = cliente.addGenere(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (cliente.VisualizzaGenere() != null) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);

			do {
				try {
					System.out.println("Inserisci la data di nascita del cliente");
					System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
					valoriUtente = s.nextLine();
					result = cliente.addDataNascita(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(cliente.VisualizzaDataNascita())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci la città di nascita del cliente");
					valoriUtente = s.nextLine();
					result = cliente.addCitta(valoriUtente);
				} catch (PersonaException e) {
					System.err.println(e.getMessage());
					if (StringUtils.isNotBlank(cliente.VisualizzaCitta())) {
						result = true;
					} else {
						result = false;
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserisci il nome della carta fedeltà del cliente");
					valoriUtente = s.nextLine();
					result = cliente.addNomeCartaFedelta(valoriUtente);
				} catch (ClienteException | DipendenteException e) {
					System.err.println(e.getMessage());
					try {
						if (StringUtils.isNotBlank(cliente.VisualizzaNomeCartaFedelta())) {
							result = true;
						} else {
							result = false;
						}
					} catch (DipendenteException e1) {
						System.err.println(e1.getMessage());
					}
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserimento automatico del numero di carta del cliente");
					result = cliente.addNumeroCartaFedelta();
				} catch (ClienteException | DipendenteException e) {
					System.err.println(e.getMessage());
				}
			} while (result == false);
			do {
				try {
					System.out.println("Inserimento della data di insrizione della carta di fedeltà del cliente");
					System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
					valoriUtente = s.nextLine();
					result = cliente.addDataInscrizioneTessera(valoriUtente);
				} catch (ClienteException | DipendenteException e) {
					System.err.println(e.getMessage());
					try {
						if (StringUtils.isNotBlank(cliente.VisualizzaDataInscrizioneTessera())) {
							result = true;
						} else {
							result = false;
						}
					} catch (DipendenteException e1) {
						System.err.println(e1.getMessage());
					}
				}

			} while (result == false);
			do {
				try {
					System.out.println("Inserisci i punti accumulati del cliente");
					System.out.println("i punti massimi che si possono inserire sono = "
							+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
					System.out.println("Se l'utente è nuovo inserisci 0 punti accumulati");
					valoriUtente = s.nextLine();
					result = cliente.addPuntiFedeltaAccumulati(valoriUtente);
				} catch (ClienteException | DipendenteException e) {
					System.err.println(e.getMessage());
					try {
						if (StringUtils.isNotBlank(cliente.VisualizzaPuntiFedeltaAccumulati())) {
							result = true;
						} else {
							result = false;
						}
					} catch (DipendenteException e1) {
						System.err.println(e1.getMessage());
					}
				}
			} while (result == false);
		} catch (

		PersonaException e) {
			System.err.println(e.getMessage());
		}
		return cliente;
	}

	public void acquisizioneElementoCliente(Set<Persona> clienti) {
		System.out.println("Inserisci 1 se vuoi visalizzare i clienti presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaElencoClienti(clienti));
		}
		System.out.println("Inserisci il codice fiscale della persona che vuoi modificare i dati.");
		valoriUtente = s.nextLine();
		ArrayList<Object> resultControllo;
		try {
			resultControllo = ControlliGlobal.controlloPersona(valoriUtente, clienti);
			if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
				cliente = (Persona) resultControllo.get(1);
				do {
					System.out.println("Inserisci 1 se vuoi aggiungere il nome del cliente");
					System.out.println("Inserisci 2 se vuoi aggiungere il cognome del cliente");
					System.out.println("Inserisci 3 se vuoi aggiungere l' età del cliente");
					System.out.println("Inserisci 4 se vuoi aggiungere il genere del cliente");
					System.out.println("Inserisci 5 se vuoi aggiungere la data di nascita del cliente");
					System.out.println("Inserisci 6 se vuoi aggiungere la citta di nascita del cliente");
					System.out.println("Inserisci 7 se vuoi aggiungere il nome della carta di fedeltà del cliente");
					System.out.println("Inserisci 8 se vuoi modificare il numero di carta di fedeltà del cliente");
					System.out
							.println("Inserisci 9 se vuoi aggiungere la data di inscrizione della tessera del cliente");
					System.out.println("inserisci 10 se vuoi aggiungere i punti fedeltà accumulati cliente");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						do {
							try {
								System.out.println("Inserisci il nome del cliente");
								valoriUtente = s.nextLine();
								result = cliente.addNome(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaNome())) {
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
								System.out.println("Inserisci il cognome del cliente");
								valoriUtente = s.nextLine();
								result = cliente.addCognome(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaCognome())) {
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

								System.out.println("Inserisci l'età del cliente");
								System.out.println("L'età minima che il cliente può avere è : "
										+ ConstantGlobal.ETA_MINIMA_CLIENTE);
								System.out.println("L'età Massima che il cliente può avere è : "
										+ ConstantGlobal.ETA_MASSIMA_CLIENTE);
								int valoreUtenteint = s.nextInt();
								result = cliente.addEta(valoreUtenteint);
								s.nextLine();
							} catch (InputMismatchException e) {
								System.err.println("Hai inserito un valore non intero");
								s.nextLine();
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (cliente.VisualizzaEta() != 0) {
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
									cliente.visualizzaElencoGenerePersona();
								}
								System.out.println("Inserisci il genere del cliente");
								valoriUtente = s.nextLine();
								result = cliente.addGenere(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (cliente.VisualizzaGenere() != null) {
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
								System.out.println("Inserisci la data di nascita del cliente");
								System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
								valoriUtente = s.nextLine();
								result = cliente.addDataNascita(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaDataNascita())) {
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
								System.out.println("Inserisci la città di nascita del cliente");
								valoriUtente = s.nextLine();
								result = cliente.addCitta(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaCitta())) {
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
								System.out.println("Inserisci il nome della carta fedeltà del cliente");
								valoriUtente = s.nextLine();
								result = cliente.addNomeCartaFedelta(valoriUtente);
							} catch (ClienteException  e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaNomeCartaFedelta())) {
									result = true;
								} else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "8":
						do {
							try {
								System.out.println("Inserimento automatico del numero di carta del cliente");
								result = cliente.addNumeroCartaFedelta();
							} catch (ClienteException e) {
								System.err.println(e.getMessage());
							}
						} while (result == false);
						break;
					case "9":
						do {
							try {
								System.out.println(
										"Inserimento della data di insrizione della carta di fedeltà del cliente");
								System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
								valoriUtente = s.nextLine();
								result = cliente.addDataInscrizioneTessera(valoriUtente);
							} catch (ClienteException  e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaDataInscrizioneTessera())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "10":
						do {
							try {
								System.out.println("Inserisci i punti accumulati del cliente");
								System.out.println("i punti massimi che si possono inserire sono = "
										+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
								System.out.println("Se l'utente è nuovo inserisci 0 punti accumulati");
								valoriUtente = s.nextLine();
								result = cliente.addPuntiFedeltaAccumulati(valoriUtente);
							} catch (ClienteException  e) {
								System.err.println(e.getMessage());
								if (StringUtils.isNotBlank(cliente.VisualizzaPuntiFedeltaAccumulati())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel menù");
						break;
					}
					System.out.println("Inserisci 1 se vuoi fare altre operazioni su questo cliente");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			} else {
				System.err.println("il codice fiscale " + valoriUtente + " non presente");
			}
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}

	}

	public String visualizzaElencoClienti(Set<Persona> clienti) {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
				.concat("\n");
		stringa += String.format("| %110s %110s", ConstantGlobal.TITOLO_TABELLA_CLIENTE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_CLIENTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
				.concat("\n");
		if (!clienti.isEmpty()) {
			Iterator<Persona> elenco_clienti = clienti.iterator();
			while (elenco_clienti.hasNext()) {
				Persona c = elenco_clienti.next();
				try {
					stringa += String.format(
							"| %18s %5s %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %20s %6s %17s %10s %13s %5s %12s %11s \n",
							c.VisualizzaCodiceFiscale(), " | ", c.VisualizzaNome(), " | ", c.VisualizzaCognome(), " | ",
							c.VisualizzaEta(), " | ", c.VisualizzaGenere(), " | ", c.VisualizzaDataNascita(), " | ",
							c.VisualizzaCitta(), " | ", c.VisualizzaNomeCartaFedelta(), " | ",
							c.VisualizzaDataInscrizioneTessera(), " | ", c.VisualizzaNumeroCartaFedelta(), " | ",
							c.VisualizzaPuntiFedeltaAccumulati(), " | ");
					stringa += String
							.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
							.concat("\n");
				} catch ( DipendenteException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		return stringa;
	}

	public void modificaCliente(Set<Persona> clienti) {
		System.out.println("Inserisci 1 se vuoi visalizzare i clienti presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaElencoClienti(clienti));
		}
		System.out.println("Inserisci il codice fiscale della persona che vuoi modificare i dati.");
		valoriUtente = s.nextLine();
		ArrayList<Object> resultControllo;
		try {
			resultControllo = ControlliGlobal.controlloPersona(valoriUtente, clienti);
			if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
				cliente = (Persona) resultControllo.get(1);
				do {
					System.out.println("inserisci 1 se vuoi modificare il codice fiscale del cliente");
					System.out.println("Inserisci 2 se vuoi modificare il nome del cliente");
					System.out.println("Inserisci 3 se vuoi modificare il cognome del cliente");
					System.out.println("Inserisci 4 se vuoi modificare l' età del cliente");
					System.out.println("Inserisci 5 se vuoi modificare il genere del cliente");
					System.out.println("Inserisci 6 se vuoi modificare la data di nascita del cliente");
					System.out.println("Inserisci 7 se vuoi modificare la citta di nascita del cliente");
					System.out.println("Inserisci 8 se vuoi modificare il nome della carta di fedeltà del cliente");
					System.out.println("Inserisci 9 se vuoi modificare il numero di carta di fedeltà del cliente");
					System.out.println(
							"Inserisci 10 se vuoi modificare la data di inscrizione della tessera del cliente");
					System.out.println("inserisci 11 se vuoi modificare  i punti fedeltà accumulati cliente");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						System.out.println("Inserisci il codice fiscale del cliente che vuoi modificare");
						valoriUtente = s.nextLine();
						ArrayList<Object> risultato = ControlliGlobal.controlloPersona(valoriUtente, clienti);
						if (!risultato.isEmpty() && risultato.get(0).equals(true)) {
							Persona persona = (Persona) risultato.get(1);
							do {
								System.out.println("Inserisci il nuovo codice fiscale del cliente ");
								valoriUtente = s.nextLine();
								try {
									persona.modificaCodiceFiscale(valoriUtente);
									result = true;
								} catch (ClienteException e) {
									System.err.println(e.getMessage());
								}
							} while (result == false);
						}
						break;
					case "2":
						do {
							try {
								System.out.println("Inserisci il nome del cliente che vuoi modificare");
								valoriUtente = s.nextLine();
								result = cliente.modificaNome(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(cliente.VisualizzaNome())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "3":
						do {
							try {
								System.out.println("Inserisci il cognome del cliente del cliente che vuoi modificare");
								valoriUtente = s.nextLine();
								result = cliente.modificaCognome(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(cliente.VisualizzaCognome())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "4":
						do {
							try {
								System.out.println("Inserisci l'età del cliente che vuoi modificare");
								System.out.println("L'età minima che il cliente può avere è : "
										+ ConstantGlobal.ETA_MINIMA_CLIENTE);
								System.out.println("L'età Massima che il cliente può avere è : "
										+ ConstantGlobal.ETA_MASSIMA_CLIENTE);
								int valoreUtenteint = s.nextInt();
								result = cliente.modificaEta(valoreUtenteint);
							} catch (InputMismatchException e) {
								System.err.println("Hai inserito un valore non intero");
								s.nextLine();
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (cliente.VisualizzaEta()==0) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "5":
						do {
							try {
								System.out.println("Inserisci 1 se vuoi visualizzare i generi presenti");
								valoriUtente = s.next();
								s.nextLine();
								if (StringUtils.equals(valoriUtente, "1")) {
									cliente.visualizzaElencoGenerePersona();
								}
								System.out.println("Inserisci il genere del cliente che vuoi modificare");
								valoriUtente = s.nextLine();
								result = cliente.modificaGenere(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (cliente.VisualizzaGenere()==null) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "6":
						do {
							try {
								System.out.println("Inserisci la data di nascita del cliente che vuoi modificare");
								System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
								valoriUtente = s.nextLine();
								result = cliente.modificaDataNascita(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
							}
						} while (result == false);
						break;
					case "7":
						do {
							try {
								System.out.println(
										"Inserisci la città di nascita del cliente del cliente che vuoi modificare");
								valoriUtente = s.nextLine();
								result = cliente.modificaCitta(valoriUtente);
							} catch (PersonaException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(cliente.VisualizzaCitta())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "8":
						do {
							try {
								System.out.println(
										"Inserisci il nome della carta fedeltà del cliente che vuoi modificare");
								valoriUtente = s.nextLine();
								result = cliente.modificaNomeCartaFedelta(valoriUtente);
							} catch (ClienteException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(cliente.VisualizzaNomeCartaFedelta())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "9":
						do {
							try {
								System.out.println("modifica automatica del numero di carta del cliente");
								result = cliente.modificaNumeroCartaFedelta();
							} catch (ClienteException e) {
								System.err.println(e.getMessage());
							}
						} while (result == false);
						break;
					case "10":
						do {
							try {
								System.out.println(
										"Inserisci la data di insrizione della carta di fedeltà del cliente che vuoi modificare");
								System.out.println("la data di nascita ha questo formato : gg/mm/aaaa");
								valoriUtente = s.nextLine();
								result = cliente.modificaDataInscrizioneTessera(valoriUtente);
							} catch (ClienteException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(cliente.VisualizzaDataInscrizioneTessera())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					case "11":
						do {
							try {
								System.out.println("operazioni che si possono fare sui punti sono: ");
								cliente.visualizzaElencoOperazioniPunti();
								System.out.println(
										"Inserisci il valore associato all'operazione presente tra le scelte possibili");
								valoriUtente = s.nextLine();
								switch (valoriUtente) {
								case "1":
									System.out.println("Inserisci i punti accumulati del cliente");
									System.out.println("i punti massimi che si possono inserire sono = "
											+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
									System.out.println("Se l'utente è nuovo inserisci 0 punti accumulati");
									valoriUtente = s.nextLine();
									result = cliente.modificaPuntiFedeltaAccumulati(valoriUtente,
											ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI);
									break;
								case "2":
									System.out.println("Inserisci i punti accumulati del cliente");
									System.out.println("i punti massimi che si possono inserire sono = "
											+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
									System.out.println("Se l'utente è nuovo inserisci 0 punti accumulati");
									valoriUtente = s.nextLine();
									result = cliente.modificaPuntiFedeltaAccumulati(valoriUtente,
											ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA.SOTTRAI);
									break;
								case "3":
									System.out.println("Inserisci i punti accumulati del cliente");
									System.out.println("i punti massimi che si possono inserire sono = "
											+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
									System.out.println("Se l'utente è nuovo inserisci 0 punti accumulati");
									valoriUtente = s.nextLine();
									result = cliente.modificaPuntiFedeltaAccumulati(valoriUtente,
											ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA.SOSTITUISCI);
									break;
								default:
									System.err.println("Hai inserito un valore non presente nell'elenco");
									break;
								}
							} catch (ClienteException e) {
								System.err.println(e.getMessage());
								if (StringUtils.isAllEmpty(cliente.VisualizzaPuntiFedeltaAccumulati())) {
									result = true;
								}else {
									result = false;
								}
							}
						} while (result == false);
						break;
					default:
						System.out.println("Hai inserito un valore non prensente nell'elenco");
					}
					System.out.println("Inserisci 1 se vuoi fare altre operazioni sullo stesso cliente");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			} else {
				System.err.println("| Errore nell'inserimento |");
				System.err.println("hai inserito un seriale sbagliato \n");
			}
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	public void eliminaElementiCliente(Set<Persona> clienti) {
		System.out.println("Inserisci 1 se vuoi visalizzare i clienti presenti");
		valoriUtente = s.nextLine();
		if (StringUtils.equals(valoriUtente, "1")) {
			System.out.println(visualizzaElencoClienti(clienti));
		}
		System.out.println("Inserisci il codice fiscale della persona che vuoi modificare i dati.");
		valoriUtente = s.nextLine();
		ArrayList<Object> resultControllo;
		try {
			resultControllo = ControlliGlobal.controlloPersona(valoriUtente, clienti);
			if (!resultControllo.isEmpty() && resultControllo.get(0).equals(true)) {
				cliente = (Persona) resultControllo.get(1);
				do {
					System.out.println("Inserisci 1 se vuoi eliminare il nome del cliente");
					System.out.println("Inserisci 2 se vuoi eliminare il cognome del cliente");
					System.out.println("Inserisci 3 se vuoi eliminare l' età del cliente");
					System.out.println("Inserisci 4 se vuoi eliminare il genere del cliente");
					System.out.println("Inserisci 5 se vuoi eliminare la data di nascita del cliente");
					System.out.println("Inserisci 6 se vuoi eliminare la citta di nascita del cliente");
					System.out.println("Inserisci 7 se vuoi eliminare il nome della carta di fedeltà del cliente");
					System.out.println("Inserisci 8 se vuoi eliminare il numero di carta di fedeltà del cliente");
					System.out
							.println("Inserisci 9 se vuoi eliminare la data di inscrizione della tessera del cliente");
					System.out.println("inserisci 10 se vuoi eliminare i punti fedeltà accumulati cliente");
					valoriUtente = s.nextLine();
					switch (valoriUtente) {
					case "1":
						try {
							cliente.eliminaNome();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "2":
						try {
							cliente.eliminaCognome();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "3":
						try {
							result = cliente.eliminaEta();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "4":
						try {
							result = cliente.eliminaGenere();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "5":
						try {
							cliente.eliminaDataNascita();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "6":
						try {
							cliente.eliminaCitta();
						} catch (PersonaException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "7":
						try {
							result = cliente.eliminaNomeCartaFedelta();
						} catch (ClienteException e) {
							System.err.println(e.getMessage());
						}

						break;
					case "8":
						try {
							cliente.eliminaNumeroCartaFedelta();
						} catch (ClienteException e) {
							System.err.println(e.getMessage());
						}

						break;
					case "9":
						try {
							cliente.eliminaDataInscrizioneTessera();
						} catch (ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					case "10":
						try {
							cliente.eliminaPuntiAccumulati();
						} catch (ClienteException e) {
							System.err.println(e.getMessage());
						}
						break;
					default:
						System.out.println("Hai inserito un valore non prensente nell'elenco");
					}
					System.out.println("Inserisci 1 se vuoi fare altre operazioni sullo stesso cliente");
					valoriUtente = s.nextLine();
				} while (StringUtils.equals(valoriUtente, "1"));
			} else {
				System.err.println("| Errore nell'inserimento |");
				System.err.println("hai inserito un seriale sbagliato \n");
			}
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
}
