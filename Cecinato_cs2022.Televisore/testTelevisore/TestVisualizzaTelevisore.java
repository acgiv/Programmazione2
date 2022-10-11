package testTelevisore;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreAvanzato;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.PojoTelevisore.TelevisoreMedio;
import Cecinato_cs2022.TelevisoreService.Televisore;

class TestVisualizzaTelevisore {

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
		tvBase.addTelevisoreBase("lg", "42.04", "60.42", "160.34", "hd", "OLED");
		tvMedio.addTelevisoreMedio("lg", "42.04", "60.42", "160.34", "hd", "OLED", "2");
		tvAvanzato.addTelevisoreAvanzato("lg", "42.04", "60.42", "160.34", "hd", "OLED", "1", "1", "1");
	}
	
	@Test
	void testvisualizzanomiMarcheTvBase() {
		System.out.println("test su visualizzazione Marca del televisore Base = ad: "+ MarcheTelevisori.LG);
		assertEquals(tvBase.visualizzaMarca(), MarcheTelevisori.LG);
		System.out.println(tvBase);
	}
	
	@Test
	public void test2visualizzanomiMarcheTvBase() throws TelevisoreException{
		System.out.println("test su visualizzazione Marca del televisore Base non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertEquals(tvBase2.visualizzaMarca(),null);
		System.out.println(tvBase2);
	}



	@Test
	void testvisualizzanomiMarcheTvMedio() {
		System.out.println("test su visualizzazione Marca del televisore medio = ad: "+ MarcheTelevisori.LG);
		assertEquals(tvMedio.visualizzaMarca(), MarcheTelevisori.LG);
		System.out.println(tvMedio);
	}
	
	@Test
	public void test2visualizzanomiMarcheTvMedio() throws TelevisoreException{
		System.out.println("test su visualizzazione Marca del televisore Medio non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertEquals(tvMedio2.visualizzaMarca(),null);
		System.out.println(tvMedio2);
	}
	
	@Test
	void testvisualizzanomiMarcheTvAvanzato() {
		System.out.println("test su visualizzazione Marca del televisore avanzato = ad: "+ MarcheTelevisori.LG);
		assertEquals(tvAvanzato.visualizzaMarca(), MarcheTelevisori.LG);
		System.out.println(tvAvanzato);
	}
	
	@Test
	public void test2visualizzanomiMarcheTvAvanzato() throws TelevisoreException{
		System.out.println("test su visualizzazione Marca del televisore Avanzato non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertEquals(tvAvanzato2.visualizzaMarca(),null);
		System.out.println(tvAvanzato2);
	}
	
	@Test
	void testvisualizzaAltezzaTvBase() {
		System.out.println("test su visualizzazione Diagonale del televisore Base = ad: "+ 42.04);
		assertEquals(tvBase.visualizzaAltezza(), 42.04);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaAltezzaTvMedio() {
		System.out.println("test su visualizzazione Diagonale del televisore medio = ad: "+ 42.04);
		assertEquals(tvMedio.visualizzaAltezza(), 42.04);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaAltezzaTvAvanzato() {
		System.out.println("test su visualizzazione Diagonale del televisore avanzato = ad: "+ 42.04);
		assertEquals(tvAvanzato.visualizzaAltezza(), 42.04);
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaLarghezzaTvBase() {
		System.out.println("test su visualizzazione Larghezza del televisore Base = ad: "+ 60.42);
		assertEquals(tvBase.visualizzaLarghezza(), 60.42);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaLarghezzaTvMedio() {
		System.out.println("test su visualizzazione Larghezza del televisore medio = ad: "+ 60.42);
		assertEquals(tvMedio.visualizzaLarghezza(), 60.42);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaLarghezzaTvAvanzato() {
		System.out.println("test su visualizzazione Larghezza del televisore avanzato = ad: "+ 60.42);
		assertEquals(tvAvanzato.visualizzaLarghezza(), 60.42);
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaDiagonaleTvBase() {
		System.out.println("test su visualizzazione Larghezza del televisore Base = ad: "+ 160.34);
		assertEquals(tvBase.visualizzaDiagonale(), 160.34);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaDiagonaleTvMedio() {
		System.out.println("test su visualizzazione Larghezza del televisore medio = ad: "+ 160.34);
		assertEquals(tvMedio.visualizzaDiagonale(), 160.34);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaDiagonaleTvAvanzato() {
		System.out.println("test su visualizzazione Larghezza del televisore avanzato = ad: "+ 160.34);
		assertEquals(tvAvanzato.visualizzaDiagonale(), 160.34);
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaSerialeTvBase() {
		System.out.println("test su visualizzazione Seriale del televisore Base = ad: "+ "100000000001");
		assertEquals(tvBase.visualizzaSeriale(), "100000000001");
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaSerialeTvMedio() {
		System.out.println("test su visualizzazione Seriale del televisore medio = ad: "+ "100000000002");
		assertEquals(tvMedio.visualizzaSeriale(), "100000000002");
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaSerialeTvAvanzato() {
		System.out.println("test su visualizzazione Seriale del televisore avanzato = ad: "+ "100000000003");
		assertEquals(tvAvanzato.visualizzaSeriale(), "100000000003");
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaRisoluzioneTvBase() {
		System.out.println("test su visualizzazione Risoluzione del televisore Base = ad: "+ ConstantGlobal.RISOLUZIONE_TV.HD);
		assertEquals(tvBase.visualizzaRisoluzione(),ConstantGlobal.RISOLUZIONE_TV.HD);
		System.out.println(tvBase);
	}
	
	@Test
	public void test2visualizzaRisoluzioneTvBase() throws TelevisoreException{
		System.out.println("test su visualizzazione  Risoluzione del televisore Base non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertEquals(tvBase2.visualizzaRisoluzione(),null);
		System.out.println(tvBase2);
	}

	@Test
	void testvisualizzaRisoluzioneTvMedio() {
		System.out.println("test su visualizzazione Risoluzione del televisore medio = ad: "+ ConstantGlobal.RISOLUZIONE_TV.HD);
		assertEquals(tvMedio.visualizzaRisoluzione(), ConstantGlobal.RISOLUZIONE_TV.HD);
		System.out.println(tvMedio);
	}
	
	@Test
	public void test2visualizzaRisoluzioneTvMedio() throws TelevisoreException{
		System.out.println("test su visualizzazione Risoluzione del televisore Medio non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertEquals(tvMedio2.visualizzaRisoluzione(),null);
		System.out.println(tvMedio2);
	}
	
	@Test
	void testvisualizzaRisoluzioneTvAvanzato() {
		System.out.println("test su visualizzazione Risoluzione del televisore avanzato = ad: "+ ConstantGlobal.RISOLUZIONE_TV.HD);
		assertEquals(tvAvanzato.visualizzaRisoluzione(), ConstantGlobal.RISOLUZIONE_TV.HD);
		System.out.println(tvAvanzato);
	}
	
	@Test
	public void test2visualizzaRisoluzioneTvAvanzato() throws TelevisoreException{
		System.out.println("test su visualizzazione Risoluzione del televisore Avanzato non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertEquals(tvAvanzato2.visualizzaRisoluzione(),null);
		System.out.println(tvAvanzato2);
	}
	
	@Test
	void testvisualizzaTipoSchermoTvBase() {
		System.out.println("test su visualizzazione tipo schermo del televisore Base = ad: "+ ConstantGlobal.TIPOLOGIA_SCHERMO.OLED);
		assertEquals(tvBase.visualizzaTipoSchermo(),ConstantGlobal.TIPOLOGIA_SCHERMO.OLED);
		System.out.println(tvBase);
	}
	
	@Test
	public void test2visualizzaTipoSchermoTvBase() throws TelevisoreException{
		System.out.println("test su visualizzazione il tipo di schermo del televisore Base non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvBase2 = new TelevisoreBase(String.valueOf(serial));
		assertEquals(tvBase2.visualizzaTipoSchermo(),null);
		System.out.println(tvBase2);
	}

	@Test
	void testvisualizzaTipoSchermoTvMedio() {
		System.out.println("test su visualizzazione Risoluzione dello schermo del televisore medio = ad: "+ ConstantGlobal.TIPOLOGIA_SCHERMO.OLED);
		assertEquals(tvMedio.visualizzaTipoSchermo(), ConstantGlobal.TIPOLOGIA_SCHERMO.OLED);
		System.out.println(tvMedio);
	}
	
	public void test2visualizzaTipoSchermoTvMedio() throws TelevisoreException{
		System.out.println("test su visualizzazione il tipo di schermo del televisore Medio non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvMedio2 = new TelevisoreMedio(String.valueOf(serial));
		assertEquals(tvMedio2.visualizzaTipoSchermo(),null);
		System.out.println(tvMedio2);
	}
	
	@Test
	void testvisualizzaTipoSchermoTvAvanzato() {
		System.out.println("test su visualizzazione Risoluzione dello schermo del televisore avanzato = ad: "+ ConstantGlobal.TIPOLOGIA_SCHERMO.OLED);
		assertEquals(tvAvanzato.visualizzaTipoSchermo(),ConstantGlobal.TIPOLOGIA_SCHERMO.OLED);
		System.out.println(tvAvanzato);
	}
	
	@Test
	public void test2visualizzaTipoSchermoTvAvanzato() throws TelevisoreException{
		System.out.println("test su visualizzazione il tipo di schermo del televisore Avanzato non ancora inserita");
		serial = serial.add(BigInteger.valueOf(1));
		Televisore tvAvanzato2 = new TelevisoreAvanzato(String.valueOf(serial));
		assertEquals(tvAvanzato2.visualizzaTipoSchermo(),null);
		System.out.println(tvAvanzato2);
	}
	
	@Test
	void testvisualizzaTipologiaTvTvBase() {
		System.out.println("test su visualizzazione TIPOLOGIA TV del televisore Base = ad: "+ ConstantGlobal.TIPOLOGIA_TV.BASE);
		assertEquals(tvBase.visualizzaTipologiaTv(),ConstantGlobal.TIPOLOGIA_TV.BASE);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaTipologiaTvTvMedio() {
		System.out.println("test su visualizzazione TIPOLOGIA del televisore medio = ad: "+ ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		assertEquals(tvMedio.visualizzaTipologiaTv(), ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaTipologiaTvTvAvanzato() {
		System.out.println("test su visualizzazione TIPOLOGIA  del televisore avanzato = ad: "+ ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		assertEquals(tvAvanzato.visualizzaTipologiaTv(),ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaNumeroUsbTvBase() {
		System.out.println("test su visualizzazione il numero degli ingressi usb del televisore Base ");
		assertEquals(tvBase.visualizzaNumeroUsb(),0);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaNumeroUsbTvTvMedio() {
		System.out.println("test su visualizzazione il numero degli ingressi usb del televisore medio = ad: "+ ConstantGlobal.NUM_USB_TV_MEDIO);
		assertEquals(tvMedio.visualizzaNumeroUsb(), ConstantGlobal.NUM_USB_TV_MEDIO);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaNumeroUsbTvTvAvanzato() {
		System.out.println("test su visualizzazione il numero degli ingressi usb del televisore avanzato = ad: "+ ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		assertEquals(tvAvanzato.visualizzaNumeroUsb(),ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaNumeroHdmiTvBase() {
		System.out.println("test su visualizzazione il numero degli ingressi hdmi del televisore Base ");
		assertEquals(tvBase.visualizzaNumeroHdmi(),0);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaNumeroHdmiTvMedio() {
		System.out.println("test su visualizzazione il numero degli ingressi hdmi del televisore medio");
		assertEquals(tvMedio.visualizzaNumeroHdmi(), 0);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaNumeroHdmiTvAvanzato() {
		System.out.println("test su visualizzazione il numero degli ingressi hdmi del televisore avanzato = ad: "+ ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		assertEquals(tvAvanzato.visualizzaNumeroHdmi(),ConstantGlobal.NUM_HDMI_TV_AVANZATO);
		System.out.println(tvAvanzato);
	}
	
	@Test
	void testvisualizzaNumeroSmartTvTvBase() {
		System.out.println("test su visualizzazione il numero degli smart tv del televisore Base ");
		assertEquals(tvBase.visualizzaNumeroSmartTv(),0);
		System.out.println(tvBase);
	}

	@Test
	void testvisualizzaNumeroSmartTvTvMedio() {
		System.out.println("test su visualizzazione il numero degli smart tv del televisore medio");
		assertEquals(tvMedio.visualizzaNumeroSmartTv(), 0);
		System.out.println(tvMedio);
	}
	
	@Test
	void testvisualizzaNumeroSmartTvTvAvanzato() {
		System.out.println("test su visualizzazione il numero degli smart tv del televisore avanzato = ad: "+ ConstantGlobal.NUM_SMART_TV_AVANZATO);
		assertEquals(tvAvanzato.visualizzaNumeroSmartTv(),ConstantGlobal.NUM_SMART_TV_AVANZATO);
		System.out.println(tvAvanzato);
	}
}
