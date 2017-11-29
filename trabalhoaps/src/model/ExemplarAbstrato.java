package model;

public abstract class ExemplarAbstrato {
	private String codigo;
	private Livro livro;
	
	public ExemplarAbstrato(String codigo, Livro livro){
		this.codigo = codigo;
		this.livro = livro;
	}
	
	public ExemplarAbstrato(){}
}
