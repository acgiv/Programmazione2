package Cecinato_cs2022.PojoTelevisore;

import java.util.Collections;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

public class TelevisoreBase extends AbstractTelevisore {
	private String seriale;
	private MarcheTelevisori marche;
	private double altezza;
	private double larghezza;
	private double diagonale;
	private ConstantGlobal.RISOLUZIONE_TV risoluzione;
	private ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo;
	private ConstantGlobal.TIPOLOGIA_TV tipo;

	public TelevisoreBase(String seriale) throws TelevisoreException {
		super();
		if (super.controlloSeriale(seriale)) {
			this.seriale = seriale;
		} else {
			throw new TelevisoreException("Il seriale inserito non � corretto o gi� esistente: ".concat(seriale));
		}
		this.tipo = ConstantGlobal.TIPOLOGIA_TV.BASE;
	}

	public String getSeriale() {
		return seriale;
	}

	public void setSeriale(String seriale) {
		this.seriale = seriale;
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

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getDiagonale() {
		return diagonale;
	}

	public void setDiagonale(double diagonale) {
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
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");
		stringa+= String.format("| %59s %52s ", ConstantGlobal.TITOLO_TABELLA_BASE,"|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_BASE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");
		stringa += String.format("| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s\n", seriale, " | ",
				marche, " | ", altezza, " | ", larghezza, " | ", diagonale, " | ", risoluzione, " | ", tipoSchermo,
				" | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");

		return stringa;
	}

}
