package model;

public class ModelFacade {
	//Facade - Questão 2
	public static void reservarLivro(Livro l, Usuario u){
		System.out.println("Chama método reservar da classe livro");
		l.reservar(u);
	}
}
