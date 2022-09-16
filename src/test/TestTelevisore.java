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
		assertFalse(tv.addMarcaTv( tv));
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
		assertFalse(tv.addMarcaTv( tv));
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
		assertFalse(tv.addMarcaTv( tv));
	}
	

}
