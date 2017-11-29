package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.InfraFacade;
import infrastructure.IteratorSecao;

public class LivroFisico extends Livro{
	
	public LivroFisico(String identificador, String titulo) {
		super(identificador, titulo);
	}
	
	public LivroFisico(){
		super();
	}
	
	@Override
	public Exemplar createExemplar(){
		System.out.println("Exemplar físico criado"); //OK
		return new ExemplarFisico();
	}
	
	public void emprestarExemplar(){
		System.out.println("Realizou o empŕestimo");
	}
}