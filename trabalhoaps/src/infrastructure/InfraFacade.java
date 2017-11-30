package infrastructure;

import model.Reserva;

public class InfraFacade {	
	public static void reservarLivro(Reserva r){
		Repository repo = Repository.getInstance();
		System.out.println("Reserva Livro");
		repo.reservar(r);
	}
}
