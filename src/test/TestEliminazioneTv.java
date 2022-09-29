package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreAvanzato;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.PojoTelevisore.TelevisoreMedio;
import Cecinato_cs2022.TelevisoreService.Televisore;

class TestEliminazioneTv {

	private static Televisore tvBase;
	private static Televisore tvMedio;
	private static Televisore tvAvanzato;
	private static BigInteger serial = new BigInteger("100000000000");

	@BeforeAll
	public static void inizializzaMeotodi() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		tvBase = new TelevisoreBase(String.valueOf(serial));
		serial = serial.add(BigInteger.valueOf(1));
		tvMedio = new TelevisoreMedio(String.valueOf(serial));
		serial = serial.add(BigInteger.valueOf(1));
		tvAvanzato = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("Test Aggiunta Marca = lg");
		tvBase.addTelevisoreBase(tvBase, "lg", "42.04", "60.42", "160.34", "hd", "OLED");
		tvMedio.addTelevisoreMedio(tvMedio, "lg", "42.04", "60.42", "160.34", "hd", "OLED", "2");
		tvAvanzato.addTelevisoreAvanzato(tvAvanzato, "lg", "42.04", "60.42", "160.34", "hd", "OLED", "1", "1", "1");
	}

	@Test
	void testEliminaMarcaTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della marca di tipo base");
		assertTrue(tvBase.eliminaMarcaTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2EliminaMarcaTvBase() {
		try {
			System.out.println("Test sull'eliminzazione della marca di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaMarcaTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaMarcaTvMedio() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della marca tv di tipo medio");
		assertTrue(tvMedio.eliminaMarcaTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2EliminaMarcaTvMedio() {
		try {
			System.out.println("Test sull'eliminzazione della marca della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaMarcaTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaMarcaTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della marca tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaMarcaTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2EliminaMarcaTvAvanzato() {
		try {
			System.out.println("Test sull'eliminzazione della marca della tv di tipo avanzato con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaMarcaTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaAltezzaTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione dell'altezza tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaAltezzaTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2EliminaAltezzaTvAvanzato() {
		try {
			System.out.println("Test sull'eliminzazione dell' altezza della tv di tipo avanzato  con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaAltezzaTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaAltezzaTvMedio() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione dell'altezza tv di tipo base");
		assertTrue(tvMedio.eliminaAltezzaTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2EliminaAltezzaTvMedio() {
		try {
			System.out.println("Test sull'eliminzazione dell'altezza della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaAltezzaTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaAltezzaTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione dell'altezza di tipo base");
		assertTrue(tvBase.eliminaAltezzaTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2EliminaAltezzaTvBase() {
		try {
			System.out.println("Test sull'eliminzazione della marca di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaAltezzaTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaLarghezzaTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della larghezza tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaLarghezzaTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2EliminaLarghezzaTvAvanzato() {
		try {
			System.out
					.println("Test sull'eliminzazione della Larghezza della tv di tipo avanzato  con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaLarghezzaTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaLarghezzaTvMedio() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della Larghezza tv di tipo base");
		assertTrue(tvMedio.eliminaLarghezzaTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2EliminaLarghezzaTvMedio() {
		try {
			System.out.println("Test sull'eliminzazione della Larghezza della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaLarghezzaTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaLarghezzaTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della Larghezza di tipo base");
		assertTrue(tvBase.eliminaLarghezzaTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2EliminaLarghezzaTvBase() {
		try {
			System.out.println("Test sull'eliminzazione della larghezza di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaLarghezzaTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaNumberHdmiTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del numero di hdmi della tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaNumberHdmiTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2EliminaNumberHdmiTvAvanzato() {
		try {
			System.out.println(
					"Test sull'eliminzazione del numero di hdmi della della tv di tipo avanzato  con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaNumberHdmiTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaNumberHdmiTMedio()  {
		System.out.println("Test sull'eliminzazione del numero di hdmi della tv di tipo base");
		assertFalse(tvMedio.eliminaNumberHdmiTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2EliminaNumberHdmiTvMedio() {
		try {
			System.out.println(
					"Test sull'eliminzazione del numero di hdmi della della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaNumberHdmiTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaNumberHdmiTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del numero di hdmi della di tipo base");
		assertFalse(tvBase.eliminaNumberHdmiTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2EliminaNumberHdmiTvBase() {
		try {
			System.out.println("Test sull'eliminzazione  del numero di hdmi di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaNumberHdmiTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}
	
	@Test
	void testeliminaNumberUsbTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del numero di usb della tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaNumberUsbTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2eliminaNumberUsbTvAvanzato() {
		try {
			System.out.println(
					"Test sull'eliminzazione del numero di usb della  tv di tipo avanzato  con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaNumberUsbTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaNumberUsbTvMedio()  {
		System.out.println("Test sull'eliminzazione del numero di usb della tv di tipo base");
		assertTrue(tvMedio.eliminaNumberUsbTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2eliminaNumberUsbTvMedio() {
		try {
			System.out.println(
					"Test sull'eliminzazione del numero di usb della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaNumberUsbTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaNumberUsbTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del numero di usb  di tipo base");
		assertFalse(tvBase.eliminaNumberUsbTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2eliminaNumberUsbTvBase() {
		try {
			System.out.println("Test sull'eliminzazione  del numero di usb di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaNumberUsbTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}
	
	@Test
	void testeliminaDiagonaleTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della diagonale tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaDiagonaleTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2eliminaDiagonaleTvAvanzato() {
		try {
			System.out
					.println("Test sull'eliminzazione della diagonale della tv di tipo avanzato  con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaDiagonaleTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaDiagonaleTvMedio() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della diagonale tv di tipo base");
		assertTrue(tvMedio.eliminaDiagonaleTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2eliminaDiagonaleTvMedio() {
		try {
			System.out.println("Test sull'eliminzazione della diagonale della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaDiagonaleTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaDiagonaleTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della diagonale di tipo base");
		assertTrue(tvBase.eliminaDiagonaleTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2eliminaDiagonaleTvBase() {
		try {
			System.out.println("Test sull'eliminzazione della diagonale di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaDiagonaleTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}
	
	@Test
	void testEliminaeliminaNumberSmartTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del numero di smart tv della tv di tipo avanzato");
		assertTrue(tvAvanzato. eliminaNumberSmartTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2EliminaeliminaNumberSmartTvAvanzato() {
		try {
			System.out.println(
					"Test sull'eliminzazione del numero di smart tv  tipo avanzato  con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2. eliminaNumberSmartTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaeliminaNumberSmartTvMedio()  {
		System.out.println("Test sull'eliminzazione del numero di smart tv della tv di tipo base");
		assertFalse(tvMedio. eliminaNumberSmartTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2EliminaeliminaNumberSmartTvMedio() {
		try {
			System.out.println(
					"Test sull'eliminzazione del numero di smart tv  della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2. eliminaNumberSmartTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testEliminaeliminaNumberSmartTvBase() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del numero di smart tv  di tipo base");
		assertFalse(tvBase.eliminaNumberSmartTv(tvBase));
		System.out.println(tvBase);

	}

	@Test
	void test2eliminaNumberSmartTvTvBase() {
		try {
			System.out.println("Test sull'eliminzazione  del numero di smart tv di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaNumberSmartTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}
	
	@Test
	void test2eliminaRisoluzioneTvBase() {
		try {
			System.out.println("Test sull'eliminzazione della risoluzione di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaRisoluzioneTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaRisoluzioneTvMedio() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della risoluzione tv di tipo medio");
		assertTrue(tvMedio.eliminaRisoluzioneTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2eliminaRisoluzioneTvMedio() {
		try {
			System.out.println("Test sull'eliminzazione della risoluzione della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaRisoluzioneTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaRisoluzioneTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione della risoluzione tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaRisoluzioneTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2eliminaRisoluzioneTvAvanzato() {
		try {
			System.out.println("Test sull'eliminzazione della risoluzione della tv di tipo avanzato con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaRisoluzioneTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}


	@Test
	void test2eliminaTiposchermoTvBase() {
		try {
			System.out.println("Test sull'eliminzazione del tipo di schermo della tv  di tipo base con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
			System.out.println(tvBase2);
			assertFalse(tvBase2.eliminaTiposchermoTv(tvBase2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaTiposchermoTvMedio() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del tipo di schermo della tv di tipo medio");
		assertTrue(tvMedio.eliminaTiposchermoTv(tvMedio));
		System.out.println(tvMedio);

	}

	@Test
	void test2eliminaTiposchermoTvMedio() {
		try {
			System.out.println("Test sull'eliminzazione del tipo di schermo della tv di tipo medio con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
			System.out.println(tvMedio2);
			assertFalse(tvMedio2.eliminaTiposchermoTv(tvMedio2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

	@Test
	void testeliminaTiposchermoTvAvanzato() throws TelevisoreException {
		System.out.println("Test sull'eliminzazione del tipo di schermo della tv di tipo avanzato");
		assertTrue(tvAvanzato.eliminaTiposchermoTv(tvAvanzato));
		System.out.println(tvAvanzato);

	}

	@Test
	void test2eliminaTiposchermoTvAvanzato() {
		try {
			System.out.println("Test sull'eliminzazione del tipo di schermo della tv di tipo avanzato con valore già nullo");
			serial = serial.add(BigInteger.valueOf(1));
			Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
			System.out.println(tvAvanzato2);
			assertFalse(tvAvanzato2.eliminaTiposchermoTv(tvAvanzato2));
		} catch (TelevisoreException e) {
			System.err.println(e.getMessage().concat("\n"));
		}
	}

}


