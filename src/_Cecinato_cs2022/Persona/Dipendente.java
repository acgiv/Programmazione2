package _Cecinato_cs2022.Persona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public class Dipendente extends Persona{

	private int numeroTvVendute;
	private String codiceIdentificativo;
	
	public Dipendente(String nome, String cognome, int eta, char sesso, String dataNascita, String codiceIdentificativo) throws PersonaException {
		super(nome, cognome, eta, sesso, dataNascita);
		if(super.controlloIdentificativo(codiceIdentificativo)){
			this.codiceIdentificativo = codiceIdentificativo;
		}
		this.numeroTvVendute=0;
	}

	public int getNumeroTvVendute() {
		return numeroTvVendute;
	}

	public void setNumeroTvVendute(int numeroTvVendute) {
		this.numeroTvVendute = numeroTvVendute;
	}

	public String getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setCodiceIdentificativo(String codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}

	
	
}
