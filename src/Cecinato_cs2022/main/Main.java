package Cecinato_cs2022.main;

import java.math.BigInteger;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.*;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class Main {
	public static void main(String[] args) throws TelevisoreException {
		BigInteger serial = new BigInteger("100000000012");
		serial= serial.add( BigInteger.valueOf(1));
		Televisore tvBase = new TelevisoreBase(String.valueOf(serial));
		serial= serial.add( BigInteger.valueOf(1));
		Televisore tvMedio = new TelevisoreMedio(String.valueOf(serial));
		serial= serial.add( BigInteger.valueOf(1));
		Televisore tvAvanzato = new TelevisoreAvanzato(String.valueOf(serial));
		System.out.println("Test Aggiunta Marca = lg");
		tvBase.addTelevisoreBase(tvBase, "TELEFUNKEN", "42.04", "160.42", "160.34", "ULTRA_HD", "crt");
		System.out.println(tvBase);
		tvMedio.addTelevisoreMedio(tvMedio, "lg", "42.04", "60.42", "160.34", "hd", "OLED", "2");
		System.out.println(tvMedio);
		tvAvanzato.addTelevisoreAvanzato(tvAvanzato, "lg", "42.04", "60.42", "160.34", "hd", "OLED", "1", "1", "1");
		System.out.println(tvAvanzato);
		tvMedio.modificaTiposchermoTv(tvMedio, null);
		System.out.println(tvMedio);
		serial= serial.add( BigInteger.valueOf(1));
		tvMedio.modificaSeriale(tvMedio, String.valueOf(serial));
		System.out.println(tvMedio);
		
		
	}

	

}
