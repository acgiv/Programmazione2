package Cecinato_cs2022.TelevisoreService;

/**
 * 
 * <p>
 * <b> INTERFACCIA: Televisore </b>
 * <p>
 * Quest'interfaccia ha lo scopo di fornire tutte le operazioni che si
 * richiedono all'entità Televisore.
 * <p>
 * Infatti, quest'interfaccia eredita parte dei suoi metodi da altre 4
 * interfacce: AcquisizioneTv, ModificaTv, EliminaTelevisore e VisualizzaTv.
 * Quest'ultime raccolgono, rispettivamente, tutte le operazioni di
 * acquisizione, visualizzazione e modifica cancellazione delle informazioni dei
 * televisori. <br>
 * Nell'interfaccia Televisore saranno, inoltre, inclusi tutti i metodi comuni.
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

public interface Televisore extends AcquisizioneTv, ModificaTv, EliminaTelevisore, VisualizzaTv {

}
