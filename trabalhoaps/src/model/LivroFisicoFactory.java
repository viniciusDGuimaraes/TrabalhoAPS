package model;

public class LivroFisicoFactory extends LivroFactory{

	@Override
	public Livro criarLivro() {
		System.out.println("Cria livro fisico");
		return new LivroFisico();
	}
	
}
