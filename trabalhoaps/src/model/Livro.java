package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Livro {
	private String identificador;
	private String titulo;
	private List<Secao> secoes = new ArrayList<Secao>();
	
	public Livro(String identificador, String titulo) {
		this.identificador = identificador;
		this.titulo = titulo;
	}
	
	public Livro(){}
	
	public void adicionarSecao(Secao s){
		secoes.add(s);
		System.out.println("Adicionou seção ao livro");
	}
}
