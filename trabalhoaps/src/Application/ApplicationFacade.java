package Application;

import model.Livro;
import model.Usuario;

public class ApplicationFacade {	
	public static void reservarLivro(Livro l, Usuario u){
		System.out.println("Chama o UsuarioServices");
		UsuarioServices.reservaLivro(l, u);
	}
}
