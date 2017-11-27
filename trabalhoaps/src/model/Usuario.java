package model;

public class Usuario {
	private String identificador;
	private String nome;
	private String login;
	private String senha;
	private TipoUsuario tipo;
	
	public void setTipo(TipoUsuario tipo){
		this.tipo = tipo;
	}
	
	public Usuario(String identificador, String nome, String login, String senha) {
		super();
		this.identificador = identificador;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.tipo = new TipoUsuarioSimples();
	}
	
	public Reserva getReserva(){
		return new Reserva();
	}
	
	public void podeReservar(){
		this.tipo.podeReservar();
	}
	
	public void podeTomarEmprestimo(){
		this.tipo.podeTomarEmprestimo();
	}
	
	public Usuario(){}
}
