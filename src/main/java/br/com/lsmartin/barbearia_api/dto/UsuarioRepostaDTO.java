package br.com.lsmartin.barbearia_api.dto;

import br.com.lsmartin.barbearia_api.model.Usuario;

public class UsuarioRepostaDTO {
	
	private Long id;
	private String nome;
	private String login;
	private Boolean isAdmin;
	
	private UsuarioRepostaDTO(Long id, String nome, String login, Boolean isAdmin) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.isAdmin = isAdmin;
	}
	
	public static UsuarioRepostaDTO transformaEmDTO(Usuario usuario) {
		
		return new UsuarioRepostaDTO(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getIsAdmin());
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}
	
	

}
