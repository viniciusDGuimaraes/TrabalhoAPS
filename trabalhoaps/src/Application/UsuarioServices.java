package Application;

import model.Livro;
import model.ModelFacade;
import model.Usuario;

public class UsuarioServices {
	public static void reservaLivro(Livro l, Usuario u){
		ModelFacade.reservarLivro(l, u);
		System.out.println("Chamou o model facade");
	}
}
