package Application;

import model.Livro;
import model.Usuario;

public class ApplicationFacade {	
	public static void reservarLivro(Livro l, Usuario u){
		UsuarioServices.reservaLivro(l, u);
		System.out.println("Chamou o UsuarioServices");
	}
}
