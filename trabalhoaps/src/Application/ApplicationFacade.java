package Application;

import model.LivroAbstrato;
import model.Usuario;

public class ApplicationFacade {	
	public static void reservarLivro(LivroAbstrato l, Usuario u){
		UsuarioServices.reservaLivro(l, u);
		System.out.println("Chamou o UsuarioServices");
	}
}
