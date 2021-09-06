package com.root.portalEventos.entidades;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "usuario", schema = "portal")
public class Usuario {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_completo")
	private String nomeCompleto;
	@Column(name = "apelido")
	private String apelido;
	@Column(name = "email")
	private String email;
	@Column(name = "senha")
	private String senha;

	public Usuario(Long id, String nomeCompleto, String apelido, String email, String senha) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.apelido = apelido;
		this.email = email;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameCompleto() {
		return nomeCompleto;
	}

	public void setNameCompleto(String nameCompleto) {
		this.nomeCompleto = nameCompleto;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
