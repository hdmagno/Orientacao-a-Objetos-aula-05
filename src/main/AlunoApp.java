package main;

import entity.Aluno;
import entity.Curso;

public class AlunoApp {

	public static void main(String[] args) {
		
				
		Aluno a = new Aluno(10L, "Amanda");
		Aluno b = new Aluno(11L, "Hilton");
		Aluno c = new Aluno(13L, "Mel");
		
		Curso java = new Curso(55L, "Java");
		Curso grafo = new Curso(68L, "Grafologia");
		Curso excel = new Curso(15L, "Excel");
		Curso informatica = new Curso(1L, "Informática Básica");
		
		a.adicionarCurso(grafo);
		a.adicionarCurso(excel);
		b.adicionarCurso(java);
		b.adicionarCurso(excel);
		b.adicionarCurso(grafo);
		c.adicionarCurso(informatica);
		informatica.adicionarAluno(a);
		informatica.adicionarAluno(b);
		informatica.adicionarAluno(c);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("==========================================================================");
		b.removerCurso(grafo);
		System.out.println(b);

	}

}
