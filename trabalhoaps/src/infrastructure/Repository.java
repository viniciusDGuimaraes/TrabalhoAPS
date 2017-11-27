package infrastructure;

import java.util.ArrayList;
import java.util.List;

import model.Reserva;

public class Repository {
	private static Repository instance;
	
	public static Repository getInstance(){
		if(instance == null){
			instance = new InfraFacade();
		}
		return instance;
	}
	
	public static List<Reserva> reservas = new ArrayList<Reserva>();
}
