package Application;

import model.ModelFacade;
import model.Reserva;

public class UsuarioServices {
	public static void reservaLivro(Reserva r){
		ModelFacade.reservarLivro(r);
		System.out.println("Chamou o model facade");
	}
}
