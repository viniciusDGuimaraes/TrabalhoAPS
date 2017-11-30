package model;

public abstract class ReservaState {
	//State - Questão 10
	public abstract ReservaState ativar();
	
	public abstract ReservaState baixar();
	
	public abstract ReservaState cancelar();
}
