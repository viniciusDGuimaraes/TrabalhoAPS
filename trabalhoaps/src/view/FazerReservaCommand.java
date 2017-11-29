package view;

import Application.ApplicationFacade;
import model.LivroFisico;
import model.Livro;
import model.Usuario;

public class FazerReservaCommand implements Command{

	@Override
	public void execute() {
		Livro livro = new LivroFisico();
		Usuario usuario = new Usuario();
		ApplicationFacade.reservarLivro(livro, usuario);
		System.out.println("Chamou o ApplicationFacade");
	}
}
