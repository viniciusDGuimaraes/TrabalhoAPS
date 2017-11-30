package model;

//Abstract factory do livro virtual
public class LivroVirtualFactory extends LivroFactory{

	@Override
	public Livro criarLivro() {
		System.out.println("Cria livro virtual");
		return new LivroVirtual();
	}

}
