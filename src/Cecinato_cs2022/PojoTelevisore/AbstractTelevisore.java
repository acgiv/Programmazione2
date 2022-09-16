package Cecinato_cs2022.PojoTelevisore;

import java.util.Scanner;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.TelevisoreService.Televisore;

abstract class AbstractTelevisore implements Televisore {

	private Scanner sc = new Scanner(System.in);

	private ConstantGlobal.TIPOLOGIA_TV scannerTvInstanziata(Televisore tv) {
		String tipologiaInstanziata = String.valueOf(tv.getClass());
		tipologiaInstanziata = tipologiaInstanziata.replace("class Cecinato_cs2022.PojoTelevisore.Televisore", "");
		tipologiaInstanziata = tipologiaInstanziata.toUpperCase();
		return ConstantGlobal.TIPOLOGIA_TV.valueOf(tipologiaInstanziata);
	}

	private final void stampa_marche_tv() {
		int i = 1;
		System.out.println("Le marche esistenti di tv sono:");
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	private final void stampa_tipologia_schermo_tv() {
		int i = 1;
		System.out.println("Le tipologie di schermo esistenti sono:");
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	private final void stampa_Risoluzione_schermi_tv() {
		int i = 1;
		System.out.println("Le risoluzioni degli schermi esistenti sono:");
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			System.out.println(
					String.valueOf(i).concat(") ").concat(String.valueOf(item).replace("_", " ")).toLowerCase());
			i += 1;
		}
	}

	private boolean controlloMarca(String marca) {

		boolean result = false;
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			if (String.valueOf(item).equals(String.valueOf(marca))) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	private boolean controlloRisoluzione(ConstantGlobal.RISOLUZIONE_TV risoluzione) {
		boolean result = false;
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			if (String.valueOf(item).equals(String.valueOf(risoluzione))) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	private boolean controlloTipologiaSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo) {
		boolean result = false;
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			if (String.valueOf(item).equals(String.valueOf(tipoSchermo))) {
				result = true;
				break;
			}
		}
			return result;
	}

	public boolean addSeriale(Televisore tv, String Seriale) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setSeriale(Seriale);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setSeriale(Seriale);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setSeriale(Seriale);
			result = true;
			break;
		}
		return result;
	}

	public boolean addMarcaTv(Televisore tv) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getMarche() == null) {
					System.out.println("Inserisci la marca della della tv, scrivendola.");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le marche delle televisioni esistenti prima di inserire la marca");
					System.out.println(
							"inserisci un qualsiasi simbolo, lettera o numero per continuare e scrivere la marca");
					if (sc.nextLine().equals("1"))
						stampa_marche_tv();
					String marca = sc.nextLine().toUpperCase().replace(" ", "");
					if (marca == null) {
						throw new NullPointerException();
					} else if (controlloMarca(marca) == true) {
						((TelevisoreBase) tv).setMarche(MarcheTelevisori.valueOf(marca));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getMarche() == null) {
					System.out.println("Inserisci la marca della della tv, scrivendola.");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le marche delle televisioni esistenti prima di inserire la marca");
					System.out.println(
							"inserisci un qualsiasi simbolo, lettera o numero per continuare e scrivere la marca");
					if (sc.nextLine().equals("1"))
						stampa_marche_tv();
					String marca = sc.nextLine().toUpperCase().replace(" ", "");
					if (marca == null) {
						throw new NullPointerException();
					} else if (controlloMarca(marca) == true) {
						((TelevisoreMedio) tv).setMarche(MarcheTelevisori.valueOf(marca));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getMarche() == null) {
					System.out.println("Inserisci la marca della della tv, scrivendola.");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le marche delle televisioni esistenti prima di inserire la marca");
					System.out.println(
							"inserisci un qualsiasi simbolo, lettera o numero per continuare e scrivere la marca");
					if (sc.nextLine().equals("1"))
						stampa_marche_tv();
					String marca = sc.nextLine().toUpperCase().replace(" ", "");
					if (marca == null) {
						throw new NullPointerException();
					} else if (controlloMarca(marca) == true) {
						((TelevisoreAvanzato) tv).setMarche(MarcheTelevisori.valueOf(marca));
						result = true;
					}
					
				} else {
					throw new TelevisoreException();
				}
				break;
			}

		} catch (TelevisoreException e) {
			System.out.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.out.println("| Errore nell'inserimento |");
			System.out.println("| � stato inserito un valore nullo |");
		}
		return result;
	}

	public boolean addAltezzaTv(Televisore tv, double Altezza) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setAltezza(Altezza);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setAltezza(Altezza);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setAltezza(Altezza);
			result = true;
			break;
		}
		return result;

	}

	public boolean addLarghezzaTv(Televisore tv, double Larghezza) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setLarghezza(Larghezza);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setLarghezza(Larghezza);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setLarghezza(Larghezza);
			result = true;
			break;
		}
		return result;
	}

	public boolean addNumberHdmiTv(Televisore tv, int NumeroHdmi) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setNumber_hdmi(NumeroHdmi);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_hdmi(NumeroHdmi);
			result = true;
			break;
		}
		return result;
	}

	public boolean addNumberUsbTv(Televisore tv, int NumeroUsb) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setNumber_usb(NumeroUsb);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_usb(NumeroUsb);
			result = true;
			break;
		}
		return result;
	}

	public boolean addDiagonaleTv(Televisore tv, double Diagonale) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setDiagonale(Diagonale);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setDiagonale(Diagonale);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setDiagonale(Diagonale);
			result = true;
			break;
		}
		return result;
	}

	public boolean addNumberSmartTv(Televisore tv, int numeroSmartTv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione;
			break;

		case MEDIO:
			// aggiungere eccezione;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_smartTv(numeroSmartTv);
			result = true;
			break;
		}
		return result;
	}

	public boolean addRisoluzioneTv(Televisore tv) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getRisoluzione() == null) {
					System.out.println("Inserisci la Risoluzione dello schermo della tv, scrivendola");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le risoluzioni degli schermi esistenti prima di inserire la risoluzione");
					System.out.println(
							"inserisci un qualsiasi simbolo lettera o numero per continuare e scrivere la Risoluzione");
					if (sc.nextLine().equals("1"))
						stampa_Risoluzione_schermi_tv();
					String risoluzione = sc.nextLine().toUpperCase();
					if (risoluzione == null) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_"))) == true) {
						((TelevisoreBase) tv).setRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione));
					}
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getRisoluzione() == null) {
					System.out.println("Inserisci la Risoluzione dello schermo della tv, scrivendola");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le risoluzioni degli schermi esistenti prima di inserire la risoluzione");
					System.out.println(
							"inserisci un qualsiasi simbolo lettera o numero per continuare e scrivere la Risoluzione");
					if (sc.nextLine().equals("1"))
						stampa_Risoluzione_schermi_tv();
					String risoluzione = sc.nextLine().toUpperCase();
					if (risoluzione == null) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_"))) == true) {
						((TelevisoreBase) tv).setRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione));
					}
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getRisoluzione() == null) {
					System.out.println("Inserisci la Risoluzione dello schermo della tv, scrivendola");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le risoluzioni degli schermi esistenti prima di inserire la risoluzione");
					System.out.println(
							"inserisci un qualsiasi simbolo lettera o numero per continuare e scrivere la Risoluzione");
					if (sc.nextLine().equals("1"))
						stampa_Risoluzione_schermi_tv();
					String risoluzione = sc.nextLine().toUpperCase();
					if (risoluzione == null) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_"))) == true) {
						((TelevisoreBase) tv).setRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione));
					}
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			}

		} catch (TelevisoreException e) {
			System.out.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.out.println("| Errore nell'inserimento |");
			System.out.println("| � stato inserito un valore nullo |");
		}
		return result;
	}

	public boolean addTiposchermoTv(Televisore tv) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getTipoSchermo() == null) {
					System.out.println("Inserisci la tipologia dello schermo della tv, scrivendola");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le tipologie degli schermi esistenti prima di inserire la tipologia");
					System.out.println(
							"inserisci un qualsiasi simbolo lettera o numero per continuare e scrivere la tipologia");
					if (sc.nextLine().equals("1"))
						stampa_tipologia_schermo_tv();
					String tiposchermo = sc.nextLine().toUpperCase();
					if (tiposchermo == null) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tiposchermo.replace(" ", "_"))) == true) {
						((TelevisoreBase) tv).setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tiposchermo));
					}
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getTipoSchermo() == null) {
					System.out.println("Inserisci la tipologia dello schermo della tv, scrivendola");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le tipologie degli schermi esistenti prima di inserire la tipologia");
					System.out.println(
							"inserisci un qualsiasi simbolo lettera o numero per continuare e scrivere la tipologia");
					if (sc.nextLine().equals("1"))
						stampa_tipologia_schermo_tv();
					String tiposchermo = sc.nextLine().toUpperCase();
					if (tiposchermo == null) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tiposchermo.replace(" ", "_"))) == true) {
						((TelevisoreMedio) tv).setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tiposchermo));
					}
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getTipoSchermo() == null) {
					System.out.println("Inserisci la tipologia dello schermo della tv, scrivendola");
					System.out.println(
							"Inserisci 1 se vuoi visualizzare le tipologie degli schermi esistenti prima di inserire la tipologia");
					System.out.println(
							"inserisci un qualsiasi simbolo lettera o numero per continuare e scrivere la tipologia");
					if (sc.nextLine().equals("1"))
						stampa_tipologia_schermo_tv();
					String tiposchermo = sc.nextLine().toUpperCase();
					if (tiposchermo == null) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tiposchermo.replace(" ", "_"))) == true) {
						((TelevisoreAvanzato) tv).setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tiposchermo));
					}
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			}

		} catch (TelevisoreException e) {
			System.out.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.out.println("| Errore nell'inserimento |");
			System.out.println("| � stato inserito un valore nullo |");
		}
		return result;
	}

	public boolean modificaSeriale(Televisore tv, String Seriale) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setSeriale(Seriale);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setSeriale(Seriale);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setSeriale(Seriale);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaMarcaTv(Televisore tv, MarcheTelevisori marca) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setMarche(marca);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setMarche(marca);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setMarche(marca);
			result = true;
			break;
		}
		return result;

	}

	public boolean modificaAltezzaTv(Televisore tv, double Altezza) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setAltezza(Altezza);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setAltezza(Altezza);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setAltezza(Altezza);
			result = true;
			break;
		}
		return result;

	}

	public boolean modificaLarghezzaTv(Televisore tv, double Larghezza) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setLarghezza(Larghezza);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setLarghezza(Larghezza);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setLarghezza(Larghezza);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaNumberHdmiTv(Televisore tv, int NumeroHdmi) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setNumber_hdmi(NumeroHdmi);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_hdmi(NumeroHdmi);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaNumberUsbTv(Televisore tv, int NumeroUsb) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setNumber_usb(NumeroUsb);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_usb(NumeroUsb);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaDiagonaleTv(Televisore tv, double Diagonale) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setDiagonale(Diagonale);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setDiagonale(Diagonale);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setDiagonale(Diagonale);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaNumberSmartTv(Televisore tv, int numeroSmartTv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione;
			break;

		case MEDIO:
			// aggiungere eccezione;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_smartTv(numeroSmartTv);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaRisoluzioneTv(Televisore tv, ConstantGlobal.RISOLUZIONE_TV risoluzione) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setRisoluzione(risoluzione);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setRisoluzione(risoluzione);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setRisoluzione(risoluzione);
			result = true;
			break;
		}
		return result;
	}

	public boolean modificaTiposchermoTv(Televisore tv, ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setTipoSchermo(tipoSchermo);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setTipoSchermo(tipoSchermo);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setTipoSchermo(tipoSchermo);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaMarcaTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setMarche(null);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setMarche(null);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setMarche(null);
			result = true;
			break;
		}
		return result;

	}

	public boolean eliminaAltezzaTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setAltezza(0);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setAltezza(0);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setAltezza(0);
			result = true;
			break;
		}
		return result;

	}

	public boolean eliminaLarghezzaTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setLarghezza(0);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setLarghezza(0);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setLarghezza(0);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaNumberHdmiTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setNumber_hdmi(0);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_hdmi(0);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaNumberUsbTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setNumber_usb(0);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_usb(0);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaDiagonaleTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setDiagonale(0);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setDiagonale(0);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setDiagonale(0);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaNumberSmartTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			// aggiungere eccezione;
			break;

		case MEDIO:
			// aggiungere eccezione;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setNumber_smartTv(0);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaRisoluzioneTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setRisoluzione(null);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setRisoluzione(null);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setRisoluzione(null);
			result = true;
			break;
		}
		return result;
	}

	public boolean eliminaTiposchermoTv(Televisore tv) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			((TelevisoreBase) tv).setTipoSchermo(null);
			result = true;
			break;

		case MEDIO:
			((TelevisoreMedio) tv).setTipoSchermo(null);
			result = true;
			break;
		case AVANZATO:
			((TelevisoreAvanzato) tv).setTipoSchermo(null);
			result = true;
			break;
		}
		return result;
	}

}
