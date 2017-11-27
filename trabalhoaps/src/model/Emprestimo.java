package model;

import java.util.Date;

public class Emprestimo extends CalcularMultaAbstract{
	private Exemplar exemplar;
	private Usuario usuario;
	private Date dataEmprestimo; 
	private Date dataDevolucao;
	private boolean multaQuitada;
	
	public Emprestimo(Exemplar exemplar, Usuario usuario, Date dataEmprestimo, Date dataDevolucao){
		this.exemplar = exemplar;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	@Override
	public void calculaMulta() {
		System.out.println("Calcula Multa do livro");
		
	}
}
