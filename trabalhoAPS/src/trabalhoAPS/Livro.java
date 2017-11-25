package trabalhoAPS;

public class Livro {
	private String identificador;
	private String titulo;
	
	public String getTitulo() {
		return titulo;
	}

	public Livro(String identificador, String titulo) {
		this.identificador = identificador;
		this.titulo = titulo;
	}
}
