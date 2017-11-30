package infrastructure;

import java.util.Iterator;
import java.util.List;

import model.Indice;

public class IteratorIndice implements Iterator{
	//Iterator - Questão 6
	private List<Indice> l;
	private int posicao;
	
	public IteratorIndice(List<Indice> l){
		this.l = l;
		this.posicao= 0;
	}
	
	public boolean hasNext(){
		return this.posicao < l.size();
	}
	
	public Object next() {
		return l.get(++posicao);
	}
	
	public Object currentItem(){
		return l.get(posicao);
	}
}
