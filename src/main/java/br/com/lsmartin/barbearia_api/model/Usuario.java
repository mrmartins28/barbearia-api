package br.com.lsmartin.barbearia_api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", initialValue = 1, allocationSize = 1)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private String senha;

	@Column(nullable = false)
	private Boolean isAdmin = false;

	public Usuario() {

	}

	public Usuario(String nome, String login, String senha) {
		
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
