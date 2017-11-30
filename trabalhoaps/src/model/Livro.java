package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.InfraFacade;
import infrastructure.IteratorIndice;

public abstract class Livro {
	public abstract Exemplar createExemplar();
	
	private String identificador;
	private String titulo;
	private List<Indice> secoes = new ArrayList<Indice>();
	private List<Exemplar> exemplares;
	
	public Livro(String identificador, String titulo){
		this.identificador = identificador;
		this.titulo = titulo;
	}
	
	public Livro(){}
	
	public void newExemplar(){
		Exemplar e = createExemplar();
		this.exemplares.add(e);
		System.out.println("Exemplar adicionado");
	}
	
	public void adicionarSecao(Indice s){
		secoes.add(s);
		System.out.println("Adicionou seção ao livro");
	}
	
	public void listarSecoes(){
		IteratorIndice i = new IteratorIndice(secoes);
		while(i.hasNext()){
			System.out.println(((Secao)i.currentItem()).getNome());
			((Secao)i.currentItem()).listarSubSecoes();
			i.next();
		}
	}
	
	public void reservar(Usuario u){
		Reserva r = new Reserva(this, u);
		InfraFacade.reservarLivro(r);
	}
	
	public void baixarReserva(Usuario u){
		List<Reserva> reservas = u.getReservas();
		for(Reserva reserva : reservas){
			reserva.getStatus().baixar();
		}
	}
	
	public void cancelarReserva(Usuario u){
		List<Reserva> reservas = u.getReservas(); 
		for(Reserva reserva : reservas){
			reserva.getStatus().cancelar();
		}
	}
}
