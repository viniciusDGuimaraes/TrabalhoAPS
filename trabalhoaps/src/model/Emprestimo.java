package model;

import java.util.Date;

public class Emprestimo {
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
}
