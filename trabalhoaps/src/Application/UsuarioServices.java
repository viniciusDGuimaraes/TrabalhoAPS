package Application;

import model.LivroAbstrato;
import model.ModelFacade;
import model.Usuario;

public class UsuarioServices {
	public static void reservaLivro(LivroAbstrato l, Usuario u){
		ModelFacade.reservarLivro(l, u);
		System.out.println("Chamou o model facade");
	}
}
