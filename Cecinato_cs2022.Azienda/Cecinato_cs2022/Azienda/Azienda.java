package Cecinato_cs2022.Azienda;

import java.util.Scanner;
import java.util.Set;

import Cecinato_cs2022.DaoCliente.DaoClienteImp;
import Cecinato_cs2022.DaoDipendente.DaoDipedenteImp;
import Cecinato_cs2022.DaoTelevisore.DaoTelevisoreImp;
import Cecinato_cs2022.ServiceDipendente.DaoDipendente;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.DaoTelevisore;
import Cecinato_cs2022.TelevisoreService.Televisore;
import _Cecinato_cs2022.ServiceCliente.DaoCliente;

public class Azienda {
	public static void main(String[] args) {
		DaoTelevisore fileTelevisore = new DaoTelevisoreImp();
		DaoCliente fileCliente = new DaoClienteImp();
		DaoDipendente fileDipendente = new DaoDipedenteImp();
		Set<Televisore> listaTvFornite = fileTelevisore.readFileAllTelevisore();
		Set<Persona> listaClienti = fileCliente.readFileAllClienti();
		Set<Persona> listaDipendenti = fileDipendente.readFileAllDipendente();
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
					tv = new FornitoreTv();
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo televisore");
					System.out.println("Seleziona 2 se vuoi modificare un televisore esistente");
					System.out.println("Seleziona 3 se vuoi eliminare un televisore");
					System.out.println("Seleziona 4 se vuoi visualizzare i televisori");
					System.out.println("Seleziona 5 se vuoi tornare al men� principale");
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
								listaTvFornite.add(tv.fornisciTvBase());
								break;
							case "2":
								tv.addcomponentiTvBase(listaTvFornite);
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
								listaTvFornite.add(tv.fornisciTvMedio());
								break;
							case "2":
								tv.addcomponentiTvMedio(listaTvFornite);
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
								listaTvFornite.add(tv.fornisciTvAvanzato());
								break;
							case "2":
								tv.addcomponentiTvAvanzato(listaTvFornite);
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
						tv.modificaTelevisore(listaTvFornite);
						break;
					case "3":
						tv.eliminaTelevisore(listaTvFornite);
						break;
					case "4":
						System.out.println("Seleziona 1 se vuoi visualizzare le tv fornite");
						System.out.println("Seleziona 2 se vuoi visualizzare le tv riparate");
						System.out.println("Seleziona 3 se vuoi visualizzare le tv vendute");
						System.out.println("Seleziona 4 se vuoi tornare al men� principale");
						scelta = s.next();
						switch (scelta) {
						case "1":
							System.out.println(tv.visualizzaTvFornite(listaTvFornite));
							break;
						case "2":
							System.out.println(tv.visualizzaAllTvRiparate(listaDipendenti));
							break;
						case "3":
							System.out.println(tv.visualizzaAllTvVendute(listaDipendenti));
							break;
						case "4":
							break;
						default:
							System.err.println("Hai inserito un valore non presente nel men�");
							break;
						}
						break;
					case "5":
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel men�");
						break;
					}
					break;
				case "2":
					cliente = new AccettazioneClienti();
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo cliente");
					System.out.println("Seleziona 2 se vuoi modificare un cliente esistente");
					System.out.println("Seleziona 3 se vuoi eliminare i dati del cliente");
					System.out.println("Seleziona 4 se vuoi visualizzare i clienti dell'azienda");
					System.out.println("Seleziona 5 se vuoi tornare al men� principale");
					scelta = s.next();
					switch (scelta) {
					case "1":
						System.out.println("Inserisci 1 se vuoi aggiungere un cliente");
						System.out.println("Inserisci 2 se vuoi aggiungere dei dati ad un cliente esistente");
						scelta = s.next();
						switch (scelta) {
						case "1":
							listaClienti.add(cliente.acquisizioneCliente());
							break;
						case "2":
							cliente.acquisizioneElementoCliente(listaClienti);
							break;
						default:
							System.err.println("Hai inserito un valore non presente nell'elenco");
						}
						break;
					case "2":
						cliente.modificaCliente(listaClienti);
						break;
					case "3":
						cliente.eliminaElementiCliente(listaClienti);
						break;
					case "4":
						System.out.println(cliente.visualizzaElencoClienti(listaClienti));
						break;
					case "5":
						break;
					default:
						System.err.println("hai inserito un valore non prensente nell'elenco");
						break;
					}
					break;
				case "3":
					dipendente = new RepartoDipendenti();
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo Dipendente");
					System.out.println("Seleziona 2 se vuoi modificare un Dipendente esistente");
					System.out.println("Seleziona 3 se vuoi eliminare i dati del dipendente");
					System.out.println("Seleziona 4 se vuoi visualizzare i dipendenti dell'azienda");
					System.out.println("Seleziona 5 se vuoi vendere un televisore");
					System.out.println("Seleziona 6 se vuoi riparare un televisore");
					System.out.println("Seleziona 7 se vuoi se vuoi visualizzare le tv riparate");
					System.out.println("Seleziona 8 se vuoi se vuoi visualizzare le tv vendute");
					System.out.println("Seleziona 9 se vuoi se vuoi stamapare su file le vendite ordinate per data");
					System.out.println("Seleziona 10 se vuoi tornare al men� principale");
					scelta = s.next();
					switch (scelta) {
					case "1":
						System.out.println("Inserisci 1 se vuoi aggiungere un dipendente");
						System.out.println("Inserisci 2 se vuoi aggiungere dei dati ad un dipendente esistente");
						scelta = s.next();
						switch (scelta) {
						case "1":
							listaDipendenti.add(dipendente.acquisizioneDipendente());
							break;
						case "2":
							dipendente.acquisizioneInformazioniDipendenti(listaDipendenti);
							break;
						default:
							System.err.println("Hai inserito un valore non presente nell'elenco");
							break;
						}
						break;
					case "2":
						dipendente.modificaInformazioniDipendenti(listaDipendenti);
						break;
					case "3":
						dipendente.eliminaInformazioniDipendenti(listaDipendenti);
						break;
					case "4":
						System.out.println(dipendente.visualizzaElencoDipendenti(listaDipendenti));
						break;
					case "5":
						dipendente.venditaTv(listaTvFornite, listaClienti, listaDipendenti);
						break;
					case "6":
						dipendente.riparazioneTv(listaTvFornite, listaClienti, listaDipendenti);
						break;
					case "7":
						System.out.println("Inserisci 1 se vuoi visualizzare le riparazioni si un solo dipendente");
						System.out.println("Inserisci 2 se vuoi vuoi visualizzare tutte le riparazioni");
						System.out.println(
								"Inserisci 3 se vuoi vuoi visualizzare le riparazioni in un certo range di date");
						scelta = s.next();
						switch (scelta) {
						case "1":
							System.out.println(dipendente.visualizzaRiparazioniDipendente(listaDipendenti));
							break;
						case "2":
							System.out.println(dipendente.visualizzaAllRiparazioni(listaDipendenti));
							break;
						case "3":
							System.out.println(dipendente.visualizzaAllRiparazioniRangeDate(listaDipendenti));
							break;
						default:
							System.err.println("Hai inserito un valore non presente nel men�");
							break;
						}
						break;
					case "8":
						System.out.println(dipendente.visualizzaAllVendite(listaDipendenti));
						break;
					case "9":
						dipendente.scriviFileTVendute(listaDipendenti);
						break;
					case "10":
						break;
					default:
						System.err.println("Hai inserito un valore non presente nel men�");
						break;
					}
					break;
				case "4":
					fileTelevisore.savenewALLtv(listaTvFornite);
					fileCliente.savenewALLClienti(listaClienti);
					fileDipendente.saveNewAllDipendente(listaDipendenti);
					System.exit(1);
					break;
				default:
					System.err.println("Hai inserito un valore non presente nel men�");
					break;
				}
			} while (true);
		}
	}
}
