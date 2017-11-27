package Application;

import model.LivroFisico;
import model.Usuario;

public class ApplicationFacade {	
	public static void reservarLivro(LivroFisico l, Usuario u){
		UsuarioServices.reservaLivro(l, u);
		System.out.println("Chamou o UsuarioServices");
	}
}
