package model;

import java.util.Date;

public class Emprestimo extends EmprestimoAbstract{
	private ExemplarFisico exemplar;
	private Usuario usuario;
	private Date dataEmprestimo; 
	private Date dataDevolucao;
	private boolean multaQuitada;
	private enum status {ATIVO, DEVOLVIDO};
	
	public Emprestimo(ExemplarFisico exemplar, Usuario usuario, Date dataEmprestimo, Date dataDevolucao){
		this.exemplar = exemplar;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	public Emprestimo(){}
	
	@Override
	public void calculaMulta() {
		System.out.println("Calcula Multa do livro");
	}
}
