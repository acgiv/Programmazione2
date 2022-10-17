package Cecinato_cs2022.TestDipendente;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

class TestAggiungiDipendente {

	private static Persona dipendente;
	
	
	@BeforeAll
	public static void inizializzaMeotodi() {
		try {
			dipendente = new Dipendente("123456789a");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@BeforeEach()
	void stampaPrimaTest() {
		System.out.println("\n prima del test");
		System.out.println(dipendente + "\n");	
	}

	
	@Test
	void test1addNomeDipendente() {
		System.out.println("Test inserimento del nome = Mario1");
		try {
			assertFalse(dipendente.addNome("Mario1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addNomeDipendente() {
		System.out.println("Test inserimento del nome = Mar io");
		try {
			assertTrue(dipendente.addNome("Mar io"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test3addNomeDipendente() {
		System.out.println("Test inserimento del nome = Mario&");
		try {
			assertFalse(dipendente.addNome("Mario&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test4addNomeDipendente() {
		System.out.println("Test inserimento del nome = Mario");
		try {
			assertTrue(dipendente.addNome("Mario"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test5addNomeDipendente() {
		System.out.println("Test inserimento del nome = null");
		try {
			assertFalse(dipendente.addNome(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}
	
	
	@Test
	void test6addNomeDipendente() {
		System.out.println("Test inserimento del nome = ' '");
		try {
			assertFalse(dipendente.addNome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addNomeDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento del nome = mario");
		try {
			assertTrue(dipendente.addNome("mario"));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addNome("mario"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
		}
	}
	
	
	@Test
	void test1addCognomeDipendente() {
		System.out.println("Test inserimento del cognome = Rossi1");
		try {
			assertFalse(dipendente.addCognome("Rossi1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addCognomeDipendente() throws PersonaException {
		System.out.println("Test inserimento del cognome = Ros si");
		try {
			assertTrue(dipendente.addCognome("Ros si"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCognome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());	

		}
	}
	
	
	@Test
	void test3addCognomeDipendente() {
		System.out.println("Test inserimento del cognome = Rossi&");
		try {
			assertFalse(dipendente.addCognome("Rossi&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test4addCognomeDipendente() {
		System.out.println("Test inserimento del cognome = Rossi");
		try {		
			assertTrue(dipendente.addCognome("Rossi"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCognome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test5addCognomeDipendente() {
		System.out.println("Test inserimento del cognome = null");
		try {
			assertFalse(dipendente.addCognome(null));
			
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}
	
	@Test
	void test6addCongomeDipendente() {
		System.out.println("Test inserimento del cognome = ' '");
		try {
			assertFalse(dipendente.addCognome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addCognomeDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento del cognome = Rossi");
		try {		
			assertTrue(dipendente.addCognome("Rossi"));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addCognome("Rossi"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCognome();
		}
	}

	
	@Test
	void test1addEtaDipendente() {
		System.out.println("Test inserimento del eta  minore di = "+ConstantGlobal.ETA_MINIMA_CLIENTE + " = 15 ");
		try {
			assertFalse(dipendente.addEta(15));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addEtaDipendente() {
		System.out.println("Test inserimento del eta maggiore dell'età massima =  " +ConstantGlobal.ETA_MASSIMA_CLIENTE + "  = 151");
		try {
			assertFalse(dipendente.addEta(151));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	
	@Test
	void test3addEtaDipendente() {
		System.out.println("Test inserimento dell'età  =  " +17);
		try {
			assertTrue(dipendente.addEta(17));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaEta();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			
		}
	}
	
	
	@Test
	void test4addEtaDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento dell'età  =  " +17);
		try {
			assertTrue(dipendente.addEta(17));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addEta(17));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaEta();
		}
	}
	
	
	@Test
	void test1addGenereDipendente() {
		System.out.println("Test inserimento del Genere = Maschio1");
		try {
			assertFalse(dipendente.addGenere("Maschio1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addGenereDipendente() {
		System.out.println("Test inserimento del genere = Maschio&");
		try {
			assertFalse(dipendente.addGenere("Maschio&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test3addGenereDipendente() {
		System.out.println("Test inserimento del genere = Mas chio");
		try {
			assertFalse(dipendente.addGenere("Mas chio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test4addGenereDipendente() {
		System.out.println("Test inserimento del genere = ' maschio '");
		try {
			assertFalse(dipendente.addGenere(" maschio "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test5addGenereDipendente() {
		System.out.println("Test inserimento del genere = null");
		try {
			assertFalse(dipendente.addGenere(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}
	
	
	@Test
	void test6addGenereDipendente() {
		System.out.println("Test inserimento del genere = ' '");
		try {
			assertFalse(dipendente.addGenere(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addGenereDipendente() {
		System.out.println("Test inserimento del genere = maschio");
		try {
			assertTrue(dipendente.addGenere("maschio"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaGenere();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		
		}
	}
	
	
	@Test
	void test8addGenereDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento del genere = maschio");
		try {
			assertTrue(dipendente.addGenere("maschio"));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addGenere("maschio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaGenere();
		}
	}
	
	
	@Test
	void test1addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 17-12-2000");
		try {
			assertFalse(dipendente.addDataNascita("17-12-2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 17/12/20+0");
		try {
			assertFalse(dipendente.addDataNascita("17/12/20+0"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test3addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 07/2/2000");
		try {
			assertFalse(dipendente.addDataNascita("07/2/2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");		}
	}
	
	
	@Test
	void test4addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = ' 17/12/2000 '");
		try {
			assertTrue(dipendente.addDataNascita(" 17/12/2000 "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaDataNascita();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test5addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = null");
		try {
			assertFalse(dipendente.addDataNascita(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test6addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = ' '");
		try {
			assertFalse(dipendente.addDataNascita(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 17/05/2022");
		try {
			assertTrue(dipendente.addDataNascita("17/05/2022"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaDataNascita();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test8addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 7/05/2022");
		try {
			assertFalse(dipendente.addDataNascita("7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test9addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = a7/05/2022");
		try {
			assertFalse(dipendente.addDataNascita("a7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test10addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 07/a5/2022");
		try {
			assertFalse(dipendente.addDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test11addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 07/05/1899");
		try {
			assertFalse(dipendente.addDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test12addDataNascitaDipendente() {
		System.out.println("Test inserimento della data nascita = 07/05/3000");
		try {
			assertFalse(dipendente.addDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test13addDataNascitaDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento della data nascita = 07/05/1930");
		try {
			assertTrue(dipendente.addDataNascita("07/05/1930"));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addDataNascita("07/05/1930"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaDataNascita();
		}
	}
	
	
	@Test
	void test1addCittaDipendente() {
		System.out.println("Test inserimento della città = bari1");
		try {
			assertFalse(dipendente.addCitta("bari1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addCittaDipendente() {
		System.out.println("Test inserimento della città = bari&");
		try {
			assertFalse(dipendente.addCitta("bari&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test3addCittaDipendente() {
		System.out.println("Test inserimento della città = ba ri");
		try {
			assertTrue(dipendente.addCitta("ba ri"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCitta();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test4addCittaDipendente() {
		System.out.println("Test inserimento della città = ' bari '");
		try {
			assertTrue(dipendente.addCitta(" bari "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCitta();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}
	
	
	@Test
	void test5addCittaDipendente() {
		System.out.println("Test inserimento della città = null");
		try {
			assertFalse(dipendente.addCitta(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}
	
	
	@Test
	void test6addCittaDipendente() {
		System.out.println("Test inserimento della città = ' '");
		try {
			assertFalse(dipendente.addCitta(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addCittaDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento della città = 'bari'");
		try {
			assertTrue(dipendente.addCitta("bari"));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addCitta("bari"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCitta();
		}
	}
	
	
	@Test
	void test1addRuoloDipendente() {
		System.out.println("Test inserimento del ruolo = menager1");
		try {
			assertFalse(dipendente.addRuolo("menager1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addRuoloDipendente() {
		System.out.println("Test inserimento del ruolo = menager&");
		try {
			assertFalse(dipendente.addRuolo("menageri&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test3addRuoloDipendente() {
		System.out.println("Test inserimento del ruolo= impegato cassiere");
		try {
			assertTrue(dipendente.addRuolo("impegato cassiere"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaRuolo();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test4addRuoloDipendente() {
		System.out.println("Test inserimento del ruolo = ' manager '");
		try {
			assertTrue(dipendente.addRuolo(" bari "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaRuolo();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}
	
	
	@Test
	void test5addRuoloDipendente() {
		System.out.println("Test inserimento del ruolo = null");
		try {
			assertFalse(dipendente.addRuolo(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
	}
	
	
	@Test
	void test6addRuoloDipendente() {
		System.out.println("Test inserimento del ruolo = ' '");
		try {
			assertFalse(dipendente.addRuolo(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addRuoloDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento del ruolo = 'MANAGER'");
		try {
			assertTrue(dipendente.addRuolo("MANAGER"));
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addRuolo("MANAGER"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaRuolo();
		}
	}
	
	
	@Test
	void test1addemailDipendente() throws PersonaException {
		System.out.println("Test doppio inserimento dell'email");
		dipendente.addCognome("rossi");
		dipendente.addNome("mario");
		dipendente.addNomeAzienda("fincons group");
		try {
			assertTrue(dipendente.addEmailAziendale());
			System.out.println(dipendente + "\n");
			assertFalse(dipendente.addEmailAziendale());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
			dipendente.eliminaCognome();
			dipendente.eliminaEmailAziendale();
			dipendente.eliminaNomeAzienda();

		}
	}
	
	
	@Test
	void test2addemailDipendente() throws PersonaException {
		System.out.println("Test inserimento dell'email");
		dipendente.addCognome("rossi");
		dipendente.addNome("mario");
		dipendente.addNomeAzienda("fincons group");
		try {
			assertTrue(dipendente.addEmailAziendale());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
			dipendente.eliminaCognome();
			dipendente.eliminaEmailAziendale();
			dipendente.eliminaNomeAzienda();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test3addemailDipendente() throws PersonaException {
		System.out.println("Test inserimento dell'email con cognome nullo");
		dipendente.addNome("mario");
		dipendente.addNomeAzienda("fincons group");
		try {
			assertFalse(dipendente.addEmailAziendale());

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNome();
			dipendente.eliminaNomeAzienda();
			
		}
	}
	
	
	@Test
	void test4addemailDipendente() throws PersonaException {
		System.out.println("Test inserimento dell'email con nomw nullo");
		dipendente.addCognome("rossi");
		dipendente.addNomeAzienda("fincons group");
		try {
			assertFalse(dipendente.addEmailAziendale());

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCognome();
			dipendente.eliminaNomeAzienda();
			
		}
	}
	
	
	@Test
	void test5addemailDipendente() throws PersonaException {
		System.out.println("Test inserimento dell'email con nome Azienda nullo");
		dipendente.addCognome("rossi");
		dipendente.addNome("Maria Pia");
		try {
			assertFalse(dipendente.addEmailAziendale());

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaCognome();
			dipendente.eliminaNome();
			
		}
	}

	
	@Test
	void test1addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = +39 333333333a");
		try {
			assertFalse(dipendente.addNumeroTelefonoAziendale("+39 333333333a3"));

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}

	
	@Test
	void test2addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = +39 333333333&");
		try {
			assertFalse(dipendente.addNumeroTelefonoAziendale("+39 333333333&3"));

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test3addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = +39 33333333312");
		try {
			assertFalse(dipendente.addNumeroTelefonoAziendale("+39 33333333312"));

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	@Test
	void test4addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = +393333333331");
		try {
			assertFalse(dipendente.addNumeroTelefonoAziendale("+393333333331"));

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test5addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = ' +39 3333333331 '");
		try {
			assertTrue(dipendente.addNumeroTelefonoAziendale(" +39 3333333331 "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNumeroTelefonoAziendale();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test6addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = ' 39 3333333331 '");
		try {
			assertFalse(dipendente.addNumeroTelefonoAziendale("39 3333333331"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test7addNumeroTelefonicoDipendente() throws PersonaException {
		System.out.println("Test inserimento del numero telefonico = +47 3333333331'");
		try {
			assertFalse(dipendente.addNumeroTelefonoAziendale("+474 3333333331"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}

	
	@Test
	void test1addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome aziendale  = fincons22");
		try {
			assertFalse(dipendente.addNomeAzienda("fincons22"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome azienda  = fincons&");
		try {
			assertFalse(dipendente.addNomeAzienda("fincons&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test3addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome azienda  = null");
		try {
			assertFalse(dipendente.addNomeAzienda(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test5addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome azienda  = ' finsons '");
		try {
			assertTrue(dipendente.addNomeAzienda(" fincons "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNomeAzienda();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test
	void test6addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome azienda  = ' finsons group '");
		try {
			assertTrue(dipendente.addNomeAzienda(" fincons group "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNomeAzienda();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@Test
	void test7addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome azienda  = GROUP FINSONS");
		try {
			assertTrue(dipendente.addNomeAzienda("GROUP FINSONS"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNomeAzienda();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	
	@Test
	void test8addNomeAziendaDipendente() throws PersonaException {
		System.out.println("Test inserimento nome azienda  = ' finsons GROUP'");
		try {
			assertTrue(dipendente.addNomeAzienda(" finsons GROUP"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminaNomeAzienda();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test1addTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test inserimento della tipologia di contratto = STAGE22");
		try {
			assertFalse(dipendente.addtipologiaContratto("STAGE22"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test2addTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test inserimento della tipologia di contratto = STAGE&");
		try {
			assertFalse(dipendente.addtipologiaContratto("STAGE&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");

		}
	}
	
	
	@Test
	void test3addTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test inserimento della tipologia di contratto = null");
		try {
			assertFalse(dipendente.addtipologiaContratto(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
		}
	}
	
	
	@Test
	void test5addTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test inserimento della tipologia di contratto = ' STAGE '");
		try {
			assertTrue(dipendente.addtipologiaContratto(" STAGE "));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminatipologiaContratto();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test6addTipoContrattoDipendente() throws PersonaException {
		System.out.println("Test inserimento della tipologia di contratto = 'STAGE'");
		try {
			assertTrue(dipendente.addtipologiaContratto("STAGE"));
			System.out.println("\n dopo il test");
			System.out.println(dipendente + "\n");
			dipendente.eliminatipologiaContratto();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	void testAggiungiNomeCartaFedelta() {
		try {
			System.out.println("test errore aggiunti nome carta fedeltà ");
			assertFalse(dipendente.addNomeCartaFedelta("finconscard"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testAggiungiPuntiAccumulati() {
		try {
			System.out.println("test errore aggiungi punti accumulati del cliente ");
			assertFalse(dipendente.addPuntiFedeltaAccumulati("1000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testAggiungiDataInscrizioneTessera() {
		try {
			System.out.println("test errore aggiungi data inscrizione tessera cliente ");
			assertFalse(dipendente.addDataInscrizioneTessera("11/12/2020"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void testAggiungiNumeroCartaFedelta() {
		try {
			System.out.println("test errore aggiungi numero carta fedeltà cliente ");
			assertFalse(dipendente.addNumeroCartaFedelta());
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}	
	}
	

	
}
