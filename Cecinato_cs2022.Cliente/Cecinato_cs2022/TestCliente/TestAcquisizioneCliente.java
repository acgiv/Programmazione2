package Cecinato_cs2022.TestCliente;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

class TestAcquisizioneCliente {

	private static Persona cliente;

	@BeforeAll
	public static void inizializzaMeotodi() {
		try {
			cliente = new Cliente("aarrtx66q16x329a");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@BeforeEach()
	void stampaPrimaTest() {
		System.out.println("\n prima del test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test1addNomeCliente() {
		System.out.println("Test inserimento del nome = Mario1");
		try {
			assertFalse(cliente.addNome("Mario1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addNomeCliente() {
		System.out.println("Test inserimento del nome = Mar io");
		try {
			assertTrue(cliente.addNome("Mar io"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test3addNomeCliente() {
		System.out.println("Test inserimento del nome = Mario&");
		try {
			assertFalse(cliente.addNome("Mario&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4addNomeCliente() {
		System.out.println("Test inserimento del nome = Mario");
		try {
			assertTrue(cliente.addNome("Mario"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5addNomeCliente() {
		System.out.println("Test inserimento del nome = null");
		try {
			assertFalse(cliente.addNome(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test6addNomeCliente() {
		System.out.println("Test inserimento del nome = ' '");
		try {
			assertFalse(cliente.addNome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7addNomeCliente() throws PersonaException {
		System.out.println("Test doppio inserimento del nome = mario");
		try {
			assertTrue(cliente.addNome("mario"));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addNome("mario"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNome();
		}
	}

	@Test
	void test1addCognomeCliente() {
		System.out.println("Test inserimento del cognome = Rossi1");
		try {
			assertFalse(cliente.addCognome("Rossi1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addCognomeCliente() throws PersonaException {
		System.out.println("Test inserimento del cognome = Ros si");
		try {
			assertTrue(cliente.addCognome("Ros si"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaCognome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test3addCognomeCliente() {
		System.out.println("Test inserimento del cognome = Rossi&");
		try {
			assertFalse(cliente.addCognome("Rossi&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4addCognomeCliente() {
		System.out.println("Test inserimento del cognome = Rossi");
		try {
			assertTrue(cliente.addCognome("Rossi"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaCognome();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5addCognomeCliente() {
		System.out.println("Test inserimento del cognome = null");
		try {
			assertFalse(cliente.addCognome(null));

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}

	}

	@Test
	void test6addCongomeCliente() {
		System.out.println("Test inserimento del cognome = ' '");
		try {
			assertFalse(cliente.addCognome(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7addCognomeCliente() throws PersonaException {
		System.out.println("Test doppio inserimento del cognome = Rossi");
		try {
			assertTrue(cliente.addCognome("Rossi"));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addCognome("Rossi"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaCognome();
		}
	}

	@Test
	void test1addEtaCliente() {
		System.out.println("Test inserimento del eta  minore di = " + ConstantGlobal.ETA_MINIMA_CLIENTE + " = 15 ");
		try {
			assertFalse(cliente.addEta(15));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addEtaCliente() {
		System.out.println("Test inserimento del eta maggiore dell'età massima =  " + ConstantGlobal.ETA_MASSIMA_CLIENTE
				+ "  = 151");
		try {
			assertFalse(cliente.addEta(151));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3addEtaCliente() {
		System.out.println("Test inserimento dell'età  =  " + 17);
		try {
			assertTrue(cliente.addEta(17));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaEta();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test4addEtaCliente() throws PersonaException {
		System.out.println("Test doppio inserimento dell'età  =  " + 17);
		try {
			assertTrue(cliente.addEta(17));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addEta(17));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaEta();
		}
	}

	@Test
	void test1addGenereCliente() {
		System.out.println("Test inserimento del Genere = Maschio1");
		try {
			assertFalse(cliente.addGenere("Maschio1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addGenereCliente() {
		System.out.println("Test inserimento del genere = Maschio&");
		try {
			assertFalse(cliente.addGenere("Maschio&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3addGenereCliente() {
		System.out.println("Test inserimento del genere = Mas chio");
		try {
			assertFalse(cliente.addGenere("Mas chio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4addGenereCliente() {
		System.out.println("Test inserimento del genere = ' maschio '");
		try {
			assertFalse(cliente.addGenere(" maschio "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test5addGenereCliente() {
		System.out.println("Test inserimento del genere = null");
		try {
			assertFalse(cliente.addGenere(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
	}

	@Test
	void test6addGenereCliente() {
		System.out.println("Test inserimento del genere = ' '");
		try {
			assertFalse(cliente.addGenere(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7addGenereCliente() {
		System.out.println("Test inserimento del genere = maschio");
		try {
			assertTrue(cliente.addGenere("maschio"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaGenere();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test8addGenereCliente() throws PersonaException {
		System.out.println("Test doppio inserimento del genere = maschio");
		try {
			assertTrue(cliente.addGenere("maschio"));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addGenere("maschio"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaGenere();
		}
	}

	@Test
	void test1addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 17-12-2000");
		try {
			assertFalse(cliente.addDataNascita("17-12-2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 17/12/20+0");
		try {
			assertFalse(cliente.addDataNascita("17/12/20+0"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 07/2/2000");
		try {
			assertFalse(cliente.addDataNascita("07/2/2000"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = ' 17/12/2000 '");
		try {
			assertTrue(cliente.addDataNascita(" 17/12/2000 "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaDataNascita();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = null");
		try {
			assertFalse(cliente.addDataNascita(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test6addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = ' '");
		try {
			assertFalse(cliente.addDataNascita(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 17/05/2022");
		try {
			assertTrue(cliente.addDataNascita("17/05/2022"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaDataNascita();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test8addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 7/05/2022");
		try {
			assertFalse(cliente.addDataNascita("7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test9addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = a7/05/2022");
		try {
			assertFalse(cliente.addDataNascita("a7/05/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test10addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 07/a5/2022");
		try {
			assertFalse(cliente.addDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test11addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 07/05/1899");
		try {
			assertFalse(cliente.addDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test12addDataNascitaCliente() {
		System.out.println("Test inserimento della data nascita = 07/05/3000");
		try {
			assertFalse(cliente.addDataNascita("07/a5/2022"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test13addDataNascitaCliente() throws PersonaException {
		System.out.println("Test doppio inserimento della data nascita = 07/05/1930");
		try {
			assertTrue(cliente.addDataNascita("07/05/1930"));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addDataNascita("07/05/1930"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaDataNascita();
		}
	}

	@Test
	void test1addCittaCliente() {
		System.out.println("Test inserimento della città = bari1");
		try {
			assertFalse(cliente.addCitta("bari1"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addCittaCliente() {
		System.out.println("Test inserimento della città = bari&");
		try {
			assertFalse(cliente.addCitta("bari&"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3addCittaCliente() {
		System.out.println("Test inserimento della città = ba ri");
		try {
			assertTrue(cliente.addCitta("ba ri"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaCitta();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test4addCittaCliente() {
		System.out.println("Test inserimento della città = ' bari '");
		try {
			assertTrue(cliente.addCitta(" bari "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaCitta();
		} catch (PersonaException e) {
			System.err.println(e.getMessage());

		}
	}

	@Test
	void test5addCittaCliente() {
		System.out.println("Test inserimento della città = null");
		try {
			assertFalse(cliente.addCitta(null));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test6addCittaCliente() {
		System.out.println("Test inserimento della città = ' '");
		try {
			assertFalse(cliente.addCitta(" "));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7addCittaCliente() throws PersonaException {
		System.out.println("Test doppio inserimento della città = 'bari'");
		try {
			assertTrue(cliente.addCitta("bari"));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addCitta("bari"));
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaCitta();
		}
	}
	
	@Test
	void testaddRuoloCliente(){
	
			System.out.println("Test errore inserimento ruolo aziendale del dipendente");
			try {
				assertFalse(cliente.addRuolo("MANAGER"));
			} catch (DipendenteException | ClienteException e) {
				System.err.println(e.getMessage());
			}
		
	}
	
	@Test
	void testaddemailCliente() throws PersonaException {
		System.out.println("Test errore inserimento dell'email");
		try {
			assertFalse(cliente.addEmailAziendale());
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	

	@Test
	void test1addNumeroTelefonicoCliente() {
		try {
			System.out.println("Test errore inserimento numero aziendale del dipendente");
			assertFalse(cliente.addNumeroTelefonoAziendale(" +39 3333333331 "));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test8addNomeAziendaCliente(){
		try {
			System.out.println("Test errore inserimento nome azienda del dipendente");
			assertFalse(cliente.addNomeAzienda("fincons"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testaddTipoContrattoCliente(){
		try {
			System.out.println("Test errore inserimento della tipologia di contratto del dipendente");
			assertFalse(cliente.addtipologiaContratto("manager"));
		} catch (DipendenteException | ClienteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void testAggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà = finconscard");
			assertTrue(cliente.addNomeCartaFedelta("finconscard"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNomeCartaFedelta();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			
		}	
	}
	
	@Test
	void test2AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà 'fincons card'");
			assertTrue(cliente.addNomeCartaFedelta("fincons card"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNomeCartaFedelta();
		} catch (ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		
		}	
	}
	
	@Test
	void test3AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà 'Fincons card'");
			assertTrue(cliente.addNomeCartaFedelta("Fincons card"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNomeCartaFedelta();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			
		}	
	}
	
	@Test
	void test4AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà 'fincons Card'");
			assertTrue(cliente.addNomeCartaFedelta("Fincons Card"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNomeCartaFedelta();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test5AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà ' fincons card '");
			assertTrue(cliente.addNomeCartaFedelta(" Fincons card "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNomeCartaFedelta();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			
		}	
	}
	
	@Test
	void test6AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà 'fincons card&'");
			assertFalse(cliente.addNomeCartaFedelta(" Fincons card&"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void test7AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			System.out.println("test aggiunti nome carta fedeltà 'fincons card1'");
			assertFalse(cliente.addNomeCartaFedelta(" Fincons card1"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void test8AggiungiNomeCartaFedelta() throws PersonaException {
		try {
			cliente.addNomeCartaFedelta("fincons card");
			System.out.println("test doppio inseimento nome carta fedeltà 'fincons card'");
			assertFalse(cliente.addNomeCartaFedelta(" Fincons card"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			try {
				cliente.eliminaNomeCartaFedelta();
			} catch (ClienteException | DipendenteException e1) {
				System.err.println(e1.getMessage());
			}
		}	
	}
	
	@Test
	void testAggiungiPuntiAccumulati() {
		try {
			System.out.println("test aggiungi punti accumulati del cliente = 100");
			assertTrue(cliente.addPuntiFedeltaAccumulati("100"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaPuntiAccumulati();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	
	@Test
	void test2AggiungiPuntiAccumulati() {
		try {
			System.out.println("test aggiungi punti accumulati del cliente = ' 100 '");
			assertTrue(cliente.addPuntiFedeltaAccumulati(" 100 "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaPuntiAccumulati();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test3AggiungiPuntiAccumulati() {
		try {
			System.out.println("test aggiungi punti accumulati del cliente = '3000'");
			assertFalse(cliente.addPuntiFedeltaAccumulati("3000"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void test4AggiungiPuntiAccumulati() {
		try {
			System.out.println("test aggiungi punti accumulati del cliente = '300%'");
			assertFalse(cliente.addPuntiFedeltaAccumulati("300%"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void test5AggiungiPuntiAccumulati() {
		try {
			System.out.println("test aggiungi punti accumulati del cliente = '300a'");
			assertFalse(cliente.addPuntiFedeltaAccumulati("300a"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void test6AggiungiPuntiAccumulati() {
		try {
			System.out.println("test aggiungi punti accumulati del cliente = '-1'");
			assertFalse(cliente.addPuntiFedeltaAccumulati("-1"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}	
	}
	
	@Test
	void test7AggiungiPuntiAccumulati() throws PersonaException {
		try {
			cliente.addPuntiFedeltaAccumulati("300");
			System.out.println("test doppio inserimento aggiungi punti accumulati del cliente = '3'");
			assertFalse(cliente.addPuntiFedeltaAccumulati("-1"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			try {
				cliente.eliminaPuntiAccumulati();
			} catch (ClienteException | DipendenteException e1) {
				System.err.println(e1.getMessage());
			}
		}	
	}
	
	@Test
	void test1addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 17-12-2000");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("17-12-2000"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test2addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 17/12/20+0");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("17/12/20+0"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test3addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 07/2/2000");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("07/2/2000"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test4addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= ' 17/12/2000 '");
		try {
			assertTrue(cliente.addDataInscrizioneTessera(" 17/12/2000 "));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaDataInscrizioneTessera();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test5addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= null");
		try {
			assertFalse(cliente.addDataInscrizioneTessera(null));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test6addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= ' '");
		try {
			assertFalse(cliente.addDataInscrizioneTessera(" "));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test7addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 17/05/2022");
		try {
			assertTrue(cliente.addDataInscrizioneTessera("17/05/2022"));
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaDataInscrizioneTessera();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test8addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 7/05/2022");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("7/05/2022"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test9addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= a7/05/2022");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("a7/05/2022"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test10addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 07/a5/2022");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("07/a5/2022"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test11addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 07/05/1899");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("07/a5/2022"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test12addDataInscrizioneTessera() {
		System.out.println("Test inserimento della data inscrizione tessera= 07/05/3000");
		try {
			assertFalse(cliente.addDataInscrizioneTessera("07/a5/2022"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
		}
	}

	@Test
	void test13addDataInscrizioneTessera() throws PersonaException {
		System.out.println("Test doppio inserimento della data inscrizione tessera= 07/05/1930");
		try {
			assertTrue(cliente.addDataInscrizioneTessera("07/05/1930"));
			System.out.println(cliente + "\n");
			assertFalse(cliente.addDataInscrizioneTessera("07/05/1930"));
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			try {
				cliente.eliminaDataInscrizioneTessera();
			} catch (ClienteException | DipendenteException e1) {
				System.err.println(e1.getMessage());
			}
		}
	}
	
	
	@Test
	void test1AggiungiNumeroCartaFedelta() {
		try {
			System.out.println("test aggiungi numero carta fedeltà cliente ");
			assertTrue(cliente.addNumeroCartaFedelta());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			cliente.eliminaNumeroCartaFedelta();
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}	
	}
	
	@Test
	void test2AggiungiNumeroCartaFedelta() throws PersonaException {
		try {
			System.out.println("test doppio inserimento numero carta fedeltà cliente ");
			assertTrue(cliente.addNumeroCartaFedelta());
			assertFalse(cliente.addNumeroCartaFedelta());
		} catch ( ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
			System.out.println("\n dopo il test");
			System.out.println(cliente + "\n");
			try {
				cliente.eliminaNumeroCartaFedelta();
			} catch (ClienteException | DipendenteException e1) {
				System.err.println(e1.getMessage());

			}
		}	
	}
}
