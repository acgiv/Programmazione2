package _Cecinato_cs2022.Persona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public class Cliente extends Persona {

	private String codiceFiscale;

	public Cliente(String nome, String cognome, int eta, char sesso, String dataNascita, String CodiceFiscale) throws PersonaException {
		super(nome, cognome, eta, sesso, dataNascita);
		if (super.controlloCodiceFiscale(CodiceFiscale)) {
			this.codiceFiscale = CodiceFiscale;
		}
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	


}
