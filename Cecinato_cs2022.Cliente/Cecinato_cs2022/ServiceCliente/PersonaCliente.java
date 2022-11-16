package Cecinato_cs2022.ServiceCliente;

/**
 * 
 * <p>
 * <b> INTERFACCIA: PersonaCliente </b>
 * <p>
 * Quest'interfaccia ha lo scopo di fornire tutte le operazioni che si
 * richiedono all'entità PersonaCliente.
 * <p>
 * Infatti, quest'interfaccia eredita parte dei suoi metodi da altre 4
 * interfacce: AcquisizioneCliente, VisualizzaCliente, EliminaCliente e
 * ModificaCliente. Quest'ultime raccolgono, rispettivamente, tutte le
 * operazioni di acquisizione, visualizzazione e modifica cancellazione delle
 * informazioni dei clienti. <br>
 * Nell'interfaccia PersonaCliente saranno, inoltre, inclusi tutti i metodi comuni.
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

public interface PersonaCliente extends AcquisizioneCliente, VisualizzaCliente, EliminaCliente, ModificaCliente {

}
