package _Cecinato_cs2022.ServiceCliente;

import java.util.Set;

import Cecinato_cs2022.ServicePersona.Persona;

public interface DaoCliente {
	
	public void savenewALLClienti(Set<Persona> cliente) ;
	
	public Set<Persona> readFileAllClienti();

}
