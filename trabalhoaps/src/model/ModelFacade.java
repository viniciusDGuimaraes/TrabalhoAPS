package model;

import infrastructure.Repository;
import infrastructure.InfraFacade;

public class ModelFacade {
	
	public static void reservarLivro(LivroFisico l, Usuario u){
		l.reservar(u);
		System.out.println("Chamou método reservar da classe livro");
	}
}
