package Cecinato_cs2022.TelevisoreService;


public interface ModificaTv {

	public boolean modificaSeriale(Televisore tv, String Seriale);

	public boolean modificaMarcaTv(Televisore tv);

	public boolean modificaAltezzaTv(Televisore tv);

	public boolean modificaLarghezzaTv(Televisore tv);

	public boolean modificaNumberHdmiTv(Televisore tv);

	public boolean modificaNumberUsbTv(Televisore tv);

	public boolean modificaDiagonaleTv(Televisore tv);
	
	public boolean modificaNumberSmartTv(Televisore tv);
	
	public boolean modificaRisoluzioneTv(Televisore tv); 
	
	public boolean modificaTiposchermoTv(Televisore tv);
}
