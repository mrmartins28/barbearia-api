package br.com.lsmartin.barbearia_api.dto;

import br.com.lsmartin.barbearia_api.model.Usuario;


public class UsuarioDTO {
	
	private String nome;
	
	private String login;
	private String senha;
	
	public Usuario transformaParObjeto() {
		
		return new Usuario(nome,login,senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
