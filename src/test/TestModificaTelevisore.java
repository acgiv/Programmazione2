package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.PojoTelevisore.*;

import Cecinato_cs2022.TelevisoreService.Televisore;

class TestModificaTelevisore {

	private static Televisore tvBase;
	private static Televisore tvMedio;
	private static Televisore tvAvanzato;

	@BeforeAll
	public static void inizializzaMeotodi() {
		tvBase = new TelevisoreBase();
		tvMedio = new TelevisoreMedio();
		tvAvanzato = new TelevisoreAvanzato();
		System.out.println("Test Aggiunta Marca = lg");
		assertTrue(tvBase.addMarcaTv(tvBase));
		assertTrue(tvMedio.addMarcaTv(tvMedio));
		assertTrue(tvAvanzato.addMarcaTv(tvAvanzato));
		assertTrue(tvBase.addAltezzaTv(tvBase));
		assertTrue(tvMedio.addAltezzaTv(tvMedio));
		assertTrue(tvAvanzato.addAltezzaTv(tvAvanzato));
	}

	@Test
	public void test1MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvBase.modificaMarcaTv(tvBase));
	}

	@Test
	public void test2MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvBase.modificaMarcaTv(tvBase));
	}

	@Test
	public void test3MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvBase.modificaMarcaTv(tvBase));
	}

	@Test
	public void test4MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tvBase.modificaMarcaTv(tvBase));
	}

	@Test
	public void test5MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvBase.modificaMarcaTv(tvBase));
	}

	@Test
	public void test6MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertTrue(tvBase.modificaMarcaTv(tvBase));
	}

	@Test
	public void test7MarcaTelevisoreBase() {
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		Televisore tvBase2 = new TelevisoreBase();
		assertFalse(tvBase2.modificaMarcaTv(tvBase2));
	}

	@Test
	public void test1MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio));
	}

	@Test
	public void test2MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio));
	}

	@Test
	public void test3MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio));
	}

	@Test
	public void test4MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio));
	}

	@Test
	public void test5MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvMedio.modificaMarcaTv(tvMedio));
	}

	@Test
	public void test6MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio));
	}

	@Test
	public void test7MarcaTelevisoreMedio() {
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		Televisore tvMedio2 = new TelevisoreBase();
		assertFalse(tvMedio2.modificaMarcaTv(tvMedio2));
	}

	@Test
	public void test1MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato));
	}

	@Test
	public void test2MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato));
	}

	@Test
	public void test3MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato));
	}

	@Test
	public void test4MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato));
	}

	@Test
	public void test5MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvAvanzato.modificaMarcaTv(tvAvanzato));
	}

	@Test
	public void test6MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato));
	}

	@Test
	public void test7MarcaTelevisoreAvanzato() {
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		Televisore tvAvanzato2 = new TelevisoreBase();
		assertFalse(tvAvanzato2.modificaMarcaTv(tvAvanzato2));
	}

	@Test
	public void test1AltezzaTelevisioreBase() {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		Televisore tvBase2 = new TelevisoreBase();
		assertFalse(tvBase2.modificaMarcaTv(tvBase2));
	}

	
	@Test
	public void test2AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test3AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test4AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test5AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test6AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test7AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test8AltezzaTelevisioreBase() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test9AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}

	@Test
	public void test10AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvBase.modificaAltezzaTv(tvBase));
	}
	@Test
	public void test1AltezzaTelevisoreMedio() {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		Televisore tvMedio2 = new TelevisoreBase();
		assertFalse(tvMedio2.modificaMarcaTv(tvMedio2));
	}

	
	@Test
	public void test2AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test3AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test4AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test5AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test6AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test7AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test8AltezzaTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test9AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}

	@Test
	public void test10AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio));
	}
	
	@Test
	public void test1AltezzaTelevisoreAvanzato() {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		Televisore tvAvanzato2 = new TelevisoreBase();
		assertFalse(tvAvanzato2.modificaMarcaTv(tvAvanzato2));
	}

	
	@Test
	public void test2AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test3AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test4AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test5AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test6AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test7AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test8AltezzaTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test9AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

	@Test
	public void test10AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato));
	}

}
