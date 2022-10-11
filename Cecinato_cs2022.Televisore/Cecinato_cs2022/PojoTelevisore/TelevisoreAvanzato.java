package Cecinato_cs2022.PojoTelevisore;

import java.util.Collections;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.MaxValueException;
import Cecinato_cs2022.EcceptionTelevisore.MinValueException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;



public class TelevisoreAvanzato extends TelevisoreMedio {

	private int number_smartTv;
	private int number_hdmi;

	public TelevisoreAvanzato(String seriale) throws TelevisoreException {
		super(seriale, ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.number_smartTv = ConstantGlobal.NUM_SMART_TV_AVANZATO;
	}

	public TelevisoreAvanzato(String seriale, int number_hdmi, int number_usb, int number_smartTv)
			throws TelevisoreException {
		super(seriale, number_usb);
		this.number_hdmi = number_hdmi;
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.number_smartTv = number_smartTv;

	}

	public int getNumber_smartTv() {
		return number_smartTv;
	}

	public void setNumber_smartTv(int number_smartTv) {
		this.number_smartTv = number_smartTv;
	}

	public int getNumber_hdmi() {
		return number_hdmi;
	}

	public void setNumber_hdmi(int number_hdmi) {
		this.number_hdmi = number_hdmi;
	}

	@Override
	public String toString() {
		String stringa;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += String.format("| %94s %75s ", ConstantGlobal.TITOLO_TABELLA_TV_AVANZATO, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_AVANZATO;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += String.format(
				"| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s %6s %9s %7s %10s %10s %10s\n",
				super.getSeriale(), " | ", super.getMarche(), " | ", super.getAltezza(), " | ", super.getLarghezza(),
				" | ", super.getDiagonale(), " | ", super.getRisoluzione(), " | ", super.getTipoSchermo(), " | ",
				super.getNumber_usb(), " | ", getNumber_hdmi(), " | ", getNumber_smartTv(), " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");

		return stringa;
	}

	
	
	
	@Override
	public boolean addNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			if (!inserthdmi) {
				if (!numeroHdmi.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroHdmi)) {
						if (super.isInteger(numeroHdmi)) {
							if (Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_HDMI_TV_AVANZATO
									|| Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_MINIMO_HDMI) {
								setNumber_hdmi(Integer.valueOf(numeroHdmi));
								inserthdmi = true;
								result = true;
							} else if (Integer.valueOf(numeroHdmi) < 0) {
								throw new MinValueException();
							} else {
								throw new MaxValueException();
							}
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.out.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_HDMI)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroHdmi());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.out.println(e.ErrorMinNumeroHdmi());
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
			if (!insertSmartTV) {
				if (!numeroSmartTv.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroSmartTv)) {
						if (isInteger(numeroSmartTv)) {
							if (Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_SMART_TV_AVANZATO
									|| Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_MINIMO_SMART_TV) {
								setNumber_smartTv(Integer.valueOf(numeroSmartTv));
								insertSmartTV = true;
								result = true;
							} else if (Integer.valueOf(numeroSmartTv) < 0) {
								throw new MinValueException();
							} else {
								throw new MaxValueException();
							}
							result = true;
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
			System.err.println(e.ErrorMinNumeroMinSmartTv());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(
					e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_SMART_TV)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroSmartTv());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addTelevisoreAvanzato( String marca, String altezza, String larghezza, String diagonale , String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv) {
		return super.addTelevisoreMedio(marca, altezza, larghezza, diagonale, risoluzione, tipoSchermo, numeroUsb) && addNumberHdmiTv(numeroHdmi) && addNumberSmartTv(numeroSmartTv);
	}
	
	@Override
	public boolean modificaNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			if (inserthdmi) {
				if (!numeroHdmi.isEmpty()) {
					if (super.controlloParamentriNumericiTv(numeroHdmi)) {

							if (super.isInteger(numeroHdmi)) {
								if (Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_HDMI_TV_AVANZATO
										|| Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_MINIMO_HDMI) {
									setNumber_hdmi(Integer.valueOf(numeroHdmi));
									result = true;
								} else if (Integer.valueOf(numeroHdmi) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.out.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_HDMI)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroHdmi());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.out.println(e.ErrorMinNumeroHdmi());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;

	}
	
	@Override
	public boolean modificaNumberSmartTv( String numeroSmartTv) {
		Boolean result = false;
		try {
			if (insertSmartTV) {
				if (!numeroSmartTv.isEmpty()) {
							if (super.isInteger(numeroSmartTv)) {
								if (Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_SMART_TV_AVANZATO
										|| Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_MINIMO_SMART_TV) {
									setNumber_smartTv(Integer.valueOf(numeroSmartTv));
									result = true;
								} else if (Integer.valueOf(numeroSmartTv) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
								result = true;
							}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinSmartTv());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_SMART_TV)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroSmartTv());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}
	
	@Override
	public boolean eliminaNumberHdmiTv() {
		Boolean result = false;
		try {
			if (super.inserthdmi) {
				setNumber_hdmi(0);
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"non è possibile cancellare, il numero di hdmi non è mai stato aggiunto"));
		}
		return result;

	}

	@Override
	public boolean eliminaNumberSmartTv() {
		Boolean result = false;
		try {
			if (super.insertSmartTV) {
				setNumber_smartTv(0);
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"il numero dello smart  non può essere cancellata essendo già nulla "));
		}
		return result;
	}

	public int visualizzaNumeroHdmi() {
		return getNumber_hdmi();
	}

	public int visualizzaNumeroSmartTv() {
		return getNumber_smartTv();
	}

}
