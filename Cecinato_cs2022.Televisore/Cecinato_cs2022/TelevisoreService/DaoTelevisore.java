package Cecinato_cs2022.TelevisoreService;

import java.util.Set;

public interface DaoTelevisore {
	
	public Set<Televisore> readFileAllTelevisore();
	
	public void savenewALLtv(Set<Televisore> tv);
}
