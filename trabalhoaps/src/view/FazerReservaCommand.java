package view;

import Application.ApplicationFacade;
import model.Reserva;

public class FazerReservaCommand implements Command{

	@Override
	public void execute() {
		Reserva r = new Reserva();
		FazerReservaComponent fd = new FazerReservaComponent();
		fd.autentica();
		ApplicationFacade.reservarLivro(r);
	}
	
}
