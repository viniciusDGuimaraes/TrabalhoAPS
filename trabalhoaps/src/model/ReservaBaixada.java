package model;

public class ReservaBaixada extends ReservaState{
	//State - Questão 10
	@Override
	public ReservaState ativar() {
		System.out.println("Não é possível ativar uma reserva que foi baixada");
		return new ReservaBaixada();
	}

	@Override
	public ReservaState baixar() {
		System.out.println("Reserva baixada com sucesso");
		return new ReservaBaixada();
	}

	@Override
	public ReservaState cancelar() {
		System.out.println("Não é possível cancelar uma reserva que foi baixada");
		return new ReservaBaixada();
	}

}
