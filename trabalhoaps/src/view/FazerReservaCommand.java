package view;

import Application.ApplicationFacade;
import model.Livro;
import model.LivroAbstrato;
import model.Usuario;

public class FazerReservaCommand implements Command{

	@Override
	public void execute() {
		LivroAbstrato livro = new Livro();
		Usuario usuario = new Usuario();
		ApplicationFacade.reservarLivro(livro, usuario);
		System.out.println("Chamou o ApplicationFacade");
	}
}
