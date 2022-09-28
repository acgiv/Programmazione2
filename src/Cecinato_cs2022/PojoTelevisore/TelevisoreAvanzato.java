package Cecinato_cs2022.PojoTelevisore;

import java.util.Collections;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

public class TelevisoreAvanzato extends TelevisoreMedio {

	private int number_smartTv;
	private int number_hdmi ;
	
	public TelevisoreAvanzato(String seriale) throws TelevisoreException {
		super(seriale, ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.number_smartTv =ConstantGlobal.NUM_SMART_TV_AVANZATO;
	}

	
	public TelevisoreAvanzato(String seriale, int number_hdmi, int number_usb, int number_smartTv) throws TelevisoreException {
		super( seriale, number_usb);
		this.number_hdmi = number_hdmi;
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.number_smartTv= number_smartTv;

	}

	public int getNumber_smartTv() {
		return number_smartTv;
	}

	public void setNumber_smartTv(int number_smartTv) {
		this.number_smartTv = number_smartTv;
	}



	public int getNumber_hdmi() {
		return number_hdmi;
	}



	public void setNumber_hdmi(int number_hdmi) {
		this.number_hdmi = number_hdmi;
	}



	@Override
	public String toString() {
		String stringa;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa+= String.format("| %94s %75s ", ConstantGlobal.TITOLO_TABELLA_TV_AVANZATO,"|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_AVANZATO;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += String.format("| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s %6s %9s %7s %10s %10s %10s\n", super.getSeriale(), " | ",
				super.getMarche(), " | ", super.getAltezza(), " | ", super.getLarghezza(), " | ", super.getDiagonale(), " | ", super.getRisoluzione(), " | ", super.getTipoSchermo(),
				" | ", super.getNumber_usb(), " | ", getNumber_hdmi(), " | ", getNumber_smartTv(), " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");

		return stringa;
	}
	
	


	
	
	
}
