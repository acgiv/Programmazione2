package Cecinato_cs2022.PojoTelevisore;

import java.util.Collections;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.RISOLUZIONE_TV;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPOLOGIA_SCHERMO;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPOLOGIA_TV;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.MaxValueException;
import Cecinato_cs2022.EcceptionTelevisore.MinValueException;
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
			elencoSerialeTv.add(seriale);
		} else {
			throw new TelevisoreException("Il seriale inserito non è corretto o già esistente: " + seriale);
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
		stringa += String.format("| %59s %52s ", ConstantGlobal.TITOLO_TABELLA_BASE, "|\n");
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

	@Override
	public boolean addMarcaTv(String marca) {
		Boolean result = false;
		try {
			if (getMarche() == null) {
				if (marca.isEmpty()) {
					throw new NullPointerException();
				} else if (controlloMarca(marca.toUpperCase())) {
					setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
					result = true;
				} else {
					throw new TelevisoreException();
				}
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	@Override
	public boolean addAltezzaTv(String altezza) {
		Boolean result = false;
		try {
			if (getAltezza() == 0) {
				if (!altezza.isEmpty()) {
					if (controlloParamentriNumericiTv(altezza)) {
						if (Double.valueOf(altezza) <= ConstantGlobal.ALTEZZA_MASSIMA_TV
								&& Double.valueOf(altezza) >= ConstantGlobal.ALTEZZA_MINIMA_TV) {
							setAltezza(Double.valueOf(altezza));
							result = true;
						} else if (Double.valueOf(altezza) < ConstantGlobal.ALTEZZA_MINIMA_TV) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinAltezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.out.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.ALTEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxAltezza());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addLarghezzaTv(String larghezza) {
		Boolean result = false;
		try {
			if (getLarghezza() == 0) {
				if (!larghezza.isEmpty()) {
					if (controlloParamentriNumericiTv(larghezza)) {
						if (Double.valueOf(larghezza) <= ConstantGlobal.LARGHEZZA_MASSIMA_TV
								&& Double.valueOf(larghezza) >= ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							setLarghezza(Double.valueOf(larghezza));
							result = true;
						} else if (Double.valueOf(larghezza) < ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinLarghezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.LARGHEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxLarghezza());

		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");

		}
		return result;
	}

	@Override
	public boolean addNumberSmartTv(String numeroSmartTv) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean addNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean addNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean addDiagonaleTv(String diagonale) {
		Boolean result = false;
		try {
			if (getDiagonale() == 0) {
				if (!diagonale.isEmpty()) {
					if (controlloParamentriNumericiTv(diagonale)) {
						if (Double.valueOf(diagonale) <= ConstantGlobal.DIAGONALE_MASSIMA_TV
								&& Double.valueOf(diagonale) >= ConstantGlobal.DIAGONALE_MINIMA_TV) {
							setDiagonale(Double.valueOf(diagonale));
							result = true;
						} else if (Double.valueOf(diagonale) < ConstantGlobal.DIAGONALE_MINIMA_TV) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}

			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinDiagonale());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.DIAGONALE)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxDiagonale());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addRisoluzioneTv(String risoluzione) {
		Boolean result = false;
		try {
			if (getRisoluzione() == null) {
				if (risoluzione.isEmpty()) {
					throw new NullPointerException();
				} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
					setRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
					result = true;
				} else {
					throw new TelevisoreException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.RISOLUZIONE)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	@Override
	public boolean addTiposchermoTv(String tipoSchermo) {
		Boolean result = false;
		try {

			if (getTipoSchermo() == null) {
				if (tipoSchermo.isEmpty()) {
					throw new NullPointerException();
				} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
					setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
					result = true;
				} else {
					throw new TelevisoreException();
				}

			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.TIPO_SCHERMO)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	@Override
	public boolean addTelevisoreBase(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo) {
		return addMarcaTv(marca) && addAltezzaTv(altezza) && addLarghezzaTv(larghezza) && addDiagonaleTv(diagonale)
				&& addRisoluzioneTv(risoluzione) && addTiposchermoTv(tipoSchermo);
	}

	@Override
	public boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean modificaSeriale(String seriale) {
		Boolean result = false;
		try {
			if (controlloSeriale(seriale)) {
				super.eliminaSeriale(getSeriale());
				this.seriale = seriale;
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("Il seriale inserito non è corretto o già esistente: "+ seriale);
		}
		return result;
	}

	@Override
	public boolean modificaMarcaTv(String marca) {
		Boolean result = false;
		try {
			if (getMarche() != null) {
				if (marca.isEmpty()) {
					throw new NullPointerException();
				} else if (super.controlloMarca(marca.toUpperCase())) {
					setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
					result = true;
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	@Override
	public boolean modificaAltezzaTv(String altezza) {
		Boolean result = false;
		try {
			if (getAltezza() != 0) {
				if (!altezza.isEmpty()) {
					if (controlloParamentriNumericiTv(altezza)) {
						if (Double.valueOf(altezza) <= ConstantGlobal.ALTEZZA_MASSIMA_TV
								&& Double.valueOf(altezza) >= ConstantGlobal.ALTEZZA_MINIMA_TV) {
							setAltezza(Double.valueOf(altezza));
							result = true;
						} else if (Double.valueOf(altezza) < ConstantGlobal.ALTEZZA_MINIMA_TV) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinAltezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.out.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.ALTEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxAltezza());

		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificaLarghezzaTv(String larghezza) {
		Boolean result = false;
		try {
			if (getLarghezza() != 0) {
				if (!larghezza.isEmpty()) {
					if (controlloParamentriNumericiTv(larghezza)) {
						if (Double.valueOf(larghezza) <= ConstantGlobal.LARGHEZZA_MASSIMA_TV
								&& Double.valueOf(larghezza) >= ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							setLarghezza(Double.valueOf(larghezza));
							result = true;
						} else if (Double.valueOf(larghezza) < ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinLarghezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err
					.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.LARGHEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxLarghezza());

		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificaNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean modificaNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean modificaDiagonaleTv(String diagonale) {
		Boolean result = false;
		try {
			if (getDiagonale() != 0) {
				if (!diagonale.isEmpty()) {
					if (super.controlloParamentriNumericiTv(diagonale)) {
						if (Double.valueOf(diagonale) <= ConstantGlobal.DIAGONALE_MASSIMA_TV
								&& Double.valueOf(diagonale) >= ConstantGlobal.DIAGONALE_MINIMA_TV) {
							setDiagonale(Double.valueOf(diagonale));
							result = true;
						} else if (Double.valueOf(diagonale) < ConstantGlobal.DIAGONALE_MINIMA_TV) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}

			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinDiagonale());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err
					.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.DIAGONALE)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxDiagonale());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificaNumberSmartTv(String numeroSmartTv) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	public boolean modificaRisoluzioneTv(String risoluzione) {
		Boolean result = false;
		try {
			if (getRisoluzione() != null) {
				if (risoluzione.isEmpty()) {
					throw new NullPointerException();
				} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
					setRisoluzione(ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
					result = true;
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.RISOLUZIONE)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	@Override
	public boolean modificaTiposchermoTv(String tipoSchermo) {
		Boolean result = false;
		try {
			if (getTipoSchermo() != null) {
				if (tipoSchermo.isEmpty()) {
					throw new NullPointerException();
				} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
					setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
					result = true;
				}

			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.TIPO_SCHERMO)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	@Override
	public boolean eliminaMarcaTv() throws TelevisoreException {
		Boolean result = false;
		if (getMarche() != null) {
			setMarche(null);
			result = true;
		} else {
			throw new TelevisoreException("la marca non può essere cancellata essendo già nulla");
		}
		return result;

	}

	@Override
	public boolean eliminaAltezzaTv() throws TelevisoreException {
		Boolean result = false;
		if (getAltezza() != 0) {
			setAltezza(0);
			result = true;
		} else {
			throw new TelevisoreException("l'altezza non può essere cancellata essendo già nulla");
		}
		return result;
	}

	@Override
	public boolean eliminaLarghezzaTv() throws TelevisoreException {
		Boolean result = false;
		if (getLarghezza() != 0) {
			setLarghezza(0);
			result = true;
		} else {
			throw new TelevisoreException("la larghezza non può essere cancellata essendo già nulla");
		}
		return result;
	}

	@Override
	public boolean eliminaNumberHdmiTv() {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean eliminaNumberUsbTv() {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean eliminaDiagonaleTv() throws TelevisoreException {
		Boolean result = false;
		if (getDiagonale() != 0) {
			setDiagonale(0);
			result = true;
		} else {
			throw new TelevisoreException("la diagonale della tv non può essere cancellata essendo già nulla");
		}
		return result;
	}

	@Override
	public boolean eliminaNumberSmartTv() {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	@Override
	public boolean eliminaRisoluzioneTv() throws TelevisoreException {
		Boolean result = false;
		if (getRisoluzione() != null) {
			setRisoluzione(null);
			result = true;
		} else {
			throw new TelevisoreException("la risoluzione non può essere cancellata essendo già nulla");
		}
		return result;
	}

	@Override
	public boolean eliminaTiposchermoTv() throws TelevisoreException {
		Boolean result = false;
		if (getTipoSchermo() != null) {
			setTipoSchermo(null);
			result = true;
		} else {
			throw new TelevisoreException("la tipologia della tv non può essere cancellata essendo già nulla");
		}
		return result;
	}

	@Override
	public MarcheTelevisori visualizzaMarca() {
		return getMarche();
	}

	@Override
	public double visualizzaAltezza() {
		return getAltezza();
	}

	@Override
	public double visualizzaLarghezza() {
		return getLarghezza();
	}

	@Override
	public double visualizzaDiagonale() {
		return getDiagonale();
	}

	@Override
	public String visualizzaSeriale() {
		return getSeriale();
	}

	@Override
	public RISOLUZIONE_TV visualizzaRisoluzione() {
		return getRisoluzione();
	}

	@Override
	public TIPOLOGIA_SCHERMO visualizzaTipoSchermo() {
		return getTipoSchermo();
	}

	@Override
	public TIPOLOGIA_TV visualizzaTipologiaTv() {
		return getTipo();
	}

	@Override
	public int visualizzaNumeroUsb() {
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return 0;
	}

	@Override
	public int visualizzaNumeroHdmi() {
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return 0;
	}

	@Override
	public int visualizzaNumeroSmartTv() {
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return 0;
	}

}
