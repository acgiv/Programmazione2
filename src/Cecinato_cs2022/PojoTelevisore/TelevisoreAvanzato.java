package Cecinato_cs2022.PojoTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

public class TelevisoreAvanzato extends TelevisoreMedio {

	private int number_smartTv;
	
	
	public TelevisoreAvanzato(String seriale) {
		super(seriale, ConstantGlobal.NUM_HDMI_TV_AVANZATO, ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.number_smartTv =ConstantGlobal.NUM_SMART_TV_AVANZATO;
	}

	
	
	public TelevisoreAvanzato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TelevisoreAvanzato(String seriale, int number_hdmi, int number_usb, int number_smartTv) {
		super( seriale,  number_hdmi, number_usb);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.number_smartTv= number_smartTv;

	}

	public int getNumber_smartTv() {
		return number_smartTv;
	}

	public void setNumber_smartTv(int number_smartTv) {
		this.number_smartTv = number_smartTv;
	}

	@Override
	public String toString() {
		return "TelevisoreAvanzato [number_smartTv=" + number_smartTv + ", Number_hdmi=" + getNumber_hdmi()
				+ ", Number_usb=" + getNumber_usb() + ", Seriale=" + getSeriale() + ", Tipo=" + getTipo()
				+ "]";
	}


	
	
	
}
