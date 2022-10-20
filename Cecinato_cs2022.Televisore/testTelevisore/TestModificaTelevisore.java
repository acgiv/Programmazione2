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
		tvBase.addTelevisoreBase("lg", "70.04", "100.42", "200.34", "hd", "OLED");
		tvMedio.addTelevisoreMedio("lg", "70.04", "100.42", "200.34", "hd", "OLED", "2");
		tvAvanzato.addTelevisoreAvanzato("lg", "70.04", "100.42", "200.34", "full hd", "LED", "1", "1", "1");
		System.out.println(tvBase+ "\n"+tvMedio+ "\n"+tvAvanzato+ "\n");
	}
	


	@Test
	public void test1MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvBase.modificaMarcaTv("AMAZON"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test2MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvBase.modificaMarcaTv("Amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvBase.modificaMarcaTv("amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test4MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tvBase.modificaMarcaTv(" amazon "));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvBase.modificaMarcaTv("amazon1"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test6MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tvBase.modificaMarcaTv("ama zon"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test7MarcaTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		assertFalse(tvBase2.modificaMarcaTv("amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test8MarcaTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica marca con valore nullo");
		assertFalse(tvBase.modificaMarcaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test1MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvMedio.modificaMarcaTv("AMAZON"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test2MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvMedio.modificaMarcaTv("Amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvMedio.modificaMarcaTv("amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tvMedio.modificaMarcaTv(" amazon "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvMedio.modificaMarcaTv("amazon1"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tvMedio.modificaMarcaTv("ama zon"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7MarcaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		assertFalse(tvMedio2.modificaMarcaTv("AMAZON"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test8MarcaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test modifica marca con vlaore nummo");
		assertFalse(tvMedio.modificaMarcaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Marca = AMAZON");
		assertTrue(tvAvanzato.modificaMarcaTv("AMAZON"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test2MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Marca = Amazon");
		assertTrue(tvAvanzato.modificaMarcaTv("Amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Marca = amazon");
		assertTrue(tvAvanzato.modificaMarcaTv("amazon"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Marca con spazi sia prima che dopo la parola = ' amazon '");
		assertTrue(tvAvanzato.modificaMarcaTv(" amazon "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Marca = amazon1 ");
		assertFalse(tvAvanzato.modificaMarcaTv("amazon1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Marca = ama zon ");
		assertFalse(tvAvanzato.modificaMarcaTv("ama zon"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7MarcaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test modifica marca senza averla giunta precedentemente");
		assertFalse(tvAvanzato2.modificaMarcaTv("AMAZON"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test8MarcaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica marca con valore nullo");
		assertFalse(tvAvanzato.modificaMarcaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1AltezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		assertFalse(tvBase2.modificaAltezzaTv("37.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test2AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvBase.modificaAltezzaTv("37.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvBase.modificaAltezzaTv("10.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test4AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvBase.modificaAltezzaTv("24.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = -24.09");
		assertFalse(tvBase.modificaAltezzaTv("-24.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test6AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvBase.modificaAltezzaTv("+24.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test7AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvBase.modificaAltezzaTv("+28&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test8AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertTrue(tvBase.modificaAltezzaTv(" 28.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test9AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvBase.modificaAltezzaTv("28,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test10AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvBase.modificaAltezzaTv("150.05"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test11AltezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tvBase.modificaAltezzaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test1AltezzaTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		assertFalse(tvMedio2.modificaAltezzaTv("40.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test2AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvMedio.modificaAltezzaTv("40.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvMedio.modificaAltezzaTv("10.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvMedio.modificaAltezzaTv("24.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvMedio.modificaAltezzaTv("-24.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvMedio.modificaAltezzaTv("+24.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvMedio.modificaAltezzaTv("+28&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test8AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertTrue(tvMedio.modificaAltezzaTv(" 28.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test9AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvMedio.modificaAltezzaTv("28,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test10AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvMedio.modificaAltezzaTv("160.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test11AltezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tvMedio.modificaAltezzaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1AltezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2+ "\n");
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		assertFalse(tvAvanzato2.modificaAltezzaTv("100.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test2AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere maggiore di  24.09");
		assertTrue(tvAvanzato.modificaAltezzaTv("100.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza che deve essere minore di 24.09");
		assertFalse(tvAvanzato.modificaAltezzaTv("10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 24.09a");
		assertFalse(tvAvanzato.modificaAltezzaTv("24.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = = -24.09");
		assertFalse(tvAvanzato.modificaAltezzaTv("-24.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +24.10");
		assertTrue(tvAvanzato.modificaAltezzaTv("+24.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = +28&.10");
		assertFalse(tvAvanzato.modificaAltezzaTv("+28&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test8AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println(
				"\"Test di'inserimento dell' altezza con uno spazio sia all' inizio che alla fine del numero =' 28.10 '");
		assertTrue(tvAvanzato.modificaAltezzaTv(" 28.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test9AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore = 28,10 ");
		assertFalse(tvAvanzato.modificaAltezzaTv("28,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test10AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore superiore al valore massimo di = 124.05 ");
		assertFalse(tvAvanzato.modificaAltezzaTv("127.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test11AltezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento dell'altezza con valore nullo ");
		assertFalse(tvAvanzato.modificaAltezzaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1LarghezzaTelevisioreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		assertFalse(tvBase2.modificaLarghezzaTv("60.02"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test2LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvBase.modificaLarghezzaTv("60.02"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvBase.modificaLarghezzaTv("2.01"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test4LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvBase.modificaLarghezzaTv(" 45.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvBase.modificaLarghezzaTv("-45.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test6LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvBase.modificaLarghezzaTv("+45.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test7LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvBase.modificaLarghezzaTv("+45&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test8LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertTrue(tvBase.modificaLarghezzaTv(" 45.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test9LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvBase.modificaLarghezzaTv("45,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test10LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvBase.modificaLarghezzaTv("230"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test11LarghezzaTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tvBase.modificaLarghezzaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test1LarghezzaTelevisoreMedio() throws TelevisoreException {

		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		assertFalse(tvMedio2.modificaLarghezzaTv("60.12"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test2LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvMedio.modificaLarghezzaTv("60.12"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvMedio.modificaLarghezzaTv("41.03"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvMedio.modificaLarghezzaTv("45.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvMedio.modificaLarghezzaTv("-45.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvMedio.modificaLarghezzaTv("+45.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvMedio.modificaLarghezzaTv("+45&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test8LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertTrue(tvMedio.modificaLarghezzaTv(" 45.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test9LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvMedio.modificaLarghezzaTv("45,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test10LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvMedio.modificaLarghezzaTv("240.12"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test11LarghezzaTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tvMedio.modificaLarghezzaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1LarghezzaTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		assertFalse(tvAvanzato2.modificaLarghezzaTv("50.12"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test2LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
	System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvAvanzato.modificaLarghezzaTv("50.12"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvAvanzato.modificaLarghezzaTv("12.12"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvAvanzato.modificaLarghezzaTv("45.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvAvanzato.modificaLarghezzaTv("-45.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvAvanzato.modificaLarghezzaTv("+45.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvAvanzato.modificaLarghezzaTv("+45&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test8LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertTrue(tvAvanzato.modificaLarghezzaTv(" 45.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test9LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvAvanzato.modificaLarghezzaTv("45,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test10LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvAvanzato.modificaLarghezzaTv("223"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test11LarghezzaTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Larghezza con valore nullo ");
		assertFalse(tvAvanzato.modificaLarghezzaTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1NumberUsbTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test modifica volore senza aver inserimento il numero Usb  uguale a "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tvMedio2.modificaNumberHdmiTv("0"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test2NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_USB + "uguale a " + ConstantGlobal.NUM_USB_TV_MEDIO);
		assertTrue(tvMedio.modificaNumberUsbTv("2"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertFalse(tvMedio.modificaNumberUsbTv("-40"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 2a");
		assertFalse(tvMedio.modificaNumberUsbTv("2a"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		assertFalse(tvMedio.modificaNumberUsbTv("-2"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +2");
		assertTrue(tvMedio.modificaNumberUsbTv("+2"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +2&");
		assertFalse(tvMedio.modificaNumberUsbTv("+2&"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test8NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 2 '");
		assertTrue(tvMedio.modificaNumberUsbTv(" 2 "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test9NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 2,5 ");
		assertFalse(tvMedio.modificaNumberUsbTv("2,5"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test10NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tvMedio.modificaNumberUsbTv("3"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test11NumberUsbTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento del numero usb con valore nullo");
		assertFalse(tvMedio.modificaNumberUsbTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1NumberUsbTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test modifica volore senza aver inserimento il numero Usb");
		assertFalse(tvAvanzato2.modificaNumberHdmiTv("0"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test2NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_USB + " e uguale a " + ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		assertTrue(tvAvanzato.modificaNumberUsbTv("1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertFalse(tvAvanzato.modificaNumberUsbTv("-4"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 1a");
		assertFalse(tvAvanzato.modificaNumberUsbTv("1a"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
		}

	@Test
	public void test5NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		assertFalse(tvAvanzato.modificaNumberUsbTv("-2"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +1");
		assertTrue(tvAvanzato.modificaNumberUsbTv("+1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = +1&");
		assertFalse(tvAvanzato.modificaNumberUsbTv("+1&"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test8NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertTrue(tvAvanzato.modificaNumberUsbTv(" 1 "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test9NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");
		assertFalse(tvAvanzato.modificaNumberUsbTv("1,5"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test10NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tvAvanzato.modificaNumberUsbTv("3"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test11NumberUsbTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del numero usb con valore nullo ");
		assertFalse(tvAvanzato.modificaNumberUsbTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1DiagonaleTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test moedificca della Diagonale, senza inserirla inizialmente");
		assertFalse(tvBase2.modificaDiagonaleTv("70.02"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test2DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tvBase.modificaDiagonaleTv("70.02"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tvBase.modificaDiagonaleTv("40.02"));
	}

	@Test
	public void test4DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tvBase.modificaDiagonaleTv("51.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tvBase.modificaDiagonaleTv("-51.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test6DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tvBase.modificaDiagonaleTv("+51.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test7DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tvBase.modificaDiagonaleTv("+51&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test8DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertTrue(tvBase.modificaDiagonaleTv(" 51.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test9DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tvBase.modificaDiagonaleTv("51,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test10DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tvBase.modificaDiagonaleTv("257.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test11DiagonaleTelevisioreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tvBase.modificaDiagonaleTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test1DiagonaleTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test moedificca della Diagonale, senza inserirla inizialmente");
		assertFalse(tvMedio2.modificaDiagonaleTv("51.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test2DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tvMedio.modificaDiagonaleTv("51.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tvMedio.modificaDiagonaleTv("40.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51.10a");
		assertFalse(tvMedio.modificaDiagonaleTv("51.10a"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tvMedio.modificaDiagonaleTv("-51.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tvMedio.modificaDiagonaleTv("+51.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tvMedio.modificaDiagonaleTv("+51&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test8DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertTrue(tvMedio.modificaDiagonaleTv(" 51.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test9DiagonaleTelevisoreMedio() {
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tvMedio.modificaDiagonaleTv("51,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test10DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tvMedio.modificaDiagonaleTv("260.03"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test11DiagonaleTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tvMedio.modificaDiagonaleTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test2DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere maggiore di  51.09");
		assertTrue(tvAvanzato.modificaDiagonaleTv("52.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale che deve essere minore di  51.09");
		assertFalse(tvAvanzato.modificaDiagonaleTv("40.02"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51.09a");
		assertFalse(tvAvanzato.modificaDiagonaleTv("51.09a"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = = -51.09");
		assertFalse(tvAvanzato.modificaDiagonaleTv("-51.09"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51.10");
		assertTrue(tvAvanzato.modificaDiagonaleTv("+51.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = +51&.10");
		assertFalse(tvAvanzato.modificaDiagonaleTv("+51&.10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test8DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println(
				"\"Test di'inserimento della Diagonale con uno spazio sia all' inizio che alla fine del numero =' 51.10 '");
		assertTrue(tvAvanzato.modificaDiagonaleTv(" 51.10 "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test9DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore = 51,10 ");
		assertFalse(tvAvanzato.modificaDiagonaleTv("51,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test10DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore superiore al valore massimo di = 254.0 ");
		assertFalse(tvAvanzato.modificaDiagonaleTv("257.00"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");

	}

	@Test
	public void test11DiagonaleTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento della Diagonale con valore nullo ");
		assertFalse(tvAvanzato.modificaDiagonaleTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");

	}

	@Test
	public void test1NumberSmartTvTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test  modifica del numero smart tv, senza inserimento");
		assertFalse(tvAvanzato2.modificaNumberSmartTv("1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test2NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv che deve essere maggiore di "
				+ ConstantGlobal.NUM_MINIMO_SMART_TV);
		assertTrue(tvAvanzato.modificaNumberSmartTv("1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv che deve essere minore di  0.5");
		assertFalse(tvAvanzato.modificaNumberSmartTv("0.5"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1a");
		assertFalse(tvAvanzato.modificaNumberSmartTv("1a"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = -1");
		assertFalse(tvAvanzato.modificaNumberSmartTv("-1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1");
		assertTrue(tvAvanzato.modificaNumberSmartTv("+1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = +1&");
		assertFalse(tvAvanzato.modificaNumberSmartTv("+1&"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test8NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println(
				"\"Test di'inserimento del  numero smart tv con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertTrue(tvAvanzato.modificaNumberSmartTv(" 1 "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test9NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore = 1,10 ");
		assertFalse(tvAvanzato.modificaNumberSmartTv("1,10"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test10NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
		assertFalse(tvAvanzato.modificaNumberSmartTv("3"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test11NumberSmartTvTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test di'inserimento del  numero smart tv con valore nullo");
		assertFalse(tvAvanzato.modificaNumberSmartTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tvBase.modificaRisoluzioneTv("FULL HD"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test2RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica Risoluzione = Full Hd");
		assertTrue(tvBase.modificaRisoluzioneTv("Full Hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica Risoluzione = full hd");
		assertTrue(tvBase.modificaRisoluzioneTv("full hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test4RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertTrue(tvBase.modificaRisoluzioneTv(" full hd "));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica Risoluzione = hd1 ");
		assertFalse(tvBase.modificaRisoluzioneTv("hd1"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test6RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica Risoluzione = h d ");
		assertFalse(tvBase.modificaRisoluzioneTv("h d"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test7RisoluzioneTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test modifica della Risoluzione senza aver inserito la modifica");
		assertFalse(tvBase2.modificaRisoluzioneTv("hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test8RisoluzioneTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tvBase.modificaRisoluzioneTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test1RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Risoluzione = FULL HD");
		assertTrue(tvMedio.modificaRisoluzioneTv("FULL HD"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test2RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Risoluzione = Full Hd");
		assertTrue(tvMedio.modificaRisoluzioneTv("Full Hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Risoluzione = full hd");
		assertTrue(tvMedio.modificaRisoluzioneTv("full hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertTrue(tvMedio.modificaRisoluzioneTv(" full hd "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Risoluzione = hd1 ");
		assertFalse(tvMedio.modificaRisoluzioneTv("hd1"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Risoluzione = h d ");
		assertFalse(tvMedio.modificaRisoluzioneTv("h d"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7RisoluzioneTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test della modifica della Risoluzione senza averla prima inserita");
		assertFalse(tvMedio2.modificaRisoluzioneTv("hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test8RisoluzioneTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test modifica della Risoluzione con valore nullo");
		assertFalse(tvMedio.modificaRisoluzioneTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato+ "\n");
		System.out.println("Test modifica Risoluzione = FULL HD");
		assertTrue(tvAvanzato.modificaRisoluzioneTv("FULL HD"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test2RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica Risoluzione = Full Hd");
		assertTrue(tvAvanzato.modificaRisoluzioneTv("Full Hd"));
	}

	@Test
	public void test3RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica Risoluzione = full hd");
		assertTrue(tvAvanzato.modificaRisoluzioneTv("full hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica Risoluzione con spazi sia prima che dopo la parola = ' full hd '");
		assertTrue(tvAvanzato.modificaRisoluzioneTv(" full hd "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica Risoluzione = hd1 ");
		assertFalse(tvAvanzato.modificaRisoluzioneTv("hd1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato+ "\n");
		System.out.println("Test modifica Risoluzione = h d ");
		assertFalse(tvAvanzato.modificaRisoluzioneTv("h d"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7RisoluzioneTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test modifica della risuoluzione senza aggiungerla prima");
		assertFalse(tvAvanzato2.modificaRisoluzioneTv("hd"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test8RisoluzioneTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test inserimento della Risoluzione con valore nullo");
		assertFalse(tvAvanzato.modificaRisoluzioneTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tvBase.modificaTiposchermoTv("CRT"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test2TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tvBase.modificaTiposchermoTv("Crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tvBase.modificaTiposchermoTv("crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test4TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertTrue(tvBase.modificaTiposchermoTv(" crt "));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tvBase.modificaTiposchermoTv("crt1"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test6TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tvBase.modificaTiposchermoTv("cr t"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test7TiposchermoTelevisoreBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test modifica del Tipo schermo senza averla inserita");
		assertFalse(tvBase2.modificaTiposchermoTv("CRT"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test8TiposchermoTelevisoreBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test Aggiunta Tiposchermo con valore nullo ");
		assertFalse(tvBase.modificaTiposchermoTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test1TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tvMedio.modificaTiposchermoTv("CRT"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test2TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tvMedio.modificaTiposchermoTv("Crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tvMedio.modificaTiposchermoTv("crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertTrue(tvMedio.modificaTiposchermoTv(" crt "));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test5TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tvMedio.modificaTiposchermoTv("crt1"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test6TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tvMedio.modificaTiposchermoTv("cr t"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test7TiposchermoTelevisoreMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvMedio2 + "\n");
		System.out.println("Test modifica del Tipo schermo senza averla inserita");
		assertFalse(tvMedio2.modificaTiposchermoTv("crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio2 + "\n");
	}

	@Test
	public void test8TiposchermoTelevisoreMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test inserimento della Tiposchermo con valore nullo");
		assertFalse(tvMedio.modificaTiposchermoTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1TiposchermoTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Tiposchermo = CRT");
		assertTrue(tvAvanzato.modificaTiposchermoTv("CRT"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test2TiposchermoTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Tiposchermo = Crt");
		assertTrue(tvAvanzato.modificaTiposchermoTv("Crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3TiposchermoTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt");
		assertTrue(tvAvanzato.modificaTiposchermoTv("crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4TiposchermoTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Tiposchermo con spazi sia prima che dopo la parola = ' crt '");
		assertTrue(tvAvanzato.modificaTiposchermoTv(" crt "));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5TiposchermoTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Tiposchermo = crt1 ");
		assertFalse(tvAvanzato.modificaTiposchermoTv("crt1"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test6TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test Aggiunta Tiposchermo = cr t ");
		assertFalse(tvAvanzato.modificaTiposchermoTv("cr t"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test7TiposchermoTelevisoreAvanzato() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test modifica del Tipo schermo senza averlo aggiunto inizialmente");
		assertFalse(tvAvanzato2.modificaTiposchermoTv("crt"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test8TiposchermoTelevisoreAvanzato() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test doppio inserimento della tipologia di  schemo con valore nullo");
		assertFalse(tvAvanzato.modificaTiposchermoTv(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1modificaSerialeTvAvanzanto() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println(
				"Test modifica seriale tv avanzato con lo stesso seriale iniziale = " + String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaSeriale(String.valueOf(serial)));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test2modificaSerialeTvAvanzanto() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica seriale tv avanzato con seriale corretto  = " + serial + "e diverso da "
				+ tvAvanzato.visualizzaSeriale());
		assertTrue(tvAvanzato.modificaSeriale(String.valueOf(serial)));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test3modificaSerialeTvAvanzanto() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica seriale tv avanzato con seriale sbagliato = 1234a6789011");
		assertFalse(tvAvanzato.modificaSeriale("1234a6789011"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test4modificaSerialeTvAvanzanto() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica seriale tv avanzato con seriale sbagliato = 1234 6789011");
		assertFalse(tvAvanzato.modificaSeriale("1234 6789011"));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test5modificaSerialeTvAvanzanto() {
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato + "\n");
		System.out.println("Test modifica seriale tv avanzato con seriale sbagliato = null");
		assertFalse(tvAvanzato.modificaSeriale(null));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato + "\n");
	}

	@Test
	public void test1modificaSerialeTvMedio() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));

		Televisore tvAvanzato2 = new TelevisoreMedio(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvAvanzato2 + "\n");
		System.out.println("Test modifica seriale tv medio con lo stesso seriale iniziale = " + String.valueOf(serial));
		assertFalse(tvAvanzato2.modificaSeriale(String.valueOf(serial)));
		System.out.println("\n dopo del test");
		System.out.println(tvAvanzato2 + "\n");
	}

	@Test
	public void test2modificaSerialeTvMedio() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test modifica seriale tv medio con seriale corretto  = " + serial + "e diverso da "
				+ tvMedio.visualizzaSeriale());
		assertTrue(tvMedio.modificaSeriale(String.valueOf(serial)));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test3modificaSerialeTvMedio() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test modifica seriale tv medio con seriale sbagliato = 1234a6789011");
		assertFalse(tvMedio.modificaSeriale("1234a6789011"));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test4modificaSerialeTvMedio() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test modifica seriale  tv medio con seriale sbagliato = 1234 6789011");
		assertFalse(tvMedio.modificaSeriale("1234 6789011"));
	}

	@Test
	public void test5modificaSerialeTvMedio() {
		System.out.println("\n prima del test");
		System.out.println(tvMedio + "\n");
		System.out.println("Test modifica seriale tv medio con seriale sbagliato = null");
		assertFalse(tvMedio.modificaSeriale(null));
		System.out.println("\n dopo del test");
		System.out.println(tvMedio + "\n");
	}

	@Test
	public void test1modificaSerialeTvBase() throws TelevisoreException {
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		System.out.println("\n prima del test");
		System.out.println(tvBase2 + "\n");
		System.out.println("Test modifica seriale tv base con lo stesso seriale iniziale = " + String.valueOf(serial));
		assertFalse(tvBase2.modificaSeriale(String.valueOf(serial)));
		System.out.println("\n dopo del test");
		System.out.println(tvBase2 + "\n");
	}

	@Test
	public void test2modificaSerialeTvBase() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica seriale tv base con seriale corretto  = " + serial + " e diverso da "
				+ tvBase.visualizzaSeriale());
		assertTrue(tvBase.modificaSeriale(String.valueOf(serial)));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test3modificaSerialeTvBase() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica seriale tv base con seriale sbagliato = 1234a6789011");
		assertFalse(tvBase.modificaSeriale("1234a6789011"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test4modificaSerialeTvBase() {
		serial = serial.add(BigInteger.valueOf(1));
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica seriale tv base con seriale sbagliato = 1234 6789011");
		assertFalse(tvBase.modificaSeriale("1234 6789011"));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}

	@Test
	public void test5modificaSerialeTvBase() {
		System.out.println("\n prima del test");
		System.out.println(tvBase + "\n");
		System.out.println("Test modifica seriale tv base con seriale sbagliato = null");
		assertFalse(tvBase.modificaSeriale(null));
		System.out.println("\n dopo del test");
		System.out.println(tvBase + "\n");
	}
}