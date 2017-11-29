package model;

public abstract class Exemplar {
	private String codigo;
	private LivroFisico livro;
	
	public Exemplar(String codigo, LivroFisico livro){
		this.codigo = codigo;
		this.livro = livro;
	}
	
	public Exemplar(){}
}
