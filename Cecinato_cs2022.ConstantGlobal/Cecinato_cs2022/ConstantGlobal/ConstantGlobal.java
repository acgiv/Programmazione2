package Cecinato_cs2022.ConstantGlobal;

/**
 * 
 * <p>
 * <b> CLASSE: ConstantGlobal </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le constant globali da poter
 * riutilizzare in tutte le classi in cui si ha bisogno.
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

public interface ConstantGlobal {

	/**
	 * {@link int} variabile che indica il numero di usb del televisore medio
	 */

	int NUMERO_USB_TV_MEDIO = 2;

	/**
	 * {@link int} variabile che indica il numero di hdmi del televisore di
	 * tipologia avanzato
	 */
	int NUM_HDMI_TV_AVANZATO = 1;

	/**
	 * {@link int} variabile che indica il numero di usb di tipologia avanzato
	 */

	int NUMERO_USB_TV_AVANZATO = 1;

	/**
	 * {@link int} variabile che indica il numero di smart tv ti tipologia avanzato
	 */

	int NUM_SMART_TV_AVANZATO = 1;

	/**
	 * {@link int } Variabile che indica il numero minimo di hdmi del televisore
	 */

	int NUMERO_MINIMO_HDMI = 0;

	/**
	 * {@link int } Variabile che indica il numero minimo di usb del televisore
	 */

	int NUMERO_MINIMO_USB = 0;

	/**
	 * {@link int } Variabile che indica il numero minimo di smart tv del televiore
	 */

	int NUMERO_MINIMO_SMART_TV = 0;

	/**
	 * {@link TIPOLOGIA_TV} lista che indica le tipologie del televisore
	 */

	enum TIPOLOGIA_TV {
		/**
		 * tipologia del televisiore = BASE
		 */
		BASE,
		/**
		 * tipologia del televisiore = MEDIO
		 */
		MEDIO,
		/**
		 * tipologia del televisiore = AVANZATO
		 */
		AVANZATO
	}

	/**
	 * {@link RISOLUZIONE_TV} lista che indica le risoluzione dei televisori
	 */

	enum RISOLUZIONE_TV {
		/**
		 * risoluzione schermo= HD
		 */
		HD,
		/**
		 * risoluzione schermo = FULL_HD
		 */
		FULL_HD,
		/**
		 * risoluzione schermo = ULTRA_HD
		 */
		ULTRA_HD,
		/**
		 * risoluzione schermo = TV_8K
		 */
		TV_8K

	}

	/**
	 * {@link TIPOLOGIA_SCHERMO} lista che indica le tipologie di schermo del
	 * televisore
	 */

	enum TIPOLOGIA_SCHERMO {
		/**
		 * tipologia schermo = CRT
		 */
		CRT,
		/**
		 * tipologia schermo = LED
		 */
		LED,
		/**
		 * tipologia schermo = OLED
		 */
		OLED,
		/**
		 * tipologia schermo = QLED
		 */
		QLED,
		/**
		 * tipologia schermo = PLASMA
		 */
		PLASMA
	}

	/**
	 * {@link int} Variabile che indica la lunghezza del codice seriale
	 */

	int LUNGHEZZA_SERIALE_TV = 12;

	/**
	 * {@link TIPOLOGIA_OPERAZIONE} lista che indica il tipo di operazione che può
	 * essere effettuato sul televisore
	 */

	enum TIPOLOGIA_OPERAZIONE {
		/**
		 * tipologia operazione = MARCA
		 */
		MARCA,
		/**
		 * tipologia operazione = ALTEZZA
		 */
		ALTEZZA,
		/**
		 * tipologia operazione = LARGHEZZA
		 */
		LARGHEZZA,
		/**
		 * tipologia operazione = DIAGONALE
		 */
		DIAGONALE,
		/**
		 * tipologia operazione = RISOLUZIONE
		 */
		RISOLUZIONE,
		/**
		 * tipologia operazione = NUMERO_HDMI
		 */
		NUMERO_HDMI,
		/**
		 * tipologia operazione = NUMERO_USB
		 */
		NUMERO_USB,
		/**
		 * tipologia operazione = NUMERO_SMART_TV
		 */
		NUMERO_SMART_TV,
		/**
		 * tipologia operazione = TIPO_SCHERMO
		 */
		TIPO_SCHERMO
	}

	/**
	 * {@link double} Variabile che indica la larghezza massima del televisore
	 */

	double LARGHEZZA_MASSIMA_TV = 221.35;

	/**
	 * {@link double} Variabile che indica la lunghezza massima del televisore
	 */

	double ALTEZZA_MASSIMA_TV = 124.05;

	/**
	 * {@link double} Variabile che indica la lunghezza della diagonale massima del
	 * televisore
	 */

	double DIAGONALE_MASSIMA_TV = 254.0;

	/**
	 * {@link double} Variabile che indica la lunghezza della diagonale minima del
	 * televisore
	 */

	double DIAGONALE_MINIMA_TV = 50.8;

	/**
	 * {@link double} Variabile che indica la larghezza della diagonale minima del
	 * televisore
	 */

	double LARGHEZZA_MINIMA_TV = 44.03;

	/**
	 * {@link double} Variabile che indica l'altezza della minima del televisore
	 */

	double ALTEZZA_MINIMA_TV = 24.09;

	/**
	 * {@link String} Variabile che indica il titolo della tabella di tipo base
	 */

	String TITOLO_TABELLA_BASE = "TELEVISORE BASE";

	/**
	 * {@link String} Variabile che indica il titolo della tabella di tipo medio
	 */

	String TITOLO_TABELLA_MEDIO = "TELEVISORE MEDIO";

	/**
	 * {@link String} Variabile che indica il titolo della tabella di tipo avanzato
	 */

	String TITOLO_TABELLA_TV_AVANZATO = "TELEVISORE AVANZATO";

	/**
	 * {@link String} Variabile che indica il titolo della tabella delle tv fornite
	 */

	String TITOLO_ELENCO_TV = "TABELLA  TV FORNITE";

	/**
	 * {@link String} Variabile che indica il titolo della tabella del dipendente
	 */

	String TITOLO_TABELLA_DIPENDENTE = "DIPENDENTE";

	/**
	 * {@link String} Variabile che indica il titolo della tabella dei clienti
	 * inscritti
	 */

	String TITOLO_TABELLA_CLIENTE = "CLIENTE";
	/**
	 * {@link String} Variabile che indica il titolo della tabella delle tv riparate
	 */

	String TITOLO_TABELLA_LISTA_TV_RIPARATE = "ELENCO TV RIPATE";

	/**
	 * {@link String} Variabile che indica il titolo della tabella delle tv vendute
	 */
	String TITOLO_TABELLA_LISTA_TV_VENDUTE = "ELENCO TV VENDUTE";

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella del tv
	 * base
	 */

	String TABELLA_TV_BASE = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s \n", "SERIALE",
			" | ", "MARCA", " | ", "ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ",
			"TIPO SCHERMO", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella del tv
	 * medio
	 */

	String TABELLA_TV_MEDIO = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s \n",
			"SERIALE", " | ", "MARCA", " | ", "ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE",
			" | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella del tv
	 * avanzato
	 */

	String TABELLA_TV_AVANZATO = String.format(
			"| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s %11s %6s %12s %5s \n", "SERIALE", " | ",
			"MARCA", " | ", "ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ",
			"TIPO SCHERMO", " | ", "NUMERO USB", " | ", "NUMERO HDMI", " | ", "NUMERO SMART TV", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella del
	 * dipendente
	 */

	String TABELLA_DIPENDENTE = String.format(
			"| %20s %3s %9s %6s %9s %5s %7s %4s %8s %5s %8s %4s %9s %5s %16s %5s %24s %9s %14s %4s %12s %5s %12s %3s \n",
			"COD IDENTIFICATIVO", " | ", "NOME", " | ", "COGNOME", " | ", "ETA'", " | ", "GENERE", " | ",
			"DATA NASCITA", " | ", "CITTA'", " | ", "RUOLO_AZIENDALE", " | ", "EMAIL AZIENDALE", " | ",
			"NUMERO TELEFONO", " | ", "NOME AZIENDA ", " | ", "TIPOLOGIA CONTRATTO ", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella del
	 * cliente
	 */

	String TABELLA_CLIENTE = String.format(
			"| %17s %6s %9s %6s %9s %5s %7s %4s %8s %5s %8s %4s %9s %5s %21s %5s %19s %5s %14s %4s %12s %3s \n",
			"CODICE FISCALE", " | ", "NOME", " | ", "COGNOME", " | ", "ETA'", " | ", "GENERE", " | ", "DATA NASCITA",
			" | ", "CITTA'", " | ", "NOME CARTA FEDELTA'", " | ", "DATA INSCRIZIONE CARTA", " | ", "NUMERO CARTA",
			" | ", "PUNTI CARTA FEDELTA'", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella di
	 * tutte le tv
	 */

	String TABELLA_ELENCO_TV = String.format(
			"| %12s %4s %10s %3s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s %11s %6s %12s %5s \n",
			"SERIALE", " | ", "TIPOLOGIA TV", " | ", "MARCA", " | ", "ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE",
			" | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ", "NUMERO HDMI", " | ",
			"NUMERO SMART TV", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella di
	 * tutte le tv riparate
	 */

	String TABELLA_ELENCO_TV_RIPARATE = String.format(
			"| %24s %3s %13s %5s %10s %3s %9s %5s %7s %4s %8s %4s %8s %5s %5s %5s %7s %4s %6s %5s %28s %14s \n",
			"COD IDENTIFICATIVO DIP", " | ", "SERIALE TV", " | ", "TIPOLOGIA TV", " | ", "MARCA", " | ",
			"NOME CLIENTE ", " | ", "COGNOME CLIENTE", " | ", "CODICE FISCALE", " | ", "DATA RICHIESTA", " | ",
			"DATA RICONSEGNA", " | ", "COSTO RIPARAZIONE", " | ", "INFO RIPARAZIONE", " | ");

	/**
	 * {@link String} Variabile che indica i nomi delle colonne della tabella di
	 * tutte le tv vendute
	 */

	String TABELLA_ELENCO_TV_VENDUTE = String.format(
			"|  %12s %5s %24s %5s %12s %5s %15s %5s %10s %6s %15s %4s %17s %5s %16s %5s %14s %5s %15s %5s  \n",
			"ID FATTURA", " | ", "COD IDENTIFICATIVO DIP", " | ", "SERIALE TV", " | ", "TIPOLOGIA TV", " | ",
			"MARCA TV", " | ", "NOME CLIENTE ", " | ", "COGNOME CLIENTE", " | ", "CODICE FISCALE", " | ",
			"DATA VENDITA", " | ", "COSTO VENDITA", " | ");

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella del
	 * televisore base fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_TABELLA_BASE = TABELLA_TV_BASE.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella del
	 * televisore medio fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_TABELLA_MEDIA = TABELLA_TV_MEDIO.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella del
	 * televisore avanzato fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV = TABELLA_TV_AVANZATO.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella del
	 * dipendente fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE = TABELLA_DIPENDENTE.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella del
	 * cliente fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_TABELLA_CLIENTE = TABELLA_CLIENTE.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella
	 * delle tv fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_ELENCO_TV = TABELLA_ELENCO_TV.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella
	 * delle tv riparate fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE = TABELLA_ELENCO_TV_RIPARATE.length() - 4;

	/**
	 * {@link int} Variabile che indica la lunghezza del contorno della tabella
	 * delle tv vendute fatta con "-"
	 */

	int LUNGHEZZA_CONTORNO_ELENCO_TV_VENDUTE = TABELLA_ELENCO_TV_VENDUTE.length() - 4;

	/**
	 * {@link String} Variabile che consente di controllare la correttezza della
	 * data con questo formato dd/mm/aaaa
	 */

	String REGEX_CONTROLLO_DATA = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$";

	/**
	 * {@link String} Variabile che consnete di controllare la correttezza dei
	 * numeri float con valori: a) +1 b) -1 c) .01 d) -.01 e) 1 f) 10.10 g) -10.10
	 * 
	 */

	String REGEX_CONTROLLO_NUMERI_FLOAT = "^[+,-]?(\\d+(\\.\\d*)?)|((\\.\\d+))?$";

	/**
	 * {@link String} Variabile che consente di controllare la correttezza del
	 * codice fiscale dove a = indica i caratteri e 0 indicano i numeri il formato
	 * è: aaaaaa00a00a000a
	 */

	String REGEX_CONTROLLO_CODICE_FISCALE = "^[a-zA-Z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}$";

	/**
	 * {@link String} Variabile che consente di controllare del codice
	 * identidicativo composto da caratteri alfanumerici lunga 10
	 */

	String REGEX_CONTROLLO_CODICE_IDENTIFICATIVO = "^[a-zA-Z0-9]{10}$";
	/**
	 * {@link String} Variabile che consente di controllare se la stringa è
	 * costituita da numeri interi
	 */

	String REGEX_CONTROLLO_INTERO = "^[0-9]+$";

	/**
	 * {@link String} Variabile che consente di controllare se seriale del
	 * televisore è lungo 12 ed è costituito da numueri interi
	 */

	String REGEX_CONTROLLO_SERIALE_TELEVISORE = "^[0-9]{" + LUNGHEZZA_SERIALE_TV + "}$";

	/**
	 * {@link String} Variabile che consente di controllare il formato del telefono
	 * = +39 3332056789
	 */

	String REGEX_CONTROLLO_NUMERO_TELEFONO = "^[+]{1}[0-9]{2}[ ][0-9]{10}$";

	/**
	 * {@link String} Variabile che indica il numero minimo della carta di fedeltà
	 */

	String LUNGHEZZA_MINIMA_NUMERO_CARTA_FEDELTA = "100000000000";

	/**
	 * {@link String} Variabile che indica il numero massimo della carta di fedeltà
	 */

	String LUNGHEZZA_MASSIMA_NUMERO_CARTA_FEDELTA = "999999999999";

	/**
	 * {@link String} Variabile che indica il formato della data
	 */

	String FORMATO_DATA = "dd/MM/yyyy";

	/**
	 * {@link int} Variabile che indica la lunghezza del codice fiscale
	 */

	int LUNGHEZZA_CODICE_FISCALE = 16;

	/**
	 * {@link int} Variabile che indica la lunghezza del codice dipendente
	 */

	int LUNGHEZZA_CODICE_DIPENDETE = 10;

	/**
	 * {@link long} Variabile che indica il numero massimo dei punti accumulati
	 */

	long NUMERO_MASSIMO_PUNTI_AGGIUNTI = 2000;

	/**
	 * {@link GENERE} Lista che indica il genere della persona
	 */

	enum GENERE {
		/**
		 * sesso della persona= MASCHIO
		 */
		MASCHIO,
		/**
		 * sesso della persona= FEMMINA
		 */
		FEMMINA,
		/**
		 * sesso della persona= ALTRO
		 */
		ALTRO
	}

	/**
	 * {@link int} Variabile che indica l'età minima che una persona può acquistare
	 * il televisore
	 */

	int ETA_MINIMA_CLIENTE = 16;

	/**
	 * {@link int} Variabile che indica l'età massima che una persona può acquistare
	 * il televisore
	 */

	int ETA_MASSIMA_CLIENTE = 150;

	/**
	 * {@link TIPO_CONTRATTO} Lista che indica le tipologie di contratto del
	 * dipendente
	 */

	enum TIPO_CONTRATTO {
		/**
		 * tipolgia di contratto = STAGE
		 */
		STAGE,
		/**
		 * tipolgia di contratto = DETERMINATO
		 */
		DETERMINATO,
		/**
		 * tipolgia di contratto = INDETERMINATO
		 */
		INDETERMINATO,
		/**
		 * tipolgia di contratto = PART_TIME
		 */
		PART_TIME,
		/**
		 * tipolgia di contratto = APPRENDISTATO
		 */
		APPRENDISTATO
	}

	/**
	 * {@link OPERAZIONE_PUNTI_FEDELTA} Lista che indica le operazioni che il
	 * cliente può effettuare sui punti di fedeltà
	 */

	enum OPERAZIONE_PUNTI_FEDELTA {
		/**
		 * tipo di operazione che si può effettuare sui punti fedeltà = AGGIUNGI
		 */
		AGGIUNGI,
		/**
		 * tipo di operazione che si può effettuare sui punti fedeltà = SOTTRAI
		 */
		SOTTRAI,
		/**
		 * tipo di operazione che si può effettuare sui punti fedeltà = SOSTITUISCI
		 */
		SOSTITUISCI
	}

	/**
	 * {@link String} Variabile che indica il percoso del file dove vengono salvate
	 * le televisioni
	 */

	String PERCORSO_FILE_TELEVISORE = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\televisore.data";

	/**
	 * {@link String} Variabile che indica il percoso del file dove vengono salvati
	 * i clienti
	 */

	String PERCORSO_FILE_CLIENTE = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\cliente.data";

	/**
	 * {@link String} Variabile che indica il percoso del file dove vengono salvati
	 * i dipendenti
	 */

	String PERCORSO_FILE_DIPENDENTE = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\dipendente.data";

	/**
	 * {@link String} Variabile che indica il percoso del file dove vengono salvate
	 * le vendite
	 */

	String PERCORSO_FILE_VENDITA = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\vendita.data";

	/**
	 * {@link int} Variabile che indica il numero massimo di tv vendute
	 */

	int NUMERO_MASSIMO_TV_VENDUTE = 2;

}
