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
		System.out.println("Test Aggiunta Marca = AMAZON");
		serial = serial.add( BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("AMAZON"));
	}

	@Test
	public void test2MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = Amazon");
		serial = serial.add( BigInteger.valueOf(1));
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addMarcaTv( "Amazon"));
	}

	@Test
	public void test3MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = amazon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("amazon"));
	}

	@Test
	public void test4MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca =  ' amazon '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( " amazon "));
	}

	@Test
	public void test5MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = amazon1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( "amazon1"));
	}

	@Test
	public void test6MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = ama zon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( "ama zon"));
	}

	@Test
	public void test7MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test doppio inserimento della marca");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addMarcaTv( "amazon"));
		assertFalse(tv.addMarcaTv( "amazon"));
	}

	@Test
	public void test8MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test inserimento valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( null));
	}

	@Test
	public void test1MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = AMAZON");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addMarcaTv( "AMAZON"));
	}

	@Test
	public void test2MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = Amazon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("Amazon"));
	}

	@Test
	public void test3MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = amazon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("amazon"));
	}

	@Test
	public void test4MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addMarcaTv(" amazon "));
	}

	@Test
	public void test5MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( "amazon1"));
	}

	@Test
	public void test6MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = ama zon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( "ama zon"));
	}

	@Test
	public void test7MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento della marca");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("amazon"));
		assertFalse(tv.addMarcaTv("amazon"));
	}

	@Test
	public void test8MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test inserimento valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( null));
	}

	@Test
	public void test1MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = AMAZON");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addMarcaTv( "AMAZON"));
	}

	@Test
	public void test2MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = Amazon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("Amazon"));
	}

	@Test
	public void test3MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = amazon");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("amazon"));
	}

	@Test
	public void test4MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addMarcaTv(" amazon "));
	}

	@Test
	public void test5MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addMarcaTv("amaozon1"));
	}

	@Test
	public void test6MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Marca = ama zon ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addMarcaTv("ama zon"));
	}

	@Test
	public void test7MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento della marca");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addMarcaTv("amazon"));
		assertFalse(tv.addMarcaTv( "amazon"));
	}

	@Test
	public void test8MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test inserimento valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addMarcaTv( null));
	}

	@Test
	public void test1RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv( "FULL HD"));
	}

	@Test
	public void test2RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv( "Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv( "full hd"));
	}

	@Test
	public void test4RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv( " full hd "));
	}

	@Test
	public void test5RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv( "hd1"));
	}

	@Test
	public void test6RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv( "h d"));
	}

	@Test
	public void test7RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Risoluzione");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv( "hd"));
		assertFalse(tv.addRisoluzioneTv( "hd"));
	}

	@Test
	public void test8RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv( null));
	}

	@Test
	public void test1RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("FULL HD"));
	}

	@Test
	public void test2RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("full hd"));
	}

	@Test
	public void test4RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv(" full hd "));
	}

	@Test
	public void test5RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv("hd1"));
	}

	@Test
	public void test6RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv("h d"));
	}

	@Test
	public void test7RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Risoluzione");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("hd"));
		assertFalse(tv.addRisoluzioneTv("hd"));
	}

	@Test
	public void test8RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv(null));
	}

	@Test
	public void test1RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv( "FULL HD"));
	}

	@Test
	public void test2RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("full hd"));
	}

	@Test
	public void test4RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv(" full hd "));
	}

	@Test
	public void test5RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv("hd1"));
	}

	@Test
	public void test6RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv("h d"));
	}

	@Test
	public void test7RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio della Risoluzione");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addRisoluzioneTv("hd"));
		assertFalse(tv.addRisoluzioneTv(null));
	}

	@Test
	public void test8RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addRisoluzioneTv(null));
	}

	@Test
	public void test1TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("CRT"));
	}

	@Test
	public void test2TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("Crt"));
	}

	@Test
	public void test3TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("crt"));
	}

	@Test
	public void test4TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv(" crt "));
	}

	@Test
	public void test5TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv("crt1"));
	}

	@Test
	public void test6TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv("cr t"));
	}

	@Test
	public void test7TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Tiposchermo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv( "CRT"));
		assertFalse(tv.addTiposchermoTv("CRT"));
	}

	@Test
	public void test8TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv(null));
	}

	@Test
	public void test1TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("CRT"));
	}

	@Test
	public void test2TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("Crt"));
	}

	@Test
	public void test3TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("crt"));
	}

	@Test
	public void test4TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv(" crt "));
	}

	@Test
	public void test5TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv("crt1"));
	}

	@Test
	public void test6TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv("cr t"));
	}

	@Test
	public void test7TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Tiposchermo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("crt"));
		assertFalse(tv.addTiposchermoTv("crt"));
	}

	@Test
	public void test8TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test inserimento della Tiposchermo con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv( null));
	}

	@Test
	public void test1TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("CRT"));
	}

	@Test
	public void test2TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("Crt"));
	}

	@Test
	public void test3TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("crt"));
	}

	@Test
	public void test4TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv(" crt "));
	}

	@Test
	public void test5TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv("crt1"));
	}

	@Test
	public void test6TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv("cr t"));
	}

	@Test
	public void test7TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Tiposchermo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addTiposchermoTv("crt"));
		assertFalse(tv.addTiposchermoTv("crt"));
	}

	@Test
	public void test8TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento della tipologia di  schemo con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addTiposchermoTv(null));
	}

	@Test
	public void test1AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test doppio inserimento dell' altezza");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("25.00"));
		assertFalse(tv.addAltezzaTv("25.00"));
	}

	@Test
	public void test2AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di 24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("25.00"));
	}

	@Test
	public void test3AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("23.00"));
	}

	@Test
	public void test4AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("24.09a"));
	}

	@Test
	public void test5AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("-24.09"));
	}

	@Test
	public void test6AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("+24.10"));
	}

	@Test
	public void test7AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("+28&.10"));
	}

	@Test
	public void test8AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv(" 28.10 "));
	}

	@Test
	public void test9AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("28,10"));
	}

	@Test
	public void test10AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("124.07"));
	}

	@Test
	public void test11AltezzaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv(null));
	}

	@Test
	public void test1AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento dell' altezza");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("120.0"));
		assertFalse(tv.addAltezzaTv("120.0"));
	}

	@Test
	public void test2AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("25.0"));
	}

	@Test
	public void test3AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("23.09"));
	}

	@Test
	public void test4AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("24.09a"));
	}

	@Test
	public void test5AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = -24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("-24.09"));
	}

	@Test
	public void test6AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("+24.10"));
	}

	@Test
	public void test7AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("+28&.10"));
	}

	@Test
	public void test8AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv(" 28.10 "));
	}

	@Test
	public void test9AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("28,10"));
	}

	@Test
	public void test10AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("127.02"));
	}

	@Test
	public void test11AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv(null));
	}

	@Test
	public void test1AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento dell' altezza");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("40.00"));
		assertFalse(tv.addAltezzaTv("40.00"));
	}

	@Test
	public void test2AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di 24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("40.00"));
	}

	@Test
	public void test3AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("23.00"));
	}

	@Test
	public void test4AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("24.09a"));
	}

	@Test
	public void test5AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("-24.09"));
	}

	@Test
	public void test6AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addAltezzaTv("+24.10"));
	}

	@Test
	public void test7AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("+28&.10"));
	}

	@Test
	public void test8AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv(" 28.10 "));
	}

	@Test
	public void test9AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("28,10"));
	}

	@Test
	public void test10AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv("127"));
	}

	@Test
	public void test11AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addAltezzaTv(null));
	}

	@Test
	public void test1LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Larghezza");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("45.00"));
		assertFalse(tv.addLarghezzaTv("45.00"));
	}

	@Test
	public void test2LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("45.00"));
	}

	@Test
	public void test3LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("41.23"));
	}

	@Test
	public void test4LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("45.09a"));
	}

	@Test
	public void test5LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("-45.09"));
	}

	@Test
	public void test6LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("+45.10"));
	}

	@Test
	public void test7LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("+45&.10"));
	}

	@Test
	public void test8LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv(" 45.10 "));
	}

	@Test
	public void test9LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("45,10"));
	}

	@Test
	public void test10LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("225.23"));
	}

	@Test
	public void test11LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv(null));
	}

	@Test
	public void test1LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Larghezza");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("45.23"));
		assertFalse(tv.addLarghezzaTv("45.23"));
	}

	@Test
	public void test2LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("45.23"));
	}

	@Test
	public void test3LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("41.23"));
	}

	@Test
	public void test4LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("45.09a"));
	}

	@Test
	public void test5LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("-45.09"));
	}

	@Test
	public void test6LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("+45.10"));
	}

	@Test
	public void test7LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("+45&.10"));
	}

	@Test
	public void test8LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv(" 45.10 "));
	}

	@Test
	public void test9LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("45,10"));
	}

	@Test
	public void test10LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("225"));
	}

	@Test
	public void test11LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv(null));
	}

	@Test
	public void test1LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Larghezza");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("45.24"));
		assertFalse(tv.addLarghezzaTv("45.24"));
	}

	@Test
	public void test2LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("45.03"));
	}

	@Test
	public void test3LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("41.03"));
	}

	@Test
	public void test4LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("45.09a"));
	}

	@Test
	public void test5LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("-45.09"));
	}

	@Test
	public void test6LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addLarghezzaTv("+45.10"));
	}

	@Test
	public void test7LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("+45&.10"));
	}

	@Test
	public void test8LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv(" 45.10 "));
	}

	@Test
	public void test9LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("45,10"));
	}

	@Test
	public void test10LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv("225.02"));
	}

	@Test
	public void test11LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Larghezza con valore  nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addLarghezzaTv(null));
	}

	@Test
	public void test1DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Diagonale");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("52.00"));
		assertFalse(tv.addDiagonaleTv("52.00"));
	}

	@Test
	public void test2DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("52.00"));
	}

	@Test
	public void test3DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("30.00"));
	}

	@Test
	public void test4DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("51.09a"));
	}

	@Test
	public void test5DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("-51.09"));
	}

	@Test
	public void test6DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("+51.10"));
	}

	@Test
	public void test7DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("+51&.10"));
	}

	@Test
	public void test8DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv(" 51.10 "));
	}

	@Test
	public void test9DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("51,10"));
	}

	@Test
	public void test10DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("255.0"));
	}

	@Test
	public void test11DiagonaleTelevisioreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv(null));
	}

	@Test
	public void test1DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Diagonale");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("251.0"));
		assertFalse(tv.addDiagonaleTv("251.0"));
	}

	@Test
	public void test2DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("52.00"));
	}

	@Test
	public void test3DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("50.00"));
	}

	@Test
	public void test4DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("51.09a"));
	}

	@Test
	public void test5DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("-51.09"));
	}

	@Test
	public void test6DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("+51.10"));
	}

	@Test
	public void test7DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("+51&.10"));
	}

	@Test
	public void test8DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv(" 51.10 "));
	}

	@Test
	public void test9DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("51,10"));
	}

	@Test
	public void test10DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("255.00"));
	}

	@Test
	public void test11DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv(null));
	}

	@Test
	public void test1DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento della Diagonale");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("60.00"));
		assertFalse(tv.addDiagonaleTv("60.00"));
	}

	@Test
	public void test2DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("52.00"));
	}

	@Test
	public void test3DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("50.00"));
	}

	@Test
	public void test4DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("51.09a"));
	}

	@Test
	public void test5DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("-51.09"));
	}

	@Test
	public void test6DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addDiagonaleTv("+51.10"));
	}

	@Test
	public void test7DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("+51&.10"));
	}

	@Test
	public void test8DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv(" 51.10 "));
	}

	@Test
	public void test9DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("51,10"));
	}

	@Test
	public void test10DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv("255.00"));

	}

	@Test
	public void test11DiagonaleTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addDiagonaleTv(null));

	}

	@Test
	public void test1NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento del numeroHdmi");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberHdmiTv("1"));
		assertFalse(tv.addNumberHdmiTv("1"));
	}

	@Test
	public void test2NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi che deve essere maggiore di: "
				+ ConstantGlobal.NUM_MINIMO_HDMI + " ed uaguale ad :" + ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberHdmiTv("1"));
	}

	@Test
	public void test3NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi che deve essere uguale a = 0.5");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv("0.5"));
	}

	@Test
	public void test4NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore = 1a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv("1a"));
	}

	@Test
	public void test5NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore = -1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv("-1"));
	}

	@Test
	public void test6NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore = +1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberHdmiTv("+1"));
	}

	@Test
	public void test7NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore = +1&");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv("1&"));
	}

	@Test
	public void test8NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento del numero hdmi con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv(" 1 "));
	}

	@Test
	public void test9NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore = 1,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv("1,10"));
	}

	@Test
	public void test10NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv("2"));
	}

	@Test
	public void test12NumberHdmiTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero hdmi con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberHdmiTv(null));
	}

	@Test
	public void test1NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test doppio inserimento del numero hdmi");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addNumberUsbTv("2"));
		assertFalse(tv.addNumberUsbTv("2"));
	}

	@Test
	public void test2NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addNumberUsbTv("2"));
	}

	@Test
	public void test3NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("-2"));
	}

	@Test
	public void test4NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = 2a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("1a"));
	}

	@Test
	public void test5NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("-2"));
	}

	@Test
	public void test6NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = +2");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertTrue(tv.addNumberUsbTv("+2"));
	}

	@Test
	public void test7NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = +2&");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("+1&"));
	}

	@Test
	public void test8NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 2 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv(" 1 "));
	}

	@Test
	public void test9NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = 2,5 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("2,5"));
	}

	@Test
	public void test10NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("3"));
	}

	@Test
	public void test11NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv(null));
	}

	@Test
	public void test1NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento del numero hdmi");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberUsbTv("1"));
		assertFalse(tv.addNumberUsbTv("1"));
	}

	@Test
	public void test2NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberUsbTv("1"));
	}

	@Test
	public void test3NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("-1"));
	}

	@Test
	public void test4NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = 1a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("1a"));
	}

	@Test
	public void test5NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = = -1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("-1"));
	}

	@Test
	public void test6NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = +1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberUsbTv("+1"));
	}

	@Test
	public void test7NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = +1&");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("+1&"));
	}

	@Test
	public void test8NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv(" 1 "));
	}

	@Test
	public void test9NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("1,5"));
	}

	@Test
	public void test10NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("3"));
	}

	@Test
	public void test11NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv(null));
	}

	@Test
	public void test1NumberUsbTelevisoreBase() throws TelevisoreException {
		System.out.println("Test di'inserimento del numero usb ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tv.addNumberUsbTv("2"));
	}

	@Test
	public void test1NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento del numero smart tv");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberSmartTv("1"));
		assertFalse(tv.addNumberSmartTv("1"));
	}

	@Test
	public void test2NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_SMART_TV);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato("123456789113");
		assertTrue(tv.addNumberSmartTv("1"));
	}

	@Test
	public void test3NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv che deve essere minore di  0.5");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv("0.5"));
	}

	@Test
	public void test4NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1a");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv("1a"));
	}

	@Test
	public void test5NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = -1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv("-1"));
	}

	@Test
	public void test6NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertTrue(tv.addNumberSmartTv("+1"));
	}

	@Test
	public void test7NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1&");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv("+1&"));
	}

	@Test
	public void test8NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento del  numero smart tv con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv(" 1 "));
	}

	@Test
	public void test9NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1,10 ");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv("1,10"));
	}

	@Test
	public void test10NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv("3"));
	}

	@Test
	public void test11NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore nullo");
		serial = serial.add( BigInteger.valueOf(1));;
		Televisore tv = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tv.addNumberSmartTv(null));
	}
	
	

}
