package Cecinato_cs2022.DaoCliente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;
import _Cecinato_cs2022.ServiceCliente.DaoCliente;


public class DaoClienteImp  implements DaoCliente{
	
	public void savenewALLClienti(Set<Persona> cliente) {
		FileOutputStream fileout = null;
		ObjectOutputStream oss;
		try {
			fileout = new FileOutputStream(ConstantGlobal.PERCORSO_FILE_CLIENTE);
			oss = new ObjectOutputStream(fileout);
			Iterator<Persona> element = cliente.iterator();
			while (element.hasNext()) {
				oss.writeObject(element.next());
				oss.flush();
			}
			oss.close();
		} catch (Exception e) {
		}
	}

	public Set<Persona> readFileAllClienti() {
		FileInputStream filein = null;
		Set<Persona> cliente = new HashSet<Persona>();
		try {
			filein = new FileInputStream(ConstantGlobal.PERCORSO_FILE_CLIENTE);
			try (ObjectInputStream input = new ObjectInputStream(filein)) {
				while (filein.available() > 0) {
					Persona cl = ((Persona) input.readObject());
					if(cl != null) {
						new Cliente(cl.VisualizzaCodiceFiscale());
						cliente.add(cl);
					}
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
				cliente = new HashSet<Persona>();
			} catch (PersonaException e) {
				System.err.println(e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return cliente;
	}

}
