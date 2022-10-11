package Cecinato_cs2022.PojoTelevisore;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.TelevisoreService.Televisore;

abstract class AbstractTelevisore implements Televisore {

	protected boolean inserthdmi = false;
	protected boolean insertusb = false;
	protected boolean insertSmartTV = false;
	protected final static Set<String> elencoSerialeTv = new TreeSet<String>();

	public void visualizzanomiMarcheTv() {
		int i = 0;
		System.out.println("Le marche esistenti di tv sono:");
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	public void visualizzaTipologieSchermoTv() {
		int i = 1;
		System.out.println("Le tipologie di schermo esistenti sono:");
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	public void visualizzaRisoluzioniSchermiTv() {
		int i = 1;
		System.out.println("Le risoluzioni degli schermi esistenti sono:");
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			System.out.println(
					String.valueOf(i).concat(") ").concat(String.valueOf(item).replace("_", " ")).toLowerCase());
			i += 1;
		}
	}

	protected boolean controlloMarca(String marca) {
		boolean result = false;
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			if (String.valueOf(item).equals(marca)) {
				result = true;
				break;
			}
		}
		return result;
	}

	protected boolean controlloRisoluzione(String risoluzione) {
		boolean result = false;
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			if (String.valueOf(item).equals(risoluzione)) {
				result = true;
				break;
			}
		}
		return result;
	}

	protected boolean controlloTipologiaSchermo(String tipoSchermo) {
		boolean result = false;
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			if (String.valueOf(item).equals(tipoSchermo)) {
				result = true;
				break;
			}
		}
		return result;
	}

	protected boolean controlloSeriale(String seriale) {
		boolean result = true;
		if (seriale != null) {
			if (!elencoSerialeTv.isEmpty() && seriale.matches(ConstantGlobal.REGEX_CONTROLLO_SERIALE_TELEVISORE)) {
				Iterator<String> element = elencoSerialeTv.iterator();
				while (element.hasNext()) {
					if (element.next().equals(seriale))
						result = false;
				}

			} else if (elencoSerialeTv.isEmpty()
					&& seriale.matches(ConstantGlobal.REGEX_CONTROLLO_SERIALE_TELEVISORE)) {
				result = true;
			} else {
				result = false;
			}
		}else {
			result = false;
		}
		return result;
	}

	protected boolean controlloParamentriNumericiTv(String parametri) {
		boolean result = false;
		try {
			parametri = parametri.replace(" ", "_");
			if (parametri.matches(ConstantGlobal.REGEX_CONTROLLO_NUMERI_FLOAT)) {
				result = true;
			} else {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			System.out.println("| Errore nell'inserimento |\n");
			System.out.println("| Non hai inserito dei valori numerici |\n");
		}
		return result;
	}

	protected boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("| Errore nell'inserimento |\n");
			System.out.println("| Non hai inserito dei valori interi |\n");
			return false;
		} catch (NullPointerException e) {
			return false;
		}

		return true;
	}

	protected boolean eliminaSeriale(String seriale) {
		boolean result = false;
		Iterator<String> element = elencoSerialeTv.iterator();
		while (element.hasNext()) {
			if (element.next().equals(seriale))
				element.remove();
		}

		return result;
	}

	protected boolean controlloCorrettezzaUsb(String numeroUsb) {
		boolean result = false;
		if ((Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_USB_TV_MEDIO
				&& visualizzaTipologiaTv().equals(ConstantGlobal.TIPOLOGIA_TV.MEDIO))
				|| (Integer.valueOf(numeroUsb) == ConstantGlobal.NUMERO_USB_TV_AVANZATO
						&& visualizzaTipologiaTv().equals(ConstantGlobal.TIPOLOGIA_TV.AVANZATO))
				|| Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_MINIMO_USB) {
			result = true;
		}
		return result;
	}

	public abstract boolean addMarcaTv(String marca);

	public abstract boolean addAltezzaTv(String altezza);

	public abstract boolean addLarghezzaTv(String larghezza);

	public abstract boolean addNumberHdmiTv(String numeroHdmi);

	public abstract boolean addNumberUsbTv(String numeroUsb);

	public abstract boolean addDiagonaleTv(String diagonale);

	public abstract boolean addNumberSmartTv(String numeroSmartTv);

	public abstract boolean addRisoluzioneTv(String risoluzione);

	public abstract boolean addTiposchermoTv(String tipoSchermo);

	public abstract boolean modificaSeriale(String seriale);

	public abstract boolean addTelevisoreBase(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo);

	public abstract boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb);

	public abstract boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv);

	public abstract boolean modificaMarcaTv(String marca);

	public abstract boolean modificaAltezzaTv(String altezza);

	public abstract boolean modificaLarghezzaTv(String larghezza);

	public abstract boolean modificaNumberHdmiTv(String numeroHdmi);

	public abstract boolean modificaNumberUsbTv(String numeroUsb);

	public abstract boolean modificaDiagonaleTv(String diagonale);

	public abstract boolean modificaNumberSmartTv(String numeroSmartTv);

	public abstract boolean modificaRisoluzioneTv(String risoluzione);

	public abstract boolean modificaTiposchermoTv(String tipoSchermo);

	public abstract boolean eliminaMarcaTv() throws TelevisoreException;

	public abstract boolean eliminaAltezzaTv() throws TelevisoreException;

	public abstract boolean eliminaLarghezzaTv() throws TelevisoreException;

	public abstract boolean eliminaNumberHdmiTv();

	public abstract boolean eliminaNumberUsbTv();

	public abstract boolean eliminaDiagonaleTv() throws TelevisoreException;

	public abstract boolean eliminaNumberSmartTv();

	public abstract boolean eliminaRisoluzioneTv() throws TelevisoreException;

	public abstract boolean eliminaTiposchermoTv() throws TelevisoreException;

	public abstract MarcheTelevisori visualizzaMarca();

	public abstract double visualizzaAltezza();

	public abstract double visualizzaLarghezza();

	public abstract double visualizzaDiagonale();

	public abstract String visualizzaSeriale();

	public abstract ConstantGlobal.RISOLUZIONE_TV visualizzaRisoluzione();

	public abstract ConstantGlobal.TIPOLOGIA_SCHERMO visualizzaTipoSchermo();

	public abstract ConstantGlobal.TIPOLOGIA_TV visualizzaTipologiaTv();

	public abstract int visualizzaNumeroUsb();

	public abstract int visualizzaNumeroHdmi();

	public abstract int visualizzaNumeroSmartTv();

}
