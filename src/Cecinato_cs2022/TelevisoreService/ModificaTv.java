package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;

public interface ModificaTv {

	public boolean modificaSeriale(Televisore tv, String Seriale);

	public boolean modificaMarcaTv(Televisore tv);

	public boolean modificaAltezzaTv(Televisore tv, double Altezza);

	public boolean modificaLarghezzaTv(Televisore tv, double Larghezza);

	public boolean modificaNumberHdmiTv(Televisore tv, int NumeroHdmi);

	public boolean modificaNumberUsbTv(Televisore tv, int NumeroUsb);

	public boolean modificaDiagonaleTv(Televisore tv, double Diagonale);
	
	public boolean modificaNumberSmartTv(Televisore tv, int numeroSmartTv);
	
	public boolean modificaRisoluzioneTv(Televisore tv, ConstantGlobal.RISOLUZIONE_TV risoluzione); 
	
	public boolean modificaTiposchermoTv(Televisore tv, ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo);
}
