package view;

import Application.ApplicationFacade;
import model.LivroFisico;
import model.Usuario;

public class FazerReservaCommand implements Command{

	@Override
	public void execute() {
		LivroFisico l = new LivroFisico();
		Usuario u = new Usuario();
		FazerReservaComponent fd = new FazerReservaComponent();
		fd.autentica();
		ApplicationFacade.reservarLivro(l, u);
	}
	
}
