package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

public interface EliminaTelevisore {

	public boolean eliminaMarcaTv()throws TelevisoreException;

	public boolean eliminaAltezzaTv() throws TelevisoreException;
	
	public boolean eliminaLarghezzaTv() throws TelevisoreException;

	public boolean eliminaNumberHdmiTv();

	public boolean eliminaNumberUsbTv();

	public boolean eliminaDiagonaleTv() throws TelevisoreException;
	
	public boolean eliminaNumberSmartTv();
	
	public boolean eliminaRisoluzioneTv() throws TelevisoreException; 
	
	public boolean eliminaTiposchermoTv() throws TelevisoreException;
}
