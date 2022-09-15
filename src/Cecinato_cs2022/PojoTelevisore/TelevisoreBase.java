package Cecinato_cs2022.PojoTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;

public class TelevisoreBase extends AbstractTelevisore {
	private String Seriale;
	private MarcheTelevisori marche;
	private float altezza;
	private float larghezza;
	private float diagonale;
	private ConstantGlobal.RISOLUZIONE_TV risoluzione;
	private ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo;
	private ConstantGlobal.TIPOLOGIA_TV tipo;

	public TelevisoreBase(String seriale) {
		super();
		Seriale = seriale;
		this.tipo =  ConstantGlobal.TIPOLOGIA_TV.BASE;
	}


	public  TelevisoreBase() {
		this.tipo = ConstantGlobal.TIPOLOGIA_TV.BASE;
	}
	
	public String getSeriale() {
		return Seriale;
	}

	public void setSeriale(String seriale) {
		Seriale = seriale;
	}

	public ConstantGlobal.TIPOLOGIA_TV getTipo() {
		return tipo;
	}

	public void setTipo(ConstantGlobal.TIPOLOGIA_TV tipo) {
		this.tipo = tipo;
	}

	public MarcheTelevisori getMarche() {
		return marche;
	}

	public void setMarche(MarcheTelevisori marche) {
		this.marche = marche;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public float getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}

	public float getDiagonale() {
		return diagonale;
	}

	public void setDiagonale(float diagonale) {
		this.diagonale = diagonale;
	}

	public ConstantGlobal.RISOLUZIONE_TV getRisoluzione() {
		return risoluzione;
	}

	public void setRisoluzione(ConstantGlobal.RISOLUZIONE_TV risoluzione) {
		this.risoluzione = risoluzione;
	}

	public ConstantGlobal.TIPOLOGIA_SCHERMO getTipoSchermo() {
		return tipoSchermo;
	}

	public void setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo) {
		this.tipoSchermo = tipoSchermo;
	}

	@Override
	public String toString() {
		return "TelevisoreBase [Seriale=" + Seriale + ", marche=" + marche + ", altezza=" + altezza + ", larghezza="
				+ larghezza + ", diagonale=" + diagonale + ", risoluzione=" + risoluzione + ", tipoSchermo=" + tipoSchermo
				+ ", tipo=" + tipo + "]";
	}

}
