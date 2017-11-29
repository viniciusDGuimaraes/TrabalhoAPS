package model;

public class ModelFacade {
	
	public static void reservarLivro(LivroAbstrato l, Usuario u){
		l.reservar(u);
		System.out.println("Chamou método reservar da classe livro");
	}
}
