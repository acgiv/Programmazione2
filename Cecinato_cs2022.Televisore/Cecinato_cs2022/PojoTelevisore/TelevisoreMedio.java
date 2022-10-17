package Cecinato_cs2022.PojoTelevisore;

import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.MaxValueException;
import Cecinato_cs2022.EcceptionTelevisore.MinValueException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

public class TelevisoreMedio extends TelevisoreBase {

	private int number_usb;

	public TelevisoreMedio(String seriale) throws TelevisoreException {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.number_usb = ConstantGlobal.NUM_USB_TV_MEDIO;
	}

	public TelevisoreMedio(String seriale, int number_usb) throws TelevisoreException {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.number_usb = number_usb;
	}

	public int getNumber_usb() {
		return number_usb;
	}

	public void setNumber_usb(int number_usb) {
		this.number_usb = number_usb;
	}

	@Override
	public String toString() {
		String stringa;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");
		stringa += String.format("| %73s %55s ", ConstantGlobal.TITOLO_TABELLA_MEDIO, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_MEDIO;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");
		stringa += String.format("| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s %6s %9s\n",
				super.getSeriale(), " | ", super.getMarche(), " | ", super.getAltezza(), " | ", super.getLarghezza(),
				" | ", super.getDiagonale(), " | ", super.getRisoluzione(), " | ", super.getTipoSchermo(), " | ",
				number_usb, " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");

		return stringa;
	}

	@Override
	public boolean addNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			if (!insertusb) {
				if (StringUtils.isNotBlank(numeroUsb)) {
					numeroUsb = numeroUsb.trim();
					if (controlloParamentriNumericiTv(numeroUsb)) {
						if (super.isInteger(numeroUsb)) {
							if (super.controlloCorrettezzaUsb(numeroUsb)) {
								setNumber_usb(Integer.valueOf(numeroUsb));
								insertusb = true;
								result = true;
							} else if (Integer.valueOf(numeroUsb) < 0) {
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
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_USB)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroUsb());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinUsb());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb) {
		return addTelevisoreBase(marca, altezza, larghezza, diagonale, risoluzione, tipoSchermo)
				&& addNumberUsbTv(numeroUsb);
	}

	@Override
	public boolean modificaNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			if (insertusb) {
				if (StringUtils.isNotBlank(numeroUsb)) {
					numeroUsb = numeroUsb.trim();
					if (super.controlloParamentriNumericiTv(numeroUsb)) {
						if (super.isInteger(numeroUsb)) {
							if (super.controlloCorrettezzaUsb(numeroUsb)) {
								setNumber_usb(Integer.valueOf(numeroUsb));
								result = true;
							}
						} else if (Integer.valueOf(numeroUsb) < 0) {
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
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_USB)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroUsb());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinUsb());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean eliminaNumberUsbTv() {
		Boolean result = false;
		try {
			if (super.insertusb) {
				setNumber_usb(0);
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"non è possibile cancellare , il numero di usb non è mai stato aggiunto"));
		}
		return result;
	}

	@Override
	public int visualizzaNumeroUsb() {
		return number_usb;
	}
}
