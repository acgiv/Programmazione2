package Cecinato_cs2022.TelevisoreService;

public interface AcquisizioneTv {

	public boolean addMarcaTv(String marca);

	public boolean addAltezzaTv(String altezza);

	public boolean addLarghezzaTv(String larghezza);

	public boolean addNumberHdmiTv(String numeroHdmi);

	public boolean addNumberUsbTv(String numeroUsb);

	public boolean addDiagonaleTv(String diagonale);

	public boolean addNumberSmartTv(String numeroSmartTv);

	public boolean addRisoluzioneTv(String risoluzione);

	public boolean addTiposchermoTv(String tipoSchermo);

	public boolean addTelevisoreBase(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo);

	public boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb);

	public boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv);

}
