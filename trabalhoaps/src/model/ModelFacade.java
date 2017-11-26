package model;

import infrastructure.Database;
import infrastructure.InfraFacade;

public class ModelFacade {
	
	public static void reservarLivro(Reserva r){
		InfraFacade infra = InfraFacade.getInstance();
		infra.reservarLivro(r);
		System.out.println("Chamou infra facade");
	}
}
