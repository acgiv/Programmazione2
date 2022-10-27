package Cecinato_cs2022.ServiceDipendente;

import java.util.Set;

import Cecinato_cs2022.ServicePersona.Persona;

public interface DaoDipendente {
	
	public void saveNewAllDipendente(Set<Persona> dipendente) ;
	
	public Set<Persona> readFileAllDipendente();


}
