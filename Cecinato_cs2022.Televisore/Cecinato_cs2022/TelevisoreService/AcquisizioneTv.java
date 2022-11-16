package Cecinato_cs2022.TelevisoreService;

/**
 * 
 * <p>
 * <b> INTERFACCIA: AcquisizioneTv </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di acquisire le proprietà del televisore.
 * 
 * @author <i> Alberto Cecinato </i> <br>
 *         Gruppo 79<br>
 *         Matricola: 706576 <br>
 *         Email: <u> cecinatoa@gmail.com </u>
 * 
 * @version 1.0 <br>
 *          Date: 03.11.2022 <br>
 * 
 *
 */

public interface AcquisizioneTv {

	/**
	 * 
	 * <b> OPERAZIONE: addMarcaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la marca del televisore attraverso
	 * il parametro marca e assegnarla alla televisione<br>
	 * Essendo che la marca del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param marca Variabile di tipo stringa che contiene la marca del televisore
	 *              inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addMarcaTv(String marca);

	/**
	 * 
	 * <b> OPERAZIONE: addAltezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'altezza del televisore attraverso
	 * il parametro altezza e assegnarla alla televisione<br>
	 * Essendo che l'altezza del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param altezza Variabile di tipo stringa che contiene l'altezza del
	 *                televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addAltezzaTv(String altezza);

	/**
	 * 
	 * <b> OPERAZIONE: addLarghezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la larghezza del televisore
	 * attraverso il parametro larghezza e assegnarla alla televisione<br>
	 * Essendo che la larghezza del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param larghezza Variabile di tipo stringa che contiene la larghezza del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addLarghezzaTv(String larghezza);

	/**
	 * 
	 * <b> OPERAZIONE: addNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero degli hdmi del televisore
	 * attraverso il parametro numeroHdmi e assegnarla alla televisione<br>
	 * Essendo che il numero degli hdmi del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroHdmi Variabile di tipo stringa che contiene il numero degli hdmi
	 *                   del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addNumberHdmiTv(String numeroHdmi);

	/**
	 * 
	 * <b> OPERAZIONE: addNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero degli usb del televisore
	 * attraverso il parametro numeroUsb e assegnarla alla televisione<br>
	 * Essendo che il numero degli usb del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroUsb Variabile di tipo stringa che contiene il numero degli usb
	 *                  del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addNumberUsbTv(String numeroUsb);

	/**
	 * 
	 * <b> OPERAZIONE: addDiagonaleTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la diagonale del televisore
	 * attraverso il parametro diagonale e assegnarla alla televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param diagonale Variabile di tipo stringa che contiene la diagonale del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addDiagonaleTv(String diagonale);

	/**
	 * 
	 * <b> OPERAZIONE: addNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire del numero di smart tv del
	 * televisore attraverso il parametro numeroSmartTv e assegnarla alla
	 * televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroSmartTv Variabile di tipo boolean che contiene il numero di
	 *                      smart tv del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addNumberSmartTv(String numeroSmartTv);

	/**
	 * 
	 * <b> OPERAZIONE: addRisoluzioneTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la risoluzione del televisore
	 * attraverso il parametro risoluzione e assegnarla alla televisione<br>
	 * Essendo che la risoluzione del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addRisoluzioneTv(String risoluzione);

	/**
	 * 
	 * <b> OPERAZIONE: addTiposchermoTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il tipo dello schermo del
	 * televisore attraverso il parametro tipoSchermo e assegnarlo alla
	 * televisione<br>
	 * Essendo che il tipo dello schermo del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param tipoSchermo Variabile di tipo stringa che contiene la tipoliga di
	 *                    schermo del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addTiposchermoTv(String tipoSchermo);

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreBase </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i parametri di un televisore
	 * base attraverso i parametri marca, altezza, larghezza, diagonale risoluzione
	 * e tipoSchermo ed assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param marca       Variabile di tipo stringa che contiene la marca del
	 *                    televisore inserito dall'utente.
	 * @param altezza     Variabile di tipo stringa che contiene l'altezza del
	 *                    televisore inserito dall'utente.
	 * @param larghezza   Variabile di tipo stringa che contiene la larghezza del
	 *                    televisore inserito dall'utente.
	 * @param diagonale   Variabile di tipo stringa che contiene la diagonale del
	 *                    televisore inserito dall'utente.
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @param tipoSchermo Variabile di tipo stringa che contiene il tipo schermo del
	 *                    televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean addTelevisoreBase(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo);

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreMedio </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i parametri di un televisore
	 * base attraverso i parametri marca, altezza, larghezza, diagonale risoluzione
	 * tipoSchermo, numeroUsb ed assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param marca       Variabile di tipo stringa che contiene la marca del
	 *                    televisore inserito dall'utente.
	 * @param altezza     Variabile di tipo stringa che contiene l'altezza del
	 *                    televisore inserito dall'utente.
	 * @param larghezza   Variabile di tipo stringa che contiene la larghezza del
	 *                    televisore inserito dall'utente.
	 * @param diagonale   Variabile di tipo stringa che contiene la diagonale del
	 *                    televisore inserito dall'utente.
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @param tipoSchermo Variabile di tipo stringa che contiene il tipo schermo del
	 *                    televisore inserito dall'utente.
	 * @param numeroUsb   Variabile di tipo stringa che contiene il numero di usb
	 *                    del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb);

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreAvanzato </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i parametri di un televisore
	 * base attraverso i parametri marca, altezza, larghezza, diagonale risoluzione
	 * tipoSchermo, numeroUsb, numeroHdmi, numeroSmartTv ed assegnarli alla
	 * televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param marca         Variabile di tipo stringa che contiene la marca del
	 *                      televisore inserito dall'utente.
	 * @param altezza       Variabile di tipo stringa che contiene l'altezza del
	 *                      televisore inserito dall'utente.
	 * @param larghezza     Variabile di tipo stringa che contiene la larghezza del
	 *                      televisore inserito dall'utente. 
	 * @param diagonale     Variabile di tipo stringa che contiene la diagonale del
	 *                      televisore inserito dall'utente.
	 * @param risoluzione   Variabile di tipo stringa che contiene la risoluzione
	 *                      del televisore inserito dall'utente.
	 * @param tipoSchermo   Variabile di tipo stringa che contiene il tipo schermo
	 *                      del televisore inserito dall'utente.
	 * @param numeroUsb     Variabile di tipo stringa che contiene il numero di usb
	 *                      del televisore inserito dall'utente.
	 * @param numeroHdmi    Variabile di tipo stringa che contiene il numero di hdmi
	 *                      del televisore inserito dall'utente.
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero di
	 *                      smart tv del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv);

}
