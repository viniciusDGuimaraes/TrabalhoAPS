package model;

public class ReservaAtiva extends ReservaState{

	@Override
	public ReservaState ativar() {
		System.out.println("Reserva ativada");	
		return new ReservaAtiva();
	}

	@Override
	public ReservaState baixar() {
		System.out.println("Reserva baixada");
		return new ReservaBaixada();
	}

	@Override
	public ReservaState cancelar() {
		System.out.println("Reserva cancelada");
		return new ReservaCancelada();
	}
	
}
