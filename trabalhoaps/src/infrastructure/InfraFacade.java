package infrastructure;

import model.Reserva;

public class InfraFacade {	
	public void reservarLivro(Reserva r){
		Repository repo = new Repository.getInstance();
		repo.reservas.add(r);
		System.out.println("Reserva Livro");
	}
}
