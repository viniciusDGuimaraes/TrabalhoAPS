package model;

public abstract class ReservaState {
	public abstract ReservaState ativar();
	
	public abstract ReservaState baixar();
	
	public abstract ReservaState cancelar();
}
