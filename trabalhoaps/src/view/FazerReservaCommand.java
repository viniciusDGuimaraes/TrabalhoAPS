package view;

import Application.ApplicationFacade;
import model.LivroFisico;
import model.Livro;
import model.Usuario;

public class FazerReservaCommand implements Command{
	//Command - Questão 3
	@Override
	public void execute() {
		Livro livro = new LivroFisico();
		Usuario usuario = new Usuario();
		System.out.println("Chamou o ApplicationFacade");
		ApplicationFacade.reservarLivro(livro, usuario);
	}
}
