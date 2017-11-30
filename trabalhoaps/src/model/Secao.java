package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.IteratorIndice;

public class Secao extends Indice{
	//Composite - Questão 5
	private Livro livro;
	private String nome;
	private List<Indice> subsecoes = new ArrayList<Indice>();
	
	public Secao(LivroFisico livro, String nome){
		this.livro = livro;
		this.nome = nome;
		System.out.println("Adicionou Seção");
		livro.adicionarSecao(this);
	}
	
	public String getNome(){
		return this.getNome();
	}
	
	@Override
	public void adicionar(Indice s){
		subsecoes.add(s);
		System.out.println("Adiconou uma subseção");
	}

	@Override
	public void remover(Indice s){
		subsecoes.remove(s);
		System.out.println("Removeu uma subseção");
	}
	
	@Override
	public void listarSubSecoes(){
		IteratorIndice i = new IteratorIndice(subsecoes);
		while(i.hasNext()){
			System.out.println(((Secao)i.currentItem()).nome);
			i.next();
		}
	}
}
