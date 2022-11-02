package Cecinato_cs2022.ConstantGlobal;

public interface ConstantGlobal {

	int NUM_USB_TV_MEDIO = 2;

	int NUM_MINIMO_USB = 0;

	int NUM_HDMI_TV_AVANZATO = 1;

	int NUM_MINIMO_HDMI = 0;

	int NUMERO_USB_TV_AVANZATO = 1;

	int NUM_SMART_TV_AVANZATO = 1;

	int NUM_MINIMO_SMART_TV = 0;

	enum TIPOLOGIA_TV {
		BASE, MEDIO, AVANZATO
	}

	enum RISOLUZIONE_TV {
		HD, FULL_HD, ULTRA_HD, TV_8K

	}

	enum TIPOLOGIA_SCHERMO {
		CRT, LED, OLED, QLED, PLASMA
	}

	int LUNGHEZZA_SERIALE_TV = 12;

	enum TIPOLOGIA_OPERAZIONE {
		MARCA, ALTEZZA, LARGHEZZA, DIAGONALE, RISOLUZIONE, NUMERO_HDMI, NUMERO_USB, NUMERO_SMART_TV, TIPO_SCHERMO
	}

	double LARGHEZZA_MASSIMA_TV = 221.35;

	double ALTEZZA_MASSIMA_TV = 124.05;

	double DIAGONALE_MASSIMA_TV = 254.0;

	double DIAGONALE_MINIMA_TV = 50.8;

	double LARGHEZZA_MINIMA_TV = 44.03;

	double ALTEZZA_MINIMA_TV = 24.09;

	int NUMERO_MINIMO_HDMI = 0;

	int NUMERO_MINIMO_USB = 0;

	int NUMERO_MINIMO_SMART_TV = 0;
	
	String TITOLO_TABELLA_BASE = "TELEVISORE BASE";
	
	String TITOLO_TABELLA_MEDIO = "TELEVISORE MEDIO";
	
	String TITOLO_TABELLA_TV_AVANZATO ="TELEVISORE AVANZATO";
	
	String TITOLO_ELENCO_TV ="TABELLA  TV FORNITE";
	
	String TITOLO_TABELLA_DIPENDENTE ="DIPENDENTE";
	
	String TITOLO_TABELLA_CLIENTE ="CLIENTE";
	
	String TITOLO_TABELLA_LISTA_CLIENTI ="ELENCO CLIENTI INSCRITTI";
	
	String TITOLO_TABELLA_LISTA_TV_RIPARATE ="ELENCO TV RIPATE";
	
	String TITOLO_TABELLA_LISTA_TV_VENDUTE ="ELENCO TV VENDUTE";
	
	String TABELLA_TV_BASE = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s \n", "SERIALE", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ");

	String TABELLA_TV_MEDIO = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s \n", "SERIALE", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ");
	
	String TABELLA_TV_AVANZATO = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s %11s %6s %12s %5s \n", "SERIALE", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ", "NUMERO HDMI", " | ", "NUMERO SMART TV", " | ");
	
	
	String  TABELLA_DIPENDENTE  = String.format("| %20s %3s %9s %6s %9s %5s %7s %4s %8s %5s %8s %4s %9s %5s %16s %5s %24s %9s %14s %4s %12s %5s %12s %3s \n", "COD IDENTIFICATIVO", " | ", "NOME", " | ", "COGNOME", " | ",
			"ETA'", " | ", "GENERE", " | ", "DATA NASCITA", " | ", "CITTA'", " | ", "RUOLO_AZIENDALE", " | ", "EMAIL AZIENDALE", " | ", "NUMERO TELEFONO", " | ", "NOME AZIENDA ", " | ", "TIPOLOGIA CONTRATTO ", " | ");
	
	String  TABELLA_CLIENTE  = String.format("| %17s %6s %9s %6s %9s %5s %7s %4s %8s %5s %8s %4s %9s %5s %21s %5s %19s %5s %14s %4s %12s %3s \n", "CODICE FISCALE", " | ", "NOME", " | ", "COGNOME", " | ",
			"ETA'", " | ", "GENERE", " | ", "DATA NASCITA", " | ", "CITTA'", " | ", "NOME CARTA FEDELTA'", " | ", "DATA INSCRIZIONE CARTA", " | ", "NUMERO CARTA", " | ", "PUNTI CARTA FEDELTA'",  " | ");
	
	String TABELLA_ELENCO_TV= String.format("| %12s %4s %10s %3s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s %11s %6s %12s %5s \n", "SERIALE", " | ", "TIPOLOGIA TV", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ", "NUMERO HDMI", " | ", "NUMERO SMART TV", " | ");
	
	String TABELLA_ELENCO_TV_RIPARATE= String.format("| %24s %3s %13s %5s %10s %3s %9s %5s %7s %4s %8s %4s %8s %5s %5s %5s %7s %4s %6s %5s %28s %14s \n","COD IDENTIFICATIVO DIP", " | ", "SERIALE TV", " | ", "TIPOLOGIA TV", " | ", "MARCA", " | ",
			"NOME CLIENTE ", " | ", "COGNOME CLIENTE", " | ", "CODICE FISCALE", " | ", "DATA RICHIESTA", " | ", "DATA RICONSEGNA", " | ", "COSTO RIPARAZIONE", " | ", "INFO RIPARAZIONE", " | ");
	
	
	String TABELLA_ELENCO_TV_VENDUTE= String.format("|  %12s %5s %24s %5s %12s %5s %15s %5s %10s %6s %15s %4s %17s %5s %16s %5s %14s %5s %15s %5s  \n","ID FATTURA", " | ","COD IDENTIFICATIVO DIP", " | ", "SERIALE TV", " | ", "TIPOLOGIA TV", " | ", "MARCA TV", " | ",
			"NOME CLIENTE ", " | ", "COGNOME CLIENTE", " | ", "CODICE FISCALE", " | ", "DATA VENDITA", " | ", "COSTO VENDITA", " | ");
	
	
	int LUNGHEZZA_CONTORNO_TABELLA_BASE = TABELLA_TV_BASE.length()-4;
	
	int LUNGHEZZA_CONTORNO_TABELLA_MEDIA = TABELLA_TV_MEDIO.length()-4;
	
	int LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV = TABELLA_TV_AVANZATO.length()-4;
	
	int LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE = TABELLA_DIPENDENTE.length()-4;
	
	int LUNGHEZZA_CONTORNO_TABELLA_CLIENTE = TABELLA_CLIENTE.length()-4;
	
	int LUNGHEZZA_CONTORNO_ELENCO_TV = TABELLA_ELENCO_TV.length()-4;
	
	int LUNGHEZZA_CONTORNO_ELENCO_TV_RIPARATE = TABELLA_ELENCO_TV_RIPARATE.length()-4;
	
	int LUNGHEZZA_CONTORNO_ELENCO_TV_VENDUTE = TABELLA_ELENCO_TV_VENDUTE.length()-4;
	
	String REGEX_CONTROLLO_DATA = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d$";
	
	String REGEX_CONTROLLO_NUMERI_FLOAT = "^[+,-]?(\\d+(\\.\\d*)?)|((\\.\\d+))?$";
	
	String REGEX_CONTROLLO_CODICE_FISCALE = "^[a-zA-Z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}$";
	
	String REGEX_CONTROLLO_CODICE_IDENTIFICATIVO = "^[a-zA-Z0-9]{10}$";
	
	String REGEX_CONTROLLO_s="^[A-Za-z]+$";
	
	String REGEX_CONTROLLO_SPAZI_STRINGA="^[]*[A-Za-z]+[*]$";
	
	String REGEX_CONTROLLO_STRINGA_NUMERI="^[A-Za-z0-9]+$";
	
	String REGEX_CONTROLLO_INTERO="^[0-9]+$";
	
	String REGEX_CONTROLLO_SERIALE_TELEVISORE = "^[0-9]{"+LUNGHEZZA_SERIALE_TV+"}$";
	
	String REGEX_CONTROLLO_NUMERO_TELEFONO = "^[+]{1}[0-9]{2}[ ][0-9]{10}$";
	
	String LUNGHEZZA_MINIMA_NUMERO_CARTA_FEDELTA = "100000000000";
	
	String LUNGHEZZA_MASSIMA_NUMERO_CARTA_FEDELTA = "999999999999";
	
	String FORMATO_DATA = "dd/MM/yyyy";
	

	int LUNGHEZZA_CODICE_FISCALE = 16;
	
	int LUNGHEZZA_CODICE_DIPENDETE = 10;
	
	long NUMERO_MASSIMO_PUNTI_AGGIUNTI=2000;
	
	enum GENERE{
		MASCHIO,
		FEMMINA,
		ALTRO
	}
	
	int ETA_MINIMA_CLIENTE= 16;

	int ETA_MASSIMA_CLIENTE  = 150;
	
	enum TIPO_CONTRATTO{
		STAGE,
		DETERMINATO,
		INTETERMINATO,
		PART_TIME,
		APPRENDISTATO
	}
	
	enum OPERAZIONE_PUNTI_FEDELTA{
		AGGIUNGI,
		SOTTRAI,
		SOSTITUISCI
	}
	
	String PERCORSO_FILE_TELEVISORE = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\televisore.data";
	
	String PERCORSO_FILE_CLIENTE = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\cliente.data";
	
	String PERCORSO_FILE_DIPENDENTE = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\dipendente.data";
	
	String PERCORSO_FILE_VENDITA = "D:\\Progetti\\Java\\Programmazione2\\706576_Cecinato_cs2022\\file\\vendita.data";
	
	int NUMERO_MASSIMO_TV_VENDUTE = 10;

}
