package Cecinato_cs2022.Azienda;

import java.util.Scanner;
import java.util.Set;

import Cecinato_cs2022.DaoCliente.DaoClienteImp;
import Cecinato_cs2022.DaoDipendente.DaoDipedenteImp;
import Cecinato_cs2022.DaoTelevisore.DaoTelevisoreImp;
import Cecinato_cs2022.ServiceCliente.DaoCliente;
import Cecinato_cs2022.ServiceDipendente.DaoDipendente;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.DaoTelevisore;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: Azienda </b>
 * <p>
 * Questa classe consente di avviare il programma per la gestione delle vendite
 * e riparazioni delle tv.
 *
 * 
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

public class Azienda {

	/**
	 * 
	 * <p>
	 * <b> CLASSE: main </b>
	 * <p>
	 * Questo metodo, è il metodo pricipale per l'avvio del programma che conente di
	 * richiamre tutti i metodi per far funzionare il programma.
	 * 
	 * @param args Lista di valori che possono essere assduti attraverso il pront di
	 *             comandi
	 *
	 * 
	 ***/

	public static void main(String[] args) {
		DaoTelevisore fileTelevisore = new DaoTelevisoreImp(); /// instanzio l'oggetto per leggere e scrivere su file i
																/// televisori
		DaoCliente fileCliente = new DaoClienteImp();
		/// instanzio l'oggetto per leggere e scrivere su file i
		/// clienti
		DaoDipendente fileDipendente = new DaoDipedenteImp(); /// instanzio l'oggetto per leggere e scrivere su file i
		/// dipendenti
		Set<Televisore> listaTvFornite = fileTelevisore.readFileAllTelevisore(); /// leggo le tv salvate sul file e le
																					/// inserisco nella lista che
																					/// conterrà tv
		Set<Persona> listaClienti = fileCliente.readFileAllClienti(); /// leggo i clienti salvat sul file e le inserisco
																		/// nella lista che conterra i clienti
		Set<Persona> listaDipendenti = fileDipendente.readFileAllDipendente(); /// leggo i dipendenti salvati sul file e
																				/// le inserisco nella lista che
																				/// conterra i dipendenti

		/// imposto le varibili che verranno instanziate al momento opportuno
		FornitoreTv tv = null;
		AccettazioneClienti cliente = null;
		RepartoDipendenti dipendente = null;
		String scelta;
		try (Scanner s = new Scanner(System.in)) {
			do {
				System.out.println("Seleziona 1 se vuoi entrare nel reparto televisore");
				System.out.println("Seleziona 2 se vuoi entrare come cliente");
				System.out.println("Seleziona 3 se vuoi entrare come dipendente");
				System.out.println("Seleziona 4 se vuoi uscire");
				scelta = s.next();
				switch (scelta) {
				case "1":
					tv = new FornitoreTv(); /// instanzio la classe che mi consente di fornire e gestire le tv
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo televisore");
					System.out.println("Seleziona 2 se vuoi modificare un televisore esistente");
					System.out.println("Seleziona 3 se vuoi eliminare un televisore");
					System.out.println("Seleziona 4 se vuoi visualizzare i televisori");
					System.out.println("Seleziona 5 se vuoi tornare al menù principale");
					scelta = s.next();
					switch (scelta) {
					case "1":
						System.out.println("scegli che tipologia di televisore Vuoi inserire");
						System.out.println("Seleziona 1 se televisore di tipo Base");
						System.out.println("Seleziona 2 se Televisore di tipo Medio");
						System.out.println("Seleziona 3 se Televisore di tipo Avanzato");
						System.out.println("Seleziona 4 se non vuoi fare nessun operazione");
						scelta = s.next();
						switch (scelta) {
						case "1":
							System.out.println("Inserisci 1 se vuoi aggiungere il televisore di tipo base");
							System.out.println(
									"Inserisci 2 se vuoi aggiungere dei dati ad un televisore di tipo base  esistente");
							scelta = s.next();
							switch (scelta) {
							case "1":
								listaTvFornite.add(tv.fornisciTvBase()); /// metodo per acquisire un nuova tv di tipo
																			/// base
								break;
							case "2":
								tv.addcomponentiTvBase(listaTvFornite); // metodo che consente di acquisire dei
																		// paramentri della tv di tipo base già
																		// esistente
								break;
							default:
								System.err.println("Hai inserito un valore non presente nell'elenco");
							}

							break;
						case "2":
							System.out.println("Inserisci 1 se vuoi aggiungere il televisore di tipo medio");
							System.out.println(
									"Inserisci 2 se vuoi aggiungere dei dati ad un televisore di tipo medio  esistente");
							scelta = s.next();
							switch (scelta) {
							case "1":
								listaTvFornite.add(tv.fornisciTvMedio()); /// metodo per acquisire un nuova tv di tipo
																			/// medio
								break;
							case "2":
								tv.addcomponentiTvMedio(listaTvFornite);// metodo che consente di acquisire dei
								// paramentri della tv di tipo medio già
								// esistente
								break;
							default:
								System.err.println("Hai inserito un valore non presente nell'elenco");
							}

							break;
						case "3":
							System.out.println("Inserisci 1 se vuoi aggiungere il televisore di tipo avanzato");
							System.out.println(
									"Inserisci 2 se vuoi aggiungere dei dati ad un televisore di tipo avanzato esistente");
							scelta = s.next();
							switch (scelta) {
							case "1":
								listaTvFornite.add(tv.fornisciTvAvanzato()); /// metodo per acquisire un nuova tv di
																				/// tipo
								/// avanzato
								break;
							case "2":
								tv.addcomponentiTvAvanzato(listaTvFornite);// metodo che consente di acquisire dei
								// paramentri della tv di tipo avanzato già
								// esistente
								break;
							default:
								System.err.println("Hai inserito un valore non presente nell'elenco");
							}
							break;
						case "4":
							break;
						default:
							System.err.println("hai inserito un valore non prensente nell'elenco");
							break;
						}
						break;
					case "2":
						tv.modificaTelevisore(listaTvFornite); // metodo che consente di modificare dei
						// paramentri della tv già
						// esistente
						break;
					case "3":
						tv.eliminaTelevisore(listaTvFornite);// metodo che consente di eliminare una tv già esistente
						break;
					case "4":
						System.out.println("Seleziona 1 se vuoi visualizzare le tv fornite");
						System.out.println("Seleziona 2 se vuoi visualizzare le tv riparate");
						System.out.println("Seleziona 3 se vuoi visualizzare le tv vendute");
						System.out.println("Seleziona 4 se vuoi tornare al menù principale");
						scelta = s.next();
						switch (scelta) {
						case "1":
							System.out.println(tv.visualizzaTvFornite(listaTvFornite)); /// metodo che consente far
																						/// visualizzare le tv fornite
							break;
						case "2":
							System.out.println(tv.visualizzaAllTvRiparate(listaDipendenti));/// metodo che consente far
																							/// visualizzare tutte le tv
																							/// riparate
							break;
						case "3":
							System.out.println(tv.visualizzaAllTvVendute(listaDipendenti));/// metodo che consente far
																							/// visualizzare tutte le tv
																							/// vendute
							break;
						case "4":
							break;
						default:
							System.err.println("Hai inserito un valore non presente nel menù");
							break;
						}
						break;
					case "5":
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel menù");
						break;
					}
					break;
				case "2":
					cliente = new AccettazioneClienti(); /// instanzio la classe che consente di gestire i clienti
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo cliente");
					System.out.println("Seleziona 2 se vuoi modificare un cliente esistente");
					System.out.println("Seleziona 3 se vuoi eliminare i dati del cliente");
					System.out.println("Seleziona 4 se vuoi visualizzare i clienti dell'azienda");
					System.out.println("Seleziona 5 se vuoi tornare al menù principale");
					scelta = s.next();
					switch (scelta) {
					case "1":
						System.out.println("Inserisci 1 se vuoi aggiungere un cliente");
						System.out.println("Inserisci 2 se vuoi aggiungere dei dati ad un cliente esistente");
						scelta = s.next();
						switch (scelta) {
						case "1":
							listaClienti.add(cliente.acquisizioneCliente()); /// metodo che consente di acquisire un
																				/// nuovo cliente
							break;
						case "2":
							cliente.acquisizioneElementoCliente(listaClienti); /// metodo che consente di acquisire
																				/// delle informazioni del cliente
																				/// esistente
							break;
						default:
							System.err.println("Hai inserito un valore non presente nell'elenco");
						}
						break;
					case "2":
						cliente.modificaCliente(listaClienti);/// metodo che consente di modificare delle infromazioni
																/// di un cliente esistente
						break;
					case "3":
						cliente.eliminaElementiCliente(listaClienti); /// metodo che consente di eliminare il cliente
						break;
					case "4":
						System.out.println(cliente.visualizzaElencoClienti(listaClienti));/// metodo che consente di
																							/// visualizzare l'elenco
																							/// dei clienti
						break;
					case "5":
						break;
					default:
						System.err.println("hai inserito un valore non prensente nell'elenco");
						break;
					}
					break;
				case "3":
					dipendente = new RepartoDipendenti(); /// instanzio la classe che mi permette di gestire i
															/// dipendenti
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo Dipendente");
					System.out.println("Seleziona 2 se vuoi modificare un Dipendente esistente");
					System.out.println("Seleziona 3 se vuoi eliminare i dati del dipendente");
					System.out.println("Seleziona 4 se vuoi visualizzare i dipendenti dell'azienda");
					System.out.println("Seleziona 5 se vuoi vendere un televisore");
					System.out.println("Seleziona 6 se vuoi riparare un televisore");
					System.out.println("Seleziona 7 se vuoi se vuoi visualizzare le tv riparate");
					System.out.println("Seleziona 8 se vuoi se vuoi visualizzare le tv vendute");
					System.out.println("Seleziona 9 se vuoi se vuoi stamapare su file le vendite ordinate per data");
					System.out.println("Seleziona 10 se vuoi tornare al menù principale");
					scelta = s.next();
					switch (scelta) {
					case "1":
						System.out.println("Inserisci 1 se vuoi aggiungere un dipendente");
						System.out.println("Inserisci 2 se vuoi aggiungere dei dati ad un dipendente esistente");
						scelta = s.next();
						switch (scelta) {
						case "1":
							listaDipendenti.add(dipendente.acquisizioneDipendente()); /// metodo che consente di
																						/// acquisire un nuovo dipendete
							break;
						case "2":
							dipendente.acquisizioneInformazioniDipendenti(listaDipendenti); /// metodo che consente di
																							/// acquisire delle
																							/// informazioni su
																							/// dipendete esistente
							break;
						default:
							System.err.println("Hai inserito un valore non presente nell'elenco");
							break;
						}
						break;
					case "2":
						dipendente.modificaInformazioniDipendenti(listaDipendenti); /// metodo che consente di
																					/// modificare le informazioni di un
																					/// dipendente
						break;
					case "3":
						dipendente.eliminaInformazioniDipendenti(listaDipendenti); /// metodo che consente di eliminare
																					/// le informazioni di un dipendente
						break;
					case "4":
						System.out.println(dipendente.visualizzaElencoDipendenti(listaDipendenti)); /// metodo che
																									/// consente di far
																									/// visualizzare
																									/// l'elenco dei
																									/// dipendenti
						break;
					case "5":
						dipendente.venditaTv(listaTvFornite, listaClienti, listaDipendenti); /// questo metodo consente
																								/// di vedere un
																								/// televisore
						break;
					case "6":
						dipendente.riparazioneTv(listaTvFornite, listaClienti, listaDipendenti);/// questo metodo
																								/// consente di riparare
																								/// un televisore di un
																								/// cliente
						break;
					case "7":
						System.out.println("Inserisci 1 se vuoi visualizzare le riparazioni si un solo dipendente");
						System.out.println("Inserisci 2 se vuoi vuoi visualizzare tutte le riparazioni");
						System.out.println(
								"Inserisci 3 se vuoi vuoi visualizzare le riparazioni in un certo range di date");
						scelta = s.next();
						switch (scelta) {
						case "1":
							System.out.println(dipendente.visualizzaRiparazioniDipendente(listaDipendenti)); /// questo
																												/// metodo
																												/// consente
																												/// di
																												/// far
																												/// visalizzare
																												/// le
																												/// riparazioni
																												/// che
																												/// ha
																												/// effettuato
																												/// un
																												/// dipendente
							break;
						case "2":
							System.out.println(dipendente.visualizzaAllRiparazioni(listaDipendenti)); /// questo metodo
																										/// consente di
																										/// far
																										/// visualizzare
																										/// tutte le
																										/// riparazioni
																										/// dei
																										/// dipendenti
							break;
						case "3":
							System.out.println(dipendente.visualizzaAllRiparazioniRangeDate(listaDipendenti)); /// questo
																												/// metodo
																												/// consente
																												/// di
																												/// far
																												/// visualizzare
																												/// le
																												/// riparazioni
																												/// fatte
																												/// in
																												/// un
																												/// range
																												/// di
																												/// date
							break;
						default:
							System.err.println("Hai inserito un valore non presente nel menù");
							break;
						}
						break;
					case "8":
						System.out.println(dipendente.visualizzaAllVendite(listaDipendenti)); /// questo metodo consente
																								/// di far visualizzare
																								/// tutte le tv vendute
																								/// dai dipendenti
						break;
					case "9":
						dipendente.scriviFileTVendute(listaDipendenti); /// questo metodo consente di scrivere su file
																		/// le tv vendute dai dipendenti
						break;
					case "10":
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel menù");
						break;
					}
					break;
				case "4":

					fileTelevisore.savenewALLtv(listaTvFornite); /// consente di salvare su file tutte le tv fornite
																	/// prima della chiusura del programma
					fileCliente.savenewALLClienti(listaClienti);/// consente di salvere su file tutti i clienti prima
																/// della chiusura del programma
					fileDipendente.saveNewAllDipendente(listaDipendenti); /// consente di salvere su file tutti i
																			/// dipendenti prima della chiusura del
																			/// programma
					System.exit(1);
					break;
				default:
					System.err.println("Hai inserito un valore non presente nel menù");
					break;
				}
			} while (true);
		}
	}
}
