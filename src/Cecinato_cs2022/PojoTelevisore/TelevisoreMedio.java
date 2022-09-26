package Cecinato_cs2022.PojoTelevisore;

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
		return "TelevisoreMedio [ number_usb=" + number_usb + ", Seriale=" + getSeriale() + ", Tipo=" + getTipo()
				+ ", Marche=" + getMarche() + ", Altezza=" + getAltezza() + ", Lunghezza=" + getAltezza()
				+ ", Diagonale=" + getDiagonale() + ", Risoluzione=" + getRisoluzione() + ", TipoSchermo="
				+ getTipoSchermo() + "]";
	}

}
