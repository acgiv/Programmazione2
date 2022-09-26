package Cecinato_cs2022.main;

import java.math.BigInteger;

import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.*;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class Main {
	public static void main(String[] args) throws TelevisoreException {
		Televisore tvBase = new TelevisoreBase("123456789112");
		Televisore tvMedio = new TelevisoreMedio("111111111111");
		Televisore tvAvanzato = new TelevisoreAvanzato("222222222221");
		System.out.println("Test Aggiunta Marca = lg");
		tvBase.addTelevisoreBase(tvBase, "lg", "42.04", "60.42", "160.34", "hd", "OLED");
		System.out.println(tvBase);
		tvMedio.addTelevisoreMedio(tvMedio, "lg", "42.04", "60.42", "160.34", "hd", "OLED", "2");
		System.out.println(tvMedio);
		tvAvanzato.addTelevisoreAvanzato(tvAvanzato, "lg", "42.04", "60.42", "160.34", "hd", "OLED", "1", "1", "1");
		System.out.println(tvAvanzato);
		tvMedio.modificaTiposchermoTv(tvMedio, null);
		System.out.println(tvMedio);
		
		BigInteger serial1 = new BigInteger("100000000001");
		System.out.println(serial1.add( BigInteger.valueOf(1)));
	}

	

}
