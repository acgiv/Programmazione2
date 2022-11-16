package Cecinato_cs2022.TestCliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

/**
 * 
 * <p>
 * <b> CLASSE: TestEliminaCliente </b>
 * <p>
 * * <p> Questa classe si occupa del test di tutti i metodi implementati sull'eleminazione del cliente, così da verificare <br>
 * se metodi sono stati implementati correttamente o necessitano modifiche. </p>
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

class TestEliminaCliente {

	 private static Persona cliente;
	 private static Persona cliente2;
	@BeforeAll
	public static void inizializzaMeotodi() {
		try {
			cliente = new Cliente("bbhzrt76t20v003f");
			cliente2 = new Cliente("aactre54g83x837z");
			cliente.addNome("Mario");
			cliente.addCognome("Rossi");
			cliente.addEta(17);
			cliente.addGenere("femmina");
			cliente.addDataNascita("18/12/2000");
			cliente.addCitta("BARI");
			cliente.addNomeCartaFedelta("fincons group");
			cliente.addNumeroCartaFedelta();
			cliente.addDataInscrizioneTessera("13/12/2020");
			cliente.addPuntiFedeltaAccumulati("230");
		}catch(PersonaException | ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@AfterEach
	void stampaPrimaTest(){
		System.out.println("\n dopo il test");
		System.out.println(cliente+"\n");
	}
	
	@BeforeEach()
	void stampaDopoTest(){
		System.out.println("\n prima del test");
		System.out.println(cliente+"\n");
	}
	
	@Test
	void testEliminaNomeCliente() {
		try {
			System.out.println("test elimina il nome del cliente con campo = "+ cliente.VisualizzaNome());
			assertTrue(cliente.eliminaNome());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaNomeCliente() {
		try {
			System.out.println("test elimina il nome del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaNome());		
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testEliminaCognomeCliente() {
		try {
			System.out.println("test elimina il cognome del cliente con campo = "+  cliente.VisualizzaCognome());
			assertTrue(cliente.eliminaCognome());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaCognomeCliente() {
		try {
			System.out.println("test elimina il cognome del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaCognome());		
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testEliminaEtaCliente() {
		try {
			System.out.println("test elimina l'età del cliente con campo = "+ cliente.VisualizzaEta());
			assertTrue(cliente.eliminaEta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaEtaCliente() {
		try {
			System.out.println("test elimina l'età del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaEta());		
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}

	@Test
	void testEliminaGenereCliente() {
		try {
			System.out.println("test elimina il genere del cliente con campo = "+  cliente.VisualizzaGenere());
			assertTrue(cliente.eliminaGenere());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaGenereCliente() {
		try {
			System.out.println("test elimina il genere del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaGenere());		
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}

	@Test
	void testEliminaDataNascitaCliente() {
		try {
			System.out.println("test elimina la data di nascita del cliente con campo = "+  cliente.VisualizzaDataNascita());
			assertTrue(cliente.eliminaDataNascita());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaCittaCliente() {
		try {
			System.out.println("test elimina la città del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaCitta());		
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testEliminaCittaCliente() {
		try {
			System.out.println("test elimina la città del cliente con campo = "+ cliente.VisualizzaCitta());
			assertTrue(cliente.eliminaCitta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaDataNascitaCliente() {
		try {
			System.out.println("test elimina la data di nascita del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaDataNascita());		
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testEliminaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test il nome della carta di fedeltà del cliente con campo = "+  cliente.VisualizzaNomeCartaFedelta());
			assertTrue(cliente.eliminaNomeCartaFedelta());
		} catch ( DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test elimina il nome della carta di fedeltà del cliente con campo = "+ null);
			assertFalse(cliente2.eliminaNomeCartaFedelta());		
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test elimina la data di inscrizione della tessera fedeltà del cliente con campo = "+  cliente.VisualizzaDataInscrizioneTessera());
			assertTrue(cliente.eliminaDataInscrizioneTessera());
		} catch ( DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test elimina il nome della carta di fedeltà cliente con campo = "+ null);
			assertFalse(cliente2.eliminaDataInscrizioneTessera());		
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEliminaNumeroCartaFedeltaCliente() {
		try {
			System.out.println("test elimina il numero della carta di fedeltà cliente con campo = "+  cliente.VisualizzaNumeroCartaFedelta());
			assertTrue(cliente.eliminaNumeroCartaFedelta());
		} catch ( DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test elimina il numero della carta di fedeltà cliente con campo = "+ null);
			assertFalse(cliente2.eliminaNumeroCartaFedelta());		
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEliminaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test elimina i punti della carta di  fedeltà cliente con campo = "+  cliente.VisualizzaPuntiFedeltaAccumulati());
			assertTrue(cliente.eliminaPuntiAccumulati());
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2EliminaNumeroCartaFedeltaCliente() {
		try {
			System.out.println("test elimina il numero della carta di fedeltà cliente con campo = "+ null);
			assertFalse(cliente2.eliminaPuntiAccumulati());		
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEliminatipologiaContrattoDipendente() {
		try {
			System.out.println("test errore elimina la tipologia di contratto del dipendente ");
			assertEquals(cliente.eliminatipologiaContratto(), null);
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEliminaNumeroTelefonoAziendaleDipendente() {
		try {
			System.out.println("test errore elimina il numero aziendale del dipendente ");
			assertEquals(cliente.eliminaNumeroTelefonoAziendale(), null);
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaEmailAziendaleDipendente() {
		try {
			System.out.println("test errore elimina l'email aziendale del dipendente ");
			assertEquals(cliente.eliminaEmailAziendale(), null);
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEliminaNomeAziendaDipendente() {
		try {
			System.out.println("test errore elimina il nome dell'azienda del dipendente ");
			assertEquals(cliente.eliminaNomeAzienda(), null);
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEliminaRuoloDipendente() {
		try {
			System.out.println("test errore elimina il ruolo del dipendente ");
			assertEquals(cliente.eliminaRuolo(), null);
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	

}
