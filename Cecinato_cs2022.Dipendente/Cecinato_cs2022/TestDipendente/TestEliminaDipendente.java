package Cecinato_cs2022.TestDipendente;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

/**
 * 
 * <p>
 * <b> CLASSE: TestEliminaDipendente </b>
 * <p>
 * * <p> Questa classe si occupa del test di tutti i metodi implementati sull'eleminazione dei dipendenti, così da verificare <br>
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

class TestEliminaDipendente {

	private static Persona dipendente;
	private static Persona dipendente2;

	@BeforeAll
	public static void inizializzaMeotodi() {
		try {
			dipendente = new Dipendente("123456789a");
			dipendente2 = new Dipendente("123456789b");
			dipendente.addNome("Mario");
			dipendente.addCognome("Rossi");
			dipendente.addEta(17);
			dipendente.addGenere("femmina");
			dipendente.addDataNascita("18/12/2000");
			dipendente.addCitta("BARI");
			dipendente.addNomeAzienda("Fincons");
			dipendente.addEmailAziendale();
			dipendente.addNumeroTelefonoAziendale("+39 3453636348");
			dipendente.addtipologiaContratto(String.valueOf(ConstantGlobal.TIPO_CONTRATTO.DETERMINATO));
			dipendente.addRuolo("menager");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@AfterEach
	void stampaPrimaTest() {
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}

	@BeforeEach()
	void stampaDopoTest() {
		System.out.println("\n prima del test");
		System.out.println(dipendente + "\n");
	}

	@Test
	void testEliminaNomeDipendente() {
		try {
			System.out.println("test elimina il nome del dipendente con campo = " + dipendente.VisualizzaNome());
			assertTrue(dipendente.eliminaNome());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaNomeDipendente() {
		try {
			System.out.println("test elimina il nome del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaNome());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaCognomeDipendente() {
		try {
			System.out.println("test elimina il cognome del dipendente con campo = " + dipendente.VisualizzaCognome());
			assertTrue(dipendente.eliminaCognome());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaCognomeDipendente() {
		try {
			System.out.println("test elimina il cognome del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaCognome());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaEtaDipendente() {
		try {
			System.out.println("test elimina l'età del dipendente con campo = " + dipendente.VisualizzaEta());
			assertTrue(dipendente.eliminaEta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaEtaDipendente() {
		try {
			System.out.println("test elimina l'età del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaEta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaGenereDipendente() {
		try {
			System.out.println("test elimina il genere del dipendente con campo = " + dipendente.VisualizzaGenere());
			assertTrue(dipendente.eliminaGenere());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaGenereDipendente() {
		try {
			System.out.println("test elimina il genere del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaGenere());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaDataNascitaDipendente() {
		try {
			System.out.println(
					"test elimina la data di nascita del dipendente con campo = " + dipendente.VisualizzaDataNascita());
			assertTrue(dipendente.eliminaDataNascita());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaCittaDipendente() {
		try {
			System.out.println("test elimina la città del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaCitta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaCittaDipendente() {
		try {
			System.out.println("test elimina la città del dipendente con campo = " + dipendente.VisualizzaCitta());
			assertTrue(dipendente.eliminaCitta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaDataNascitaDipendente() {
		try {
			System.out.println("test elimina la data di nascita del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaDataNascita());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaNomeAziendaDipendente() {
		try {
			System.out.println(
					"test elimina il nome dell'azienda con campo = " + dipendente.visualizzaNomeAziendaDipendente());
			assertTrue(dipendente.eliminaCitta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaNomeAziendaDipendente() {
		try {
			System.out.println("test elimina il nome dell'azienda del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaNomeAzienda());
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaEmailAziendaleDipendente() {
		try {
			System.out.println("test elimina l'email del dipendente dell'azienda con campo = "
					+ dipendente.visualizzaEmailAziendaleDipendente());
			assertTrue(dipendente.eliminaEmailAziendale());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaEmailAziendaleDipendente() {
		try {
			System.out.println("test elimina l'email del dipendente dell'azienda del dipendente con campo = " + null);
			assertFalse(dipendente2.eliminaEmailAziendale());
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaNumeroTelefonoAziendaleDipendente() {
		try {
			System.out.println("test elimina il numero telefonico del  dipendente dell'azienda con campo = "
					+ dipendente.visualizzaNumeroTelefonoAziendaleDipendente());
			assertTrue(dipendente.eliminaNumeroTelefonoAziendale());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminaNumeroTelefonoAziendaleDipendente() {
		System.out.println(
				"test elimina il numero telefonico del dipendente dell'azienda del dipendente con campo = " + null);
		try {
			assertFalse(dipendente2.eliminaNumeroTelefonoAziendale());
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminatipologiaContrattoDipendente() {
		try {
			System.out.println("test elimina la tipologia di contratto del dipendente dell'azienda con campo = "
					+ dipendente.visualizzatipologiaContrattoDipendente());
			assertTrue(dipendente.eliminatipologiaContratto());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2EliminatipologiaContrattoDipendente() {
		try {
			System.out.println(
					"test elimina la tipologia di contratto del dipendente dell'azienda del dipendente con campo = "
							+ null);
			assertFalse(dipendente2.eliminatipologiaContratto());
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaNomeCartaFedelta() {
		try {
			System.out.println("test errore elimina nome carta fedeltà ");
			assertFalse(dipendente.eliminaNomeCartaFedelta());
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaPuntiAccumulati() {
		try {
			System.out.println("test errore elimina punti accumulati del cliente ");
			assertFalse(dipendente.eliminaPuntiAccumulati());
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaDataInscrizioneTessera() {
		try {
			System.out.println("test errore elimina data inscrizione tessera cliente ");
			assertFalse(dipendente.eliminaDataInscrizioneTessera());
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testEliminaNumeroCartaFedelta() {
		try {
			System.out.println("test errore elimina numero carta fedeltà cliente ");
			assertFalse(dipendente.eliminaNumeroCartaFedelta());
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
}
