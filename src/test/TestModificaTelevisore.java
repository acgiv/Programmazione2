package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
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
		assertTrue(tvBase.addLarghezzaTv(tvBase));
		assertTrue(tvMedio.addLarghezzaTv(tvMedio));
		assertTrue(tvAvanzato.addLarghezzaTv(tvAvanzato));
		assertTrue(tvAvanzato.addNumberHdmiTv(tvAvanzato));
		assertTrue(tvMedio.addNumberUsbTv(tvMedio));
		assertTrue(tvAvanzato.addNumberUsbTv(tvAvanzato));
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
		assertFalse(tvBase2.modificaAltezzaTv(tvBase2));
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
		assertFalse(tvMedio2.modificaAltezzaTv(tvMedio2));
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
		assertFalse(tvAvanzato2.modificaAltezzaTv(tvAvanzato2));
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

	@Test
	public void test1LarghezzaTelevisioreBase() {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		Televisore tvBase2 = new TelevisoreBase();
		assertFalse(tvBase2.modificaLarghezzaTv(tvBase2));
	}

	@Test
	public void test2LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test3LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test4LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test5LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test6LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test7LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test8LarghezzaTelevisioreBase() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test9LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test10LarghezzaTelevisioreBase() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvBase.modificaLarghezzaTv(tvBase));
	}

	@Test
	public void test1LarghezzaTelevisoreMedio() {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		Televisore tvMedio2 = new TelevisoreBase();
		assertFalse(tvMedio2.modificaLarghezzaTv(tvMedio2));
	}

	@Test
	public void test2LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test3LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test4LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test5LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test6LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test7LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test8LarghezzaTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test9LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test10LarghezzaTelevisoreMedio() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvMedio.modificaLarghezzaTv(tvMedio));
	}

	@Test
	public void test1LarghezzaTelevisoreAvanzato() {
		System.out.println("Test inserimento dell' altezza senza averla aggiunta inzialmente");
		Televisore tvAvanzato2 = new TelevisoreBase();
		assertFalse(tvAvanzato2.modificaLarghezzaTv(tvAvanzato2));
	}

	@Test
	public void test2LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza che deve essere maggiore di  44.03");
		assertTrue(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test3LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza che deve essere minore di  44.03");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test4LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45.09a");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test5LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = = -45.09");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test6LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45.10");
		assertTrue(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test7LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = +45&.10");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test8LarghezzaTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento della Larghezza con uno spazio sia all' inizio che alla fine del numero =' 45.10 '");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test9LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore = 45,10 ");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test10LarghezzaTelevisoreAvanzato() {
		System.out.println("Test di'inserimento della Larghezza con valore superiore al valore massimo di = 221.35 ");
		assertFalse(tvAvanzato.modificaLarghezzaTv(tvAvanzato));
	}

	@Test
	public void test1NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test modifica volore senza aver inserimento il numero Hdmi");
		Televisore tvAvanzato2 = new TelevisoreAvanzato();
		assertFalse(tvAvanzato2.modificaNumberHdmiTv(tvAvanzato2));
	}



	@Test
	public void test2NumberHdmiTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento del numero hdmi che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_HDMI);
		assertTrue(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test3NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi che deve essere uguale a = 0.5");
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test4NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = 1a");
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test5NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = -1");
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test6NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = +1");
		assertTrue(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test7NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = +1&");
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test8NumberHdmiTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento del numero hdmi con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test9NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore = 1,10 ");
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test10NumberHdmiTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero hdmi con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		assertFalse(tvAvanzato.modificaNumberHdmiTv(tvAvanzato));
	}

	@Test
	public void test1NumberUsbTelevisoreMedio() {
		System.out.println("Test modifica volore senza aver inserimento il numero Usb");
		Televisore tvMedio2 = new TelevisoreMedio();
		assertFalse(tvMedio2.modificaNumberHdmiTv(tvMedio2));
	}

	@Test
	public void test2NumberUsbTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertTrue(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test3NumberUsbTelevisoreMedio() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test4NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = 1a");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test5NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = = -2");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test6NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = +1");
		assertTrue(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test7NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = +1&");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test8NumberUsbTelevisoreMedio() {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test9NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}

	@Test
	public void test10NumberUsbTelevisoreMedio() {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertFalse(tvMedio.modificaNumberUsbTv(tvMedio));
	}
	

	@Test
	public void test1NumberUsbTelevisoreAvanzato() {
		System.out.println("Test modifica volore senza aver inserimento il numero Usb");
		Televisore tvAvanzato2 = new TelevisoreAvanzato();
		assertFalse(tvAvanzato2.modificaNumberHdmiTv(tvAvanzato2));
	}

	@Test
	public void test2NumberUsbTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere maggiore di " + ConstantGlobal.NUM_MINIMO_USB);

		assertTrue(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test3NumberUsbTelevisoreAvanzato() {
		System.out.println(
				"Test di'inserimento del numero usb che deve essere minore di " + ConstantGlobal.NUM_MINIMO_USB);

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test4NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = 1a");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test5NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = = -2");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test6NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = +1");

		assertTrue(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test7NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = +1&");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test8NumberUsbTelevisoreAvanzato() {
		System.out.println(
				"\"Test di'inserimento del numero usb con uno spazio sia all' inizio che alla fine del numero =' 1 '");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test9NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore = 1,5 ");

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

	@Test
	public void test10NumberUsbTelevisoreAvanzato() {
		System.out.println("Test di'inserimento del numero usb con valore superiore al valore massimo di = "
				+ ConstantGlobal.NUM_USB_TV_MEDIO);

		assertFalse(tvAvanzato.modificaNumberUsbTv(tvAvanzato));
	}

}
