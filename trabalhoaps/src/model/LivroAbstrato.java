package model;

import java.util.List;

public abstract class LivroAbstrato {
	public abstract ExemplarAbstrato createExemplar();
	public abstract void reservar(Usuario u);
	public abstract void baixarReserva(Usuario u);
	public abstract void cancelarReserva(Usuario u);
	public abstract void emprestarExemplar();
	private List<ExemplarAbstrato> exemplares;
	
	public void newExemplar(){
		ExemplarAbstrato e = createExemplar();
		this.exemplares.add(e);
		System.out.println("Exemplar adicionado");
	}
}
