package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.InfraFacade;
import infrastructure.IteratorIndice;

public class LivroFisico extends Livro{
	private List<Exemplar> exemplares = new ArrayList<Exemplar>();
	
	public LivroFisico(String identificador, String titulo) {
		super(identificador, titulo);
	}
	
	public LivroFisico(){
		super();
	}
	
	public Exemplar createExemplar(){
		System.out.println("Exemplar físico criado");
		return new ExemplarFisico();
	}
	
	public void newExemplar(){
		Exemplar e = createExemplar();
		this.exemplares.add(e);
		System.out.println("Exemplar adicionado");
	}
	
	public void emprestarExemplar(){
		System.out.println("Realizou o empŕestimo");
	}
}
