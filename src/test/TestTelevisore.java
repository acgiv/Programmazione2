package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Cecinato_cs2022.PojoTelevisore.*;
import Cecinato_cs2022.TelevisoreService.Televisore;

class TestTelevisore {

	@Test
	public void test1MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test2MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = Amazon");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test3MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = amazon");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test4MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test5MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addMarcaTv(tv));
	}

	@Test
	public void test6MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test7MarcaTelevisoreBase() {
		System.out.println("Test doppio inserimento della marca");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addMarcaTv(tv));
		assertFalse(tv.addMarcaTv(tv));
	}

	@Test
	public void test1MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test2MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = Amazon");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test3MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = amazon");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test4MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test5MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addMarcaTv(tv));
	}

	@Test
	public void test6MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test7MarcaTelevisoreMedio() {
		System.out.println("Test doppio inserimento della marca");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addMarcaTv(tv));
		assertFalse(tv.addMarcaTv(tv));
	}

	@Test
	public void test1MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test2MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = Amazon");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test3MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = amazon");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test4MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test5MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addMarcaTv(tv));
	}

	@Test
	public void test6MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addMarcaTv(tv));
	}

	@Test
	public void test7MarcaTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento della marca");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addMarcaTv(tv));
		assertFalse(tv.addMarcaTv(tv));
	}

	@Test
	public void test1RisoluzioneTelevisoreBase() {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test2RisoluzioneTelevisoreBase() {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test3RisoluzioneTelevisoreBase() {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test4RisoluzioneTelevisoreBase() {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test5RisoluzioneTelevisoreBase() {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test6RisoluzioneTelevisoreBase() {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		Televisore tv = new TelevisoreBase();
		assertFalse (tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test7RisoluzioneTelevisoreBase() {
		System.out.println("Test doppio inserimento della Risoluzione");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addRisoluzioneTv(tv));
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test1RisoluzioneTelevisoreMedio() {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test2RisoluzioneTelevisoreMedio() {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test3RisoluzioneTelevisoreMedio() {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test4RisoluzioneTelevisoreMedio() {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test5RisoluzioneTelevisoreMedio() {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test6RisoluzioneTelevisoreMedio() {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test7RisoluzioneTelevisoreMedio() {
		System.out.println("Test doppio inserimento della Risoluzione");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addRisoluzioneTv(tv));
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test1RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test2RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test3RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test4RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test5RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test6RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test7RisoluzioneTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento della Risoluzione");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addRisoluzioneTv(tv));
		assertFalse(tv.addRisoluzioneTv(tv));
	}

	@Test
	public void test1TiposchermoTelevisoreBase() {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test2TiposchermoTelevisoreBase() {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test3TiposchermoTelevisoreBase() {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test4TiposchermoTelevisoreBase() {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test5TiposchermoTelevisoreBase() {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test6TiposchermoTelevisoreBase() {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test7TiposchermoTelevisoreBase() {
		System.out.println("Test doppio inserimento della Tiposchermo");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addTiposchermoTv(tv));
		assertFalse(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test1TiposchermoTelevisoreMedio() {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test2TiposchermoTelevisoreMedio() {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test3TiposchermoTelevisoreMedio() {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test4TiposchermoTelevisoreMedio() {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test5TiposchermoTelevisoreMedio() {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test6TiposchermoTelevisoreMedio() {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test7TiposchermoTelevisoreMedio() {
		System.out.println("Test doppio inserimento della Tiposchermo");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addTiposchermoTv(tv));
		assertFalse(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test1TiposchermoTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test2TiposchermoTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test3TiposchermoTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test4TiposchermoTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test5TiposchermoTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test6TiposchermoTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addTiposchermoTv(tv));
	}

	@Test
	public void test7TiposchermoTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento della Tiposchermo");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addTiposchermoTv(tv));
		assertFalse(tv.addTiposchermoTv(tv));
	}

}
