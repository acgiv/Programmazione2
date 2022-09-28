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
	
	String REGEX_CONTROLLO_SERIALE = "^[0-9]{12}$";
	
	String TITOLO_TABELLA_BASE = "TELEVISORE BASE";
	
	String TITOLO_TABELLA_MEDIO = "TELEVISORE MEDIO";
	
	String TITOLO_TABELLA_TV_AVANZATO ="TELEVISORE AVANZATO";
	
	String TABELLA_TV_BASE = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s \n", "SERIALE", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ");

	String TABELLA_TV_MEDIO = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s \n", "SERIALE", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ");
	
	String TABELLA_TV_AVANZATO = String.format("| %11s %5s %9s %5s %7s %4s %8s %4s %8s %4s %5s %5s %7s %4s %6s %5s %11s %6s %12s %5s \n", "SERIALE", " | ", "MARCA", " | ",
			"ALTEZZA", " | ", "LARGHEZZA", " | ", "DIAGONALE", " | ", "RISOLUZIONE", " | ", "TIPO SCHERMO", " | ", "NUMERO USB", " | ", "NUMERO HDMI", " | ", "NUMERO SMART TV", " | ");
	
	int LUNGHEZZA_CONTORNO_TABELLA_BASE = TABELLA_TV_BASE.length()-4;
	
	int LUNGHEZZA_CONTORNO_TABELLA_MEDIA = TABELLA_TV_MEDIO.length()-4;
	
	int LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV = TABELLA_TV_AVANZATO.length()-4;
}
