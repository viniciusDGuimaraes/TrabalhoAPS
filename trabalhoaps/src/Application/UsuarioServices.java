package Application;

import model.Livro;
import model.ModelFacade;
import model.Usuario;

public class UsuarioServices {
	public static void reservaLivro(Livro l, Usuario u){
		System.out.println("Chamou o model facade");
		ModelFacade.reservarLivro(l, u);
	}
}
