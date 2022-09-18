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

}
