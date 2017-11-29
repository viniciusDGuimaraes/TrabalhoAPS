package infrastructure;

import model.Reserva;

public class InfraFacade {	
	public static void reservarLivro(Reserva r){
		Repository repo = Repository.getInstance();
		repo.reservas.add(r);
		System.out.println("Reserva Livro");
	}
}
