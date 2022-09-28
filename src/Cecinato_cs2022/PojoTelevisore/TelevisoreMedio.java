package Cecinato_cs2022.PojoTelevisore;

import java.util.Collections;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

public class TelevisoreMedio extends TelevisoreBase {

	private int number_usb;

	public TelevisoreMedio(String seriale) throws TelevisoreException {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.number_usb = ConstantGlobal.NUM_USB_TV_MEDIO;
	}


	public TelevisoreMedio(String seriale, int number_usb) throws TelevisoreException {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.number_usb = number_usb;
	}

	public int getNumber_usb() {
		return number_usb;
	}

	public void setNumber_usb(int number_usb) {
		this.number_usb = number_usb;
	}

	@Override
	public String toString() {
		String stringa;
			stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
					.concat("\n");
			stringa+= String.format("| %73s %55s ", ConstantGlobal.TITOLO_TABELLA_MEDIO,"|\n");
			stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
					.concat("\n");
			stringa += ConstantGlobal.TABELLA_TV_MEDIO;
			stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
					.concat("\n");
			stringa += String.format("| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s %6s %9s\n", super.getSeriale(), " | ",
					super.getMarche(), " | ", super.getAltezza(), " | ", super.getLarghezza(), " | ", super.getDiagonale(), " | ", super.getRisoluzione(), " | ", super.getTipoSchermo(),
					" | ", number_usb, " | ");
			stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
					.concat("\n");

			return stringa;
	}

}
