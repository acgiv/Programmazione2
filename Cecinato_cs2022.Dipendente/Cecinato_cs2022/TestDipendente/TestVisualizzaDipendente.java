package Cecinato_cs2022.TestDipendente;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.Dipendente.Dipendente;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

class TestVisualizzaDipendente {

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
		}
	}

	@AfterEach
	void stampaPrimaTest() {
		System.out.println("\n dopo il test");
		System.out.println(dipendente + "\n");
		System.out.println(dipendente2 + "\n");
	}

	@BeforeEach()
	void stampaDopoTest() {
		System.out.println("\n prima del test");
		System.out.println(dipendente + "\n");
		System.out.println(dipendente2 + "\n");
	}

	@Test
	void testvisualizzanomeDipendente() throws PersonaException {
		System.out.println("test su visualizzazione nome del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" = ad: " + "Mario");
		assertEquals(dipendente.VisualizzaNome(), "Mario");
	}

	@Test
	void test2visualizzanomeDipendente() throws PersonaException {
		System.out.println("test su visualizzazione nome del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" = ad: " + null);
		assertEquals(dipendente2.VisualizzaNome(), null);
	}

	@Test
	void testVisualizzaCognomeDipendente() throws PersonaException {
		System.out.println("test visualizza il cognome del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" con campo = " + "Rossi");
		assertEquals(dipendente.VisualizzaCognome(), "Rossi");
	}

	@Test
	void test2VisualizzaCognomeDipendente() throws PersonaException {
		System.out.println("test visualizza il cognome del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" con campo = " + null);
		assertEquals(dipendente2.VisualizzaCognome(), null);
	}

	@Test
	void testVisualizzaEtaDipendente() throws PersonaException {
		System.out.println("test visualizza l'età del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" con campo = " + 17);
		assertEquals(dipendente.VisualizzaEta(), 17);
	}

	@Test
	void test2VisualizzaEtaDipendente() throws PersonaException {
		System.out.println("test visualizza l'età del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" con campo vuoto");
		assertEquals(dipendente2.VisualizzaEta(), 0);
	}

	@Test
	void testVisualizzaGenereDipendente() throws PersonaException {
		System.out.println("test visualizza il genere del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" con campo = " + "femmina");
		assertEquals(dipendente.VisualizzaGenere(), ConstantGlobal.GENERE.FEMMINA);
	}

	@Test
	void test2VisualizzaGenereDipendente() throws PersonaException {

		System.out.println("test visualizza il genere del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" con campo = " + null);
		assertEquals(dipendente2.VisualizzaGenere(), null);

	}

	@Test
	void testVisualizzaDataNascitaDipendente() throws PersonaException {
		System.out.println("test visualizza la data di nascita del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" con campo = " + "18/12/2000");
		assertEquals(dipendente.VisualizzaDataNascita(), "18/12/2000");
	}

	@Test
	void test2VisualizzaDataNascitaDipendente() throws PersonaException {
		System.out.println("test visualizza la data di nascita del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" con campo = " + null);
		assertEquals(dipendente2.VisualizzaDataNascita(), null);
	}

	@Test
	void testVisualizzaCittaDipendente() throws PersonaException {
		System.out.println("test visualizza la città del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" con campo = " + "Bari");
		assertEquals(dipendente.VisualizzaCitta(), "Bari");
	}

	@Test
	void test2VisualizzaCittaDipendente() throws PersonaException {
		System.out.println("test visualizza la città del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" con campo = " + null);
		assertEquals(dipendente2.VisualizzaCitta(), null);
	}

	@Test
	void testVisualizzaNomeAziendaDipendente() {
		try {
			System.out.println("test visualizza il nome dell'azienda dove lavora il dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" con campo = " + "Fincons");
			assertEquals(dipendente.visualizzaNomeAziendaDipendente(), "Fincons");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2VisualizzaNomeAziendaDipendente() {
		try {
			System.out.println("test visualizza il nome dell'azienda dove lavora il dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" con campo = " + null);
			assertEquals(dipendente2.visualizzaNomeAziendaDipendente(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testVisualizzaEmailAziendaleDipendente() {
		try {
			System.out.println(
					"test visualizza l'email del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" dell'azienda con campo = " + "mariorossi@fincons.com");
			assertEquals(dipendente.visualizzaEmailAziendaleDipendente(), "mariorossi@fincons.com");

		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void test2VisualizzaEmailAziendaleDipendente() {
		try {
			System.out
					.println("test visualizza l'email del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" dell'azienda del dipendente con campo = " + null);
			assertEquals(dipendente2.visualizzaEmailAziendaleDipendente(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testVisualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException {

		System.out.println(
				"test visualizza il numero telefonico del  dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" dell'azienda con campo = " + "+39 3453636348");
		try {
			assertEquals(dipendente.visualizzaNumeroTelefonoAziendaleDipendente(), "+39 3453636348");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}



	
	@Test
	void test2VisualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException{
		System.out.println(
				"test visualizza il numero telefonico del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" dell'azienda del dipendente con campo = " + null);
		try {
			assertEquals(dipendente2.visualizzaNumeroTelefonoAziendaleDipendente(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}

	@Test
	void testVisualizzatipologiaContrattoDipendente() throws PersonaException {
		System.out.println("test visualizza la tipologia di contratto del dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" dell'azienda con campo = "
				+ String.valueOf(ConstantGlobal.TIPO_CONTRATTO.DETERMINATO));
		try {
			assertEquals(dipendente.visualizzatipologiaContrattoDipendente(),
					ConstantGlobal.TIPO_CONTRATTO.DETERMINATO);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}

	@Test
	void test2VisualizzatipologiaContrattoDipendente() throws PersonaException {
		System.out.println(
				"test visualizza la tipologia di contratto del dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" dell'azienda del dipendente con campo = "
						+ null);
		try {
			assertEquals(dipendente2.visualizzatipologiaContrattoDipendente(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}
	
	@Test
	void testVisualizzaRuoloDipendente() throws PersonaException {

		System.out.println(
				"test visualizza il ruolo del  dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" dell'azienda con campo = " + "Menager");
		try {
			assertEquals(dipendente.visualizzaRuoloDipendente(), "Menager");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}
	
	@Test
	void test2VisualizzaRuoloDipendente() throws PersonaException {
		System.out.println(
				"test visualizza il ruolo del  dipendente: "+ dipendente2.visualizzaCodiceIdentificativoDipendete()+" dell'azienda del dipendente con campo = "
						+ null);
		try {
			assertEquals(dipendente2.visualizzaRuoloDipendente(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}
	
	@Test
	void testVisualizzaCodiceIdentificativoDipendete() throws PersonaException {

		System.out.println(
				"test visualizza il codice identificativo del  dipendente: "+ dipendente.visualizzaCodiceIdentificativoDipendete()+" dell'azienda con campo = " + "123456789a");
		try {
			assertEquals(dipendente.visualizzaCodiceIdentificativoDipendete(), "123456789a");
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}
	

	@Test
	void testVisualizzaNomeCartaFedelta() {
		try {
			System.out.println("test errore visualizza nome carta fedeltà ");
			assertEquals(dipendente.VisualizzaNomeCartaFedelta(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testVisualizzaPuntiAccumulati() {
		System.out.println("test errore visualizza punti accumulati del cliente ");
		try {
			assertEquals(dipendente.VisualizzaPuntiFedeltaAccumulati(),null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}

	}

	@Test
	void testVisualizzaDataInscrizioneTessera() {
		System.out.println("test errore visualizza data inscrizione tessera cliente ");
		try {
			assertEquals(dipendente.VisualizzaDataInscrizioneTessera(),null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	void testVisualizzaNumeroCartaFedelta() {
		try {
			System.out.println("test errore visualizza numero carta fedeltà cliente ");
			assertEquals(dipendente.VisualizzaNumeroCartaFedelta(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testVisualizzaCodiceFiscale() {
		try {
			System.out.println("test errore visualizza il codice fiscale del cliente ");
			assertEquals(dipendente.VisualizzaCodiceFiscale(), null);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}
}
