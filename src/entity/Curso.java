package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	private List<Aluno> alunos = new ArrayList<>();
	
	public Curso() {
	}
	
	public Curso(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String nome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void removerAluno(Aluno a) {
		alunos.remove(a);
	}
	
	public String toString() {
		return "Id: "
				+ id
				+ ", "
				+ nome;
	}
	
}
