package entity;

import java.io.Serializable;

public class Filme implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private String imagem;
	
	public Filme() {
	}
	
	public Filme(Long id, String nome, String descricao, Double preco, String imagem) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
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
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getImagem() {
		return imagem;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public String toString() {
		return "Id: "
				+ id
				+ ", "
				+ nome
				+ ", "
				+ descricao
				+ ", "
				+ String.format("R$%.2f", preco)
				+ ", "
				+ imagem;
	}
}
