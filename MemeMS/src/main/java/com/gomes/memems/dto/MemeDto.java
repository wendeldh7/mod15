package com.gomes.memems.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.gomes.memems.config.Groups;
import com.gomes.memems.model.CategoriaMeme;
import com.gomes.memems.model.Usuario;

public class MemeDto {

	@NotBlank(groups = Groups.CadastroMeme.class)
	@NotBlank
	private String nome;
	@NotBlank(groups = Groups.CadastroMeme.class)
	@NotBlank
	private String descricao;
	@NotBlank(groups = Groups.CadastroMeme.class)
	@NotBlank
	private String url;
	
	@Valid
	@NotNull(groups = Groups.CadastroMeme.class)
	@NotNull
	private CategoriaMeme categoria;
	@Valid
	@NotNull(groups = Groups.CadastroMeme.class)
	private Usuario usuario;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CategoriaMeme getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaMeme categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
