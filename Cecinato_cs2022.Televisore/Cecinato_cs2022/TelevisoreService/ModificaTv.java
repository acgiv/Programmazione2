package Cecinato_cs2022.TelevisoreService;

/**
 * 
 * <p>
 * <b> INTERFACCIA: ModificaTv </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di modificare le proprietà del televisore, precedentemente acquisiti.
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
public interface ModificaTv {
	/**
	 * 
	 * <b> OPERAZIONE: modificaSeriale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il seriale del televisore
	 * attraverso il parametro seriale e assegnarlo alla televisione<br>
	 * Essendo che il seriale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param seriale Variabile di tipo stringa che contiene il seriale del
	 *                televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean modificaSeriale(String seriale);

	/**
	 * 
	 * <b> OPERAZIONE: modificaMarcaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la marca del televisore attraverso
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
	public boolean modificaMarcaTv(String marca);

	/**
	 * 
	 * <b> OPERAZIONE: modificaAltezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'altezza del televisore attraverso
	 * il parametro altezza e assegnarla alla televisione<br>
	 * Essendo che la larghezza del televisore dovrà necessariamente essere fornito
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
	public boolean modificaAltezzaTv(String altezza);

	/**
	 * 
	 * <b> OPERAZIONE: modificaLarghezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la larghezza del televisore
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
	public boolean modificaLarghezzaTv(String larghezza);

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero degli hdmi del
	 * televisore attraverso il parametro numeroHdmi e assegnarla alla
	 * televisione<br>
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
	public boolean modificaNumberHdmiTv(String numeroHdmi);

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero degli usb del televisore
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
	public boolean modificaNumberUsbTv(String numeroUsb);

	/**
	 * 
	 * <b> OPERAZIONE: modificaDiagonaleTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la diagonale del televisore
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
	public boolean modificaDiagonaleTv(String diagonale);

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero degli smart tv del
	 * televisore attraverso il parametro numeroSmartTv e assegnarla alla
	 * televisione<br>
	 * Essendo che il numero degli degli smart tv del televisore dovrà
	 * necessariamente essere fornito dall'utente, dunque, si rendono necessari dei
	 * controlli per verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero degli
	 *                      smart tv del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public boolean modificaNumberSmartTv(String numeroSmartTv);

	/**
	 * 
	 * <b> OPERAZIONE: modificaRisoluzioneTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la risoluzione del televisore
	 * attraverso il parametro risoluzione e assegnarla alla televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
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
	public boolean modificaRisoluzioneTv(String risoluzione);

	/**
	 * 
	 * <b> OPERAZIONE: modificaTiposchermoTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il tipo dello schermo del
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
	public boolean modificaTiposchermoTv(String tipoSchermo);

}
