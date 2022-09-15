package Cecinato_cs2022.PojoTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

public class TelevisoreMedio extends TelevisoreBase{
	
	private int number_hdmi;
	private int number_usb;
	
	public TelevisoreMedio(String seriale) {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.number_hdmi = ConstantGlobal.NUM_HDMI_TV_MEDIO;
		this.number_usb = ConstantGlobal.NUM_USB_TV_MEDIO;
		
		
	}
	
	public TelevisoreMedio() {
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
	}
	
	public TelevisoreMedio(String seriale, int number_hdmi, int number_usb) {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.number_hdmi = number_hdmi;
		this.number_usb = number_usb;
	}


	public int getNumber_hdmi() {
		return number_hdmi;
	}
	public void setNumber_hdmi(int number_hdmi) {
		this.number_hdmi = number_hdmi;
	}
	public int getNumber_usb() {
		return number_usb;
	}
	public void setNumber_usb(int number_usb) {
		this.number_usb = number_usb;
	}


	@Override
	public String toString() {
		return "TelevisoreMedio [number_hdmi=" + number_hdmi + ", number_usb=" + number_usb + ", Seriale="
				+ getSeriale() + ", Tipo=" + getTipo() + ", Marche=" + getMarche() + ", Altezza="
				+ getAltezza() + ", Lunghezza=" + getAltezza() + ", Diagonale=" + getDiagonale()
				+ ", Risoluzione=" + getRisoluzione() + ", TipoSchermo=" + getTipoSchermo() + "]";
	}



	
}
