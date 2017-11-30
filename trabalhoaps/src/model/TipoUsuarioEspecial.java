package model;

public class TipoUsuarioEspecial extends TipoUsuario{
	//Strategy - Questão 11
	@Override
	public void podeReservar() {
		System.out.println("Retorna se o usuario especial pode fazer uma reserva");
	}

	@Override
	public void podeTomarEmprestimo() {
		System.out.println("Retorna se o usuario especial pode fazer um empréstimo");
	}

}
