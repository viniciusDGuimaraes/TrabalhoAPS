package model;

public class ReservaAtiva extends ReservaState{

	@Override
	public ReservaState ativar() {
		System.out.println("A reserva já está ativada");	
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
