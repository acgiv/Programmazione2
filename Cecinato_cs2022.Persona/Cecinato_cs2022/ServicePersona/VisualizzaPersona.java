package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

public interface VisualizzaPersona {

    public String  VisualizzaNome();
	
	public String VisualizzaCognome();
	
	public int VisualizzaEta();
	
	public ConstantGlobal.GENERE VisualizzaGenere();
	
	public String VisualizzaDataNascita();
	
	public String VisualizzaCitta();
	
	public void visualizzaElencoGenerePersona ();
	
}
