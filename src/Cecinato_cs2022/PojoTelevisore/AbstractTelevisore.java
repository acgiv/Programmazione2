package Cecinato_cs2022.PojoTelevisore;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.MaxValueException;
import Cecinato_cs2022.EcceptionTelevisore.MinValueException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.EcceptionTelevisore.TipologiaException;
import Cecinato_cs2022.TelevisoreService.Televisore;

abstract class AbstractTelevisore implements Televisore {

	private boolean inserthdmi = false;
	private boolean insertusb = false;
	private boolean insertSmartTV = false;
	private final static Set<String> elencoSerialeTv = new TreeSet<String>();

	private ConstantGlobal.TIPOLOGIA_TV scannerTvInstanziata(Televisore tv) {
		String tipologiaInstanziata = String.valueOf(tv.getClass());
		tipologiaInstanziata = tipologiaInstanziata.replace("class Cecinato_cs2022.PojoTelevisore.Televisore", "");
		tipologiaInstanziata = tipologiaInstanziata.toUpperCase();
		return ConstantGlobal.TIPOLOGIA_TV.valueOf(tipologiaInstanziata);

	}

	public final void stampaMarcheTv() {
		int i = 1;
		System.out.println("Le marche esistenti di tv sono:");
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	public final void stampaTipologiaSchermoTv() {
		int i = 1;
		System.out.println("Le tipologie di schermo esistenti sono:");
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	public final void stampaRisoluzioneSchermiTv() {
		int i = 1;
		System.out.println("Le risoluzioni degli schermi esistenti sono:");
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			System.out.println(
					String.valueOf(i).concat(") ").concat(String.valueOf(item).replace("_", " ")).toLowerCase());
			i += 1;
		}
	}

	private boolean controlloMarca(String marca) {

		boolean result = false;
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			if (String.valueOf(item).equals(marca)) {
				result = true;
				break;
			}
		}
		return result;
	}

	private boolean controlloRisoluzione(String risoluzione) {
		boolean result = false;
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			if (String.valueOf(item).equals(risoluzione)) {
				result = true;
				break;
			}
		}
		return result;
	}

	private boolean controlloTipologiaSchermo(String tipoSchermo) {
		boolean result = false;
		System.out.println(tipoSchermo);
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			if (String.valueOf(item).equals(tipoSchermo)) {
				result = true;
				break;
			}
		}
		return result;
	}

	final boolean controlloSeriale(String seriale) {
		boolean result = true;
		if (!elencoSerialeTv.isEmpty() && seriale.matches(ConstantGlobal.REGEX_CONTROLLO_SERIALE)) {
			Iterator<String> element = elencoSerialeTv.iterator();
			while (element.hasNext()) {
				if (element.next().equals(seriale))
					result = false;
			}
			if (result) {
				elencoSerialeTv.add(seriale);
			}

		} else if (elencoSerialeTv.isEmpty() && seriale.matches(ConstantGlobal.REGEX_CONTROLLO_SERIALE)) {
			elencoSerialeTv.add(seriale);
		} else {
			result = false;
		}
		return result;
	}

	private boolean controlloParamentriNumericiTv(String parametri) {
		boolean result = false;
		try {
			parametri = parametri.replace(" ", "_");
			if (parametri.matches("^[+,-]?(\\d+(\\.\\d*)?)|((\\.\\d+))?$")) {
				result = true;
			} else {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			System.out.println("| Errore nell'inserimento |\n");
			System.out.println("| Non hai inserito dei valori numerici |\n");
		}
		return result;
	}

	private boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("| Errore nell'inserimento |\n");
			System.out.println("| Non hai inserito dei valori interi |\n");
			return false;
		} catch (NullPointerException e) {
			return false;
		}

		return true;
	}

	public boolean addMarcaTv(Televisore tv, String marca) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getMarche() == null) {
					if (marca.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloMarca(marca.toUpperCase())) {
						((TelevisoreBase) tv).setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getMarche() == null) {
					if (marca.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloMarca(marca.toUpperCase())) {
						((TelevisoreMedio) tv).setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getMarche() == null) {
					if (marca.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloMarca(marca.toUpperCase())) {
						((TelevisoreAvanzato) tv).setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;
			}
		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	public boolean addAltezzaTv(Televisore tv, String altezza) {
		Boolean result = false;
		try {
			if (((TelevisoreBase) tv).getAltezza() == 0) {
				if (!altezza.isEmpty()) {
					if (controlloParamentriNumericiTv(altezza)) {
						if (Double.valueOf(altezza) <= ConstantGlobal.ALTEZZA_MASSIMA_TV
								&& Double.valueOf(altezza) >= ConstantGlobal.ALTEZZA_MINIMA_TV) {
							switch (scannerTvInstanziata(tv)) {
							case BASE:
								((TelevisoreBase) tv).setAltezza(Double.valueOf(altezza));
								result = true;
								break;

							case MEDIO:
								((TelevisoreMedio) tv).setAltezza(Double.valueOf(altezza));
								result = true;
								break;
							case AVANZATO:
								((TelevisoreAvanzato) tv).setAltezza(Double.valueOf(altezza));
								result = true;
								break;
							}
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

	public boolean addLarghezzaTv(Televisore tv, String larghezza) {
		Boolean result = false;
		try {
			if (((TelevisoreBase) tv).getLarghezza() == 0) {
				if (!larghezza.isEmpty()) {
					if (controlloParamentriNumericiTv(larghezza)) {
						if (Double.valueOf(larghezza) <= ConstantGlobal.LARGHEZZA_MASSIMA_TV
								&& Double.valueOf(larghezza) >= ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							switch (scannerTvInstanziata(tv)) {
							case BASE:
								((TelevisoreBase) tv).setLarghezza(Double.valueOf(larghezza));
								result = true;
								break;

							case MEDIO:
								((TelevisoreMedio) tv).setLarghezza(Double.valueOf(larghezza));
								result = true;
								break;
							case AVANZATO:
								((TelevisoreAvanzato) tv).setLarghezza(Double.valueOf(larghezza));
								result = true;
								break;
							}
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

	public boolean addNumberHdmiTv(Televisore tv, String numeroHdmi) {
		Boolean result = false;
		try {
			if (!inserthdmi) {
				if (!numeroHdmi.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroHdmi)) {
						switch (scannerTvInstanziata(tv)) {
						case BASE:
							throw new TipologiaException();
						case MEDIO:
							throw new TipologiaException();
						case AVANZATO:
							if (isInteger(numeroHdmi)) {
								if (Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_HDMI_TV_AVANZATO
										|| Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_MINIMO_HDMI) {
									((TelevisoreAvanzato) tv).setNumber_hdmi(Integer.valueOf(numeroHdmi));
									inserthdmi = true;
									result = true;
								} else if (Integer.valueOf(numeroHdmi) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
							break;
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
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");

		}
		return result;

	}

	public boolean addNumberUsbTv(Televisore tv, String numeroUsb) {
		Boolean result = false;
		try {
			if (!insertusb) {
				if (!numeroUsb.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroUsb)) {
						switch (scannerTvInstanziata(tv)) {
						case BASE:
							throw new TipologiaException();
						case MEDIO:
							if (isInteger(numeroUsb)) {
								if (Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_USB_TV_MEDIO
										|| Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_MINIMO_USB) {
									((TelevisoreMedio) tv).setNumber_usb(Integer.valueOf(numeroUsb));
									insertusb = true;
									result = true;
								} else if (Integer.valueOf(numeroUsb) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
							break;
						case AVANZATO:
							if (isInteger(numeroUsb)) {
								if (Integer.valueOf(numeroUsb) == ConstantGlobal.NUMERO_USB_TV_AVANZATO
										|| Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_MINIMO_USB) {
									((TelevisoreAvanzato) tv).setNumber_usb(Integer.valueOf(numeroUsb));
									insertusb = true;
									result = true;
								} else if (Integer.valueOf(numeroUsb) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
							break;
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
			System.out.println(e.ErrorMaxNumeroUsb());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinUsb());
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean addDiagonaleTv(Televisore tv, String diagonale) {
		Boolean result = false;
		try {
			if (((TelevisoreBase) tv).getDiagonale() == 0) {
				if (!diagonale.isEmpty()) {
					if (controlloParamentriNumericiTv(diagonale)) {
						if (Double.valueOf(diagonale) <= ConstantGlobal.DIAGONALE_MASSIMA_TV
								&& Double.valueOf(diagonale) >= ConstantGlobal.DIAGONALE_MINIMA_TV) {
							switch (scannerTvInstanziata(tv)) {
							case BASE:
								((TelevisoreBase) tv).setDiagonale(Double.valueOf(diagonale));
								result = true;
								break;

							case MEDIO:
								((TelevisoreMedio) tv).setDiagonale(Double.valueOf(diagonale));
								result = true;
								break;
							case AVANZATO:
								((TelevisoreAvanzato) tv).setDiagonale(Double.valueOf(diagonale));
								result = true;
								break;
							}
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

	public boolean addNumberSmartTv(Televisore tv, String numeroSmartTv) {
		Boolean result = false;
		try {
			if (!insertSmartTV) {
				if (!numeroSmartTv.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroSmartTv)) {
						switch (scannerTvInstanziata(tv)) {
						case BASE:
							throw new TipologiaException();

						case MEDIO:
							throw new TipologiaException();
						case AVANZATO:
							if (isInteger(numeroSmartTv)) {
								if (Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_SMART_TV_AVANZATO
										|| Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_MINIMO_SMART_TV) {
									((TelevisoreAvanzato) tv).setNumber_smartTv(Integer.valueOf(numeroSmartTv));
									insertSmartTV = true;
									result = true;
								} else if (Integer.valueOf(numeroSmartTv) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
								result = true;
							}
							break;
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
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean addRisoluzioneTv(Televisore tv, String risoluzione) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getRisoluzione() == null) {
					if (risoluzione.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
						((TelevisoreBase) tv).setRisoluzione(
								ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getRisoluzione() == null) {
					if (risoluzione.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
						((TelevisoreBase) tv).setRisoluzione(
								ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getRisoluzione() == null) {
					if (risoluzione.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
						((TelevisoreBase) tv).setRisoluzione(
								ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.RISOLUZIONE)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	public boolean addTiposchermoTv(Televisore tv, String tipoSchermo) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getTipoSchermo() == null) {
					if (tipoSchermo.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
						((TelevisoreBase) tv)
								.setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getTipoSchermo() == null) {
					if (tipoSchermo.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
						((TelevisoreMedio) tv)
								.setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getTipoSchermo() == null) {
					if (tipoSchermo.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
						((TelevisoreAvanzato) tv)
								.setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.TIPO_SCHERMO)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	public void addTelevisoreBase(Televisore tv, String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo) {
		tv.addMarcaTv(tv, marca);
		tv.addAltezzaTv(tv, altezza);
		tv.addLarghezzaTv(tv, larghezza);
		tv.addDiagonaleTv(tv, diagonale);
		tv.addRisoluzioneTv(tv, risoluzione);
		tv.addTiposchermoTv(tv, tipoSchermo);

	}

	public void addTelevisoreMedio(Televisore tv, String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb) {

		tv.addMarcaTv(tv, marca);
		tv.addAltezzaTv(tv, altezza);
		tv.addLarghezzaTv(tv, larghezza);
		tv.addDiagonaleTv(tv, diagonale);
		tv.addRisoluzioneTv(tv, risoluzione);
		tv.addTiposchermoTv(tv, tipoSchermo);
		tv.addNumberUsbTv(tv, numeroUsb);
	}

	public void addTelevisoreAvanzato(Televisore tv, String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv) {
		tv.addMarcaTv(tv, marca);
		tv.addAltezzaTv(tv, altezza);
		tv.addLarghezzaTv(tv, larghezza);
		tv.addDiagonaleTv(tv, diagonale);
		tv.addRisoluzioneTv(tv, risoluzione);
		tv.addTiposchermoTv(tv, tipoSchermo);
		tv.addNumberUsbTv(tv, numeroUsb);
		tv.addNumberHdmiTv(tv, numeroHdmi);
		tv.addNumberSmartTv(tv, numeroSmartTv);
	}

	public boolean modificaSeriale(Televisore tv, String seriale) {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (controlloSeriale(seriale)) {
				((TelevisoreBase) tv).setSeriale(seriale);
				result = true;
			}
			break;

		case MEDIO:
			if (controlloSeriale(seriale) == true) {
				((TelevisoreMedio) tv).setSeriale(seriale);
				result = true;
			}
			break;
		case AVANZATO:
			if (controlloSeriale(seriale)) {
				((TelevisoreAvanzato) tv).setSeriale(seriale);
				result = true;
			}
			break;
		}
		return result;
	}

	public boolean modificaMarcaTv(Televisore tv, String marca) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getMarche() != null) {
					if (marca.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloMarca(marca.toUpperCase())) {
						((TelevisoreBase) tv).setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getMarche() != null) {
					if (marca.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloMarca(marca.toUpperCase())) {
						((TelevisoreMedio) tv).setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getMarche() != null) {
					if (marca.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloMarca(marca.toUpperCase())) {
						((TelevisoreAvanzato) tv).setMarche(MarcheTelevisori.valueOf(marca.toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;
			}
		} catch (TelevisoreException e) {
			System.err.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;

	}

	public boolean modificaAltezzaTv(Televisore tv, String altezza) {
		Boolean result = false;
		try {
			if (((TelevisoreBase) tv).getAltezza() != 0) {
				if (!altezza.isEmpty()) {
					if (controlloParamentriNumericiTv(altezza)) {
						if (Double.valueOf(altezza) <= ConstantGlobal.ALTEZZA_MASSIMA_TV
								&& Double.valueOf(altezza) >= ConstantGlobal.ALTEZZA_MINIMA_TV) {
							switch (scannerTvInstanziata(tv)) {
							case BASE:
								((TelevisoreBase) tv).setAltezza(Double.valueOf(altezza));
								result = true;
								break;

							case MEDIO:
								((TelevisoreMedio) tv).setAltezza(Double.valueOf(altezza));
								result = true;
								break;
							case AVANZATO:
								((TelevisoreAvanzato) tv).setAltezza(Double.valueOf(altezza));
								result = true;
								break;
							}
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

	public boolean modificaLarghezzaTv(Televisore tv, String larghezza) {
		Boolean result = false;
		try {
			if (((TelevisoreBase) tv).getLarghezza() != 0) {
				if (!larghezza.isEmpty()) {
					if (controlloParamentriNumericiTv(larghezza)) {
						if (Double.valueOf(larghezza) <= ConstantGlobal.LARGHEZZA_MASSIMA_TV
								&& Double.valueOf(larghezza) >= ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							switch (scannerTvInstanziata(tv)) {
							case BASE:
								((TelevisoreBase) tv).setLarghezza(Double.valueOf(larghezza));
								result = true;
								break;

							case MEDIO:
								((TelevisoreMedio) tv).setLarghezza(Double.valueOf(larghezza));
								result = true;
								break;
							case AVANZATO:
								((TelevisoreAvanzato) tv).setLarghezza(Double.valueOf(larghezza));
								result = true;
								break;
							}
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

	public boolean modificaNumberHdmiTv(Televisore tv, String numeroHdmi) {
		Boolean result = false;
		try {
			if (inserthdmi) {
				if (!numeroHdmi.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroHdmi)) {
						switch (scannerTvInstanziata(tv)) {
						case BASE:
							throw new TipologiaException();
						case MEDIO:
							throw new TipologiaException();
						case AVANZATO:
							if (isInteger(numeroHdmi)) {
								if (Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_HDMI_TV_AVANZATO
										|| Integer.valueOf(numeroHdmi) == ConstantGlobal.NUM_MINIMO_HDMI) {
									((TelevisoreAvanzato) tv).setNumber_hdmi(Integer.valueOf(numeroHdmi));
									result = true;
								} else if (Integer.valueOf(numeroHdmi) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
							break;
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
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");

		}
		return result;

	}

	public boolean modificaNumberUsbTv(Televisore tv, String numeroUsb) {
		Boolean result = false;
		try {
			if (insertusb) {
				if (!numeroUsb.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroUsb)) {
						switch (scannerTvInstanziata(tv)) {
						case BASE:
							throw new TipologiaException();
						case MEDIO:
							if (isInteger(numeroUsb)) {
								if (Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_USB_TV_MEDIO
										|| Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_MINIMO_USB) {
									((TelevisoreMedio) tv).setNumber_usb(Integer.valueOf(numeroUsb));
									result = true;
								} else if (Integer.valueOf(numeroUsb) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
							break;
						case AVANZATO:
							if (isInteger(numeroUsb)) {
								if (Integer.valueOf(numeroUsb) == ConstantGlobal.NUMERO_USB_TV_AVANZATO
										|| Integer.valueOf(numeroUsb) == ConstantGlobal.NUM_MINIMO_USB) {
									((TelevisoreAvanzato) tv).setNumber_usb(Integer.valueOf(numeroUsb));
									result = true;
								} else if (Integer.valueOf(numeroUsb) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
							}
							break;
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
			System.out.println(e.ErrorMaxNumeroUsb());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinUsb());
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean modificaDiagonaleTv(Televisore tv, String diagonale) {
		Boolean result = false;
		try {
			if (((TelevisoreBase) tv).getDiagonale() != 0) {
				if (!diagonale.isEmpty()) {
					if (controlloParamentriNumericiTv(diagonale)) {
						if (Double.valueOf(diagonale) <= ConstantGlobal.DIAGONALE_MASSIMA_TV
								&& Double.valueOf(diagonale) >= ConstantGlobal.DIAGONALE_MINIMA_TV) {
							switch (scannerTvInstanziata(tv)) {
							case BASE:
								((TelevisoreBase) tv).setDiagonale(Double.valueOf(diagonale));
								result = true;
								break;

							case MEDIO:
								((TelevisoreMedio) tv).setDiagonale(Double.valueOf(diagonale));
								result = true;
								break;
							case AVANZATO:
								((TelevisoreAvanzato) tv).setDiagonale(Double.valueOf(diagonale));
								result = true;
								break;
							}
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

	public boolean modificaNumberSmartTv(Televisore tv, String numeroSmartTv) {
		Boolean result = false;
		try {
			if (insertSmartTV) {
				if (!numeroSmartTv.isEmpty()) {
					if (controlloParamentriNumericiTv(numeroSmartTv)) {
						switch (scannerTvInstanziata(tv)) {
						case BASE:
							throw new TipologiaException();

						case MEDIO:
							throw new TipologiaException();
						case AVANZATO:
							if (isInteger(numeroSmartTv)) {
								if (Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_SMART_TV_AVANZATO
										|| Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_MINIMO_SMART_TV) {
									((TelevisoreAvanzato) tv).setNumber_smartTv(Integer.valueOf(numeroSmartTv));
									result = true;
								} else if (Integer.valueOf(numeroSmartTv) < 0) {
									throw new MinValueException();
								} else {
									throw new MaxValueException();
								}
								result = true;
							}
							break;
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
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_SMART_TV)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroSmartTv());
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean modificaRisoluzioneTv(Televisore tv, String risoluzione) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getRisoluzione() != null) {
					if (risoluzione.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
						((TelevisoreBase) tv).setRisoluzione(
								ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getRisoluzione() != null) {
					if (risoluzione.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
						((TelevisoreBase) tv).setRisoluzione(
								ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getRisoluzione() != null) {
					if (risoluzione.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloRisoluzione(risoluzione.replace(" ", "_").toUpperCase())) {
						((TelevisoreBase) tv).setRisoluzione(
								ConstantGlobal.RISOLUZIONE_TV.valueOf(risoluzione.replace(" ", "_").toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;
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

	public boolean modificaTiposchermoTv(Televisore tv, String tipoSchermo) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				if (((TelevisoreBase) tv).getTipoSchermo() != null) {
					if (tipoSchermo.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
						((TelevisoreBase) tv)
								.setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
						result = true;
					}

				} else {
					throw new TelevisoreException();
				}
				break;

			case MEDIO:
				if (((TelevisoreMedio) tv).getTipoSchermo() != null) {
					if (tipoSchermo.isEmpty()) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
						((TelevisoreMedio) tv)
								.setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				if (((TelevisoreAvanzato) tv).getTipoSchermo() != null) {
					if (tipoSchermo == null) {
						throw new NullPointerException();
					} else if (controlloTipologiaSchermo(tipoSchermo.toUpperCase())) {
						((TelevisoreAvanzato) tv)
								.setTipoSchermo(ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.toUpperCase()));
						result = true;
					}
				} else {
					throw new TelevisoreException();
				}
				break;
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

	public boolean eliminaMarcaTv(Televisore tv) throws TelevisoreException {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (((TelevisoreBase) tv).getMarche() != null) {
				((TelevisoreBase) tv).setMarche(null);
				result = true;
			} else {
				throw new TelevisoreException("la marca non può essere cancellata essendo già nulla");
			}
			break;
		case MEDIO:
			if (((TelevisoreMedio) tv).getMarche() != null) {
				((TelevisoreMedio) tv).setMarche(null);
				result = true;
			} else {
				throw new TelevisoreException("la marca non può essere cancellata essendo già nulla");
			}
			break;
		case AVANZATO:
			if (((TelevisoreAvanzato) tv).getMarche() != null) {
				((TelevisoreAvanzato) tv).setMarche(null);
				result = true;
			} else {
				throw new TelevisoreException("la marca non può essere cancellata essendo già nulla");
			}
			break;
		}

		return result;

	}

	public boolean eliminaAltezzaTv(Televisore tv) throws TelevisoreException {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (((TelevisoreBase) tv).getAltezza() != 0) {
				((TelevisoreBase) tv).setAltezza(0);
				result = true;
			} else {
				throw new TelevisoreException("l'altezza non può essere cancellata essendo già nulla");
			}
			break;

		case MEDIO:
			if (((TelevisoreMedio) tv).getAltezza() != 0) {
				((TelevisoreMedio) tv).setAltezza(0);
				result = true;
			} else {
				throw new TelevisoreException("l'altezza non può essere cancellata essendo già nulla");
			}
			break;
		case AVANZATO:
			if (((TelevisoreAvanzato) tv).getAltezza() != 0) {
				((TelevisoreAvanzato) tv).setAltezza(0);
				result = true;
			} else {
				throw new TelevisoreException("l'altezza non può essere cancellata essendo già nulla");
			}
			break;
		}
		return result;

	}

	public boolean eliminaLarghezzaTv(Televisore tv) throws TelevisoreException {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (((TelevisoreBase) tv).getLarghezza() != 0) {
				((TelevisoreBase) tv).setLarghezza(0);
				result = true;
			} else {
				throw new TelevisoreException("la larghezza non può essere cancellata essendo già nulla");
			}
			break;

		case MEDIO:
			if (((TelevisoreMedio) tv).getLarghezza() != 0) {
				((TelevisoreMedio) tv).setLarghezza(0);
				result = true;
			} else {
				throw new TelevisoreException("la larghezza non può essere cancellata essendo già nulla");
			}
			break;
		case AVANZATO:
			if (((TelevisoreMedio) tv).getLarghezza() != 0) {
				((TelevisoreAvanzato) tv).setLarghezza(0);
				result = true;
			} else {
				throw new TelevisoreException("la larghezza non può essere cancellata essendo già nulla");
			}
			break;
		}
		return result;
	}

	public boolean eliminaNumberHdmiTv(Televisore tv) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				throw new TipologiaException();
			case MEDIO:
				throw new TipologiaException();
			case AVANZATO:
				if (inserthdmi) {
					((TelevisoreAvanzato) tv).setNumber_hdmi(0);
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			}
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"non è possibile cancellare, il numero di hdmi non è mai stato aggiunto"));
		}
		return result;

	}

	public boolean eliminaNumberUsbTv(Televisore tv) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				throw new TipologiaException();
			case MEDIO:
				if (insertusb) {
					((TelevisoreMedio) tv).setNumber_usb(0);
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			case AVANZATO:
				((TelevisoreAvanzato) tv).setNumber_usb(0);
				result = true;
				break;
			}
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"non è possibile cancellare , il numero di usb non è mai stato aggiunto"));
		}
		return result;
	}

	public boolean eliminaDiagonaleTv(Televisore tv) throws TelevisoreException {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (((TelevisoreBase) tv).getDiagonale() != 0) {
				((TelevisoreBase) tv).setDiagonale(0);
				result = true;
			} else {
				throw new TelevisoreException("la diagonale della tv non può essere cancellata essendo già nulla");
			}
			break;

		case MEDIO:
			if (((TelevisoreMedio) tv).getDiagonale() != 0) {
				((TelevisoreMedio) tv).setDiagonale(0);
				result = true;
			} else {
				throw new TelevisoreException("la diagonale della tv non può essere cancellata essendo già nulla");
			}
			break;
		case AVANZATO:
			if (((TelevisoreAvanzato) tv).getDiagonale() != 0) {
				((TelevisoreAvanzato) tv).setDiagonale(0);
				result = true;
			} else {
				throw new TelevisoreException("la diagonale della tv non può essere cancellata essendo già nulla");
			}
			break;
		}
		return result;
	}

	public boolean eliminaNumberSmartTv(Televisore tv) {
		Boolean result = false;
		try {
			switch (scannerTvInstanziata(tv)) {
			case BASE:
				throw new TipologiaException();
			case MEDIO:
				throw new TipologiaException();
			case AVANZATO:
				if (insertSmartTV) {
					((TelevisoreAvanzato) tv).setNumber_smartTv(0);
					result = true;
				} else {
					throw new TelevisoreException();
				}
				break;
			}
		} catch (TipologiaException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}catch(TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement("il numero dello smart  non può essere cancellata essendo già nulla "));
		}
		return result;
	}

	public boolean eliminaRisoluzioneTv(Televisore tv) throws TelevisoreException {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (((TelevisoreBase) tv).getRisoluzione() != null) {
				((TelevisoreBase) tv).setRisoluzione(null);
				result = true;
			} else {
				throw new TelevisoreException("la risoluzione non può essere cancellata essendo già nulla");
			}
			break;

		case MEDIO:
			if (((TelevisoreMedio) tv).getRisoluzione() != null) {
				((TelevisoreMedio) tv).setRisoluzione(null);
				result = true;
			} else {
				throw new TelevisoreException("la risoluzione non può essere cancellata essendo già nulla");
			}
			break;
		case AVANZATO:
			if (((TelevisoreAvanzato) tv).getRisoluzione() != null) {
				((TelevisoreAvanzato) tv).setRisoluzione(null);
				result = true;

			} else {
				throw new TelevisoreException("la risoluzione non può essere cancellata essendo già nulla");

			}
			break;
		}
		return result;
	}

	public boolean eliminaTiposchermoTv(Televisore tv) throws TelevisoreException {
		Boolean result = false;
		switch (scannerTvInstanziata(tv)) {
		case BASE:
			if (((TelevisoreBase) tv).getTipoSchermo() != null) {
				((TelevisoreBase) tv).setTipoSchermo(null);
				result = true;
			} else {
				throw new TelevisoreException("la tipologia della tv non può essere cancellata essendo già nulla");
			}
			break;

		case MEDIO:
			if (((TelevisoreMedio) tv).getTipoSchermo() != null) {
				((TelevisoreMedio) tv).setTipoSchermo(null);
				result = true;
			} else {
				throw new TelevisoreException("la tipologia della tv non può essere cancellata essendo già nulla");
			}
			break;
		case AVANZATO:
			if (((TelevisoreAvanzato) tv).getTipoSchermo() != null) {
				((TelevisoreAvanzato) tv).setTipoSchermo(null);
				result = true;
			} else {
				throw new TelevisoreException("la tipologia della tv non può essere cancellata essendo già nulla");
			}
			break;
		}
		return result;
	}

}
