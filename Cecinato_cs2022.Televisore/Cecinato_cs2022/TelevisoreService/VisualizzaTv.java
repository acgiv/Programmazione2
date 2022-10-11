package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;

public interface VisualizzaTv {
	
	 public void visualizzanomiMarcheTv();
	 
	 public void visualizzaTipologieSchermoTv();
	 
	 public  void visualizzaRisoluzioniSchermiTv();
	 
	 public MarcheTelevisori visualizzaMarca();
	 
	 public double visualizzaAltezza();
	 
	 public double visualizzaLarghezza();
	 
	 public double visualizzaDiagonale();
	 
	 public String visualizzaSeriale();
	 
	 public ConstantGlobal.RISOLUZIONE_TV  visualizzaRisoluzione();
	 
	 public ConstantGlobal.TIPOLOGIA_SCHERMO visualizzaTipoSchermo();
	 
	 public ConstantGlobal.TIPOLOGIA_TV visualizzaTipologiaTv();
	 
	 public int visualizzaNumeroUsb();
	 
	 public int visualizzaNumeroHdmi();
	 
	 public int visualizzaNumeroSmartTv();

}
