package Cecinato_cs2022.main;


import java.util.Scanner;
import java.util.Set;

import Cecinato_cs2022.DaoTelevisore.DaoTelevisoreImp;

import Cecinato_cs2022.TelevisoreService.DaoTelevisore;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class Azienda {
	public static void main(String[] args) {
		DaoTelevisore file = new DaoTelevisoreImp();
		Set<Televisore> listaTvFornite = file.readFileAllTelevisore();
		FornitoreTv tv = null;
		String scelta;
		try (Scanner s = new Scanner(System.in)) {
			do {
				System.out.println("Seleziona 1 se vuoi entrare nel reparto televisore");
				System.out.println("Seleziona 2 se vuoi entrare come cliente");
				System.out.println("Seleziona 3 se vuoi entrare come dipendente");
				System.out.println("Seleziona 4 se vuoi uscire");
				scelta = s.next();
				System.out.flush();
				switch (scelta) {
				case "1":
					tv = new FornitoreTv();
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo televisore");
					System.out.println("Seleziona 2 se vuoi modificare un televisore esistente");
					System.out.println("Seleziona 3 se vuoi eliminare un televisore");
					System.out.println("Seleziona 4 se vuoi visualizzare i televisori forniti");
					System.out.println("Seleziona 5 se vuoi tornare al menù principale");
					scelta = s.next();
					System.out.flush();
					switch (scelta) {
					case "1":
						System.out.println("scegli che tipologia di televisore Vuoi inserire");
						System.out.println("Seleziona 1 se televisore di tipo Base");
						System.out.println("Seleziona 2 se Televisore di tipo Medio");
						System.out.println("Seleziona 3 se Televisore di tipo Avanzato");
						System.out.println("Seleziona 4 se non vuoi fare nessun operazione");
						scelta = s.next();
						System.out.flush();
						switch (scelta) {
						case "1":
							listaTvFornite.add(tv.fornisciTvBase());
							break;
						case "2":
							listaTvFornite.add(tv.fornisciTvMedio());
							break;
						case "3":
							listaTvFornite.add(tv.fornisciTvAvanzato());
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
						System.out.println(tv.visualizzaTvFornite(listaTvFornite));
						break;
					case "5":
						break;
					}
					break;
				case "2":
					System.out.println("Seleziona 1 se vuoi aggiungere un nuovo cliente");
					System.out.println("Seleziona 2 se vuoi modificare un cliente esistente");
					System.out.println("Seleziona 3 se vuoi eliminare i dati del cliente");
					System.out.println("Seleziona 4 se vuoi visualizzare i clienti dell'azienda");
					System.out.println("Seleziona 5 se vuoi tornare al menù principale");
					scelta = s.next();
					System.out.flush();
					switch (scelta) {
					case "1":
						listaTvFornite.add(tv.fornisciTvBase());
						break;
					case "2":
						listaTvFornite.add(tv.fornisciTvMedio());
						break;
					case "3":
						listaTvFornite.add(tv.fornisciTvAvanzato());
						break;
					case "4":
						break;
					default:
						System.err.println("hai inserito un valore non prensente nell'elenco");
						break;
					}
					break;
				case "3":
					break;
				case "4":
					file.savenewALLtv(listaTvFornite);
					System.exit(1);
					break;

				}
			} while (true);
		}
	}
}
