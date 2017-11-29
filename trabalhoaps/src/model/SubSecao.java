package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.IteratorSecao;

public class SubSecao extends Secao{
	private Livro livro;
	private String nome;
	private List<Secao> secoes = new ArrayList<Secao>();
	
	public SubSecao(LivroFisico livro, String nome){
		this.livro = livro;
		this.nome = nome;
		System.out.println("Adicionou Seção");
		livro.adicionarSecao(this);
	}
	
	public String getNome(){
		return this.getNome();
	}
	
	@Override
	public void adicionar(Secao s){
		secoes.add(s);
		System.out.println("Adiconou uma subseção");
	}

	@Override
	public void remover(Secao s){
		secoes.remove(s);
		System.out.println("Removeu uma subseção");
	}
	
	@Override
	public void listarSubSecoes(){
		IteratorSecao i = new IteratorSecao(secoes);
		while(i.hasNext()){
			System.out.println(((SubSecao)i.currentItem()).getNome());
			i.next();
		}
	}
}
