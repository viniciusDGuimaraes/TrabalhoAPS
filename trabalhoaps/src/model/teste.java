package model;

public class teste {
	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.podeReservar();
		u.podeTomarEmprestimo();
		u.setTipo(new TipoUsuarioEspecial());
		u.podeReservar();
		u.podeTomarEmprestimo();
	}
}
