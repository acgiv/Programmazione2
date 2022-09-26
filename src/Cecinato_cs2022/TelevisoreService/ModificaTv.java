package Cecinato_cs2022.TelevisoreService;


public interface ModificaTv {

	public boolean modificaSeriale(Televisore tv, String seriale);

	public boolean modificaMarcaTv(Televisore tv, String marca);

	public boolean modificaAltezzaTv(Televisore tv, String altezza);

	public boolean modificaLarghezzaTv(Televisore tv, String larghezza);

	public boolean modificaNumberHdmiTv(Televisore tv, String numeroHdmi);

	public boolean modificaNumberUsbTv(Televisore tv, String numeroUsb);

	public boolean modificaDiagonaleTv(Televisore tv, String diagonale);
	
	public boolean modificaNumberSmartTv(Televisore tv, String numeroSmartTv);
	
	public boolean modificaRisoluzioneTv(Televisore tv, String risoluzione); 
	
	public boolean modificaTiposchermoTv(Televisore tv, String tipoSchermo);
	
}
