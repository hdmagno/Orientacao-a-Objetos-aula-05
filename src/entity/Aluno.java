package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	private List<Curso> cursos = new ArrayList<>();
	
	public Aluno() {
	}

	public Aluno(Long id, String nome) {
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
	
	public void adicionarCurso(Curso c) {
		cursos.add(c);
	}
	
	public void removerCurso(Curso c) {
		cursos.remove(c);
	}
	
	@Override
	public String toString() {
		return "Id: "
				+ id
				+ ", "
				+ nome
				+ ", Cursos: "
				+ cursos;
	}
}
