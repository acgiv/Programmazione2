package Cecinato_cs2022.TestDipendente;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

/**
 * 
 * <p>
 * <b> CLASSE: TestModificaDipendente </b>
 * <p>
 * * <p> Questa classe si occupa del test di tutti i metodi implementati sulla modifica dei dipendenti, così da verificare <br>
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

class TestModificaDipendente {

	private static Persona dipendente;;

	@BeforeAll
	public static void inizializzaMeotodi() {
		try {
			dipendente = new Dipendente("123456789a");
			dipendente.addNome("Giovanni");
			dipendente.addCognome("Sabatino");
			dipendente.addEta(30);
			dipendente.addGenere("altro");
			dipendente.addDataNascita("30/11/2020");
			dipendente.addCitta("FOGGIA");
			dipendente.addNomeAzienda("Exprivia");
			dipendente.addEmailAziendale();
			dipendente.addNumeroTelefonoAziendale("+39 3453636348");
			dipendente.addtipologiaContratto(String.valueOf(ConstantGlobal.TIPO_CONTRATTO.DETERMINATO));
			dipendente.addRuolo("dipendente");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@BeforeEach()
	void stampaPrimaTest() {
		System.out.println("\n prima del test");
		System.out.println(dipendente + "\n");
	}

	@Test
	void test1modificaNomeDipendente() {
		System.out.println("Test modifica del nome = Mario1");
		try {
			assertFalse(dipendente.modificaNome("Mario1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test2modificaNomeDipendente() {
		System.out.println("Test modifica del nome = Mar io");
		try {
			assertTrue(dipendente.modificaNome("Mar io"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test3modificaNomeDipendente() {
		System.out.println("Test modifica del nome = Mario&");
		try {
			assertFalse(dipendente.modificaNome("Mario&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test4modificaNomeDipendente() {
		System.out.println("Test modifica del nome = Mario");
		try {
			assertTrue(dipendente.modificaNome("Mario"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5modificaNomeDipendente() {
		System.out.println("Test modifica del nome = null");
		try {
			assertFalse(dipendente.modificaNome(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}

	@Test
	void test6modificaNomeDipendente() {
		System.out.println("Test modifica del nome = ' '");
		try {
			assertFalse(dipendente.modificaNome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test7modificaNomeDipendente() throws PersonaException {
		System.out.println("Test modifica del nome = mario senza averlo aggiunto");
		String val = dipendente.VisualizzaNome();
		try {
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
			assertFalse(dipendente.modificaNome("mario"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addNome(val);
		}
	}

	@Test
	void test1addCognomeDipendente() {
		System.out.println("Test modifica del cognome = Rossi1");
		try {
			assertFalse(dipendente.addCognome("Rossi1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test2modificaCognomeDipendente() {
		System.out.println("Test modifica del cognome = Ros si");
		try {
			assertTrue(dipendente.modificaCognome("Ros si"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test3modificaCognomeDipendente() {
		System.out.println("Test modifica del cognome = Rossi&");
		try {
			assertFalse(dipendente.modificaCognome("Rossi&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test4modificaCognomeDipendente() {
		System.out.println("Test modifica del cognome = Rossi");
		try {
			assertTrue(dipendente.modificaCognome("Rossi"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.modificaCognome("Sabatino");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5modificaCognomeDipendente() {
		System.out.println("Test modifica del cognome = null");
		try {
			assertFalse(dipendente.modificaCognome(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}

	@Test
	void test6modificaCongomeDipendente() {
		System.out.println("Test modifica del cognome = ' '");
		try {
			assertFalse(dipendente.modificaCognome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test7modificaCognomeDipendente() throws PersonaException {
		System.out.println("Test modifica del cognome senza che il cognome sia stato mai inserito");
		String val = dipendente.VisualizzaCognome();
		try {
			dipendente.eliminaCognome();
			assertFalse(dipendente.modificaCognome("Rossi"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addCognome(val);
		}
	}

	@Test
	void test1modificaEtaDipendente() {
		System.out.println("Test modifica del eta  minore di = " + ConstantGlobal.ETA_MINIMA_CLIENTE + " = 15 ");
		try {
			assertFalse(dipendente.modificaEta(15));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test2modificaEtaDipendente() {
		System.out.println(
				"Test modifica del eta maggiore dell'età massima =  " + ConstantGlobal.ETA_MASSIMA_CLIENTE + "  = 151");
		try {
			assertFalse(dipendente.modificaEta(151));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test3modificaEtaDipendente() {
		System.out.println("Test modifica dell'età  =  " + 17);
		try {
			assertTrue(dipendente.modificaEta(17));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test4modificaEtaDipendente() throws PersonaException {
		System.out.println("Test  modifica dell'età  =  " + 17 + " senza averla prima inserita");
		int eta = dipendente.VisualizzaEta();
		try {
			dipendente.eliminaEta();
			assertFalse(dipendente.modificaEta(17));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addEta(eta);
		}
	}

	@Test
	void test1modificaGenereDipendente() {
		System.out.println("Test modifica del Genere = Maschio1");
		try {
			assertFalse(dipendente.modificaGenere("Maschio1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test2modificaGenereDipendente() {
		System.out.println("Test modifica del genere = Maschio&");
		try {
			assertFalse(dipendente.modificaGenere("Maschio&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test3modificaGenereDipendente() {
		System.out.println("Test modifica del genere = Mas chio");
		try {
			assertFalse(dipendente.modificaGenere("Mas chio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test4modificaGenereDipendente() {
		System.out.println("Test modifica del genere = ' maschio '");
		try {
			assertFalse(dipendente.modificaGenere(" maschio "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test5modificaGenereDipendente() {
		System.out.println("Test modifica del genere = null");
		try {
			assertFalse(dipendente.modificaGenere(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}

	@Test
	void test6modificaGenereDipendente() {
		System.out.println("Test modifica del genere = ' '");
		try {
			assertFalse(dipendente.modificaGenere(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test7modificaGenereDipendente() {
		System.out.println("Test modifica del genere = maschio");
		try {
			assertTrue(dipendente.modificaGenere("maschio"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test8modificaGenereDipendente() throws PersonaException {
		System.out.println("Test modifica del genere = maschio senza averlo prima inserito");
		String val = String.valueOf( dipendente.VisualizzaGenere());
		try {
			dipendente.eliminaGenere();
			assertFalse(dipendente.modificaGenere("maschio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addGenere(val);

		}
	}

	@Test
	void test1modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 17-12-2000");
		try {
			assertFalse(dipendente.modificaDataNascita("17-12-2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test2modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 17/12/20+0");
		try {
			assertFalse(dipendente.modificaDataNascita("17/12/20+0"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test3modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 07/2/2000");
		try {
			assertFalse(dipendente.modificaDataNascita("07/2/2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test4modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = ' 17/12/2000 '");
		try {
			assertTrue(dipendente.modificaDataNascita(" 10/06/2000 "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = null");
		try {
			assertFalse(dipendente.modificaDataNascita(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test6modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = ' '");
		try {
			assertFalse(dipendente.modificaDataNascita(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test7modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 17/05/2022");
		try {
			assertTrue(dipendente.modificaDataNascita("17/05/2022"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test8modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 7/05/2022");
		try {
			assertFalse(dipendente.modificaDataNascita("7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test9modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = a7/05/2022");
		try {
			assertFalse(dipendente.modificaDataNascita("a7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test10modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 07/a5/2022");
		try {
			assertFalse(dipendente.modificaDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test11modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 07/05/1899");
		try {
			assertFalse(dipendente.modificaDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test12modificaDataNascitaDipendente() {
		System.out.println("Test modifica della data nascita = 07/05/3000");
		try {
			assertFalse(dipendente.modificaDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test13modificaDataNascitaDipendente() throws PersonaException {
		System.out.println("Test modifica della data nascita = 07/05/1930 senza averla prima inserita");
		String data = dipendente.VisualizzaDataNascita();
		try {
			dipendente.eliminaDataNascita();
			assertFalse(dipendente.modificaDataNascita("07/05/1930"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addDataNascita(data);
		}
	}

	@Test
	void test1modificaCittaDipendente() {
		System.out.println("Test modifica della città = bari1");
		try {
			assertFalse(dipendente.modificaCitta("bari1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test2modificaCittaDipendente() {
		System.out.println("Test modifica della città = bari&");
		try {
			assertFalse(dipendente.modificaCitta("bari&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test3modificaCittaDipendente() {
		System.out.println("Test modifica della città = ba ri");
		try {
			assertTrue(dipendente.modificaCitta("ba ri"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test4modificaCittaDipendente() {
		System.out.println("Test modifica della città = ' bari '");
		try {
			assertTrue(dipendente.modificaCitta(" bari "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test5modificaCittaDipendente() {
		System.out.println("Test modifica della città = null");
		try {
			assertFalse(dipendente.modificaCitta(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}

	@Test
	void test6modificaCittaDipendente() {
		System.out.println("Test modifica della città = ' '");
		try {
			assertFalse(dipendente.modificaCitta(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test7modificaCittaDipendente() throws PersonaException {
		System.out.println("Test modifica della città = 'bari' senza averla inserita");
		String val = dipendente.VisualizzaCitta();
		try {
			dipendente.eliminaCitta();
			assertFalse(dipendente.modificaCitta("bari"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addCitta(val);
		}
	}

	@Test
	void test1modificaRuoloDipendente() {
		System.out.println("Test modifica del ruolo = menager1");
		try {
			assertFalse(dipendente.modificaRuolo("menager1"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}

	@Test
	void test2modificaRuoloDipendente() {
		System.out.println("Test modifica del ruolo = menager&");
		try {
			assertFalse(dipendente.modificaRuolo("menageri&"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test3modificaRuoloDipendente() {
		System.out.println("Test modifica del ruolo = impegato cassiere");
		try {
			assertTrue(dipendente.modificaRuolo("impegato cassiere"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test4modificaRuoloDipendente() {
		System.out.println("Test modifica del ruolo = ' commesso '");
		try {
			assertTrue(dipendente.modificaRuolo(" commesso "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5modificaRuoloDipendente() {
		System.out.println("Test modifica del ruolo = null");
		try {
			assertFalse(dipendente.modificaRuolo(null));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}

	}

	@Test
	void test6modificaRuoloDipendente() {
		System.out.println("Test modifica del ruolo = ' '");
		try {
			assertFalse(dipendente.modificaRuolo(" "));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test7modificaRuoloDipendente() throws DipendenteException, ClienteException {
		System.out.println("Test modifica del ruolo = 'segretario' senza averlo prima inserito");
		String val = dipendente.visualizzaRuoloDipendente();
		try {
			dipendente.eliminaRuolo();
			assertFalse(dipendente.modificaRuolo("segretario"));
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addRuolo(val);
		}
	}
	
	@Test
	void test1modificaemailDipendente() throws DipendenteException, ClienteException, PersonaException  {
		System.out.println("Test modifica dell'email senza averla inserita");
		String nome = dipendente.VisualizzaNome();
		String cognome = dipendente.VisualizzaCognome();
		String nomeAzienda = dipendente.visualizzaNomeAziendaDipendente();
		try {
			dipendente.eliminaCognome();
			dipendente.eliminaNome();
			dipendente.eliminaNomeAzienda();
			assertFalse(dipendente.modificaEmailAziendale());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");	
			dipendente.addNome(nome);
			dipendente.addNomeAzienda(nomeAzienda);
			dipendente.addCognome(cognome);
		}
	}
	
	
	@Test
	void test2modificaemailDipendente() throws PersonaException {
		System.out.println("Test modifica dell'email");
		try {
			dipendente.modificaNome("Maria Pia");
			dipendente.modificaCognome("rossi");
			dipendente.modificaNomeAzienda("fincons group");
			assertTrue(dipendente.modificaEmailAziendale());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test3modificaemailDipendente() throws PersonaException {
		System.out.println("Test modifica dell'email con nome nullo");
		String var = dipendente.VisualizzaNome();
		try {
			dipendente.modificaCognome("rossi");
			dipendente.modificaNomeAzienda("fincons group");
			dipendente.eliminaNome();
			assertFalse(dipendente.modificaEmailAziendale());
		} catch (DipendenteException | ClienteException e) {
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			System.err.println(e.getMessage());
			dipendente.addNome(var);
		}
	}
	
	
	@Test
	void test4modificaemailDipendente() throws PersonaException {
		System.out.println("Test modifica dell'email con cognome nullo");
		String var = dipendente.VisualizzaCognome();
		try {
			dipendente.modificaNome("Maria Pia");
			dipendente.modificaNomeAzienda("fincons group");
			dipendente.eliminaCognome();
			assertFalse(dipendente.modificaEmailAziendale());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addCognome(var);		
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test5modificaemailDipendente() throws  ClienteException, PersonaException, DipendenteException {
		System.out.println("Test modifica dell'email con nome Azienda nulla");
		String var = dipendente.visualizzaNomeAziendaDipendente();
		try {
			dipendente.eliminaNomeAzienda();
			assertFalse(dipendente.modificaEmailAziendale());
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.addNomeAzienda(var);
		}
	}
	
	@Test
	void test1modificaNumeroTelefonicoDipendente() throws  ClienteException {
		System.out.println("Test modifica del numero telefonico = +39 333333333a");
		try {
			assertFalse(dipendente.modificaNumeroTelefonoAziendale("+39 333333333a3"));
		} catch (DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}

	
	@Test
	void test2modificaNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test modifica del numero telefonico = +39 333333333&");
		try {
			assertFalse(dipendente.modificaNumeroTelefonoAziendale("+39 333333333&3"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test3modificaNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test modifica del numero telefonico = +39 33333333312");
		try {
			assertFalse(dipendente.modificaNumeroTelefonoAziendale("+39 33333333312"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	@Test
	void test4modificaNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test modifica del numero telefonico = +393333333331");
		try {
			assertFalse(dipendente.modificaNumeroTelefonoAziendale("+393333333331"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test5modificaNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test modifica del numero telefonico = ' +39 3333333331 '");
		try {
			assertTrue(dipendente.modificaNumeroTelefonoAziendale(" +39 3333333331 "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test6modificaNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test modifica del numero telefonico = ' 39 3333333331 '");
		try {
			assertFalse(dipendente.modificaNumeroTelefonoAziendale("39 3333333331"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7modificaNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test modifica del numero telefonico = +47 3333333331'");
		try {
			assertFalse(dipendente.modificaNumeroTelefonoAziendale("+474 3333333331"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	@Test
	void test1modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = fincons22");
		try {
			assertFalse(dipendente.modificaNomeAzienda("fincons22"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = fincons&");
		try {
			assertFalse(dipendente.modificaNomeAzienda("fincons&"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test3modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = null");
		try {
			assertFalse(dipendente.modificaNomeAzienda(null));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test5modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = ' finsons '");
		try {
			assertTrue(dipendente.modificaNomeAzienda(" fincons "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test6modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = ' cusmai '");
		try {
			assertTrue(dipendente.modificaNomeAzienda(" cusmai analisi "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@Test
	void test7modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = ATOS");
		try {
			assertTrue(dipendente.modificaNomeAzienda("ATOS"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@Test
	void test8modificaNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test modifica nome aziendale  = ' finsons GROUP'");
		try {
			assertTrue(dipendente.modificaNomeAzienda(" finsons GROUP"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@Test	
	void testmodificaNomeCartaFedelta() {
		try {
			System.out.println("test errore modifica nome carta fedeltà ");
			assertFalse(dipendente.modificaNomeCartaFedelta("finconscard"));
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testmodificaPuntiAccumulati() {
		try {
			System.out.println("test errore modifica punti accumulati del cliente ");
			assertFalse(dipendente.modificaPuntiFedeltaAccumulati("1000",OPERAZIONE_PUNTI_FEDELTA.AGGIUNGI));
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testmodificaDataInscrizioneTessera() {
		try {
			System.out.println("test errore modifica data inscrizione tessera cliente ");
			assertFalse(dipendente.modificaDataInscrizioneTessera("11/12/2020"));
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testmodificaNumeroCartaFedelta() {
		try {
			System.out.println("test errore modifica numero carta fedeltà cliente ");
			assertFalse(dipendente.modificaNumeroCartaFedelta());
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test1modificaTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test modifica della tipologia di contratto = STAGE22");
		try {
			assertFalse(dipendente.modificatipologiaContratto("STAGE22"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2modificaTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test modifica della tipologia di contratto = STAGE&");
		try {
			assertFalse(dipendente.modificatipologiaContratto("STAGE&"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test3modificaTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test modifica della tipologia di contratto = null");
		try {
			assertFalse(dipendente.modificatipologiaContratto(null));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test5modificaTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test modifica della tipologia di contratto = ' STAGE '");
		try {
			assertTrue(dipendente.modificatipologiaContratto(" STAGE "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test6modificaTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test modifica della tipologia di contratto = 'STAGE'");
		try {
			assertTrue(dipendente.modificatipologiaContratto("STAGE"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
}
