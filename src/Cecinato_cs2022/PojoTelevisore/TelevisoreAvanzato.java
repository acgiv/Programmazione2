package Cecinato_cs2022.PojoTelevisore;

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
		return "TelevisoreAvanzato [number_smartTv=" + number_smartTv + ", number_hdmi=" + number_hdmi
				+ ", Seriale=" + getSeriale() + ", Tipo=" + getTipo() + ", Marche=" + getMarche()
				+ ", Altezza()=" + getAltezza() + ", Larghezza=" + getLarghezza() + ", Diagonale="
				+ getDiagonale() + ", Risoluzione=" + getRisoluzione() + ", TipoSchermo=" + getTipoSchermo()
				+ "]";
	}
	
	


	
	
	
}
