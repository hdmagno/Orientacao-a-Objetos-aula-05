package entity;

import java.io.Serializable;

public class Jogador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String posicao;
	
	public Jogador() {
	}
	
	public Jogador(Long id, String nome, String posicao) {
		this.id = id;
		this.nome = nome;
		this.posicao = posicao;
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
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return "Id: "
				+ id
				+ ", "
				+ nome
				+ ", "
				+ posicao;
	}
}
