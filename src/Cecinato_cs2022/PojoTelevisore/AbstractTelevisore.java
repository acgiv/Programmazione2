package Cecinato_cs2022.PojoTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.TelevisoreService.Televisore;

abstract class AbstractTelevisore implements Televisore {

	public ConstantGlobal.TIPOLOGIA_TV scannerTvInstanziata(Televisore tv) {
		String tipologiaInstanziata = String.valueOf(tv.getClass());
		tipologiaInstanziata = tipologiaInstanziata.replace("class Cecinato_cs2022.PojoTelevisore.Televisore", "");
		tipologiaInstanziata = tipologiaInstanziata.toUpperCase();
		return ConstantGlobal.TIPOLOGIA_TV.valueOf(tipologiaInstanziata);
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

	public boolean addMarcaTv(Televisore tv, MarcheTelevisori marca) {
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

	public boolean addRisoluzioneTv(Televisore tv, ConstantGlobal.RISOLUZIONE_TV risoluzione) {
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

	public boolean addTiposchermoTv(Televisore tv, ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo) {
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
