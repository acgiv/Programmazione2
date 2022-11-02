package Cecinato_cs2022.TestCliente;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

class TestVisualizzaCliente{

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
		} catch (PersonaException | ClienteException | DipendenteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@AfterEach
	void stampaPrimaTest() {
		System.out.println("\n dopo il test");
		System.out.println(cliente + "\n");
		System.out.println(cliente2 + "\n");
	}

	@BeforeEach()
	void stampaDopoTest() {
		System.out.println("\n prima del test");
		System.out.println(cliente + "\n");
		System.out.println(cliente2 + "\n");
	}
	
	@Test
	void testvisualizzanomeCliente() throws DipendenteException {
		try {
			System.out.println("test su visualizzazione nome del cliente: "+cliente.VisualizzaCodiceFiscale()+" = ad: " + "Mario");
		} catch ( DipendenteException e) {
			e.printStackTrace();
		}
		assertEquals(cliente.VisualizzaNome(), "Mario");
	}
	
	@Test
	void testCodiceFiscaleCliente()  throws  DipendenteException {
		System.out.println("test su visualizzazione del codice fiscale del cliente: "+cliente2.VisualizzaCodiceFiscale()+" = ad: " +"bbhzrt76t20v003f");
		assertEquals(cliente.VisualizzaCodiceFiscale(), "bbhzrt76t20v003f");
	}


	@Test
	void test2visualizzanomeCliente() throws DipendenteException {
		System.out.println("test su visualizzazione nome del cliente: "+cliente2.VisualizzaCodiceFiscale()+" = ad: " + null);
		assertEquals(cliente2.VisualizzaNome(), null);
	}

	@Test
	void testVisualizzaCognomeCliente() throws DipendenteException {
		System.out.println("test visualizza il cognome del cliente: "+cliente.VisualizzaCodiceFiscale()+" con campo = " + "Rossi");
		assertEquals(cliente.VisualizzaCognome(), "Rossi");
	}

	@Test
	void test2VisualizzaCognomeCliente() throws DipendenteException {
		System.out.println("test visualizza il cognome del cliente: "+cliente2.VisualizzaCodiceFiscale()+" con campo = " + null);
		assertEquals(cliente2.VisualizzaCognome(), null);
	}

	@Test
	void testVisualizzaEtaCliente() throws DipendenteException {
		System.out.println("test visualizza l'età del cliente:  "+cliente.VisualizzaCodiceFiscale()+"  con campo = " + 17);
		assertEquals(cliente.VisualizzaEta(), 17);
	}

	@Test
	void test2VisualizzaEtaCliente() throws DipendenteException {
		System.out.println("test visualizza l'età del cliente: "+cliente2.VisualizzaCodiceFiscale()+"  con campo vuoto");
		assertEquals(cliente2.VisualizzaEta(), 0);
	}

	@Test
	void testVisualizzaGenereCliente() throws DipendenteException {
		System.out.println("test visualizza il genere del cliente: "+cliente.VisualizzaCodiceFiscale()+" con campo = " + "femmina");
		assertEquals(cliente.VisualizzaGenere(), ConstantGlobal.GENERE.FEMMINA);
	}

	@Test
	void test2VisualizzaGenereCliente() throws DipendenteException {
		System.out.println("test visualizza il genere del cliente: "+cliente2.VisualizzaCodiceFiscale()+" con campo = " + null);
		assertEquals(cliente2.VisualizzaGenere(), null);

	}

	@Test
	void testVisualizzaDataNascitaCliente() throws DipendenteException {
		System.out.println("test visualizza la data di nascita del cliente:  "+cliente.VisualizzaCodiceFiscale()+"  con campo = " + "18/12/2000");
		assertEquals(cliente.VisualizzaDataNascita(), "18/12/2000");
	}

	@Test
	void test2VisualizzaDataNascitaCliente() throws DipendenteException {
		System.out.println("test visualizza la data di nascita del cliente:  "+cliente2.VisualizzaCodiceFiscale()+" con campo = " + null);
		assertEquals(cliente2.VisualizzaDataNascita(), null);
	}

	@Test
	void testVisualizzaCittaCliente() throws DipendenteException {
		System.out.println("test visualizza la città del cliente: "+cliente.VisualizzaCodiceFiscale()+" e con campo = " + "Bari");
		assertEquals(cliente.VisualizzaCitta(), "Bari");
	}

	@Test
	void test2VisualizzaCittaCliente() throws DipendenteException {
		System.out.println("test visualizza la città del cliente: "+cliente2.VisualizzaCodiceFiscale()+"  con campo = " + null);
		assertEquals(cliente2.VisualizzaCitta(), null);
	}

	
	@Test
	void testNomeCartaFedeltaCliente() throws DipendenteException {
		System.out.println("test visualizza il nome della carta fedeltà del cliente: "+cliente.VisualizzaCodiceFiscale()+" e con campo = fincons group" );
		assertEquals(cliente.VisualizzaNomeCartaFedelta(), "Fincons Group");
	}

	@Test
	void test2NomeCartaFedeltaCliente() throws DipendenteException {
		System.out.println("test visualizza il numero carta del cliente: "+cliente2.VisualizzaCodiceFiscale()+"  con campo = " + null);
		assertEquals(cliente2.VisualizzaNomeCartaFedelta(), null);
	}

	
	@Test
	void testPuntiFedeltaAccumulatiCliente() throws DipendenteException {
		System.out.println("test visualizza i punti accumulati sulla carta fedeltà del cliente: "+cliente.VisualizzaCodiceFiscale()+" e con campo = 230" );
		assertEquals(cliente.VisualizzaPuntiFedeltaAccumulati(), "230");
	}

	@Test
	void test2PuntiFedeltaAccumulatiCliente() throws DipendenteException {
		System.out.println("test visualizza  i punti accumulati sulla carta del cliente: "+cliente2.VisualizzaCodiceFiscale()+"  con campo = " + null);
		assertEquals(cliente2.VisualizzaPuntiFedeltaAccumulati(), null);
	}

	@Test
	void testDataInscrizioneTesseraCliente() throws DipendenteException {
		System.out.println("test visualizza la data di inscirzione della carta fedeltà del cliente: "+cliente.VisualizzaCodiceFiscale()+" e con campo = 13/12/2020" );
		assertEquals(cliente.VisualizzaDataInscrizioneTessera(), "13/12/2020");
	}

	@Test
	void test2DataInscrizioneTesseraCliente() throws DipendenteException {
		System.out.println("test visualizza la data di inscirzione della carta del cliente: "+cliente2.VisualizzaCodiceFiscale()+"  con campo = " + null);
		assertEquals(cliente2.VisualizzaDataInscrizioneTessera(), null);
	}

	@Test
	void test1NumeroCartaFedeltaCliente()  throws DipendenteException {
		System.out.println("test visualizza il numero della carta del cliente: "+cliente2.VisualizzaCodiceFiscale()+"  con campo = " + null);
		assertEquals(cliente2.VisualizzaNumeroCartaFedelta(), null);
	}

	@Test
	void testVisualizzatipologiaContrattoDipendente() {
		try {
			System.out.println("test errore visualizza la tipologia di contratto del dipendente ");
			assertEquals(cliente.visualizzatipologiaContrattoDipendente(), null);
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testVisualizzaNumeroTelefonoAziendaleDipendente() {
		try {
			System.out.println("test errore visualizza il numero aziendale del dipendente ");
			assertEquals(cliente.visualizzaNumeroTelefonoAziendaleDipendente(), null);
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2VisualizzaEmailAziendaleDipendente() {
		try {
			System.out.println("test errore visualizza l'email aziendale del dipendente ");
			assertEquals(cliente.visualizzaEmailAziendaleDipendente(), null);
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testVisualizzaNomeAziendaDipendente() {
		try {
			System.out.println("test errore visualizza il nome dell'azienda del dipendente ");
			assertEquals(cliente.visualizzaNomeAziendaDipendente(), null);
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testVisualizzaRuoloDipendente() {
		try {
			System.out.println("test errore visualizza il ruolo del dipendente ");
			assertEquals(cliente.visualizzaRuoloDipendente(), null);
		} catch (ClienteException e) {
			System.err.println(e.getMessage());
		}

	}
	
}
