package Cecinato_cs2022.main;

import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class Main {
	public static void main(String[] args) {
		Televisore tv = new TelevisoreBase();
		tv.addAltezzaTv(tv);
	}

}
