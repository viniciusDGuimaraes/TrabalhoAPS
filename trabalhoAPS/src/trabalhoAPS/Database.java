package trabalhoAPS;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static Database instance;
	private List<Reserva> reservas = new ArrayList<Reserva>();
	
	public static Database getInstance(){
		if(instance == null){
			instance = new Database();
		}
		return instance;
	}
	
	public void fazerReserva(Livro l, Usuario u){
		Reserva r = new Reserva(l, u);
		reservas.add(r);
		System.out.println("Livro reservado pelo usuário " + u.getNome());
	}
	
	public void listarReservas(){
		for(Reserva reserva : reservas){
			System.out.println(reserva.toString());
		}
	}
	
	public void Database(){
	}
}
