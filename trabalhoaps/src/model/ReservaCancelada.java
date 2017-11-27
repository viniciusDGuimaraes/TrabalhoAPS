package model;

public class ReservaCancelada extends ReservaState{

	@Override
	public ReservaState ativar() {
		System.out.println("Não é possivel ativar uma reserva que foi cancelada");
		return new ReservaCancelada();
	}

	@Override
	public ReservaState baixar() {
		System.out.println("Não é possivel dar baixa em uma reserva que foi cancelada");
		return new ReservaCancelada();
	}

	@Override
	public ReservaState cancelar() {
		System.out.println("Reserva cancelada com sucesso");
		return new ReservaCancelada();
	}

}
