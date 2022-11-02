package Cecinato_cs2022.DaoDipendente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ServiceDipendente.DaoVendita;

public class DaoVenditaImp  implements DaoVendita{
	
	public  void scriviFileVendita(String vendite) {
	    String path = ConstantGlobal.PERCORSO_FILE_VENDITA;
	    try {
	        File file = new File(path);
	        FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(vendite);
	        bw.flush();
	        bw.close();
	    }
	    catch(IOException e) {
	        System.err.println(e.getMessage());
	    }
	}
}
