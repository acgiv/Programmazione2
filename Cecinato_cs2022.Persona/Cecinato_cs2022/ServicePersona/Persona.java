package Cecinato_cs2022.ServicePersona;


import java.io.Serializable;

import Cecinato_cs2022.ServiceDipendente.PersonaDipendente;
import _Cecinato_cs2022.ServiceCliente.PersonaCliente;

public interface Persona extends AcquisizionePersona, VisualizzaPersona, ModificaPersona, EliminaPersona, PersonaCliente, PersonaDipendente, Serializable{

}
