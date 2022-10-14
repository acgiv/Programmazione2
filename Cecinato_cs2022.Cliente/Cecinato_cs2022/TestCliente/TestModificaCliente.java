/**
 * 
 */
package Cecinato_cs2022.TestCliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

/**
 * @author cecin
 *
 */
class TestModificaCliente {

	private static Persona cliente;

	@BeforeAll
	public static void InizializzaMeotodi() {
		try {
			cliente = new Cliente("bbhzrt76t20v003f");
			cliente.addNome("Gabriella");
			cliente.addCognome("caria");
			cliente.addEta(130);
			cliente.addGenere("altro");
			cliente.addDataNascita("10/05/1967");
			cliente.addCitta("Torino");
			cliente.addNomeCartaFedelta("MSI");
			cliente.addNumeroCartaFedelta();
			cliente.addDataInscrizioneTessera("13/12/2020");
			cliente.addPuntiFedeltaAccumulati("100");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@BeforeEach()
	void StampaPrimaTest() {
		System.out.println("\n prima del test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test1ModificaNomeCliente() {
		System.out.println("Test modifica del nome = Mario1");
		try {
			assertFalse(cliente.modificaNome("Mario1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2ModificaNomeCliente() {
		System.out.println("Test modifica del nome = Mar io");
		try {
			assertTrue(cliente.modificaNome("Mar io"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test3ModificaNomeCliente() {
		System.out.println("Test modifica del nome = Mario&");
		try {
			assertFalse(cliente.modificaNome("Mario&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4ModificaNomeCliente() {
		System.out.println("Test modifica del nome = Mario");
		try {
			assertTrue(cliente.modificaNome("Mario"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5ModificaNomeCliente() {
		System.out.println("Test modifica del nome = null");
		try {
			assertFalse(cliente.modificaNome(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test6ModificaNomeCliente() {
		System.out.println("Test modifica del nome = ' '");
		try {
			assertFalse(cliente.modificaNome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7ModificaNomeCliente() throws PersonaException {
		System.out.println("Test modifica del nome = mario senza averlo aggiunto");
		String val = cliente.VisualizzaNome();
		try {
			System.out.println(cliente + "\n");
			cliente.eliminaNome();
			assertFalse(cliente.modificaNome("mario"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.addNome(val);
		}
	}

	@Test
	void test1ModificaCognomeCliente() {
		System.out.println("Test modifica del cognome = Rossi1");
		try {
			assertFalse(cliente.modificaCognome("Rossi1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2ModificaCognomeCliente() {
		System.out.println("Test modifica del cognome = Ros si");
		try {
			assertTrue(cliente.modificaCognome("Ros si"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test3ModificaCognomeCliente() {
		System.out.println("Test modifica del cognome = Rossi&");
		try {
			assertFalse(cliente.modificaCognome("Rossi&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4ModificaCognomeCliente() {
		System.out.println("Test modifica del cognome = Rossi");
		try {
			assertTrue(cliente.modificaCognome("Rossi"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.modificaCognome("Sabatino");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5ModificaCognomeCliente() {
		System.out.println("Test modifica del cognome = null");
		try {
			assertFalse(cliente.modificaCognome(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test6ModificaCongomeCliente() {
		System.out.println("Test modifica del cognome = ' '");
		try {
			assertFalse(cliente.modificaCognome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7ModificaCognomeCliente() throws PersonaException {
		System.out.println("Test modifica del cognome senza che il cognome sia stato mai inserito");
		String val = cliente.VisualizzaCognome();
		try {
			cliente.eliminaCognome();
			assertFalse(cliente.modificaCognome("Rossi"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.addCognome(val);
		}
	}

	@Test
	void test1ModificaEtaCliente() {
		System.out.println("Test modifica del eta  minore di = " + ConstantGlobal.ETA_MINIMA_CLIENTE + " = 15 ");
		try {
			assertFalse(cliente.modificaEta(15));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2ModificaEtaCliente() {
		System.out.println(
				"Test modifica del eta maggiore dell'età massima =  " + ConstantGlobal.ETA_MASSIMA_CLIENTE + "  = 151");
		try {
			assertFalse(cliente.modificaEta(151));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3ModificaEtaCliente() {
		System.out.println("Test modifica dell'età  =  " + 17);
		try {
			assertTrue(cliente.modificaEta(17));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test4ModificaEtaCliente() throws PersonaException {
		System.out.println("Test  modifica dell'età  =  " + 17 + " senza averla prima inserita");
		int eta = cliente.VisualizzaEta();
		try {
			cliente.eliminaEta();
			assertFalse(cliente.modificaEta(17));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.addEta(eta);
		}
	}

	@Test
	void test1ModificaGenereCliente() {
		System.out.println("Test modifica del Genere = Maschio1");
		try {
			assertFalse(cliente.modificaGenere("Maschio1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2ModificaGenereCliente() {
		System.out.println("Test modifica del genere = Maschio&");
		try {
			assertFalse(cliente.modificaGenere("Maschio&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3ModificaGenereCliente() {
		System.out.println("Test modifica del genere = Mas chio");
		try {
			assertFalse(cliente.modificaGenere("Mas chio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4ModificaGenereCliente() {
		System.out.println("Test modifica del genere = ' maschio '");
		try {
			assertFalse(cliente.modificaGenere(" maschio "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test5ModificaGenereCliente() {
		System.out.println("Test modifica del genere = null");
		try {
			assertFalse(cliente.modificaGenere(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test6ModificaGenereCliente() {
		System.out.println("Test modifica del genere = ' '");
		try {
			assertFalse(cliente.modificaGenere(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7ModificaGenereCliente() {
		System.out.println("Test modifica del genere = maschio");
		try {
			assertTrue(cliente.modificaGenere("maschio"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test8ModificaGenereCliente() throws PersonaException {
		System.out.println("Test modifica del genere = maschio senza averlo prima inserito");
		String val = String.valueOf(cliente.VisualizzaGenere());
		try {
			cliente.eliminaGenere();
			assertFalse(cliente.modificaGenere("maschio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.addGenere(val);

		}
	}

	@Test
	void test1ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 17-12-2000");
		try {
			assertFalse(cliente.modificaDataNascita("17-12-2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 17/12/20+0");
		try {
			assertFalse(cliente.modificaDataNascita("17/12/20+0"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 07/2/2000");
		try {
			assertFalse(cliente.modificaDataNascita("07/2/2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = ' 17/12/2000 '");
		try {
			assertTrue(cliente.modificaDataNascita(" 10/06/2000 "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = null");
		try {
			assertFalse(cliente.modificaDataNascita(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test6ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = ' '");
		try {
			assertFalse(cliente.modificaDataNascita(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 17/05/2022");
		try {
			assertTrue(cliente.modificaDataNascita("17/05/2022"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test8ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 7/05/2022");
		try {
			assertFalse(cliente.modificaDataNascita("7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test9ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = a7/05/2022");
		try {
			assertFalse(cliente.modificaDataNascita("a7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test10ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 07/a5/2022");
		try {
			assertFalse(cliente.modificaDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test11ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 07/05/1899");
		try {
			assertFalse(cliente.modificaDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test12ModificaDataNascitaCliente() {
		System.out.println("Test modifica della data nascita = 07/05/3000");
		try {
			assertFalse(cliente.modificaDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test13ModificaDataNascitaCliente() throws PersonaException {
		System.out.println("Test modifica della data nascita = 07/05/1930 senza averla prima inserita");
		String data = cliente.VisualizzaDataNascita();
		try {
			cliente.eliminaDataNascita();
			assertFalse(cliente.modificaDataNascita("07/05/1930"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.addDataNascita(data);
		}
	}

	@Test
	void test1ModificaCittaCliente() {
		System.out.println("Test modifica della città = bari1");
		try {
			assertFalse(cliente.modificaCitta("bari1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2ModificaCittaCliente() {
		System.out.println("Test modifica della città = bari&");
		try {
			assertFalse(cliente.modificaCitta("bari&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3ModificaCittaCliente() {
		System.out.println("Test modifica della città = ba ri");
		try {
			assertTrue(cliente.modificaCitta("ba ri"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test4ModificaCittaCliente() {
		System.out.println("Test modifica della città = ' bari '");
		try {
			assertTrue(cliente.modificaCitta(" bari "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test5ModificaCittaCliente() {
		System.out.println("Test modifica della città = null");
		try {
			assertFalse(cliente.modificaCitta(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test6ModificaCittaCliente() {
		System.out.println("Test modifica della città = ' '");
		try {
			assertFalse(cliente.modificaCitta(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7ModificaCittaCliente() throws PersonaException {
		System.out.println("Test modifica della città = 'bari' senza averla inserita");
		String val = cliente.VisualizzaCitta();
		try {
			cliente.eliminaCitta();
			assertFalse(cliente.modificaCitta("bari"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.addCitta(val);
		}
	}
	
	@Test	
	void testModificaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test modifica nome carta fedeltà del cliente "+ "finconscard");
			assertTrue(cliente.modificaNomeCartaFedelta("finconscard"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test	
	void test2ModificaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test modifica nome carta fedeltà del cliente"+ "fincons card");
			assertTrue(cliente.modificaNomeCartaFedelta("fincon scard"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test	
	void test3ModificaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test modifica nome carta fedeltà del cliente"+ "' fincons card '");
			assertTrue(cliente.modificaNomeCartaFedelta(" fincons card "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test	
	void test4ModificaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test modifica nome carta fedeltà del cliente"+ "fincons card1");
			assertFalse(cliente.modificaNomeCartaFedelta("fincons card1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test5ModificaNomeCartaFedeltaCliente() {
		try {
			System.out.println("test modifica nome carta fedeltà del cliente"+ " fincons card( ");
			assertFalse(cliente.modificaNomeCartaFedelta("fincons card("));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test1ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti aggiungendo 20A  punti a quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20A", OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test2ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti aggiungendo 20&  punti quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20&", OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test3ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti aggiungendo ' 20 ' punti quelli che il cliente ha accumulato");
			assertTrue(cliente.modificaPuntiFedeltaAccumulati(" 20 ", OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
	
		}	
	}
	
	@Test	
	void test4ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti aggiungendo 20 punti quelli che il cliente ha accumulato");
			assertTrue(cliente.modificaPuntiFedeltaAccumulati(" 20 ", OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}	
	}
	
	@Test	
	void test5ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti aggiungendo -30 punti a quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("-30", OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test6ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti aggiungendo i punti con valore superiore al valore massimo consentito di " + ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20001", OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	@Test	
	void test7ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sottraendo = ' 20 ' punti a quelli che il cliente ha accumulato"+ "' 20 '");
			assertTrue(cliente.modificaPuntiFedeltaAccumulati(" 20 ", OPERAZIONE_PUNTI_FEDELTA.SOTTRAI));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test	
	void test8ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sottraendo =  20( punti a quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20(", OPERAZIONE_PUNTI_FEDELTA.SOTTRAI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test9ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sottraendo = 20 punti a quelli che il cliente ha accumulato");
			assertTrue(cliente.modificaPuntiFedeltaAccumulati("20", OPERAZIONE_PUNTI_FEDELTA.SOTTRAI));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test	
	void test10ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sottraendo = 110 punti a quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("990", OPERAZIONE_PUNTI_FEDELTA.SOTTRAI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test11ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sottraendo = 20& punti a quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20&", OPERAZIONE_PUNTI_FEDELTA.SOTTRAI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test12ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sostituendo = 20& punti con quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20&", OPERAZIONE_PUNTI_FEDELTA.SOSTITUISCI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test13ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sostituendo = 20a punti con quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("20a", OPERAZIONE_PUNTI_FEDELTA.SOSTITUISCI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test14ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sostituendo = ' 1999 ' punti con quelli che il cliente ha accumulato");
			assertTrue(cliente.modificaPuntiFedeltaAccumulati("400", OPERAZIONE_PUNTI_FEDELTA.SOSTITUISCI));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}	
	}
	
	@Test	
	void test15ModificaPuntiFedeltaAccumulatiCliente() {
		try {
			System.out.println("test modifica dei punti sostituendo = ' 2001 ' punti con quelli che il cliente ha accumulato");
			assertFalse(cliente.modificaPuntiFedeltaAccumulati("2001", OPERAZIONE_PUNTI_FEDELTA.SOSTITUISCI));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test1ModificaNumeroCartaFedeltaCliente() {
		try {
			System.out.println("test modifica numero carta fedeltà");
			assertTrue(cliente.modificaNumeroCartaFedelta());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			
		}	
	}
	
	@Test	
	void test1ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"05/11/2014");
			assertTrue(cliente.modificaDataInscrizioneTessera("05/11/2014"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
		}	
	}
	
	@Test	
	void test2ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"5/11/2014");
			assertFalse(cliente.modificaDataInscrizioneTessera("5/11/2014"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test3ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+" 05/1/2014 ");
			assertFalse(cliente.modificaDataInscrizioneTessera(" 05/1/2014 "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test4ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"a5/01/2014");
			assertFalse(cliente.modificaDataInscrizioneTessera("a5/01/2014"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test5ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"05/a1/2014");
			assertFalse(cliente.modificaDataInscrizioneTessera("05/a1/2014"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test6ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"05/01/201a");
			assertFalse(cliente.modificaDataInscrizioneTessera("05/01/201a"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test7ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"05/01/18 0");
			assertFalse(cliente.modificaDataInscrizioneTessera("05/01/18 0"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test	
	void test8ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+"' 24/10/1983 '");
			assertTrue(cliente.modificaDataInscrizioneTessera(" 24/10/1983 "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
		}	
	}
	
	@Test	
	void test9ModificaDataInscrizioneTesseraCliente() {
		try {
			System.out.println("test modifica dataInscrizioneTessera fedeltà = "+" 24-10-1983 ");
			assertFalse(cliente.modificaDataInscrizioneTessera("24-10-1983"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void testModificaNumeroTelefonoAziendaleDipendente() {
		try {
			System.out.println("test errore modifica il numero aziendale del dipendente ");
			assertEquals(cliente.modificaNumeroTelefonoAziendale("+49 1234567812"), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2ModificaEmailAziendaleDipendente() {
		try {
			System.out.println("test errore modifica l'email aziendale del dipendente ");
			assertEquals(cliente.modificaEmailAziendale(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testModificaNomeAziendaDipendente() {
		try {
			System.out.println("test errore modifica il nome dell'azienda del dipendente ");
			assertEquals(cliente.modificaNomeAzienda("Fincons Group"), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testModificaRuoloDipendente() {
		try {
			System.out.println("test errore modifica il ruolo del dipendente ");
			assertEquals(cliente.modificaRuolo("menager"), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}
}
