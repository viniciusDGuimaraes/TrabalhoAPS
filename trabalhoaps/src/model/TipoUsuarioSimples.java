package model;

public class TipoUsuarioSimples extends TipoUsuario{
	//Strategy - Questão 11
	@Override
	public void podeReservar() {
		System.out.println("Retorna se o usuario simples pode fazer uma reserva");
	}

	@Override
	public void podeTomarEmprestimo() {
		System.out.println("Retorna se o usuario simples pode fazer um empréstimo");
	}

}
