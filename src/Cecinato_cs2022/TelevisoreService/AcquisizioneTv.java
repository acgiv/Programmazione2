package Cecinato_cs2022.TelevisoreService;

public interface AcquisizioneTv {
	
	public boolean addSeriale(Televisore tv, String Seriale);

	public boolean addMarcaTv(Televisore tv);

	public boolean addAltezzaTv(Televisore tv);

	public boolean addLarghezzaTv(Televisore tv, double Larghezza);

	public boolean addNumberHdmiTv(Televisore tv, int NumeroHdmi);

	public boolean addNumberUsbTv(Televisore tv, int NumeroUsb);

	public boolean addDiagonaleTv(Televisore tv, double Diagonale);
	
	public boolean addNumberSmartTv(Televisore tv, int numeroSmartTv);
	
	public boolean addRisoluzioneTv(Televisore tv); 
	
	public boolean addTiposchermoTv(Televisore tv);
	
}
