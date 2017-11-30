package model;

//Abstract factory do livro virtual
public class LivroFisicoFactory extends LivroFactory{

	@Override
	public Livro criarLivro() {
		System.out.println("Cria livro fisico");
		return new LivroFisico();
	}
	
}
