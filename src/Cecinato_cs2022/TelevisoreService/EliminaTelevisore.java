package Cecinato_cs2022.TelevisoreService;

public interface EliminaTelevisore {

	public boolean eliminaMarcaTv(Televisore tv);

	public boolean eliminaAltezzaTv(Televisore tv);

	public boolean eliminaLarghezzaTv(Televisore tv);

	public boolean eliminaNumberHdmiTv(Televisore tv);

	public boolean eliminaNumberUsbTv(Televisore tv);

	public boolean eliminaDiagonaleTv(Televisore tv);
	
	public boolean eliminaNumberSmartTv(Televisore tv);
	
	public boolean eliminaRisoluzioneTv(Televisore tv); 
	
	public boolean eliminaTiposchermoTv(Televisore tv);
}
