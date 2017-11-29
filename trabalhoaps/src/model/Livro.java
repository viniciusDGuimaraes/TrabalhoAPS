package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.InfraFacade;
import infrastructure.IteratorSecao;

public class Livro extends LivroAbstrato{
	private String identificador;
	private String titulo;
	private List<Secao> secoes = new ArrayList<Secao>();
	
	public Livro(String identificador, String titulo) {
		this.identificador = identificador;
		this.titulo = titulo;
	}
	
	public Livro(){}
	
	@Override
	public ExemplarAbstrato createExemplar(){
		System.out.println("Exemplar criado"); //OK
		return new Exemplar();
	}
	
	public void adicionarSecao(Secao s){
		secoes.add(s);
		System.out.println("Adicionou seção ao livro");
	}
	
	public void listarSecoes(){
		IteratorSecao i = new IteratorSecao(secoes);
		while(i.hasNext()){
			System.out.println(((SubSecao)i.currentItem()).getNome());
			((SubSecao)i.currentItem()).listarSubSecoes();
			i.next();
		}
	}
	
	@Override
	public void reservar(Usuario u){
		Reserva r = new Reserva(this, u);
		InfraFacade.reservarLivro(r);
	}
	
	@Override
	public void baixarReserva(Usuario u){
		List<Reserva> reservas = u.getReservas();
		for(Reserva reserva : reservas){
			reserva.getStatus().baixar();
		}
	}
	
	@Override
	public void cancelarReserva(Usuario u){
		List<Reserva> reservas = u.getReservas(); 
		for(Reserva reserva : reservas){
			reserva.getStatus().cancelar();
		}
	}
	
	public void emprestarExemplar(){
		System.out.println("Realizou o empŕestimo");
	}
}