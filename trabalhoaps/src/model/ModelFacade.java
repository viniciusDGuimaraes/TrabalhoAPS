package model;

public class ModelFacade {
	
	public static void reservarLivro(Livro l, Usuario u){
		l.reservar(u);
		System.out.println("Chamou método reservar da classe livro");
	}
}
