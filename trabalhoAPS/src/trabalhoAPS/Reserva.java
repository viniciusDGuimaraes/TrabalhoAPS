package trabalhoAPS;

public class Reserva {
	private Livro livro;
	private Usuario usuario;
	
	public Reserva(Livro livro, Usuario usuario) {
		this.livro = livro;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Reserva [livro=" + this.livro.getTitulo() + ", usuario=" + this.usuario.getNome() + "]";
	}
}
