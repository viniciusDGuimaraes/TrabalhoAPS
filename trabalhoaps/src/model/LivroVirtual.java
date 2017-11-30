package model;

//Versao virtual do livro(Abstract Factory)
public class LivroVirtual extends Livro{
	
	public LivroVirtual(String identificador, String titulo) {
		super(identificador, titulo);
	}
	
	public LivroVirtual(){
		super();
	}
}
