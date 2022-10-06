package testTelevisore;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.*;

import Cecinato_cs2022.TelevisoreService.Televisore;

class TestModificaTelevisore {

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
	public void test1MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvBase.modificaMarcaTv(tvBase, "AMAZON"));
	}

	@Test
	public void test2MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvBase.modificaMarcaTv(tvBase, "Amazon"));
	}

	@Test
	public void test3MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvBase.modificaMarcaTv(tvBase, "amazon"));
	}

	@Test
	public void test4MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertFalse(tvBase.modificaMarcaTv(tvBase, " amazon "));
	}

	@Test
	public void test5MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvBase.modificaMarcaTv(tvBase, "amazon1"));
	}

	@Test
	public void test6MarcaTelevisoreBase() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tvBase.modificaMarcaTv(tvBase, "ama zon"));
	}

	@Test
	public void test7MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvBase2.modificaMarcaTv(tvBase2, "amazon"));
	}

	@Test
	public void test8MarcaTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica marca con valore nullo");
		assertFalse(tvBase.modificaMarcaTv(tvBase, null));
	}

	@Test
	public void test1MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio, "AMAZON"));
	}

	@Test
	public void test2MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio, "Amazon"));
	}

	@Test
	public void test3MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvMedio.modificaMarcaTv(tvMedio, "amazon"));
	}

	@Test
	public void test4MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertFalse(tvMedio.modificaMarcaTv(tvMedio, " amazon "));
	}

	@Test
	public void test5MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvMedio.modificaMarcaTv(tvMedio, "amazon1"));
	}

	@Test
	public void test6MarcaTelevisoreMedio() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tvMedio.modificaMarcaTv(tvMedio, "ama zon"));
	}

	@Test
	public void test7MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvMedio2.modificaMarcaTv(tvMedio2, "AMAZON"));
	}

	@Test
	public void test8MarcaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test modifica marca con vlaore nummo");
		assertFalse(tvMedio.modificaMarcaTv(tvMedio, null));
	}

	@Test
	public void test1MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato, "AMAZON"));
	}

	@Test
	public void test2MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato, "Amazon"));
	}

	@Test
	public void test3MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvAvanzato.modificaMarcaTv(tvAvanzato, "amazon"));
	}

	@Test
	public void test4MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertFalse(tvAvanzato.modificaMarcaTv(tvAvanzato, " amazon "));
	}

	@Test
	public void test5MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvAvanzato.modificaMarcaTv(tvAvanzato, "amazon1"));
	}

	@Test
	public void test6MarcaTelevisoreAvanzato() {
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tvAvanzato.modificaMarcaTv(tvAvanzato, "ama zon"));
	}

	@Test
	public void test7MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaMarcaTv(tvAvanzato2, "AMAZON"));
	}

	@Test
	public void test8MarcaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica marca con valore nullo");
		assertFalse(tvAvanzato.modificaMarcaTv(tvAvanzato, null));
	}

	@Test
	public void test1AltezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvBase2.modificaAltezzaTv(tvBase2, "37.00"));
	}

	@Test
	public void test2AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvBase.modificaAltezzaTv(tvBase, "37.00"));
	}

	@Test
	public void test3AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, "10.00"));
	}

	@Test
	public void test4AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, "24.09a"));
	}

	@Test
	public void test5AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = -24.09");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, "-24.09"));
	}

	@Test
	public void test6AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvBase.modificaAltezzaTv(tvBase, "+24.10"));
	}

	@Test
	public void test7AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, "+28&.10"));
	}

	@Test
	public void test8AltezzaTelevisioreBase() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, " 28.10 "));
	}

	@Test
	public void test9AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, "28,10"));
	}

	@Test
	public void test10AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, "150.05"));
	}

	@Test
	public void test11AltezzaTelevisioreBase() {
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tvBase.modificaAltezzaTv(tvBase, null));
	}

	@Test
	public void test1AltezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvMedio2.modificaAltezzaTv(tvMedio2, "40.00"));
	}

	@Test
	public void test2AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvMedio.modificaAltezzaTv(tvMedio, "40.00"));
	}

	@Test
	public void test3AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, "10.00"));
	}

	@Test
	public void test4AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, "24.09a"));
	}

	@Test
	public void test5AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, "-24.09"));
	}

	@Test
	public void test6AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvMedio.modificaAltezzaTv(tvMedio, "+24.10"));
	}

	@Test
	public void test7AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, "+28&.10"));
	}

	@Test
	public void test8AltezzaTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, " 28.10 "));
	}

	@Test
	public void test9AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, "28,10"));
	}

	@Test
	public void test10AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, "160.00"));
	}

	@Test
	public void test11AltezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tvMedio.modificaAltezzaTv(tvMedio, null));
	}

	@Test
	public void test1AltezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaAltezzaTv(tvAvanzato2, "100.00"));
	}

	@Test
	public void test2AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvAvanzato.modificaAltezzaTv(tvAvanzato, "100.00"));
	}

	@Test
	public void test3AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, "10"));
	}

	@Test
	public void test4AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, "24.09a"));
	}

	@Test
	public void test5AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, "-24.09"));
	}

	@Test
	public void test6AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvAvanzato.modificaAltezzaTv(tvAvanzato, "+24.10"));
	}

	@Test
	public void test7AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, "+28&.10"));
	}

	@Test
	public void test8AltezzaTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, " 28.10 "));
	}

	@Test
	public void test9AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, "28,10"));
	}

	@Test
	public void test10AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, "127.00"));
	}

	@Test
	public void test11AltezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tvAvanzato.modificaAltezzaTv(tvAvanzato, null));
	}

	@Test
	public void test1LarghezzaTelevisioreBase() throws TelevisoreException {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvBase2.modificaLarghezzaTv(tvBase2, "60.02"));
	}

	@Test
	public void test2LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvBase.modificaLarghezzaTv(tvBase, "60.02"));
	}

	@Test
	public void test3LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, "2.01"));
	}

	@Test
	public void test4LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, " 45.09a"));
	}

	@Test
	public void test5LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, "-45.09"));
	}

	@Test
	public void test6LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvBase.modificaLarghezzaTv(tvBase, "+45.10"));
	}

	@Test
	public void test7LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, "+45&.10"));
	}

	@Test
	public void test8LarghezzaTelevisioreBase() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, " 45.10 "));
	}

	@Test
	public void test9LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, "45,10"));
	}

	@Test
	public void test10LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, "230"));
	}

	@Test
	public void test11LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase, null));
	}

	@Test
	public void test1LarghezzaTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvMedio2.modificaLarghezzaTv(tvMedio2, "60.12"));
	}

	@Test
	public void test2LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvMedio.modificaLarghezzaTv(tvMedio, "60.12"));
	}

	@Test
	public void test3LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, "41.03"));
	}

	@Test
	public void test4LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, "45.09a"));
	}

	@Test
	public void test5LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, "-45.09"));
	}

	@Test
	public void test6LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvMedio.modificaLarghezzaTv(tvMedio, "+45.10"));
	}

	@Test
	public void test7LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, "+45&.10"));
	}

	@Test
	public void test8LarghezzaTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, " 45.10 "));
	}

	@Test
	public void test9LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, "45,10"));
	}

	@Test
	public void test10LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, "240.12"));
	}

	@Test
	public void test11LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio, null));
	}

	@Test
	public void test1LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaLarghezzaTv(tvAvanzato2, "50.12"));
	}

	@Test
	public void test2LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "50.12"));
	}

	@Test
	public void test3LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "12.12"));
	}

	@Test
	public void test4LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "45.09a"));
	}

	@Test
	public void test5LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "-45.09"));
	}

	@Test
	public void test6LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "+45.10"));
	}

	@Test
	public void test7LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "+45&.10"));
	}

	@Test
	public void test8LarghezzaTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, " 45.10 "));
	}

	@Test
	public void test9LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "45,10"));
	}

	@Test
	public void test10LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, "223"));
	}

	@Test
	public void test11LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato, null));
	}

	@Test
	public void test1NumberUsbTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test modifica volore senza aver inserimento il numero Usb  uguale a "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tvMedio2.modificaNumberHdmiTv(tvMedio2, "0"));
	}

	@Test
	public void test2NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_USB + "uguale a " + ConstantGlobal.NUM_USB_TV_MEDIO);
		assertTrue(tvMedio.modificaNumberUsbTv(tvMedio, "2"));
	}

	@Test
	public void test3NumberUsbTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, "-40"));
	}

	@Test
	public void test4NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = 2a");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, "2a"));
	}

	@Test
	public void test5NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, "-2"));
	}

	@Test
	public void test6NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = +2");
		assertTrue(tvMedio.modificaNumberUsbTv(tvMedio, "+2"));
	}

	@Test
	public void test7NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = +2&");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, "+2&"));
	}

	@Test
	public void test8NumberUsbTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 2 '");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, " 2 "));
	}

	@Test
	public void test9NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = 2,5 ");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, "2,5"));
	}

	@Test
	public void test10NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, "3"));
	}

	@Test
	public void test11NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore nullo");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio, null));
	}

	@Test
	public void test1NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica volore senza aver inserimento il numero Usb");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaNumberHdmiTv(tvAvanzato2, "0"));
	}

	@Test
	public void test2NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_USB + " e uguale a " + ConstantGlobal.NUMERO_USB_TV_AVANZATO);

		assertTrue(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "1"));
	}

	@Test
	public void test3NumberUsbTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "-4"));
	}

	@Test
	public void test4NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = 1a");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "1a"));
	}

	@Test
	public void test5NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = = -2");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "-2"));
	}

	@Test
	public void test6NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = +1");

		assertTrue(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "+1"));
	}

	@Test
	public void test7NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = +1&");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "+1&"));
	}

	@Test
	public void test8NumberUsbTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, " 1 "));
	}

	@Test
	public void test9NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");
		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "1,5"));
	}

	@Test
	public void test10NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, "3"));
	}

	@Test
	public void test11NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore nullo ");
		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato, null));
	}

	@Test
	public void test1DiagonaleTelevisoreBase() throws TelevisoreException {
		System.out.println("Test moedificca della Diagonale, senza inserirla inizialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvBase2.modificaDiagonaleTv(tvBase2, "70.02"));
	}

	@Test
	public void test2DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tvBase.modificaDiagonaleTv(tvBase, "70.02"));
	}

	@Test
	public void test3DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, "40.02"));
	}

	@Test
	public void test4DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, "51.09a"));
	}

	@Test
	public void test5DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, "-51.09"));
	}

	@Test
	public void test6DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tvBase.modificaDiagonaleTv(tvBase, "+51.10"));
	}

	@Test
	public void test7DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, "+51&.10"));
	}

	@Test
	public void test8DiagonaleTelevisioreBase() {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, " 51.10 "));
	}

	@Test
	public void test9DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, "51,10"));
	}

	@Test
	public void test10DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, "257.00"));
	}

	@Test
	public void test11DiagonaleTelevisioreBase() {
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tvBase.modificaDiagonaleTv(tvBase, null));
	}

	@Test
	public void test1DiagonaleTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test moedificca della Diagonale, senza inserirla inizialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tvMedio2.modificaDiagonaleTv(tvMedio2, "51.10"));
	}

	@Test
	public void test2DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tvMedio.modificaDiagonaleTv(tvMedio, "51.10"));
	}

	@Test
	public void test3DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, "40.10"));
	}

	@Test
	public void test4DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.10a");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, "51.10a"));
	}

	@Test
	public void test5DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, "-51.09"));
	}

	@Test
	public void test6DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tvMedio.modificaDiagonaleTv(tvMedio, "+51.10"));
	}

	@Test
	public void test7DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, "+51&.10"));
	}

	@Test
	public void test8DiagonaleTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, " 51.10 "));
	}

	@Test
	public void test9DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, "51,10"));
	}

	@Test
	public void test10DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, "260.03"));
	}

	@Test
	public void test11DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tvMedio.modificaDiagonaleTv(tvMedio, null));
	}

	@Test
	public void test2DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "52.10"));
	}

	@Test
	public void test3DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "40.02"));
	}

	@Test
	public void test4DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "51.09a"));
	}

	@Test
	public void test5DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "-51.09"));
	}

	@Test
	public void test6DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "+51.10"));
	}

	@Test
	public void test7DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "+51&.10"));
	}

	@Test
	public void test8DiagonaleTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, " 51.10 "));
	}

	@Test
	public void test9DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "51,10"));
	}

	@Test
	public void test10DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, "257.00"));

	}

	@Test
	public void test11DiagonaleTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tvAvanzato.modificaDiagonaleTv(tvAvanzato, null));

	}

	@Test
	public void test1NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test  modifica del numero smart tv, senza inserimento");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaNumberSmartTv(tvAvanzato2, "1"));
	}

	@Test
	public void test2NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_SMART_TV);
		assertTrue(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "1"));
	}

	@Test
	public void test3NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv che deve essere minore di  0.5");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "0.5"));
	}

	@Test
	public void test4NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1a");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "1a"));
	}

	@Test
	public void test5NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = -1");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "-1"));
	}

	@Test
	public void test6NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1");
		assertTrue(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "+1"));
	}

	@Test
	public void test7NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1&");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "+1&"));
	}

	@Test
	public void test8NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println(
				"\"Test di'inserimento del  numero smart tv con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, " 1 "));
	}

	@Test
	public void test9NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1,10 ");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "1,10"));
	}

	@Test
	public void test10NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, "3"));
	}

	@Test
	public void test11NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test di'inserimento del  numero smart tv con valore nullo");
		assertFalse(tvAvanzato.modificaNumberSmartTv(tvAvanzato, null));
	}

	@Test
	public void test1RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tvBase.modificaRisoluzioneTv(tvBase, "FULL HD"));
	}

	@Test
	public void test2RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = Full Hd");
		assertTrue(tvBase.modificaRisoluzioneTv(tvBase, "Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = full hd");
		assertTrue(tvBase.modificaRisoluzioneTv(tvBase, "full hd"));
	}

	@Test
	public void test4RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertFalse(tvBase.modificaRisoluzioneTv(tvBase, " full hd "));
	}

	@Test
	public void test5RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = hd1 ");
		assertFalse(tvBase.modificaRisoluzioneTv(tvBase, "hd1"));
	}

	@Test
	public void test6RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = h d ");
		assertFalse(tvBase.modificaRisoluzioneTv(tvBase, "h d"));
	}

	@Test
	public void test7RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica della Risoluzione senza aver inserito la modifica");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvBase2.modificaRisoluzioneTv(tvBase2, "hd"));
	}

	@Test
	public void test8RisoluzioneTelevisoreBase() throws TelevisoreException {
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tvBase.modificaRisoluzioneTv(tvBase, null));
	}

	@Test
	public void test1RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tvMedio.modificaRisoluzioneTv(tvMedio, "FULL HD"));
	}

	@Test
	public void test2RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		assertTrue(tvMedio.modificaRisoluzioneTv(tvMedio, "Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = full hd");
		assertTrue(tvMedio.modificaRisoluzioneTv(tvMedio, "full hd"));
	}

	@Test
	public void test4RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertFalse(tvMedio.modificaRisoluzioneTv(tvMedio, " full hd "));
	}

	@Test
	public void test5RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		assertFalse(tvMedio.modificaRisoluzioneTv(tvMedio, "hd1"));
	}

	@Test
	public void test6RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Risoluzione = h d ");
		assertFalse(tvMedio.modificaRisoluzioneTv(tvMedio, "h d"));
	}

	@Test
	public void test7RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test della modifica della Risoluzione senza averla prima inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tvMedio2.modificaRisoluzioneTv(tvMedio2, "hd"));
	}

	@Test
	public void test8RisoluzioneTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test modifica della Risoluzione con valore nullo");
		assertFalse(tvMedio.modificaRisoluzioneTv(tvMedio, null));
	}

	@Test
	public void test1RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = FULL HD");
		assertTrue(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, "FULL HD"));
	}

	@Test
	public void test2RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = Full Hd");
		assertTrue(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, "Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = full hd");
		assertTrue(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, "full hd"));
	}

	@Test
	public void test4RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertFalse(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, " full hd "));
	}

	@Test
	public void test5RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = hd1 ");
		assertFalse(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, "hd1"));
	}

	@Test
	public void test6RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica Risoluzione = h d ");
		assertFalse(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, "h d"));
	}

	@Test
	public void test7RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica della risuoluzione senza aggiungerla prima");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tvAvanzato.modificaRisoluzioneTv(tvAvanzato2, "hd"));
	}

	@Test
	public void test8RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tvAvanzato.modificaRisoluzioneTv(tvAvanzato, null));
	}

	@Test
	public void test1TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tvBase.modificaTiposchermoTv(tvBase, "CRT"));
	}

	@Test
	public void test2TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tvBase.modificaTiposchermoTv(tvBase, "Crt"));
	}

	@Test
	public void test3TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tvBase.modificaTiposchermoTv(tvBase, "crt"));
	}

	@Test
	public void test4TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertFalse(tvBase.modificaTiposchermoTv(tvBase, " crt "));
	}

	@Test
	public void test5TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tvBase.modificaTiposchermoTv(tvBase, "crt1"));
	}

	@Test
	public void test6TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tvBase.modificaTiposchermoTv(tvBase, "cr t"));
	}

	@Test
	public void test7TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test modifica del Tipo schermo senza averla inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertFalse(tvBase2.modificaTiposchermoTv(tvBase2, "CRT"));
	}

	@Test
	public void test8TiposchermoTelevisoreBase() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con valore nullo ");
		assertFalse(tvBase.modificaTiposchermoTv(tvBase, null));
	}

	@Test
	public void test1TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tvMedio.modificaTiposchermoTv(tvMedio, "CRT"));
	}

	@Test
	public void test2TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tvMedio.modificaTiposchermoTv(tvMedio, "Crt"));
	}

	@Test
	public void test3TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tvMedio.modificaTiposchermoTv(tvMedio, "crt"));
	}

	@Test
	public void test4TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertFalse(tvMedio.modificaTiposchermoTv(tvMedio, " crt "));
	}

	@Test
	public void test5TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tvMedio.modificaTiposchermoTv(tvMedio, "crt1"));
	}

	@Test
	public void test6TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tvMedio.modificaTiposchermoTv(tvMedio, "cr t"));
	}

	@Test
	public void test7TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test modifica del Tipo schermo senza averla inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertFalse(tvMedio2.modificaTiposchermoTv(tvMedio2, "crt"));
	}

	@Test
	public void test8TiposchermoTelevisoreMedio() throws TelevisoreException {
		System.out.println("Test inserimento della Tiposchermo con valore nullo");
		assertFalse(tvMedio.modificaTiposchermoTv(tvMedio, null));
	}

	@Test
	public void test1TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tvAvanzato.modificaTiposchermoTv(tvAvanzato, "CRT"));
	}

	@Test
	public void test2TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tvAvanzato.modificaTiposchermoTv(tvAvanzato, "Crt"));
	}

	@Test
	public void test3TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tvAvanzato.modificaTiposchermoTv(tvAvanzato, "crt"));
	}

	@Test
	public void test4TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertFalse(tvAvanzato.modificaTiposchermoTv(tvAvanzato, " crt "));
	}

	@Test
	public void test5TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tvAvanzato.modificaTiposchermoTv(tvAvanzato, "crt1"));
	}

	@Test
	public void test6TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tvAvanzato.modificaTiposchermoTv(tvAvanzato2, "cr t"));
	}

	@Test
	public void test7TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test modifica del Tipo schermo senza averlo aggiunto inizialmente");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaTiposchermoTv(tvAvanzato2, "crt"));
	}

	@Test
	public void test8TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		System.out.println("Test doppio inserimento della tipologia di  schemo con valore nullo");
		assertFalse(tvAvanzato.modificaTiposchermoTv(tvAvanzato, null));
	}
}
