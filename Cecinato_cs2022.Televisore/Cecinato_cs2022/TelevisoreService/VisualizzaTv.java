package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;

public interface VisualizzaTv {
	
	 public void visualizzanomiMarcheTv();
	 
	 public void visualizzaTipologieSchermoTv();
	 
	 public  void visualizzaRisoluzioniSchermiTv();
	 
	 public MarcheTelevisori visualizzaMarca(Televisore tv);
	 
	 public double visualizzaAltezza(Televisore tv);
	 
	 public double visualizzaLarghezza(Televisore tv);
	 
	 public double visualizzaDiagonale(Televisore tv);
	 
	 public String visualizzaSeriale(Televisore tv);
	 
	 public ConstantGlobal.RISOLUZIONE_TV  visualizzaRisluzione(Televisore tv);
	 
	 public ConstantGlobal.TIPOLOGIA_SCHERMO visualizzaTipoSchermo(Televisore tv);
	 
	 public ConstantGlobal.TIPOLOGIA_TV visualizzaTipologiaTv(Televisore tv);
	 
	 public int visualizzaNumeroUsb(Televisore tv);
	 
	 public int visualizzaNumeroHdmi(Televisore tv);
	 
	 public int visualizzaNumeroSmartTv(Televisore tv);

}
