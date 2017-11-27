package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.InfraFacade;

public class LivroFisico extends Livro{
	private List<Exemplar> exemplares;
	
	public LivroFisico(String identificador, String titulo) {
		super(identificador, titulo);
	}
	
	public LivroFisico(){
		super();
	}
	
	public void adicionarExemplar(Exemplar e){
		exemplares.add(e);
	}
	
	public void reservar(Usuario u){
		Reserva r = new Reserva(this, u);
		InfraFacade infra = InfraFacade.getInstance();
		infra.reservarLivro(r);
	}
	
	public void baixarReserva(Usuario u){
		u.getReserva().baixar();
	}
	
	public void cancelarReserva(Usuario u){
		u.getReserva().cancelar();
	}
}