package Cecinato_cs2022.ServiceDipendente;

import java.text.ParseException;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.DipendenteException.RiparazioneException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> INTERFACCIA: PersonaDipendente </b>
 * <p>
 * Quest'interfaccia ha lo scopo di fornire tutte le operazioni che si
 * richiedono all'entità PersonaDipendente.
 * <p>
 * Infatti, quest'interfaccia eredita parte dei suoi metodi da altre 4
 * interfacce: AcquisizioneDipendete, EliminaDipendente, ModificaDipendente e
 * VisualizzaDipendete. Quest'ultime raccolgono, rispettivamente, tutte le
 * operazioni di acquisizione, visualizzazione e modifica cancellazione delle
 * informazioni dei dipendenti <br>
 * Nell'interfaccia PersonaDipendente saranno, inoltre, inclusi tutti i metodi
 * comuni.
 * 
 * 
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

public interface PersonaDipendente
		extends AcquisizioneDipendete, EliminaDipendente, ModificaDipendente, VisualizzaDipendete {

	/**
	 * 
	 * <b> OPERAZIONE: vendiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di vendere un televisore al un cliente. Questa
	 * operazione tre paramtri: 1) il televisore da vedere 2) il cliente e che
	 * acquista 3) il prezzo di vendita del cliente. Essendo che i parametri
	 * dovranno necessariamente essere forniti dall'utente, dunque, si rendono
	 * necessari dei controlli per verificarne l'esattezza e la correttezza.
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param tv            Variabile di tipo Televisore che contiene la tv da
	 *                      vedere al cliente inserita dall'utente
	 * @param cliente       Variabile di tipo Cliente che contiene il cliente che
	 *                      acquista il televisore inserito dall'utente
	 * @param PrezzoVendita Variabile di tipo String che contiente il prezzo di
	 *                      vendita del televisore
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException    solleva un' eccezione nel caso in cui il cliente
	 *                             passato non è corretto
	 *
	 * @throws DipendenteException solleva un 'eccezione nel caso in cui si supera
	 *                             il numero di vendite di tv consiente
	 * @throws TelevisoreException Solleva l'eccezione se il televisore passato
	 *                             dall'utente è vuoto o errato
	 */

	public boolean vendiTv(Televisore tv, Cliente cliente, String PrezzoVendita)
			throws PersonaException, TelevisoreException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: riparaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di riparare un televisore di un cliente.I
	 * parametri dovranno necessariamente essere forniti dall'utente, dunque, si
	 * rendono necessari dei controlli per verificarne l'esattezza e la correttezza.
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param dataRichiestaRiparazione Variabile di tipo String che contiente la
	 *                                 data di inizio riparazione del televisore
	 *                                 inserita dall'utente
	 * 
	 * @param dataPrevistaConsegna     Variabile di tipo String che contiente la
	 *                                 data di fine riparazione del televisore
	 *                                 inserita dall'utente
	 * 
	 * @param costoRiparazione         Variabile di tipo String che contiente il
	 *                                 costo della riparazione inserito dall'utente
	 * @param tvRiparata               Variabile di tipo Televisore che contiene la
	 *                                 tv da del cliente da riparare inserita
	 *                                 dall'utente
	 * @param clienteRiparazione       Variabile di tipo Cliente che contiene il
	 *                                 cliente che porta il televisore da riparare
	 *                                 inserito dall'utente
	 * @param informazioneRiparazione  Variabile di tipo String che contiente le
	 *                                 informazioni di riparazione del televisore
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ParseException       solleva un' eccezione nel caso in la data non
	 *                              viene correttamente parsializzata (non si
	 *                              rispetta il format della data impostato)
	 *
	 * @throws RiparazioneException solleva un 'eccezione nel caso in cui c'è stata
	 *                              qualche errore nella riparazione
	 * @throws ClienteException     Solleva l'eccezione se il cliente utilizza
	 *                              questo metodo
	 */

	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws ParseException, RiparazioneException, ClienteException;
}