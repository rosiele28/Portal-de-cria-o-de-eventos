package com.root.portalEventos.entidades;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eventos", schema = "portal")
public class Evento {
	@Id 
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_descricao")
	private String nome_descricao;
	@Column(name = "data_cadastro")
	private String data_cadastro;
	@Column(name = "hora")
	private String hora;
	@Column(name = "local_endereco")
	private String local_endereco;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_descricao() {
		return nome_descricao;
	}

	public void setNome_descricao(String nome_descricao) {
		this.nome_descricao = nome_descricao;
	}

	public void getData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLocal_endereco() {
		return local_endereco;
	}

	public void setLocal_endereco(String local_endereco) {
		this.local_endereco = local_endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data_cadastro, hora, id, local_endereco, nome_descricao, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(data_cadastro, other.data_cadastro) && hora == other.hora && Objects.equals(id, other.id)
				&& Objects.equals(local_endereco, other.local_endereco)
				&& Objects.equals(nome_descricao, other.nome_descricao) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome_descricao=" + nome_descricao + ", data_cadastro=" + data_cadastro
				+ ", hora=" + hora + ", local_endereco=" + local_endereco + ", usuario=" + usuario + "]";
	}
}
