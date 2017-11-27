package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.IteratorSecao;

public class SubSecao extends Secao{
	private LivroFisico livro;
	private String nome;
	private List<Secao> secoes = new ArrayList<Secao>();
	private IteratorSecao i = new IteratorSecao(secoes);
	
	public SubSecao(LivroFisico livro, String nome){
		this.livro = livro;
		this.nome = nome;
		System.out.println("Adicionou Seção");
		this.livro.adicionarSecao(this);
	}
	
	public void adicionar(Secao s){
		secoes.add(s);
		System.out.println("Adiconou uma subseção");
	}
}
