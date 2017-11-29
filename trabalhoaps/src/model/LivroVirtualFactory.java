package model;

public class LivroVirtualFactory extends LivroFactory{

	@Override
	public Livro criarLivro() {
		return new LivroVirtual();
	}

}
