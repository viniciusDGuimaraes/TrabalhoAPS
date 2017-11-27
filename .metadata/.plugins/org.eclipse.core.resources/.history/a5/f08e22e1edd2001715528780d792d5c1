package infrastructure;

import model.Reserva;

public class InfraFacade {
	private static InfraFacade instance;
	
	public static InfraFacade getInstance(){
		if(instance == null){
			instance = new InfraFacade();
		}
		return instance;
	}
	
	public void reservarLivro(Reserva r){
		Database.reservas.add(r);
		System.out.println("Reserva Livro");
	}
	
	private InfraFacade(){
	}
}
