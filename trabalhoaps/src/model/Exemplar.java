package model;

public class Exemplar {
	private String codigo;
	private LivroFisico livro;
	
	public Exemplar(String codigo, LivroFisico livro){
		this.codigo = codigo;
		this.livro = livro;
		this.livro.adicionarExemplar(this);
	}
}
