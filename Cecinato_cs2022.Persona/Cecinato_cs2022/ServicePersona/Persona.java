package Cecinato_cs2022.ServicePersona;


import java.io.Serializable;

import Cecinato_cs2022.ServiceCliente.PersonaCliente;
import Cecinato_cs2022.ServiceDipendente.PersonaDipendente;

/**
 * 
 * <p>
 * <b> INTERFACCIA: Persona </b>
 * <p>
 * Quest'interfaccia ha lo scopo di fornire tutte le operazioni che si
 * richiedono all'entità Persona.
 * <p>
 * Infatti, quest'interfaccia eredita parte dei suoi metodi da altre 6
 * interfacce: AcquisizionePersona, VisualizzaPersona,  ModificaPersona, PersonaCliente, PersonaDipendente e
 * VisualizzaDipendete. Quest'ultime raccolgono, rispettivamente, tutte le
 * operazioni di acquisizione, visualizzazione e modifica cancellazione delle
 * informazioni della persona, dipendenti e clienti <br>
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


public interface Persona extends AcquisizionePersona, VisualizzaPersona, ModificaPersona, EliminaPersona, PersonaCliente, PersonaDipendente, Serializable{

}
