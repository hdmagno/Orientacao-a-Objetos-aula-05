package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Time implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	
	private List<Jogador> jogadores = new ArrayList<>();
	
	public Time() {
	}
	
	public Time(Long id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
		
	public void adicionarJogador(Jogador j) {
		jogadores.add(j);
	}
	
	public void removerJogador(Jogador j) {
		jogadores.remove(j);
	}
	
		
	@Override
	public String toString() {
		return "Id: "
				+ id
				+ ", "
				+ nome
				+ ", Jogadores: "
				+ jogadores;
	}
}
