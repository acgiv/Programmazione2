package testTelevisore;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.*;
import Cecinato_cs2022.TelevisoreService.Televisore;

class TestAcquisizioneTelevisore {

	private static BigInteger serial = new BigInteger("100000000000");

	@Test
	public void test1MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tv.addMarcaTv("AMAZON"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tv.addMarcaTv("Amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tv.addMarcaTv("amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("Test Aggiunta Marca =  ' amazon '");
		assertTrue(tv.addMarcaTv(" amazon "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = amazon1");
		assertFalse(tv.addMarcaTv("amazon1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = ama zon");
		assertFalse(tv.addMarcaTv("ama zon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della marca");
		assertTrue(tv.addMarcaTv("amazon"));
		assertFalse(tv.addMarcaTv("amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento valore nullo");
		assertFalse(tv.addMarcaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tv.addMarcaTv("AMAZON"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tv.addMarcaTv("Amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tv.addMarcaTv("amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tv.addMarcaTv(" amazon "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tv.addMarcaTv("amazon1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = ama zon");
		assertFalse(tv.addMarcaTv("ama zon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della marca");
		assertTrue(tv.addMarcaTv("amazon"));
		assertFalse(tv.addMarcaTv("amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento valore nullo");
		assertFalse(tv.addMarcaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tv.addMarcaTv("AMAZON"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tv.addMarcaTv("Amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tv.addMarcaTv("amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tv.addMarcaTv(" amazon "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tv.addMarcaTv("amaozon1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tv.addMarcaTv("ama zon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della marca");
		assertTrue(tv.addMarcaTv("amazon"));
		assertFalse(tv.addMarcaTv("amazon"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento valore nullo");
		assertFalse(tv.addMarcaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tv.addRisoluzioneTv("FULL HD"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		assertTrue(tv.addRisoluzioneTv("Full Hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = full hd");
		assertTrue(tv.addRisoluzioneTv("full hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertTrue(tv.addRisoluzioneTv(" full hd "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		assertFalse(tv.addRisoluzioneTv("hd1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = h d ");
		assertFalse(tv.addRisoluzioneTv("h d"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Risoluzione");
		assertTrue(tv.addRisoluzioneTv("hd"));
		assertFalse(tv.addRisoluzioneTv("hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tv.addRisoluzioneTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1RisoluzioneTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tv.addRisoluzioneTv("FULL HD"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2RisoluzioneTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		assertTrue(tv.addRisoluzioneTv("Full Hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3RisoluzioneTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = full hd");
		assertTrue(tv.addRisoluzioneTv("full hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4RisoluzioneTelevisoreMedio() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertTrue(tv.addRisoluzioneTv(" full hd "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5RisoluzioneTelevisoreMedio() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		assertFalse(tv.addRisoluzioneTv("hd1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6RisoluzioneTelevisoreMedio() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = h d ");
		assertFalse(tv.addRisoluzioneTv("h d"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7RisoluzioneTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Risoluzione");
		assertTrue(tv.addRisoluzioneTv("hd"));
		assertFalse(tv.addRisoluzioneTv("hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8RisoluzioneTelevisoreMedio() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tv.addRisoluzioneTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1RisoluzioneTelevisoreAvanzato() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tv.addRisoluzioneTv("FULL HD"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2RisoluzioneTelevisoreAvanzato() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		assertTrue(tv.addRisoluzioneTv("Full Hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3RisoluzioneTelevisoreAvanzato() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = full hd");
		assertTrue(tv.addRisoluzioneTv("full hd"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4RisoluzioneTelevisoreAvanzato() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertTrue(tv.addRisoluzioneTv(" full hd "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5RisoluzioneTelevisoreAvanzato() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		assertFalse(tv.addRisoluzioneTv("hd1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Risoluzione = h d ");
		assertFalse(tv.addRisoluzioneTv("h d"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio della Risoluzione");
		assertTrue(tv.addRisoluzioneTv("hd"));
		assertFalse(tv.addRisoluzioneTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tv.addRisoluzioneTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tv.addTiposchermoTv("CRT"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tv.addTiposchermoTv("Crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tv.addTiposchermoTv("crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertTrue(tv.addTiposchermoTv(" crt "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tv.addTiposchermoTv("crt1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tv.addTiposchermoTv("cr t"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Tiposchermo");
		assertTrue(tv.addTiposchermoTv("CRT"));
		assertFalse(tv.addTiposchermoTv("CRT"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test  inserimento della Tiposchermo = null");
		assertFalse(tv.addTiposchermoTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tv.addTiposchermoTv("CRT"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tv.addTiposchermoTv("Crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tv.addTiposchermoTv("crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertTrue(tv.addTiposchermoTv(" crt "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tv.addTiposchermoTv("crt1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tv.addTiposchermoTv("cr t"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Tiposchermo");
		assertTrue(tv.addTiposchermoTv("crt"));
		assertFalse(tv.addTiposchermoTv("crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test inserimento della Tiposchermo con valore nullo");
		assertFalse(tv.addTiposchermoTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tv.addTiposchermoTv("CRT"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tv.addTiposchermoTv("Crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tv.addTiposchermoTv("crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertTrue(tv.addTiposchermoTv(" crt "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tv.addTiposchermoTv("crt1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tv.addTiposchermoTv("cr t"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Tiposchermo");
		assertTrue(tv.addTiposchermoTv("crt"));
		assertFalse(tv.addTiposchermoTv("crt"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della tipologia di  schemo con valore nullo");
		assertFalse(tv.addTiposchermoTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento dell' altezza");
		assertTrue(tv.addAltezzaTv("25.00"));
		assertFalse(tv.addAltezzaTv("25.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di 24.09");
		assertTrue(tv.addAltezzaTv("25.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tv.addAltezzaTv("23.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tv.addAltezzaTv("24.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tv.addAltezzaTv("-24.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tv.addAltezzaTv("+24.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tv.addAltezzaTv("+28&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertTrue(tv.addAltezzaTv(" 28.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tv.addAltezzaTv("28,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tv.addAltezzaTv("124.07"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11AltezzaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tv.addAltezzaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento dell' altezza");
		assertTrue(tv.addAltezzaTv("120.0"));
		assertFalse(tv.addAltezzaTv("120.0"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tv.addAltezzaTv("25.0"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tv.addAltezzaTv("23.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tv.addAltezzaTv("24.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = -24.09");
		assertFalse(tv.addAltezzaTv("-24.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tv.addAltezzaTv("+24.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tv.addAltezzaTv("+28&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertTrue(tv.addAltezzaTv(" 28.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tv.addAltezzaTv("28,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tv.addAltezzaTv("127.02"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tv.addAltezzaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento dell' altezza");
		assertTrue(tv.addAltezzaTv("40.00"));
		assertFalse(tv.addAltezzaTv("40.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di 24.09");
		assertTrue(tv.addAltezzaTv("40.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tv.addAltezzaTv("23.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tv.addAltezzaTv("24.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tv.addAltezzaTv("-24.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tv.addAltezzaTv("+24.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tv.addAltezzaTv("+28&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertTrue(tv.addAltezzaTv(" 28.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tv.addAltezzaTv("28,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tv.addAltezzaTv("127"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tv.addAltezzaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Larghezza");
		assertTrue(tv.addLarghezzaTv("45.00"));
		assertFalse(tv.addLarghezzaTv("45.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tv.addLarghezzaTv("45.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tv.addLarghezzaTv("41.23"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tv.addLarghezzaTv("45.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tv.addLarghezzaTv("-45.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tv.addLarghezzaTv("+45.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tv.addLarghezzaTv("+45&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertTrue(tv.addLarghezzaTv(" 45.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tv.addLarghezzaTv("45,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tv.addLarghezzaTv("225.23"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore nullo");
		assertFalse(tv.addLarghezzaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Larghezza");
		assertTrue(tv.addLarghezzaTv("45.23"));
		assertFalse(tv.addLarghezzaTv("45.23"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tv.addLarghezzaTv("45.23"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tv.addLarghezzaTv("41.23"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tv.addLarghezzaTv("45.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tv.addLarghezzaTv("-45.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tv.addLarghezzaTv("+45.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tv.addLarghezzaTv("+45&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertTrue(tv.addLarghezzaTv(" 45.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tv.addLarghezzaTv("45,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tv.addLarghezzaTv("225"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11LarghezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tv.addLarghezzaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Larghezza");
		assertTrue(tv.addLarghezzaTv("45.24"));
		assertFalse(tv.addLarghezzaTv("45.24"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tv.addLarghezzaTv("45.03"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tv.addLarghezzaTv("41.03"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tv.addLarghezzaTv("45.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tv.addLarghezzaTv("-45.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tv.addLarghezzaTv("+45.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tv.addLarghezzaTv("+45&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertTrue(tv.addLarghezzaTv(" 45.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tv.addLarghezzaTv("45,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tv.addLarghezzaTv("225.02"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore  nullo ");
		assertFalse(tv.addLarghezzaTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Diagonale");
		assertTrue(tv.addDiagonaleTv("52.00"));
		assertFalse(tv.addDiagonaleTv("52.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tv.addDiagonaleTv("52.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tv.addDiagonaleTv("30.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tv.addDiagonaleTv("51.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tv.addDiagonaleTv("-51.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tv.addDiagonaleTv("+51.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");		
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tv.addDiagonaleTv("+51&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertTrue(tv.addDiagonaleTv(" 51.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tv.addDiagonaleTv("51,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tv.addDiagonaleTv("255.0"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11DiagonaleTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore nullo");
		assertFalse(tv.addDiagonaleTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Diagonale");
		assertTrue(tv.addDiagonaleTv("251.0"));
		assertFalse(tv.addDiagonaleTv("251.0"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tv.addDiagonaleTv("52.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tv.addDiagonaleTv("50.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tv.addDiagonaleTv("51.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tv.addDiagonaleTv("-51.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tv.addDiagonaleTv("+51.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tv.addDiagonaleTv("+51&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertTrue(tv.addDiagonaleTv(" 51.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tv.addDiagonaleTv("51,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tv.addDiagonaleTv("255.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tv.addDiagonaleTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento della Diagonale");
		assertTrue(tv.addDiagonaleTv("60.00"));
		assertFalse(tv.addDiagonaleTv("60.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tv.addDiagonaleTv("52.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tv.addDiagonaleTv("50.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tv.addDiagonaleTv("51.09a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tv.addDiagonaleTv("-51.09"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tv.addDiagonaleTv("+51.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tv.addDiagonaleTv("+51&.10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertTrue(tv.addDiagonaleTv(" 51.10 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tv.addDiagonaleTv("51,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tv.addDiagonaleTv("255.00"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");

	}

	@Test
	public void test11DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tv.addDiagonaleTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");

	}

	@Test
	public void test1NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento del numeroHdmi");
		assertTrue(tv.addNumberHdmiTv("1"));
		assertFalse(tv.addNumberHdmiTv("1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi che deve essere maggiore di: "
				+ ConstantGlobal.NUM_MINIMO_HDMI + " ed uaguale ad :" + ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		assertTrue(tv.addNumberHdmiTv("1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi che deve essere uguale a = 0.5");
		assertFalse(tv.addNumberHdmiTv("0.5"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore = 1a");
		assertFalse(tv.addNumberHdmiTv("1a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore = -1");
		assertFalse(tv.addNumberHdmiTv("-1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore = +1");
		assertTrue(tv.addNumberHdmiTv("+1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore = +1&");
		assertFalse(tv.addNumberHdmiTv("1&"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8NumberHdmiTelevisoreAvanzato() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento del numero hdmi con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertTrue(tv.addNumberHdmiTv(" 1 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore = 1,10 ");
		assertFalse(tv.addNumberHdmiTv("1,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		assertFalse(tv.addNumberHdmiTv("2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test12NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero hdmi con valore nullo");
		assertFalse(tv.addNumberHdmiTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento del numero hdmi");
		assertTrue(tv.addNumberUsbTv("2"));
		assertFalse(tv.addNumberUsbTv("2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertTrue(tv.addNumberUsbTv("2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertFalse(tv.addNumberUsbTv("-2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 2a");
		assertFalse(tv.addNumberUsbTv("1a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		assertFalse(tv.addNumberUsbTv("-2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +2");
		assertTrue(tv.addNumberUsbTv("+2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +2&");
		assertFalse(tv.addNumberUsbTv("+1&"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 2 '");
		assertFalse(tv.addNumberUsbTv(" 1 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 2,5 ");
		assertFalse(tv.addNumberUsbTv("2,5"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tv.addNumberUsbTv("3"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore nullo");
		assertFalse(tv.addNumberUsbTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento del numero hdmi");
		assertTrue(tv.addNumberUsbTv("1"));
		assertFalse(tv.addNumberUsbTv("1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertTrue(tv.addNumberUsbTv("1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertFalse(tv.addNumberUsbTv("-1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 1a");
		assertFalse(tv.addNumberUsbTv("1a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = = -1");
		assertFalse(tv.addNumberUsbTv("-1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +1");
		assertTrue(tv.addNumberUsbTv("+1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("Test di'inserimento del numero usb con valore = +1&");
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		assertFalse(tv.addNumberUsbTv("+1&"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertTrue(tv.addNumberUsbTv(" 1 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");
		assertFalse(tv.addNumberUsbTv("1,5"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		assertFalse(tv.addNumberUsbTv("3"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb con valore nullo");
		assertFalse(tv.addNumberUsbTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1NumberUsbTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del numero usb ");
		assertFalse(tv.addNumberUsbTv("2"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test1NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test doppio inserimento del numero smart tv");
		assertTrue(tv.addNumberSmartTv("1"));
		assertFalse(tv.addNumberSmartTv("1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test2NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato("123456789113");
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_SMART_TV);
		assertTrue(tv.addNumberSmartTv("1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test3NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv che deve essere minore di  0.5");
		assertFalse(tv.addNumberSmartTv("0.5"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test4NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1a");
		assertFalse(tv.addNumberSmartTv("1a"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test5NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = -1");
		assertFalse(tv.addNumberSmartTv("-1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test6NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1");
		assertTrue(tv.addNumberSmartTv("+1"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test7NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1&");
		assertFalse(tv.addNumberSmartTv("+1&"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test8NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println(
				"\"Test di'inserimento del  numero smart tv con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertTrue(tv.addNumberSmartTv(" 1 "));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test9NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1,10 ");
		assertFalse(tv.addNumberSmartTv("1,10"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test10NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
		assertFalse(tv.addNumberSmartTv("3"));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

	@Test
	public void test11NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test\n");
		System.out.println(tv + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore nullo");
		assertFalse(tv.addNumberSmartTv(null));
		System.out.println("\n dopo del test\n");
		System.out.println(tv + "\n");
	}

}
