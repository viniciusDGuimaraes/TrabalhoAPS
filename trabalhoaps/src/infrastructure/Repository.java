package infrastructure;

import java.util.ArrayList;
import java.util.List;

import model.Reserva;

public class Repository {
	private static Repository instance;
	
	public static Repository getInstance(){
		if(instance == null){
			instance = new Repository();
		}
		return instance;
	}
	
	public List<Reserva> reservas = new ArrayList<Reserva>();
	
	public void reservar(Reserva r){
		reservas.add(r);
	}
	
	private Repository(){}
}
