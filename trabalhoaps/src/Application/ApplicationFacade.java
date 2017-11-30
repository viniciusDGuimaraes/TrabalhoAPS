package Application;

import model.Livro;
import model.Usuario;

public class ApplicationFacade {
	//Facade - Questão 2
	public static void reservarLivro(Livro l, Usuario u){
		System.out.println("Chama o UsuarioServices");
		UsuarioServices.reservaLivro(l, u);
	}
}
