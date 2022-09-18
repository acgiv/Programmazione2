package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.PojoTelevisore.*;
import Cecinato_cs2022.TelevisoreService.Televisore;

class TestAcquisizioneTelevisore {

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
		assertFalse(tv.addRisoluzioneTv(tv));
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

	@Test
	public void test1AltezzaTelevisioreBase() {
		System.out.println("Test doppio inserimento dell' altezza");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addAltezzaTv(tv));
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test2AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di > 24.09");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addAltezzaTv(tv));
	}

	@Test
	public void test3AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test4AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test5AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test6AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addAltezzaTv(tv));
	}

	@Test
	public void test7AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test8AltezzaTelevisioreBase() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test9AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test10AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test1AltezzaTelevisoreMedio() {
		System.out.println("Test doppio inserimento dell' altezza");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addAltezzaTv(tv));
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test2AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di > 24.09");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addAltezzaTv(tv));
	}

	@Test
	public void test3AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test4AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test5AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test6AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addAltezzaTv(tv));
	}

	@Test
	public void test7AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test8AltezzaTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test9AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test10AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test1AltezzaTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento dell' altezza");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addAltezzaTv(tv));
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test2AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di > 24.09");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addAltezzaTv(tv));
	}

	@Test
	public void test3AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test4AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test5AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test6AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addAltezzaTv(tv));
	}

	@Test
	public void test7AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test8AltezzaTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test9AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test10AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addAltezzaTv(tv));
	}

	@Test
	public void test1LarghezzaTelevisioreBase() {
		System.out.println("Test doppio inserimento della Larghezza");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addLarghezzaTv(tv));
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test2LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test3LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test4LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test5LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test6LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test7LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test8LarghezzaTelevisioreBase() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test9LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test10LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test1LarghezzaTelevisoreMedio() {
		System.out.println("Test doppio inserimento della Larghezza");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addLarghezzaTv(tv));
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test2LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test3LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test4LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test5LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test6LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test7LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test8LarghezzaTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test9LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test10LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test1LarghezzaTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento della Larghezza");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addLarghezzaTv(tv));
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test2LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test3LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test4LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test5LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test6LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test7LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test8LarghezzaTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test9LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test10LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addLarghezzaTv(tv));
	}

	@Test
	public void test1DiagonaleTelevisioreBase() {
		System.out.println("Test doppio inserimento della Diagonale");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addDiagonaleTv(tv));
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test2DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test3DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test4DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test5DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test6DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		Televisore tv = new TelevisoreBase();
		assertTrue(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test7DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test8DiagonaleTelevisioreBase() {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test9DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test10DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		Televisore tv = new TelevisoreBase();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test1DiagonaleTelevisoreMedio() {
		System.out.println("Test doppio inserimento della Diagonale");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addDiagonaleTv(tv));
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test2DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test3DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test4DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test5DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test6DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test7DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test8DiagonaleTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test9DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test10DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test1DiagonaleTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento della Diagonale");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addDiagonaleTv(tv));
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test2DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test3DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test4DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test5DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test6DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test7DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test8DiagonaleTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test9DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));
	}

	@Test
	public void test10DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addDiagonaleTv(tv));

	}

	@Test
	public void test1NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento del numeroHdmi");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addNumberHdmiTv(tv));
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test2NumberHdmiTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento del numero hdmi che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_HDMI);
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test3NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi che deve essere uguale a = 0.5");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test4NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = 1a");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test5NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = -1");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test6NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = +1");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test7NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = +1&");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test8NumberHdmiTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento del numero hdmi con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test9NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = 1,10 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test10NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberHdmiTv(tv));
	}

	@Test
	public void test1NumberUsbTelevisoreMedio() {
		System.out.println("Test doppio inserimento del numero hdmi");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addNumberUsbTv(tv));
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test2NumberUsbTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test3NumberUsbTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test4NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = 1a");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test5NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test6NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = +1");
		Televisore tv = new TelevisoreMedio();
		assertTrue(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test7NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = +1&");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test8NumberUsbTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test9NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}

	@Test
	public void test10NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		Televisore tv = new TelevisoreMedio();
		assertFalse(tv.addNumberUsbTv(tv));
	}
	
	@Test
	public void test1NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test doppio inserimento del numero smart tv");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addNumberSmartTv(tv));
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test2NumberSmartTvTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento del  numero smart tv che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_SMART_TV);
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test3NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv che deve essere minore di  0.5");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test4NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1a");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test5NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv con valore = -1");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test6NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1");
		Televisore tv = new TelevisoreAvanzato();
		assertTrue(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test7NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1&");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test8NumberSmartTvTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento del  numero smart tv con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test9NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1,10 ");
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}

	@Test
	public void test10NumberSmartTvTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del  numero smart tv con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
		Televisore tv = new TelevisoreAvanzato();
		assertFalse(tv.addNumberSmartTv(tv));
	}


}
