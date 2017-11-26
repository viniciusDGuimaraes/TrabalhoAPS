package Application;

import model.Reserva;

public class ApplicationFacade {	
	public static void reservarLivro(Reserva r){
		UsuarioServices.reservaLivro(r);
		System.out.println("Chamou o UsuarioServices");
	}
}
