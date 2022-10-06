package Cecinato_cs2022.TelevisoreService;

public interface AcquisizioneTv {

	public boolean addMarcaTv(Televisore tv, String marca);

	public boolean addAltezzaTv(Televisore tv, String altezza);

	public boolean addLarghezzaTv(Televisore tv, String larghezza);

	public boolean addNumberHdmiTv(Televisore tv, String numeroHdmi);

	public boolean addNumberUsbTv(Televisore tv, String numeroUsb);

	public boolean addDiagonaleTv(Televisore tv, String diagonale);

	public boolean addNumberSmartTv(Televisore tv, String numeroSmartTv);

	public boolean addRisoluzioneTv(Televisore tv, String risoluzione);

	public boolean addTiposchermoTv(Televisore tv, String tipoSchermo);
	
	public void addTelevisoreBase(Televisore tv, String marca, String altezza, String larghezza, String diagonale , String risoluzione, String tipoSchermo);
	
	public void addTelevisoreMedio(Televisore tv, String marca, String altezza, String larghezza, String diagonale , String risoluzione, String tipoSchermo, String numeroUsb);

	public void addTelevisoreAvanzato(Televisore tv, String marca, String altezza, String larghezza, String diagonale , String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv);
	
}
