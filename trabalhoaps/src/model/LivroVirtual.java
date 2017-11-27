package model;

import infrastructure.InfraFacade;

public class LivroVirtual extends Livro{
	public LivroVirtual(String identificador, String titulo) {
		super(identificador, titulo);
	}
	
	public LivroVirtual(){
		super();
	}
}
