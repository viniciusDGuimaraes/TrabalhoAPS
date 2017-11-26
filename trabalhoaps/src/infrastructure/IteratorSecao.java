package infrastructure;

import java.util.Iterator;
import java.util.List;

import model.Secao;

public class IteratorSecao implements Iterator{
	private List<Secao> l;
	private int posicao;
	
	public IteratorSecao(List<Secao> l){
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
