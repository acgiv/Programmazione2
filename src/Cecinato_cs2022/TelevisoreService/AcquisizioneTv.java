package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;

public interface AcquisizioneTv {
	
	public boolean addSeriale(Televisore tv, String Seriale);

	public boolean addMarcaTv(Televisore tv, MarcheTelevisori marca);

	public boolean addAltezzaTv(Televisore tv, double Altezza);

	public boolean addLarghezzaTv(Televisore tv, double Larghezza);

	public boolean addNumberHdmiTv(Televisore tv, int NumeroHdmi);

	public boolean addNumberUsbTv(Televisore tv, int NumeroUsb);

	public boolean addDiagonaleTv(Televisore tv, double Diagonale);
	
	public boolean addNumberSmartTv(Televisore tv, int numeroSmartTv);
	
	public boolean addRisoluzioneTv(Televisore tv, ConstantGlobal.RISOLUZIONE_TV risoluzione); 
	
	public boolean addTiposchermoTv(Televisore tv, ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo);
	
}
