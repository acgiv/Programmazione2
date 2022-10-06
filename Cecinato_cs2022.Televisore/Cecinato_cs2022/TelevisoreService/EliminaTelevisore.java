package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

public interface EliminaTelevisore {

	public boolean eliminaMarcaTv(Televisore tv)throws TelevisoreException;

	public boolean eliminaAltezzaTv(Televisore tv) throws TelevisoreException;

	public boolean eliminaLarghezzaTv(Televisore tv) throws TelevisoreException;

	public boolean eliminaNumberHdmiTv(Televisore tv);

	public boolean eliminaNumberUsbTv(Televisore tv);

	public boolean eliminaDiagonaleTv(Televisore tv) throws TelevisoreException;
	
	public boolean eliminaNumberSmartTv(Televisore tv);
	
	public boolean eliminaRisoluzioneTv(Televisore tv) throws TelevisoreException; 
	
	public boolean eliminaTiposchermoTv(Televisore tv) throws TelevisoreException;
}
