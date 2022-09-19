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

}
