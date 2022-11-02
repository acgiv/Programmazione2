package Cecinato_cs2022.DaoTelevisore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.PojoTelevisore.TelevisoreBase;
import Cecinato_cs2022.TelevisoreService.DaoTelevisore;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class DaoTelevisoreImp  implements DaoTelevisore {

	public void savenewALLtv(Set<Televisore> tv) {
		FileOutputStream fileout = null;
		ObjectOutputStream oss;
		try {
			fileout = new FileOutputStream(ConstantGlobal.PERCORSO_FILE_TELEVISORE);
			oss = new ObjectOutputStream(fileout);
			Iterator<Televisore> element = tv.iterator();
			while (element.hasNext()) {
				oss.writeObject(element.next());
				oss.flush();
			}
			oss.close();
		} catch (Exception e) {
		}
	}

	public Set<Televisore> readFileAllTelevisore() {
		FileInputStream filein = null;
		Set<Televisore> tv = new HashSet<Televisore>();
		try {
			filein = new FileInputStream(ConstantGlobal.PERCORSO_FILE_TELEVISORE);
			try (ObjectInputStream input = new ObjectInputStream(filein)) {
				while (filein.available() > 0) {
					Object o = input.readObject();
					if(o != null) {
						if(o instanceof Televisore) {
							new TelevisoreBase(((Televisore) o).visualizzaSeriale());
							tv.add(((Televisore) o));
						}
					}
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			} catch (TelevisoreException e) {
				System.err.println(e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (FileNotFoundException e) {
			tv = new HashSet<Televisore>();
		}
		return tv;
	}

}
