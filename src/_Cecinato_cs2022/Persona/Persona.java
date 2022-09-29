package _Cecinato_cs2022.Persona;


public class Persona extends AbstractPersona {
	

	private String nome;
	private String cognome;
	private int eta;
	private char sesso;
	private String dataNascita; // il formato sarà 01/02/2022
	
	
	public Persona(String nome, String cognome, int eta, char sesso, String dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	public String getData() {
		return dataNascita;
	}
	public void setData(String data) {
		this.dataNascita = data;
	}

}
