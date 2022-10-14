package ControlliGlobal;

import java.util.Arrays;
import java.util.List;

public class ControlliGlobal {
	
	public static String upperCaseFirst(String stringa) {
		String result = "";
		List<String> s1 = Arrays.asList(stringa.split("\\s"));
		 
		for (int i = 0; i < s1.size(); i++) {
			result += String.valueOf(s1.get(i)).substring(0,1).toUpperCase();;
			result += String.valueOf(s1.get(i)).substring(1, String.valueOf(s1.get(i)).length()).toLowerCase();
			if(i!=s1.size()-1) {
				result+= " ";
			}
		}

	      return result;
	   }
	

}
