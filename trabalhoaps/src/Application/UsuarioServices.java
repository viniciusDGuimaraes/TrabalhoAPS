package Application;

import model.LivroFisico;
import model.ModelFacade;
import model.Usuario;

public class UsuarioServices {
	public static void reservaLivro(LivroFisico l, Usuario u){
		ModelFacade.reservarLivro(l, u);
		System.out.println("Chamou o model facade");
	}
}
