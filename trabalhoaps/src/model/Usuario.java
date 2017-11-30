package model;

import java.util.ArrayList;
import java.util.List;

import infrastructure.AutenticacaoAPI;
import infrastructure.NotificationHandler;

public class Usuario extends AutenticacaoAPI implements Target{
	private String identificador;
	private String nome;
	private String login;
	private String senha;
	private TipoUsuario tipo;
	
	public void setTipo(TipoUsuario tipo){
		this.tipo = tipo;
	}
	
	public Usuario(String identificador, String nome, String login, String senha) {
		this.identificador = identificador;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.tipo = new TipoUsuarioSimples();
	}
	
	public Usuario(){
		this.tipo = new TipoUsuarioSimples();
	}
	
	public List<Reserva> getReservas(){
		List<Reserva> reservas = new ArrayList<Reserva>();
		return reservas;
	}
	
	public void podeReservar(){
		this.tipo.podeReservar();
	}
	
	public void podeTomarEmprestimo(){
		this.tipo.podeTomarEmprestimo();
	}
	
	@Override
	public void autenticarUsuario(){
		this.autenticarUsuarioAPI();
	}
	
}
