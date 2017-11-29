package model;

import java.util.Date;

public class Reserva {
	private Livro livro;
	private Usuario usuario;
	private Date prazoRetirada;
	private ReservaState status;
	
	public ReservaState getStatus(){
		return status;
	}
	
	public Reserva(Livro livro, Usuario usuario) {
		this.livro = livro;
		this.usuario = usuario;
		status = new ReservaAtiva();
	}
	
	public Reserva(){}
}
