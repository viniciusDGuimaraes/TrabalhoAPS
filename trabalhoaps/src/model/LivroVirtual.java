package model;

public class LivroVirtual extends Livro{
	
	public LivroVirtual(String identificador, String titulo) {
		super(identificador, titulo);
	}
	
	public LivroVirtual(){
		super();
	}
	
	@Override
	public Exemplar createExemplar(){
		System.out.println("Exemplar virtual criado"); //OK
		return new ExemplarVirtual();
	}

}
